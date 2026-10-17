import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

target = """            val phoneContainerColor = when (state.activePhone) {
                "TECCNO" -> Color(0xFF111111)
                "No-Thing" -> Color(0xFF222222)
                else -> Color(0xFF1A1D24)
            }"""

replacement = """            val phoneContainerColor = when (state.activePhone) {
                "TECCNO" -> Color(0xFF111111)
                "No-Thing" -> Color(0xFF222222)
                else -> Color(0xFF1A1D24)
            }
            
            val phoneBgImage = when (state.activePhone) {
                "Samsong" -> R.drawable.img_unnamed_14
                "TECCNO" -> R.drawable.img_unnamed_15
                "Xiaomax" -> R.drawable.img_unnamed_16
                "No-Thing" -> R.drawable.img_unnamed_17
                "Pixxelate" -> R.drawable.img_unnamed_18
                "hiPhone" -> R.drawable.img_unnamed_19
                else -> R.drawable.img_unnamed_14
            }"""

text = text.replace(target, replacement)

box_target = """            // Main Phone Frame Box
            Box(
                modifier = Modifier
                    .width(phoneWidth)
                    .height(phoneHeight)
                    .clip(phoneOuterShape)
                    .background(phoneFrameColor)
                    .border(phoneBorderThickness, Color.White.copy(alpha = 0.15f), phoneOuterShape)
                    .padding(phoneBezelThickness),
                contentAlignment = Alignment.Center
            ) {"""

box_replacement = """            // Main Phone Frame Box
            Box(
                modifier = Modifier
                    .width(phoneWidth)
                    .height(phoneHeight)
                    .clip(phoneOuterShape)
                    .border(phoneBorderThickness, Color.White.copy(alpha = 0.15f), phoneOuterShape)
            ) {
                androidx.compose.foundation.Image(
                    painter = androidx.compose.ui.res.painterResource(id = phoneBgImage),
                    contentDescription = "Phone Hardware",
                    contentScale = androidx.compose.ui.layout.ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(phoneBezelThickness),
                    contentAlignment = Alignment.Center
                ) {"""

text = text.replace(box_target, box_replacement)

# We need to add an extra closing brace because we opened a new Box
close_target = """                }
                
                // Active App Screen Injection"""
                
close_replacement = """                }
                }
                
                // Active App Screen Injection"""

text = text.replace(close_target, close_replacement)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

