import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

# REPLACE WALLPAPER LOGIC
old_wallpaper = """                    val wallpaperBrush = when (state.wallpaperId) {
                        "Cyber Sunset", "sunset" -> Brush.verticalGradient(listOf(Color(0xFF1A1525), Color(0xFF110D18)))
                        "Cosmic Nebula", "nebula" -> Brush.verticalGradient(listOf(Color(0xFF0F1115), Color(0xFF161922)))
                        "Midnight Forest", "forest" -> Brush.verticalGradient(listOf(Color(0xFF0A0F0C), Color(0xFF101612)))
                        "Golden Hour", "golden" -> Brush.verticalGradient(listOf(Color(0xFF1C1810), Color(0xFF12100B)))
                        else -> Brush.verticalGradient(listOf(Color(0xFF0F1115), Color(0xFF1A1D24)))
                    }
                    Box(modifier = Modifier.fillMaxSize().background(wallpaperBrush)) {
                        // High-definition atmospheric light reflections (blurred vector orbs)
                        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                            val w = size.width
                            val h = size.height
                            when (state.wallpaperId) {
                                "Cyber Sunset", "sunset" -> {
                                    drawCircle(
                                        color = Color(0x38FF9800),
                                        radius = w * 0.75f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.1f, h * 0.25f)
                                    )
                                    drawCircle(
                                        color = Color(0x2CE91E63),
                                        radius = w * 0.55f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.9f, h * 0.75f)
                                    )
                                }
                                "Cosmic Nebula", "nebula" -> {
                                    drawCircle(
                                        color = Color(0x3C9C27B0),
                                        radius = w * 0.8f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.5f, h * 0.5f)
                                    )
                                    drawCircle(
                                        color = Color(0x2A00BCD4),
                                        radius = w * 0.5f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.15f, h * 0.25f)
                                    )
                                }
                                "Midnight Forest", "forest" -> {
                                    drawCircle(
                                        color = Color(0x302E7D32),
                                        radius = w * 0.7f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.3f, h * 0.2f)
                                    )
                                    drawCircle(
                                        color = Color(0x2281C784),
                                        radius = w * 0.5f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.8f, h * 0.8f)
                                    )
                                }
                                "Golden Hour", "golden" -> {
                                    drawCircle(
                                        color = Color(0x3BFFEB3B),
                                        radius = w * 0.75f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.3f)
                                    )
                                    drawCircle(
                                        color = Color(0x2BFF5722),
                                        radius = w * 0.6f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.8f, h * 0.65f)
                                    )
                                }
                                else -> { // Slate / standard
                                    drawCircle(
                                        color = Color(0x1B3F51B5),
                                        radius = w * 0.6f,
                                        center = androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.35f)
                                    )
                                }
                            }
                        }"""

new_wallpaper = """                    val wallpaperBrush = when (state.activePhone) {
                        "hiPhone" -> Brush.verticalGradient(listOf(Color(0xFF281C22), Color(0xFF14131D)))
                        "Samsong" -> Brush.verticalGradient(listOf(Color(0xFF101B2E), Color(0xFF241528)))
                        "TECCNO" -> Brush.verticalGradient(listOf(Color(0xFF12222E), Color(0xFF380720)))
                        "No-Thing" -> Brush.verticalGradient(listOf(Color(0xFF0A0A0A), Color(0xFF030303)))
                        "Xiaomax" -> Brush.verticalGradient(listOf(Color(0xFF361811), Color(0xFF111E30)))
                        "Pixxelate" -> Brush.verticalGradient(listOf(Color(0xFF2E1914), Color(0xFF141525)))
                        else -> Brush.verticalGradient(listOf(Color(0xFF0F1115), Color(0xFF1A1D24)))
                    }
                    Box(modifier = Modifier.fillMaxSize().background(wallpaperBrush)) {
                        // High-definition atmospheric light reflections (blurred vector orbs)
                        androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
                            val w = size.width
                            val h = size.height
                            when (state.activePhone) {
                                "hiPhone" -> {
                                    drawCircle(color = Color(0x25FF7B54), radius = w * 0.75f, center = androidx.compose.ui.geometry.Offset(w * 0.1f, h * 0.2f))
                                    drawCircle(color = Color(0x259C27B0), radius = w * 0.6f, center = androidx.compose.ui.geometry.Offset(w * 0.9f, h * 0.8f))
                                }
                                "Samsong" -> {
                                    drawCircle(color = Color(0x2500BCD4), radius = w * 0.75f, center = androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.3f))
                                    drawCircle(color = Color(0x25E91E63), radius = w * 0.6f, center = androidx.compose.ui.geometry.Offset(w * 0.8f, h * 0.7f))
                                }
                                "TECCNO" -> {
                                    drawCircle(color = Color(0x2500ACC1), radius = w * 0.65f, center = androidx.compose.ui.geometry.Offset(w * 0.3f, h * 0.2f))
                                    drawCircle(color = Color(0x25D81B60), radius = w * 0.8f, center = androidx.compose.ui.geometry.Offset(w * 0.7f, h * 0.8f))
                                }
                                "No-Thing" -> {
                                    // Draw dotted grid
                                    val dotRadius = 2.5f
                                    val spacing = 50f
                                    for (x in 0..(w / spacing).toInt()) {
                                        for (y in 0..(h / spacing).toInt()) {
                                            drawCircle(
                                                color = Color.White.copy(alpha = 0.08f),
                                                radius = dotRadius,
                                                center = androidx.compose.ui.geometry.Offset(x * spacing + 25f, y * spacing + 25f)
                                            )
                                        }
                                    }
                                }
                                "Xiaomax" -> {
                                    drawCircle(color = Color(0x25FF5722), radius = w * 0.75f, center = androidx.compose.ui.geometry.Offset(w * 0.1f, h * 0.25f))
                                    drawCircle(color = Color(0x252196F3), radius = w * 0.55f, center = androidx.compose.ui.geometry.Offset(w * 0.9f, h * 0.75f))
                                }
                                "Pixxelate" -> {
                                    drawCircle(color = Color(0x25FF9800), radius = w * 0.75f, center = androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.3f))
                                    drawCircle(color = Color(0x253F51B5), radius = w * 0.6f, center = androidx.compose.ui.geometry.Offset(w * 0.8f, h * 0.65f))
                                }
                                else -> {
                                    drawCircle(color = Color(0x1B3F51B5), radius = w * 0.6f, center = androidx.compose.ui.geometry.Offset(w * 0.2f, h * 0.35f))
                                }
                            }
                        }"""
text = text.replace(old_wallpaper, new_wallpaper)
with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)
