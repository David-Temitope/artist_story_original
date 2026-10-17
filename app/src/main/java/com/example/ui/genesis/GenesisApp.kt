package com.example.ui.genesis

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.border
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
import com.example.data.Crypto
import com.example.ui.CryptoAnalystDeskCard

val GenesisBg = Color(0xFF131722)
val GenesisCardBg = Color(0xFF1B1E29)
val GenesisGreen = Color(0xFF55E79F)
val GenesisRed = Color(0xFFFF647C)
val GenesisTextPrimary = Color(0xFFFFFFFF)
val GenesisTextSecondary = Color(0xFF8B92A5)

@Composable
fun GenesisExchangeScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedCryptoId by remember { mutableStateOf<String?>(null) }
    var activeTab by remember { mutableStateOf("Markets") }

    if (selectedCryptoId == null) {
        Column(modifier = Modifier.fillMaxSize().background(GenesisBg)) {
            GenesisTopBar(state.cash)
            Box(modifier = Modifier.weight(1f)) {
                when (activeTab) {
                    "Markets" -> GenesisDashboard(state, viewModel, onSelectCrypto = { selectedCryptoId = it })
                    else -> Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Coming Soon", color = GenesisTextSecondary) }
                }
            }
            GenesisBottomNav(activeTab, onSelectTab = { activeTab = it })
        }
    } else {
        val crypto = state.cryptos.find { it.id == selectedCryptoId }
        if (crypto != null) {
            GenesisAssetDetails(
                crypto = crypto,
                state = state,
                viewModel = viewModel,
                onBack = { selectedCryptoId = null }
            )
        } else {
            selectedCryptoId = null
        }
    }
}

@Composable
fun GenesisTopBar(cash: Double) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(GenesisBg)
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
                Icon(Icons.Default.CandlestickChart, contentDescription = "Logo", tint = GenesisGreen, modifier = Modifier.size(20.dp))
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text("Genesis", color = GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Crypto", color = GenesisTextSecondary, fontSize = 11.sp)
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
                    Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(GenesisGreen))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("$${String.format("%,.2f", cash)}", color = GenesisTextPrimary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Icon(Icons.Default.NotificationsNone, contentDescription = "Alerts", tint = GenesisTextPrimary)
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier.size(32.dp).clip(CircleShape).background(GenesisGreen),
                contentAlignment = Alignment.Center
            ) {
                Icon(Icons.Default.PersonOutline, contentDescription = "Profile", tint = Color.Black, modifier = Modifier.size(20.dp))
            }
        }
    }
}

