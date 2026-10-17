package com.example.ui.weshare

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.border
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.GameStateEntity
import com.example.data.GameViewModel
import com.example.data.Stock

val WeShareBg = Color(0xFF11141E)
val WeShareCardBg = Color(0xFF1A1D27)
val WeShareGreen = Color(0xFF55E79F)
val WeShareTextPrimary = Color(0xFFFFFFFF)
val WeShareTextSecondary = Color(0xFF8B92A5)

@Composable
fun WeShareExchangeScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedStockId by remember { mutableStateOf<String?>(null) }
    var activeTab by remember { mutableStateOf("Markets") }

    if (selectedStockId == null) {
        Column(modifier = Modifier.fillMaxSize().background(WeShareBg)) {
            WeShareTopBar(state.cash)
            Box(modifier = Modifier.weight(1f)) {
                when (activeTab) {
                    "Markets" -> WeShareDashboard(state, onSelectStock = { selectedStockId = it })
                    else -> Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Coming Soon", color = WeShareTextSecondary) }
                }
            }
            WeShareBottomNav(activeTab, onSelectTab = { activeTab = it })
        }
    } else {
        val stock = state.stocks.find { it.id == selectedStockId }
        if (stock != null) {
            WeShareAssetDetails(
                stock = stock,
                state = state,
                viewModel = viewModel,
                onBack = { selectedStockId = null }
            )
        } else {
            selectedStockId = null
        }
    }
}

@Composable
fun WeShareTopBar(cash: Double) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(WeShareBg)
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF1E2333)),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Default.QueryStats, contentDescription = "Logo", tint = WeShareGreen, modifier = Modifier.size(20.dp))
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text("WeShare", color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Stocks", color = WeShareTextSecondary, fontSize = 11.sp)
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0xFF1E2333))
                    .padding(horizontal = 10.dp, vertical = 4.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(WeShareGreen))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("$${String.format("%,.2f", cash)}", color = WeShareTextPrimary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Icon(Icons.Default.NotificationsNone, contentDescription = "Alerts", tint = WeShareTextPrimary)
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier.size(32.dp).clip(CircleShape).background(WeShareGreen),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Default.PersonOutline, contentDescription = "Profile", tint = Color.Black, modifier = Modifier.size(20.dp))
            }
        }
    }
}

