import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

# 1. Add top overlays (Samsong Weather, TECCNO badge, Xiaomax Game Turbo, hiPhone island extra text?)
# Wait, hiPhone doesn't have an extra banner. It just has the Island which we already did.
# Samsong has Weather + OneOS.
# TECCNO has Name + Boost.
# Xiaomax has Game Turbo.
top_overlays = """        // Living Interactive Top Widgets
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Phone Specific Top Banners
            when (state.activePhone) {
                "Samsong" -> {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 2.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(imageVector = Icons.Default.WbSunny, contentDescription = null, tint = Color(0xFFFFC107), modifier = Modifier.size(14.dp))
                            Text("Neo City 72°F • Partly Cloudy", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(imageVector = Icons.Default.Memory, contentDescription = null, tint = Color(0xFF00BCD4), modifier = Modifier.size(12.dp))
                            Text("OneOS 7.0 Ultra", color = Color.White.copy(alpha = 0.8f), fontSize = 10.sp)
                        }
                    }
                }
                "TECCNO" -> {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 2.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF00E676)))
                            Text("TECOO SPARK 20 • HIOS GO", color = Color.White.copy(alpha = 0.9f), fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        }
                        Box(modifier = Modifier.clip(RoundedCornerShape(12.dp)).background(Color(0xFF00E676).copy(alpha=0.2f)).border(1.dp, Color(0xFF00E676), RoundedCornerShape(12.dp)).padding(horizontal = 8.dp, vertical = 4.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                Icon(imageVector = Icons.Default.RocketLaunch, contentDescription = null, tint = Color(0xFF00E676), modifier = Modifier.size(12.dp))
                                Text("BOOST +2.1GB", color = Color(0xFF00E676), fontSize = 9.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
                "Xiaomax" -> {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 2.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF00E676)))
                            Text("HyperOS 2.0 • Ecosystem 5G Ultra", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
                        }
                    }
                }
            }
"""

text = text.replace("""        // Living Interactive Top Widgets
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {""", top_overlays)

# 2. Xiaomax also has a GAME TURBO overlay right below the 2nd row of widgets!
# Wait, actually it's easier to put Xiaomax GAME TURBO between the widgets and the Apps Grid.
# Let's find: `        // 4-Column High-Craft Fictional Ecosystem App Grid`
game_turbo = """            // Phone Specific Mid Banners
            if (state.activePhone == "Xiaomax") {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp).clip(RoundedCornerShape(8.dp)).background(Color.Black.copy(alpha=0.4f)).padding(horizontal = 8.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Icon(imageVector = Icons.Default.Memory, contentDescription = null, tint = Color(0xFFFF5722), modifier = Modifier.size(12.dp))
                        Text("GAME TURBO 6.0", color = Color.White.copy(alpha=0.9f), fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text("RAM", color = Color.Gray, fontSize = 8.sp)
                        Text("16GB+8GB", color = Color(0xFF2196F3), fontSize = 9.sp, fontWeight = FontWeight.Bold)
                        Text("•", color = Color.Gray, fontSize = 9.sp)
                        Text("54 FPS", color = Color(0xFF00E676), fontSize = 9.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

        // 4-Column High-Craft Fictional Ecosystem App Grid"""

text = text.replace("        // 4-Column High-Craft Fictional Ecosystem App Grid", game_turbo)

# 3. Pixxelate Bottom Search Bar right above the Dock.
# Let's find: `        // Frosted Glass Dock with 4 Primary Quick-Launch Apps`
search_bar = """        // Pixxelate Bottom Search Bar
        if (state.activePhone == "Pixxelate") {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 4.dp).clip(RoundedCornerShape(24.dp)).background(Color(0xFF1E1E1E)).padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = null, tint = Color.White.copy(alpha=0.8f), modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(12.dp))
                Text("Ask Gemini or Search...", color = Color.White.copy(alpha=0.6f), fontSize = 13.sp, modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.Default.Mic, contentDescription = null, tint = Color.White.copy(alpha=0.8f), modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(12.dp))
                Icon(imageVector = Icons.Default.CameraAlt, contentDescription = null, tint = Color.White.copy(alpha=0.8f), modifier = Modifier.size(16.dp))
            }
        }
        
        // Frosted Glass Dock with 4 Primary Quick-Launch Apps"""
text = text.replace("        // Frosted Glass Dock with 4 Primary Quick-Launch Apps", search_bar)


with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

