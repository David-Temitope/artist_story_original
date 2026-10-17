import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

# Add Samsong weather widget
top_widgets_good = """        // Living Interactive Top Widgets
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Phone Specific Top Banners
            if (state.activePhone == "Samsong") {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 2.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        Icon(imageVector = Icons.Default.WbSunny, contentDescription = null, tint = Color(0xFFFFC107), modifier = Modifier.size(14.dp))
                        Text("Neo City 72°F • Partly Cloudy", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
                    }
                }
            }"""

text = text.replace("""        // Living Interactive Top Widgets
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {""", top_widgets_good)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