@Composable
fun WeShareBottomNav(activeTab: String, onSelectTab: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF141722))
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val tabs = listOf(
            Triple("Markets", Icons.Default.TrendingUp, "Markets"),
            Triple("Portfolio", Icons.Default.PieChartOutline, "Portfolio"),
            Triple("Activity", Icons.Default.ReceiptLong, "Activity"),
            Triple("Profile", Icons.Default.AccountCircle, "Profile")
        )
        for (tab in tabs) {
            val isSelected = activeTab == tab.first
            val color = if (isSelected) WeShareGreen else WeShareTextSecondary
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable { onSelectTab(tab.first) }
            ) {
                Icon(tab.second, contentDescription = tab.third, tint = color, modifier = Modifier.size(24.dp))
                Spacer(modifier = Modifier.height(4.dp))
                Text(tab.third, color = color, fontSize = 10.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal)
            }
        }
    }
}
@Composable
fun WeShareDashboard(state: GameStateEntity, onSelectStock: (String) -> Unit) {
    val totalStockValue = state.stocks.sumOf { it.quantity * it.currentPrice }
    val totalStockCost = state.stocks.sumOf { it.quantity * (if (it.averagePurchasePrice > 0.0) it.averagePurchasePrice else it.currentPrice) }
    val totalPnl = totalStockValue - totalStockCost
    val pnlPct = if (totalStockCost > 0) (totalPnl / totalStockCost) * 100 else 0.0

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        contentPadding = PaddingValues(bottom = 24.dp)
    ) {
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            // Hero Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(Brush.verticalGradient(listOf(Color(0xFF1E2838), Color(0xFF181C28))))
                    .padding(20.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("MARKET IS OPEN", color = WeShareGreen, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        Spacer(modifier = Modifier.width(6.dp))
                        Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(WeShareGreen))
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("WeShare Equities", color = WeShareTextPrimary, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.height(6.dp))
                            Text("Smart, fee-free investing curated for modern creative communities.", color = WeShareTextSecondary, fontSize = 13.sp, lineHeight = 18.sp)
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF1F2533)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Default.Eco, contentDescription = null, tint = WeShareGreen, modifier = Modifier.size(20.dp))
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(24.dp)) }
        item {
            Text("Investing Balance", color = WeShareTextSecondary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(4.dp))
            Text("$${String.format("%,.2f", totalStockValue)}", color = WeShareTextPrimary, fontSize = 36.sp, fontWeight = FontWeight.ExtraBold)
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF0F2B20)).padding(horizontal = 10.dp, vertical = 6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    val pnlSign = if (totalPnl >= 0) "+" else ""
                    val pnlColor = if (totalPnl >= 0) WeShareGreen else Color(0xFFFF5252)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(if (totalPnl >= 0) Icons.Default.ArrowOutward else Icons.Default.TrendingDown, contentDescription = null, tint = pnlColor, modifier = Modifier.size(12.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("$pnlSign$${String.format("%,.2f", totalPnl)} ($pnlSign${String.format("%.1f", pnlPct)}%)", color = pnlColor, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text("All time gain", color = WeShareTextSecondary, fontSize = 13.sp)
            }
        }
        item { Spacer(modifier = Modifier.height(24.dp)) }
        item {
            // Chart Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(WeShareCardBg)
            ) {
                Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("PORTFOLIO GROWTH", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        Text("Steady Growth", color = WeShareGreen, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                            val w = size.width
                            val h = size.height
                            val path = androidx.compose.ui.graphics.Path()
                            path.moveTo(0f, h * 0.8f)
                            path.cubicTo(w * 0.3f, h * 0.8f, w * 0.4f, h * 0.3f, w, h * 0.1f)
                            val stroke = androidx.compose.ui.graphics.drawscope.Stroke(width = 6f)
                            drawPath(path, color = WeShareGreen, style = stroke)
                            path.lineTo(w, h)
                            path.lineTo(0f, h)
                            path.close()
                            drawPath(path, brush = Brush.verticalGradient(listOf(WeShareGreen.copy(alpha = 0.2f), Color.Transparent)))
                            drawCircle(color = WeShareGreen, radius = 10f, center = androidx.compose.ui.geometry.Offset(w, h * 0.1f))
                            drawCircle(color = Color.White, radius = 4f, center = androidx.compose.ui.geometry.Offset(w, h * 0.1f))
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth().background(Color(0xFF141722), RoundedCornerShape(16.dp)).padding(4.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        listOf("1D", "1W", "1M", "1Y", "ALL").forEach { t ->
                            val isSel = t == "ALL"
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(if (isSel) Color(0xFF262C3D) else Color.Transparent)
                                    .padding(horizontal = 16.dp, vertical = 6.dp)
                            ) {
                                Text(t, color = if (isSel) WeShareGreen else WeShareTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                            }
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(32.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text("Explore Markets", color = WeShareTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("See Trends", color = WeShareGreen, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    Icon(Icons.Default.ChevronRight, contentDescription = null, tint = WeShareGreen, modifier = Modifier.size(16.dp))
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
                Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(WeShareGreen).padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Text("All Stocks", color = Color.Black, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                }
                Spacer(modifier = Modifier.width(8.dp))
                listOf("Music & Media", "Tech", "Top Movers").forEach { cat ->
                    Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(WeShareCardBg).padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Text(cat, color = WeShareTextSecondary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        items(state.stocks) { stock ->
            WeShareStockRow(stock) { onSelectStock(stock.id) }
            Spacer(modifier = Modifier.height(12.dp))
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            // Investor Tip
            Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(WeShareCardBg).padding(20.dp)) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.size(32.dp).clip(CircleShape).background(Color(0xFF142033)), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.Info, contentDescription = null, tint = Color(0xFF4FC3F7), modifier = Modifier.size(18.dp))
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("Investor Tip", color = WeShareTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text("You own fractional shares! You can invest as little as $1.00 anytime without whole-share costs.", color = WeShareTextSecondary, fontSize = 14.sp, lineHeight = 20.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(Color(0xFF262C3D)).padding(horizontal = 16.dp, vertical = 10.dp)) {
                        Text("Explore Fractional Investing", color = WeShareTextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }
        }
    }
}

@Composable
fun WeShareStockRow(stock: Stock, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(WeShareCardBg)
            .clickable { onClick() }
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    val stockLogo = when (stock.id) {
                        "stock_media" -> "📺"
                        "stock_apex" -> "🎵"
                        "stock_live" -> "🎟️"
                        "stock_tech" -> "📱"
                        "stock_acc" -> "🎸"
                        "stock_indie" -> "💿"
                        else -> "📈"
                    }
                    Text(stockLogo, fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(stock.name, color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(2.dp))
                    Text("${stock.name.take(4).uppercase()} • ${stock.sector}", color = WeShareTextSecondary, fontSize = 12.sp)
                }
            }
            Column(horizontalAlignment = Alignment.End) {
                Text("$${String.format("%,.2f", stock.currentPrice)}", color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(4.dp))
                val pnlSign = if (stock.recentChangePercent() >= 0) "+" else ""
                val pnlColor = if (stock.recentChangePercent() >= 0) WeShareGreen else Color(0xFFFF5252)
                Text("$pnlSign${String.format("%.2f", stock.recentChangePercent())}%", color = pnlColor, fontSize = 12.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Composable
fun WeShareAssetDetails(stock: Stock, state: GameStateEntity, viewModel: GameViewModel, onBack: () -> Unit) {
    var activeTradeTab by remember { mutableStateOf("Buy") }
    var qtyInput by remember { mutableStateOf("5") }
    var showBuybackDialog by remember { mutableStateOf(false) }
    var buybackPercentInput by remember { mutableStateOf("10") }

    Column(modifier = Modifier.fillMaxSize().background(WeShareBg)) {
        // Top Bar
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = WeShareTextPrimary, modifier = Modifier.clickable { onBack() })
                Spacer(modifier = Modifier.width(16.dp))
                Text("Asset Details", color = WeShareTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.NotificationsNone, contentDescription = "Alerts", tint = WeShareTextPrimary)
                Spacer(modifier = Modifier.width(16.dp))
                Box(modifier = Modifier.size(32.dp).clip(CircleShape).background(WeShareGreen), contentAlignment = Alignment.Center) {
                    Icon(Icons.Default.PersonOutline, contentDescription = "Profile", tint = Color.Black, modifier = Modifier.size(20.dp))
                }
            }
        }

        LazyColumn(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp), contentPadding = PaddingValues(bottom = 24.dp)) {
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top) {
                    Row(modifier = Modifier.weight(1f)) {
                        Box(modifier = Modifier.size(48.dp).clip(CircleShape).background(Color(0xFF142033)).border(2.dp, WeShareGreen, CircleShape), contentAlignment = Alignment.Center) {
                            Box(modifier = Modifier.size(16.dp).clip(CircleShape).border(2.dp, WeShareGreen, CircleShape))
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(WeShareGreen))
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(stock.name, color = WeShareTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(8.dp))
                                Box(modifier = Modifier.clip(RoundedCornerShape(8.dp)).background(Color(0xFF262C3D)).padding(horizontal = 6.dp, vertical = 2.dp)) {
                                    Text(stock.name.take(4).uppercase(), color = WeShareTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Text("WeShare ${stock.sector} Index", color = WeShareTextSecondary, fontSize = 13.sp)
                        }
                    }
                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(WeShareCardBg), contentAlignment = Alignment.Center) {
                        Icon(Icons.Default.StarBorder, contentDescription = "Favorite", tint = WeShareTextSecondary, modifier = Modifier.size(20.dp))
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                Row(verticalAlignment = Alignment.Bottom) {
                    Text("$${String.format("%,.2f", stock.currentPrice)}", color = WeShareTextPrimary, fontSize = 42.sp, fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.width(16.dp))
                    Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF0F2B20)).padding(horizontal = 10.dp, vertical = 6.dp).offset(y = (-6).dp)) {
                        val pnlSign = if (stock.recentChangePercent() >= 0) "+" else ""
                        val pnlColor = if (stock.recentChangePercent() >= 0) WeShareGreen else Color(0xFFFF5252)
                        Text("↑ $pnlSign$${String.format("%.2f", stock.currentPrice * (stock.recentChangePercent()/100.0))} ($pnlSign${String.format("%.2f", stock.recentChangePercent())}%)", color = pnlColor, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Today", color = WeShareTextSecondary, fontSize = 13.sp, modifier = Modifier.offset(y = (-8).dp))
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    Text("Market Open • NYSE", color = WeShareTextSecondary, fontSize = 13.sp)
                    Spacer(modifier = Modifier.width(16.dp))
                    Text("Vol: 1.42M", color = WeShareTextSecondary, fontSize = 13.sp)
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                // Mini chart
                Box(modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(24.dp)).background(WeShareCardBg)) {
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(WeShareGreen))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Live Session Performance", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            }
                            Text("High: $128.40", color = WeShareGreen, fontSize = 11.sp, fontWeight = FontWeight.Medium)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(modifier = Modifier.weight(1f).fillMaxWidth()) {
                            androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                                val w = size.width
                                val h = size.height
                                val path = androidx.compose.ui.graphics.Path()
                                path.moveTo(0f, h * 0.7f)
                                path.cubicTo(w * 0.2f, h * 0.7f, w * 0.3f, h * 0.9f, w * 0.5f, h * 0.5f)
                                path.cubicTo(w * 0.7f, h * 0.1f, w * 0.8f, h * 0.8f, w, h * 0.3f)
                                val stroke = androidx.compose.ui.graphics.drawscope.Stroke(width = 6f)
                                drawPath(path, color = WeShareGreen, style = stroke)
                                path.lineTo(w, h)
                                path.lineTo(0f, h)
                                path.close()
                                drawPath(path, brush = Brush.verticalGradient(listOf(WeShareGreen.copy(alpha = 0.2f), Color.Transparent)))
                                drawCircle(color = WeShareGreen, radius = 10f, center = androidx.compose.ui.geometry.Offset(w, h * 0.3f))
                                drawCircle(color = Color.White, radius = 4f, center = androidx.compose.ui.geometry.Offset(w, h * 0.3f))
                            }
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            listOf("09:30 AM", "11:30 AM", "01:30 PM", "04:00 PM").forEach {
                                Text(it, color = WeShareTextSecondary, fontSize = 10.sp)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth().background(Color(0xFF141722), RoundedCornerShape(16.dp)).padding(4.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                    listOf("1D", "1W", "1M", "1Y", "ALL").forEach { t ->
                        val isSel = t == "1W"
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(if (isSel) Color(0xFF262C3D) else Color.Transparent)
                                .padding(horizontal = 16.dp, vertical = 6.dp)
                        ) {
                            Text(t, color = if (isSel) WeShareGreen else WeShareTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                // Your Position
                Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(WeShareCardBg).padding(20.dp)) {
                    Column {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.AccountBalanceWallet, contentDescription = null, tint = WeShareGreen, modifier = Modifier.size(20.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Your Position", color = WeShareTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                            }
                            Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF262C3D)).padding(horizontal = 10.dp, vertical = 4.dp)) {
                                Text("Active Portfolio", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Medium)
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Column {
                                Text("YOUR SHARES", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("${stock.quantity}", color = WeShareTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("Avg $${String.format("%.2f", stock.currentPrice)}", color = WeShareTextSecondary, fontSize = 13.sp)
                            }
                            Column {
                                Text("CURRENT VALUE", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("$${String.format("%,.2f", stock.quantity * stock.currentPrice)}", color = WeShareTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("${stock.quantity} @ $${String.format("%.2f", stock.currentPrice)}", color = WeShareTextSecondary, fontSize = 13.sp)
                            }
                            Column {
                                val pnl = (stock.currentPrice - stock.currentPrice) * stock.quantity
                                val pnlPct = if (stock.currentPrice > 0) ((stock.currentPrice - stock.currentPrice) / stock.currentPrice) * 100 else 0.0
                                val sign = if (pnl >= 0) "+" else ""
                                val color = if (pnl >= 0) WeShareGreen else Color(0xFFFF5252)
                                Text("TOTAL P/L", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("$sign$${String.format("%,.2f", pnl)}", color = color, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("$sign${String.format("%.2f", pnlPct)}%", color = color, fontSize = 13.sp)
                            }
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                if (stock.isPlayerCompany) {
                    // Founder Company Dashboard
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFF1E2333))
                            .border(1.dp, WeShareGreen.copy(alpha = 0.5f), RoundedCornerShape(20.dp))
                            .padding(20.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Verified, contentDescription = null, tint = WeShareGreen, modifier = Modifier.size(24.dp))
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text("FOUNDER PUBLIC LISTING", color = WeShareGreen, fontSize = 12.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                Text("Your Company on WeShare", color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        val soldRatio = if (stock.totalIpoShares > 0) (stock.ipoSharesSold.toFloat() / stock.totalIpoShares.toFloat()).coerceIn(0f, 1f) else 1f
                        val capitalRaised = stock.ipoSharesSold * stock.currentPrice
                        Text("Public IPO Tranche Progress: ${(soldRatio * 100).toInt()}%", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        Spacer(modifier = Modifier.height(6.dp))
                        LinearProgressIndicator(
                            progress = soldRatio,
                            modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                            color = WeShareGreen,
                            trackColor = Color(0xFF262C3D)
                        )
                        Spacer(modifier = Modifier.height(14.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Column {
                                Text("PUBLIC SHARES SOLD", color = WeShareTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("${stock.ipoSharesSold} / ${stock.totalIpoShares}", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            }
                            Column(horizontalAlignment = Alignment.End) {
                                Text("CAPITAL RAISED", color = WeShareTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("$${String.format("%,.0f", capitalRaised)}", color = WeShareGreen, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFF141722))
                                .padding(12.dp)
                        ) {
                            Column {
                                Text(
                                    if (stock.ipoCompleted) "✅ 100% Tranche Completed" else "⚡ Active IPO Distribution",
                                    color = if (stock.ipoCompleted) WeShareGreen else Color(0xFFFFB74D),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    if (stock.ipoCompleted) "All public shares have been acquired. Shareholders are now trading among themselves in secondary market activity. Weekly company dividends are distributed based on operational profit."
                                    else "Public market buyers purchase shares weekly based on business profit performance. Cash proceeds from each tranche are deposited directly into your bank.",
                                    color = WeShareTextSecondary,
                                    fontSize = 12.sp,
                                    lineHeight = 17.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(14.dp))
                        val matchingVenture = state.businessVentures.find { it.id == stock.playerVentureId || it.name.equals(stock.name, ignoreCase = true) }
                        if (matchingVenture != null && matchingVenture.isListedOnWeShare && matchingVenture.weShareListedEquityPercent > 0.0) {
                            val publicPct = (matchingVenture.weShareListedEquityPercent * 100).toInt()
                            Button(
                                onClick = { showBuybackDialog = true },
                                colors = ButtonDefaults.buttonColors(containerColor = WeShareGreen),
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.fillMaxWidth().height(42.dp)
                            ) {
                                Icon(Icons.Default.Autorenew, contentDescription = null, tint = Color.Black, modifier = Modifier.size(18.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("REQUEST PUBLIC SHARE BUYBACK ($publicPct% PUBLIC)", color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                        }
                        Text(
                            "⚖️ WeShare Regulation: Founders cannot purchase open market shares. Reacquiring equity is conducted via official Share Buyback at current market share price.",
                            color = WeShareTextSecondary.copy(alpha = 0.7f),
                            fontSize = 11.sp,
                            lineHeight = 15.sp
                        )
                    }
                } else {
                    // Buy/Sell section
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(WeShareCardBg).padding(4.dp)) {
                            Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(if (activeTradeTab == "Buy") WeShareGreen else Color.Transparent).clickable { activeTradeTab = "Buy" }.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                                Text("Buy ${stock.name.take(4).uppercase()}", color = if (activeTradeTab == "Buy") Color.Black else WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }
                            Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(if (activeTradeTab == "Sell") Color(0xFFFF5252) else Color.Transparent).clickable { activeTradeTab = "Sell" }.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                                Text("Sell", color = if (activeTradeTab == "Sell") Color.Black else WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(WeShareCardBg).padding(horizontal = 16.dp, vertical = 12.dp)) {
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                Column {
                                    Text("ORDER TYPE", color = WeShareTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text("Market Order • Instant", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                                }
                                Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).border(1.dp, Color(0xFF262C3D), RoundedCornerShape(16.dp)).padding(horizontal = 12.dp, vertical = 6.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text("Switch", color = WeShareTextSecondary, fontSize = 12.sp)
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Icon(Icons.Default.SwapVert, contentDescription = null, tint = WeShareTextSecondary, modifier = Modifier.size(16.dp))
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(WeShareCardBg).padding(horizontal = 16.dp, vertical = 12.dp)) {
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                Column {
                                    Text("QUANTITY", color = WeShareTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Row(verticalAlignment = Alignment.Bottom) {
                                        Text(qtyInput, color = WeShareTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text("Shares", color = WeShareTextSecondary, fontSize = 14.sp, modifier = Modifier.offset(y = (-2).dp))
                                    }
                                }
                                Row {
                                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(Color(0xFF262C3D)).clickable {
                                        val q = qtyInput.toIntOrNull() ?: 0
                                        if (q > 0) qtyInput = (q - 1).toString()
                                    }, contentAlignment = Alignment.Center) {
                                        Text("-", color = WeShareTextPrimary, fontSize = 20.sp)
                                    }
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(Color(0xFF262C3D)).clickable {
                                        val q = qtyInput.toIntOrNull() ?: 0
                                        qtyInput = (q + 1).toString()
                                    }, contentAlignment = Alignment.Center) {
                                        Text("+", color = WeShareTextPrimary, fontSize = 20.sp)
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            listOf("25%", "50%", "75%", "MAX").forEach {
                                Box(modifier = Modifier.weight(1f).padding(horizontal = 4.dp).clip(RoundedCornerShape(16.dp)).background(Color(0xFF1E2333)).clickable {}.padding(vertical = 10.dp), contentAlignment = Alignment.Center) {
                                    Text(it, color = WeShareTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        val qNum = qtyInput.toIntOrNull() ?: 0
                        val estCost = qNum * stock.currentPrice
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Estimated Cost", color = WeShareTextSecondary, fontSize = 14.sp)
                            Text("$${String.format("%,.2f", estCost)}", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Cash Available", color = WeShareTextSecondary, fontSize = 14.sp)
                            Text("$${String.format("%,.2f", state.cash)}", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Brokerage Execution Fee", color = WeShareTextSecondary, fontSize = 14.sp)
                            Text("Commission Free", color = WeShareGreen, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(if (activeTradeTab == "Buy") WeShareGreen else Color(0xFFFF5252))
                                .clickable {
                                    if (activeTradeTab == "Buy") viewModel.buyStock(stock.id, qNum) else viewModel.sellStock(stock.id, qNum)
                                    onBack()
                                }.padding(vertical = 16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Review ${activeTradeTab} Order", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(Icons.Default.ArrowForward, contentDescription = null, tint = Color.Black, modifier = Modifier.size(18.dp))
                            }
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(32.dp)) }
            item {
                Box(modifier = Modifier.fillMaxWidth().height(160.dp).clip(RoundedCornerShape(16.dp)).background(Color.DarkGray)) {
                    // Placeholder for news image
                    Box(modifier = Modifier.fillMaxSize().background(Brush.verticalGradient(listOf(Color.Transparent, Color(0xCC000000)))))
                    Column(modifier = Modifier.align(Alignment.BottomStart).padding(16.dp)) {
                        Text("STUDIO EXPANSION", color = WeShareGreen, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("New Global Soundstage Opening in Austin", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Info, contentDescription = null, tint = WeShareTextSecondary, modifier = Modifier.size(20.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("About ${stock.name}", color = WeShareTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("${stock.name} is the premier independent player in the WeShare simulation. The firm monetizes global rights, live festival tours, and high-fidelity collectibles across virtual regions.", color = WeShareTextSecondary, fontSize = 14.sp, lineHeight = 22.sp)
                    Spacer(modifier = Modifier.height(24.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("CEO", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                            Spacer(modifier = Modifier.height(4.dp))
                            Text("Elena Vance", color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Text("SECTOR", color = WeShareTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(stock.sector, color = WeShareTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
        }

        val matchingVentureForDialog = state.businessVentures.find { it.id == stock.playerVentureId || it.name.equals(stock.name, ignoreCase = true) }
        if (showBuybackDialog && matchingVentureForDialog != null) {
            val requestedPct = buybackPercentInput.toDoubleOrNull() ?: 10.0
            val publicShares = stock.totalIpoShares
            val sharesToReclaim = (publicShares * (requestedPct / 100.0)).toLong().coerceAtLeast(1L)
            val totalCost = sharesToReclaim * stock.currentPrice
            val canAfford = state.cash >= totalCost

            AlertDialog(
                onDismissRequest = { showBuybackDialog = false },
                title = {
                    Text("Public Share Buyback", color = Color.White, fontWeight = FontWeight.Bold)
                },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text(
                            "Reacquire public equity back into private ownership. Buybacks execute at current market share price ($${String.format("%,.2f", stock.currentPrice)}/share), not the original IPO listing price.",
                            color = WeShareTextSecondary,
                            fontSize = 12.sp,
                            lineHeight = 16.sp
                        )
                        Text(
                            "Currently Listed: ${String.format("%.1f", matchingVentureForDialog.weShareListedEquityPercent * 100)}% public float",
                            color = WeShareGreen,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )

                        OutlinedTextField(
                            value = buybackPercentInput,
                            onValueChange = { buybackPercentInput = it.filter { ch -> ch.isDigit() || ch == '.' } },
                            label = { Text("Buyback Equity % (e.g. 5, 10, 20)") },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedTextColor = Color.White,
                                unfocusedTextColor = Color.White,
                                focusedBorderColor = WeShareGreen,
                                unfocusedBorderColor = Color(0xFF334155)
                            )
                        )

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            listOf(5, 10, 20, 50).forEach { pct ->
                                OutlinedButton(
                                    onClick = { buybackPercentInput = pct.toString() },
                                    colors = ButtonDefaults.outlinedButtonColors(contentColor = WeShareGreen),
                                    border = BorderStroke(1.dp, if (buybackPercentInput == pct.toString()) WeShareGreen else Color(0xFF334155)),
                                    modifier = Modifier.weight(1f).height(32.dp),
                                    contentPadding = PaddingValues(0.dp)
                                ) {
                                    Text("$pct%", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }

                        Surface(
                            color = Color(0xFF141722),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Text("Shares to Reclaim:", color = WeShareTextSecondary, fontSize = 11.sp)
                                    Text("${String.format("%,d", sharesToReclaim)} shares", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                }
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Text("Current Stock Price:", color = WeShareTextSecondary, fontSize = 11.sp)
                                    Text("$${String.format("%,.2f", stock.currentPrice)}", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                }
                                Divider(color = Color(0xFF262C3D), thickness = 0.8.dp)
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Text("Total Execution Cost:", color = WeShareTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                    Text("$${String.format("%,.0f", totalCost)}", color = if (canAfford) WeShareGreen else Color(0xFFFF5252), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                }
                                Text("Available Cash: $${String.format("%,.0f", state.cash)}", color = WeShareTextSecondary, fontSize = 10.sp)
                            }
                        }
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            showBuybackDialog = false
                            viewModel.buybackPublicShares(matchingVentureForDialog.id, requestedPct)
                        },
                        enabled = canAfford && requestedPct > 0.0,
                        colors = ButtonDefaults.buttonColors(containerColor = WeShareGreen)
                    ) {
                        Text("CONFIRM BUYBACK", color = Color.Black, fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showBuybackDialog = false }) {
                        Text("CANCEL", color = WeShareTextSecondary)
                    }
                },
                containerColor = Color(0xFF1A1D27)
            )
        }
    }
}
