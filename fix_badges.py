import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

# 1. Add the external badge above the phone frame
external_badge = """        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.75f))
                .clickable { onDismiss() },
            contentAlignment = Alignment.Center
        ) {
            // External Device Identification Badge
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 16.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color.Black.copy(alpha = 0.6f))
                    .border(1.dp, Color.White.copy(alpha = 0.1f), RoundedCornerShape(24.dp))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Box(modifier = Modifier.size(8.dp).clip(CircleShape).background(Color(0xFF00E676)))
                    val phoneLabel = when (state.activePhone) {
                        "TECCNO" -> "TECCNO Spark • HiOS GO"
                        "Xiaomax" -> "Xiaomax HyperOS • Ecosystem 5G Ultra"
                        "No-Thing" -> "No-Thing GLYPH // OS"
                        "Pixxelate" -> "Pixxelate Pro • Pixel UI"
                        "Samsong" -> "Samsong Galaxy • OneOS 7.0 Ultra"
                        "hiPhone" -> "hiPhone 16 Pro • HiOS 18"
                        else -> "Smartphone"
                    }
                    Text(phoneLabel, color = Color.White.copy(alpha=0.9f), fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }
            }
"""
text = text.replace("""        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.75f))
                .clickable { onDismiss() },
            contentAlignment = Alignment.Center
        ) {""", external_badge)


# 2. Remove the inline top banners from Living Interactive Top Widgets
top_widgets_bad = """        // Living Interactive Top Widgets
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
            }"""

top_widgets_good = """        // Living Interactive Top Widgets
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {"""

text = text.replace(top_widgets_bad, top_widgets_good)


with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