@Composable
fun GenesisBottomNav(activeTab: String, onSelectTab: (String) -> Unit) {
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
            val color = if (isSelected) GenesisGreen else GenesisTextSecondary
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
fun GenesisDashboard(
    state: GameStateEntity,
    viewModel: GameViewModel,
    onSelectCrypto: (String) -> Unit
) {
    val totalCryptoValue = state.cryptos.sumOf { it.quantity * it.currentPrice }
    val totalCryptoCost = state.cryptos.sumOf { it.quantity * (if (it.averagePurchasePrice > 0.0) it.averagePurchasePrice else it.currentPrice) }
    val totalPnl = totalCryptoValue - totalCryptoCost
    val pnlPct = if (totalCryptoCost > 0) (totalPnl / totalCryptoCost) * 100 else 0.0

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        contentPadding = PaddingValues(bottom = 24.dp)
    ) {
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("GENESIS CRYPTO BALANCE", color = GenesisTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(Icons.Default.Visibility, contentDescription = null, tint = GenesisTextSecondary, modifier = Modifier.size(16.dp))
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(GenesisGreen))
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Live Feeds", color = GenesisGreen, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("$${String.format("%,.2f", totalCryptoValue)}", color = GenesisTextPrimary, fontSize = 36.sp, fontWeight = FontWeight.ExtraBold)
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF0F2B20)).padding(horizontal = 10.dp, vertical = 6.dp)) {
                    val pnlSign = if (totalPnl >= 0) "+" else ""
                    val pnlColor = if (totalPnl >= 0) GenesisGreen else GenesisRed
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(if (totalPnl >= 0) Icons.Default.TrendingUp else Icons.Default.TrendingDown, contentDescription = null, tint = pnlColor, modifier = Modifier.size(12.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("$pnlSign$${String.format("%,.2f", totalPnl)} ($pnlSign${String.format("%.2f", pnlPct)}%)", color = pnlColor, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                Text("Past 24 hours", color = GenesisTextSecondary, fontSize = 13.sp)
            }
        }
        item { Spacer(modifier = Modifier.height(24.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(GenesisGreen).clickable {}.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.AddCircleOutline, contentDescription = null, tint = Color.Black, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Deposit Cash", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(Color(0xFF262C3D)).clickable {}.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Sync, contentDescription = null, tint = GenesisTextPrimary, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Recurring Buy", color = GenesisTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(24.dp)) }
        item {
            CryptoAnalystDeskCard(state = state, viewModel = viewModel)
        }
        item { Spacer(modifier = Modifier.height(24.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text("Explore Markets", color = GenesisTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.FilterList, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Filters", color = GenesisGreen, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
                Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(Color(0xFF262C3D)).padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.AllInclusive, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("All Coins", color = GenesisTextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(GenesisCardBg).padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Headphones, contentDescription = null, tint = GenesisTextSecondary, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Audio & Music Tokens", color = GenesisTextSecondary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Box(modifier = Modifier.clip(RoundedCornerShape(16.dp)).background(GenesisCardBg).padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Layers, contentDescription = null, tint = GenesisTextSecondary, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Layer 1", color = GenesisTextSecondary, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        items(state.cryptos) { crypto ->
            GenesisCryptoRow(crypto) { onSelectCrypto(crypto.id) }
            Spacer(modifier = Modifier.height(12.dp))
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item {
            Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(GenesisCardBg).padding(20.dp)) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.size(32.dp).clip(CircleShape).background(Color(0xFF142033)), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.Info, contentDescription = null, tint = Color(0xFF4FC3F7), modifier = Modifier.size(18.dp))
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("BEGINNER TIP • Royalties 101", color = GenesisTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text("How crypto royalties work in your empire", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold, lineHeight = 24.sp)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Earn daily yields whenever simulated artists stream their songs. Holdings unlock studio perks and automated fractional payouts straight to your balance.", color = GenesisTextSecondary, fontSize = 14.sp, lineHeight = 20.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                        Row {
                            Box(modifier = Modifier.size(24.dp).clip(CircleShape).background(Color(0xFF262C3D)).border(1.dp, GenesisCardBg, CircleShape), contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.MusicNote, contentDescription = null, tint = Color(0xFFFFC107), modifier = Modifier.size(12.dp))
                            }
                            Box(modifier = Modifier.size(24.dp).clip(CircleShape).background(Color(0xFF262C3D)).border(1.dp, GenesisCardBg, CircleShape).offset(x = (-8).dp), contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.Security, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(12.dp))
                            }
                            Box(modifier = Modifier.size(24.dp).clip(CircleShape).background(Color(0xFF262C3D)).border(1.dp, GenesisCardBg, CircleShape).offset(x = (-16).dp), contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.Timeline, contentDescription = null, tint = Color(0xFF4FC3F7), modifier = Modifier.size(12.dp))
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Learn more", color = GenesisGreen, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.Default.ArrowForward, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(16.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GenesisCryptoRow(crypto: Crypto, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(GenesisCardBg)
            .clickable { onClick() }
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    val cryptoLogo = when (crypto.id) {
                        "crypto_btc" -> "₿"
                        "crypto_eth" -> "Ξ"
                        "crypto_sol" -> "◎"
                        "crypto_meme" -> "🐕"
                        "crypto_music" -> "🎵"
                        "crypto_defi" -> "🏦"
                        else -> "🪙"
                    }
                    Text(cryptoLogo, fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(crypto.name.take(7) + "...", color = GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(modifier = Modifier.clip(RoundedCornerShape(8.dp)).background(Color(0xFF262C3D)).padding(horizontal = 6.dp, vertical = 2.dp)) {
                            Text(crypto.name.take(4).uppercase(), color = GenesisTextSecondary, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(crypto.name + " Token...", color = GenesisTextSecondary, fontSize = 12.sp, maxLines = 1)
                }
            }
            // Mini sparkline
            val isPos = crypto.recentChangePercent() >= 0
            val lineCol = if (isPos) GenesisGreen else GenesisRed
            Box(modifier = Modifier.width(40.dp).height(20.dp).padding(horizontal = 8.dp)) {
                androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val path = androidx.compose.ui.graphics.Path()
                    if (isPos) {
                        path.moveTo(0f, h)
                        path.lineTo(w*0.3f, h*0.8f)
                        path.lineTo(w*0.6f, h*0.6f)
                        path.lineTo(w, 0f)
                    } else {
                        path.moveTo(0f, 0f)
                        path.lineTo(w*0.3f, h*0.2f)
                        path.lineTo(w*0.6f, h*0.4f)
                        path.lineTo(w, h)
                    }
                    val stroke = androidx.compose.ui.graphics.drawscope.Stroke(width = 3f)
                    drawPath(path, color = lineCol, style = stroke)
                }
            }
            Column(horizontalAlignment = Alignment.End) {
                Text("$${String.format("%,.2f", crypto.currentPrice)}", color = GenesisTextPrimary, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(4.dp))
                val pnlSign = if (isPos) "+" else ""
                Text("$pnlSign${String.format("%.2f", crypto.recentChangePercent())}%", color = lineCol, fontSize = 11.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Composable
fun GenesisAssetDetails(crypto: Crypto, state: GameStateEntity, viewModel: GameViewModel, onBack: () -> Unit) {
    var activeTradeTab by remember { mutableStateOf("Buy") }
    var qtyInput by remember { mutableStateOf("250") }

    Column(modifier = Modifier.fillMaxSize().background(GenesisBg)) {
        // Top Bar
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = GenesisTextPrimary, modifier = Modifier.clickable { onBack() })
                Spacer(modifier = Modifier.width(16.dp))
                Text("Asset Details", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.NotificationsNone, contentDescription = "Alerts", tint = GenesisTextPrimary)
                Spacer(modifier = Modifier.width(16.dp))
                Box(modifier = Modifier.size(32.dp).clip(CircleShape).background(GenesisGreen), contentAlignment = Alignment.Center) {
                    Icon(Icons.Default.PersonOutline, contentDescription = "Profile", tint = Color.Black, modifier = Modifier.size(20.dp))
                }
            }
        }

        LazyColumn(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp), contentPadding = PaddingValues(bottom = 24.dp)) {
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top) {
                    Row(modifier = Modifier.weight(1f)) {
                        Box(modifier = Modifier.size(48.dp).clip(CircleShape).background(Color(0xFF142033)).border(2.dp, GenesisGreen, CircleShape), contentAlignment = Alignment.Center) {
                            Box(modifier = Modifier.size(16.dp).clip(CircleShape).border(2.dp, GenesisGreen, CircleShape))
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(GenesisGreen))
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(crypto.name, color = GenesisTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(8.dp))
                                Box(modifier = Modifier.clip(RoundedCornerShape(8.dp)).background(Color(0xFF262C3D)).padding(horizontal = 6.dp, vertical = 2.dp)) {
                                    Text(crypto.name.take(4).uppercase(), color = GenesisTextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(GenesisGreen))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Decentralized Audio • Royalty Tier", color = GenesisTextSecondary, fontSize = 13.sp)
                            }
                        }
                    }
                    Row {
                        Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(GenesisCardBg), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.FavoriteBorder, contentDescription = "Favorite", tint = GenesisTextSecondary, modifier = Modifier.size(20.dp))
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(GenesisCardBg), contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.IosShare, contentDescription = "Share", tint = GenesisTextSecondary, modifier = Modifier.size(20.dp))
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                Row(verticalAlignment = Alignment.Bottom) {
                    Text("$${String.format("%,.2f", crypto.currentPrice)}", color = GenesisTextPrimary, fontSize = 42.sp, fontWeight = FontWeight.ExtraBold)
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val pnlSign = if (crypto.recentChangePercent() >= 0) "+" else ""
                    val pnlColor = if (crypto.recentChangePercent() >= 0) GenesisGreen else GenesisRed
                    Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF0F2B20)).padding(horizontal = 10.dp, vertical = 6.dp)) {
                        Text("↑ $pnlSign$${String.format("%.2f", crypto.currentPrice * (crypto.recentChangePercent()/100.0))} ($pnlSign${String.format("%.2f", crypto.recentChangePercent())}%)", color = pnlColor, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Past Week", color = GenesisTextSecondary, fontSize = 13.sp)
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                // Main chart
                Box(modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(24.dp)).background(GenesisCardBg)) {
                    Box(modifier = Modifier.fillMaxSize().padding(top = 16.dp, bottom = 40.dp)) {
                        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                            val w = size.width
                            val h = size.height
                            val path = androidx.compose.ui.graphics.Path()
                            path.moveTo(0f, h * 0.8f)
                            path.cubicTo(w * 0.3f, h * 0.7f, w * 0.6f, h * 0.4f, w, h * 0.1f)
                            val stroke = androidx.compose.ui.graphics.drawscope.Stroke(width = 6f)
                            drawPath(path, color = GenesisGreen, style = stroke)
                            path.lineTo(w, h)
                            path.lineTo(0f, h)
                            path.close()
                            drawPath(path, brush = Brush.verticalGradient(listOf(GenesisGreen.copy(alpha = 0.2f), Color.Transparent)))
                            drawCircle(color = GenesisGreen, radius = 10f, center = androidx.compose.ui.geometry.Offset(w, h * 0.1f))
                            drawCircle(color = Color.White, radius = 4f, center = androidx.compose.ui.geometry.Offset(w, h * 0.1f))
                        }
                    }
                    Row(modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter).background(Color(0xFF141722), RoundedCornerShape(16.dp)).padding(4.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                        listOf("1D", "1W", "1M", "1Y", "ALL").forEach { t ->
                            val isSel = t == "1W"
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(if (isSel) Color(0xFF262C3D) else Color.Transparent)
                                    .padding(horizontal = 16.dp, vertical = 6.dp)
                            ) {
                                Text(t, color = if (isSel) GenesisGreen else GenesisTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                            }
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                // Your Position
                Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(GenesisCardBg).padding(20.dp)) {
                    Column {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                            Text("YOUR POSITION", color = GenesisTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                            Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF262C3D)).padding(horizontal = 10.dp, vertical = 4.dp)) {
                                Text("Verified Vault", color = GenesisTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Medium)
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Column {
                                Text("Your Balance", color = GenesisTextSecondary, fontSize = 13.sp)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("${String.format("%.4f", crypto.quantity)} ${crypto.name.take(4).uppercase()}", color = GenesisTextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("$${String.format("%,.2f", crypto.quantity * crypto.currentPrice)} USD", color = GenesisTextSecondary, fontSize = 13.sp)
                            }
                            Column {
                                val pnl = (crypto.currentPrice - crypto.currentPrice) * crypto.quantity
                                val pnlPct = if (crypto.currentPrice > 0) ((crypto.currentPrice - crypto.currentPrice) / crypto.currentPrice) * 100 else 0.0
                                val sign = if (pnl >= 0) "+" else ""
                                val color = if (pnl >= 0) GenesisGreen else GenesisRed
                                Text("Total Return", color = GenesisTextSecondary, fontSize = 13.sp)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("$sign$${String.format("%,.2f", pnl)}", color = color, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text("$sign${String.format("%.2f", pnlPct)}% overall", color = color, fontSize = 13.sp)
                            }
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item {
                Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(GenesisCardBg).padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.size(56.dp).clip(RoundedCornerShape(12.dp)).background(Color.DarkGray)) {
                            // Placeholder image
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.VerifiedUser, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(14.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Audio Ledger Royalty v4", color = GenesisGreen, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Text("Daily streaming payouts deposit straight into your Genesis wallet in...", color = GenesisTextPrimary, fontSize = 13.sp, lineHeight = 18.sp)
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item {
                val analystPred = crypto.analystPrediction
                val hasIntel = analystPred.isNotEmpty() && analystPred != "UNASSISTED"
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (hasIntel) (if (analystPred == "RISE") GenesisGreen.copy(alpha = 0.12f) else GenesisRed.copy(alpha = 0.12f)) else GenesisCardBg)
                        .border(1.dp, if (hasIntel) (if (analystPred == "RISE") GenesisGreen.copy(alpha = 0.4f) else GenesisRed.copy(alpha = 0.4f)) else Color(0xFF262C3D), RoundedCornerShape(20.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = if (hasIntel) (if (analystPred == "RISE") Icons.Default.TrendingUp else Icons.Default.TrendingDown) else Icons.Default.Shield,
                                    contentDescription = null,
                                    tint = if (hasIntel) (if (analystPred == "RISE") GenesisGreen else GenesisRed) else Color(0xFFFFD700),
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = if (hasIntel) "ANALYST INTEL: $analystPred (${crypto.predictionConfidence}% CONF)" else "ANALYST INTEL: UNASSISTED",
                                    color = if (hasIntel) (if (analystPred == "RISE") GenesisGreen else GenesisRed) else Color(0xFFFFD700),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = crypto.predictionReason.ifEmpty {
                                "Digital assets undergo violent shifts (+85% / -60%). Retaining an elite Crypto Analyst forecasts breakouts and mitigates crash losses."
                            },
                            color = GenesisTextPrimary,
                            fontSize = 12.sp,
                            lineHeight = 17.sp
                        )
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                // Buy/Sell section
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(GenesisCardBg).padding(4.dp)) {
                        Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(if (activeTradeTab == "Buy") GenesisGreen else Color.Transparent).clickable { activeTradeTab = "Buy" }.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                            Text("Buy", color = if (activeTradeTab == "Buy") Color.Black else GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(modifier = Modifier.weight(1f).clip(RoundedCornerShape(20.dp)).background(if (activeTradeTab == "Sell") GenesisRed else Color.Transparent).clickable { activeTradeTab = "Sell" }.padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                            Text("Sell", color = if (activeTradeTab == "Sell") Color.Black else GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(modifier = Modifier.weight(1.5f).clip(RoundedCornerShape(20.dp)).background(Color(0xFF262C3D)).padding(vertical = 12.dp), contentAlignment = Alignment.Center) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text("Market Order", color = GenesisTextPrimary, fontSize = 14.sp)
                                Icon(Icons.Default.KeyboardArrowDown, contentDescription = null, tint = GenesisTextPrimary, modifier = Modifier.size(16.dp))
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        listOf("$50", "$100", "$250", "$500", "Custom").forEach {
                            val isSel = it == "$250"
                            Box(modifier = Modifier.weight(1f).padding(horizontal = 4.dp).clip(RoundedCornerShape(16.dp)).background(if (isSel) Color(0xFF1B4032) else Color(0xFF1E2333)).clickable {}.padding(vertical = 10.dp), contentAlignment = Alignment.Center) {
                                Text(it, color = if (isSel) GenesisGreen else GenesisTextSecondary, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).background(GenesisCardBg).padding(horizontal = 16.dp, vertical = 20.dp)) {
                        Column {
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                Text("You Pay", color = GenesisTextSecondary, fontSize = 14.sp)
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Text("$250.00", color = GenesisTextPrimary, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("USD", color = GenesisTextSecondary, fontSize = 12.sp, modifier = Modifier.offset(y = (-3).dp))
                                }
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Box(modifier = Modifier.size(36.dp).clip(CircleShape).background(Color(0xFF262C3D)), contentAlignment = Alignment.Center) {
                                    Icon(Icons.Default.SwapVert, contentDescription = null, tint = GenesisGreen, modifier = Modifier.size(20.dp))
                                }
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                Text("You Receive", color = GenesisTextSecondary, fontSize = 14.sp)
                                Row(verticalAlignment = Alignment.Bottom) {
                                    Text("≈ ${String.format("%.5f", 250.0 / crypto.currentPrice)}", color = GenesisGreen, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(crypto.name.take(4).uppercase(), color = GenesisTextSecondary, fontSize = 12.sp, modifier = Modifier.offset(y = (-3).dp))
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.AccountBalanceWallet, contentDescription = null, tint = GenesisTextSecondary, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Available Cash Balance", color = GenesisTextSecondary, fontSize = 13.sp)
                        }
                        Text("$${String.format("%,.2f", state.cash)}", color = GenesisTextPrimary, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("Estimated Network Gas Fee", color = GenesisTextSecondary, fontSize = 13.sp)
                        Text("$0.00 • Genesis Covered", color = GenesisGreen, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                    val amount = 250.0
                    Box(
                        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(if (activeTradeTab == "Buy") GenesisGreen else GenesisRed)
                            .clickable {
                                if (activeTradeTab == "Buy") viewModel.buyCrypto(crypto.id, amount) else viewModel.sellCrypto(crypto.id, amount / crypto.currentPrice)
                                onBack()
                            }.padding(vertical = 16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("${activeTradeTab} ${crypto.name} Now", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(Icons.Default.ArrowForward, contentDescription = null, tint = Color.Black, modifier = Modifier.size(18.dp))
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(32.dp)) }
            item {
                Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(GenesisCardBg).padding(20.dp)) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(modifier = Modifier.size(32.dp).clip(CircleShape).background(Color(0xFF142033)), contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.Info, contentDescription = null, tint = Color(0xFF4FC3F7), modifier = Modifier.size(18.dp))
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("What is ${crypto.name}?", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text("${crypto.name} is the primary decentralized music protocol backing streaming royalties in your simulation. It turns track engagement and listener play counts into instant on-chain dividend yields.", color = GenesisTextSecondary, fontSize = 14.sp, lineHeight = 22.sp)
                    }
                }
            }
            item { Spacer(modifier = Modifier.height(24.dp)) }
            item {
                Text("PROTOCOL METRICS", color = GenesisTextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text("24h Trading Volume", color = GenesisTextSecondary, fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("$18.4M", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text("Market Capitalization", color = GenesisTextSecondary, fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("$1.12B", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text("Circulating Royalty Supply", color = GenesisTextSecondary, fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("19.8M ${crypto.name.take(4).uppercase()}", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text("All-Time Peak", color = GenesisTextSecondary, fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("$68,490.00", color = GenesisTextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
