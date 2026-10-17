import os

code = """package com.example.ui.social

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.GameStateEntity
import com.example.data.GameViewModel

val ccGold = Color(0xFFFFD166) // Slightly brighter gold
val ccGoldMuted = Color(0xFFB39659)
val ccDarkBg = Color(0xFF0C0C0E)
val ccCardBg = Color(0xFF141418)
val ccGreyText = Color(0xFF8E8E93)

@Composable
fun CapitalClubScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedTab by remember { mutableStateOf("Discover") }
    var bottomTab by remember { mutableStateOf("MATCH") }

    Scaffold(
        containerColor = ccDarkBg,
        bottomBar = {
            CapitalClubBottomNav(
                selectedTab = bottomTab,
                onTabSelected = { bottomTab = it }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            CapitalClubHeader()
            Spacer(modifier = Modifier.height(16.dp))
            CapitalClubTabs(selectedTab, onTabSelected = { selectedTab = it })
            Spacer(modifier = Modifier.height(16.dp))
            MainProfileCard()
            Spacer(modifier = Modifier.height(24.dp))
            CuratedTodaySection()
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun CapitalClubHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(ccGold),
                contentAlignment = Alignment.Center
            ) {
                Text("CC", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "CAPITAL CLUB",
                        color = Color.White,
                        fontWeight = FontWeight.Black,
                        fontSize = 16.sp,
                        letterSpacing = 1.sp
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .border(1.dp, ccGoldMuted, RoundedCornerShape(4.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text("PRIVATE TIER", color = ccGoldMuted, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Text(
                    "FOUNDER & ALLIANCE SALON",
                    color = ccGreyText,
                    fontSize = 10.sp,
                    letterSpacing = 0.5.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Column(horizontalAlignment = Alignment.End) {
            Text("NETWORK CAP", color = ccGreyText, fontSize = 9.sp, fontWeight = FontWeight.Bold)
            Text("$37,685M", color = ccGold, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun CapitalClubTabs(selectedTab: String, onTabSelected: (String) -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(12.dp),
        color = Color(0xFF16161A),
        border = BorderStroke(1.dp, Color(0xFF2A2A30))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            val tabs = listOf("Discover", "Invites", "Chats")
            tabs.forEach { tab ->
                val isSelected = tab == selectedTab
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (isSelected) Color(0xFF1E212A) else Color.Transparent)
                        .clickable { onTabSelected(tab) }
                        .padding(vertical = 10.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        if (tab == "Discover" && isSelected) {
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(ccGold))
                            Spacer(modifier = Modifier.width(6.dp))
                        }
                        if (tab == "Chats" && !isSelected) {
                            Spacer(modifier = Modifier.width(6.dp))
                        }
                        Text(
                            text = tab,
                            color = if (isSelected) Color.White else ccGreyText,
                            fontSize = 13.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                        )
                        if (tab == "Invites") {
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .size(16.dp)
                                    .clip(CircleShape)
                                    .background(ccGoldMuted),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("3", color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        if (tab == "Chats" && !isSelected) {
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color.DarkGray))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MainProfileCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(ccCardBg)
            .border(1.dp, Color(0xFF2A2A30), RoundedCornerShape(20.dp))
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
            ) {
                AsyncImage(
                    model = "https://images.unsplash.com/photo-1573496359142-b8d87734a5a2?q=80&w=600&auto=format&fit=crop",
                    contentDescription = "Sophia Lin",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                // Gradient overlay at bottom
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.8f)),
                                startY = 600f
                            )
                        )
                )
                // Top tags
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    // New Member
                    Row(
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                            .padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(ccGold))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("NEW MEMBER", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                    // Location
                    Row(
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                            .padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("SoHo, NYC", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                
                // Name and Title
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("Sophia Lin, 27", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(Icons.Default.CheckCircle, contentDescription = "Verified", tint = ccGold, modifier = Modifier.size(20.dp))
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Founder & Angel • Climate Fintech", color = Color.LightGray, fontSize = 14.sp)
                }
            }
            
            // Details Section
            Column(modifier = Modifier.padding(16.dp)) {
                // Vision Alignment
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color(0xFF2A2A30), RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.CheckCircleOutline, contentDescription = null, tint = ccGoldMuted, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Vision Alignment", color = ccGreyText, fontSize = 13.sp)
                            }
                            Text("94% COMPATIBLE", color = ccGold, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        // Progress Bar
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp)
                                .background(Color(0xFF2A2A30), CircleShape)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.94f)
                                    .height(4.dp)
                                    .background(ccGold, CircleShape)
                            )
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Co-Founding Synergy
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color(0xFF2A2A30), RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .background(Color(0xFF2A2A30), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Default.TrendingUp, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text("CO-FOUNDING SYNERGY", color = ccGoldMuted, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            Text("+12% Capital Velocity on Shared Ventures", color = Color.White, fontSize = 13.sp)
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // Quote
                Text(
                    "\"Building sustainable climate fintech. Weekends scouting contemporary art and natural wine bars.\"",
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // Tags
                @OptIn(ExperimentalLayoutApi::class)
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val tags = listOf("Angel Syndicate", "Seed Investor", "Art Collector", "Triathlon")
                    tags.forEach { tag ->
                        Box(
                            modifier = Modifier
                                .border(1.dp, Color(0xFF2A2A30), RoundedCornerShape(16.dp))
                                .background(Color(0xFF1E1E24), RoundedCornerShape(16.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(tag, color = Color.White, fontSize = 12.sp)
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(24.dp))
                
                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Close button
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .border(1.dp, Color(0xFF2A2A30), CircleShape)
                            .background(Color(0xFF16161A), CircleShape)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.Close, contentDescription = "Pass", tint = Color.White, modifier = Modifier.size(24.dp))
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    
                    // Star button
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .border(1.dp, Color(0xFF2A2A30), CircleShape)
                            .background(Color(0xFF16161A), CircleShape)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.Star, contentDescription = "Super Like", tint = ccGoldMuted, modifier = Modifier.size(24.dp))
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    
                    // Heart button
                    Box(
                        modifier = Modifier
                            .size(72.dp)
                            .background(
                                Brush.radialGradient(
                                    colors = listOf(ccGold, Color(0xFFB39659)),
                                ),
                                CircleShape
                            )
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.Favorite, contentDescription = "Like", tint = Color.Black, modifier = Modifier.size(32.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun CuratedTodaySection() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("CURATED TODAY", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Black, letterSpacing = 1.sp)
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .background(Color(0xFF1E1E24), RoundedCornerShape(12.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text("Salon Pool", color = ccGreyText, fontSize = 10.sp)
                }
            }
            Text("View All \u2192", color = ccGold, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                CuratedCard(
                    name = "Julian Reed, 29",
                    title = "Horizon VC",
                    match = "92% Match",
                    tag = "Partner",
                    imageUrl = "https://images.unsplash.com/photo-1560250097-0b93528c311a?q=80&w=600&auto=format&fit=crop"
                )
            }
            item {
                CuratedCard(
                    name = "Chloe Davenport, 28",
                    title = "Quant Strategist",
                    match = "97% Match",
                    tag = "Quant",
                    imageUrl = "https://images.unsplash.com/photo-1580489944761-15a19d654956?q=80&w=600&auto=format&fit=crop"
                )
            }
            item {
                CuratedCard(
                    name = "Marcus Vance, 31",
                    title = "Ai Researcher",
                    match = "89% Match",
                    tag = "Founder",
                    imageUrl = "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?q=80&w=600&auto=format&fit=crop"
                )
            }
        }
    }
}

@Composable
fun CuratedCard(name: String, title: String, match: String, tag: String, imageUrl: String) {
    Box(
        modifier = Modifier
            .width(160.dp)
            .height(220.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(ccCardBg)
            .border(1.dp, Color(0xFF2A2A30), RoundedCornerShape(16.dp))
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(140.dp)
        )
        // Fade at the bottom of the image
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, ccCardBg),
                        startY = 150f,
                        endY = 400f
                    )
                )
        )
        
        // Tag
        Box(
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.TopEnd)
                .background(Color.Black.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(tag, color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
        }
        
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(12.dp)
        ) {
            Text(name, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(2.dp))
            Text(title, color = ccGreyText, fontSize = 11.sp)
            Spacer(modifier = Modifier.height(6.dp))
            Text(match, color = ccGold, fontSize = 11.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun CapitalClubBottomNav(selectedTab: String, onTabSelected: (String) -> Unit) {
    Surface(
        color = Color(0xFF0C0C0E),
        border = BorderStroke(1.dp, Color(0xFF2A2A30).copy(alpha = 0.5f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavItem("DASH", Icons.Default.Home, selectedTab == "DASH", onClick = { onTabSelected("DASH") })
            BottomNavItem("MARKET", Icons.Default.ShowChart, selectedTab == "MARKET", onClick = { onTabSelected("MARKET") })
            BottomNavItem("EMPIRE", Icons.Default.Domain, selectedTab == "EMPIRE", onClick = { onTabSelected("EMPIRE") })
            BottomNavItem("MATCH", Icons.Default.Favorite, selectedTab == "MATCH", onClick = { onTabSelected("MATCH") })
            BottomNavItem("BRIEF", Icons.Default.Info, selectedTab == "BRIEF", onClick = { onTabSelected("BRIEF") })
        }
    }
}

@Composable
fun BottomNavItem(label: String, icon: androidx.compose.ui.graphics.vector.ImageVector, isSelected: Boolean, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable { onClick() }.padding(4.dp)
    ) {
        Box(contentAlignment = Alignment.TopEnd) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = if (isSelected) ccGold else ccGreyText,
                modifier = Modifier.size(24.dp)
            )
            if (isSelected && label == "MATCH") {
                Box(
                    modifier = Modifier
                        .offset(x = 4.dp, y = (-2).dp)
                        .size(6.dp)
                        .background(Color.White, CircleShape)
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            label,
            color = if (isSelected) ccGold else ccGreyText,
            fontSize = 9.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
        )
    }
}
"""
with open("app/src/main/java/com/example/ui/social/CapitalClubScreen.kt", "w") as f:
    f.write(code)
print("Created CapitalClubScreen.kt")
