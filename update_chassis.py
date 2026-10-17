import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

target = """            // Simulated Premium Flagship Smartphone Frame
            Card(
                shape = phoneOuterShape,
                border = BorderStroke(phoneBorderThickness, phoneFrameColor),
                colors = CardDefaults.cardColors(containerColor = phoneContainerColor),
                modifier = Modifier
                    .width(phoneWidth)
                    .height(phoneHeight)
                    .clickable(enabled = false) {}
                    .padding(phoneBezelThickness) // Slimmer bezels
                    .testTag("smartphone_bezel_frame")
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(phoneInnerClip)
                ) {"""

replacement = """            // Simulated Premium Flagship Smartphone Frame
            Box(
                modifier = Modifier
                    .width(phoneWidth)
                    .height(phoneHeight)
                    .clip(phoneOuterShape)
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
                        .padding(phoneBezelThickness) // Slimmer bezels
                        .clip(phoneInnerClip)
                ) {"""

text = text.replace(target, replacement)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

