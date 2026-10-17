import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# I want to add `getWallpaperOptions()` outside the composable, and update `WallpaperSettingsScreen`.

wallpaper_options = """
val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)
"""

old_settings = """fun WallpaperSettingsScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val options = listOf(
        Triple("Cosmic Nebula", "Cosmic Nebula", Brush.verticalGradient(listOf(Color(0xFF120C3F), Color(0xFF4A007A), Color(0xFF0B0720)))),
        Triple("Cyber Sunset", "Cyber Sunset", Brush.verticalGradient(listOf(Color(0xFFF07B50), Color(0xFF901C40), Color(0xFF1D0E25)))),
        Triple("Midnight Forest", "Midnight Forest", Brush.verticalGradient(listOf(Color(0xFF0A2E12), Color(0xFF031B08), Color(0xFF000C02)))),
        Triple("Golden Hour", "Golden Hour", Brush.verticalGradient(listOf(Color(0xFFF9D423), Color(0xFFFF4E50), Color(0xFF2C1014))))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Ecosystem Wallpaper Theme", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)

        options.forEach { (id, name, brush) ->
            val isCurrent = state.wallpaperId == id
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C29)),
                border = BorderStroke(2.dp, if (isCurrent) NeonTeal else Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.updateWallpaper(id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(brush)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }
    }
}"""

new_settings = """val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)

fun WallpaperSettingsScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val options = listOf(
        Triple("Cosmic Nebula", "Cosmic Nebula", Brush.verticalGradient(listOf(Color(0xFF120C3F), Color(0xFF4A007A), Color(0xFF0B0720)))),
        Triple("Cyber Sunset", "Cyber Sunset", Brush.verticalGradient(listOf(Color(0xFFF07B50), Color(0xFF901C40), Color(0xFF1D0E25)))),
        Triple("Midnight Forest", "Midnight Forest", Brush.verticalGradient(listOf(Color(0xFF0A2E12), Color(0xFF031B08), Color(0xFF000C02)))),
        Triple("Golden Hour", "Golden Hour", Brush.verticalGradient(listOf(Color(0xFFF9D423), Color(0xFFFF4E50), Color(0xFF2C1014))))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Ecosystem Wallpaper Theme", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)

        imageWallpapers.forEach { (id, name, url) ->
            val isCurrent = state.wallpaperId == id
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C29)),
                border = BorderStroke(2.dp, if (isCurrent) NeonTeal else Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.updateWallpaper(id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    coil.compose.AsyncImage(
                        model = url,
                        contentDescription = name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }

        options.forEach { (id, name, brush) ->
            val isCurrent = state.wallpaperId == id
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C29)),
                border = BorderStroke(2.dp, if (isCurrent) NeonTeal else Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.updateWallpaper(id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(brush)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }
    }
}"""

content = content.replace(old_settings, new_settings)

old_bg = """                    val wallpaperBrush = when (state.activePhone) {
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
                        }
                    }"""

new_bg = """                    val selectedImg = imageWallpapers.find { it.first == state.wallpaperId }
                    if (selectedImg != null) {
                        coil.compose.AsyncImage(
                            model = selectedImg.third,
                            contentDescription = "Wallpaper",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    } else {
                        val wallpaperBrush = when (state.wallpaperId) {
                            "Cosmic Nebula" -> Brush.verticalGradient(listOf(Color(0xFF120C3F), Color(0xFF4A007A), Color(0xFF0B0720)))
                            "Cyber Sunset" -> Brush.verticalGradient(listOf(Color(0xFFF07B50), Color(0xFF901C40), Color(0xFF1D0E25)))
                            "Midnight Forest" -> Brush.verticalGradient(listOf(Color(0xFF0A2E12), Color(0xFF031B08), Color(0xFF000C02)))
                            "Golden Hour" -> Brush.verticalGradient(listOf(Color(0xFFF9D423), Color(0xFFFF4E50), Color(0xFF2C1014)))
                            else -> when (state.activePhone) {
                                "hiPhone" -> Brush.verticalGradient(listOf(Color(0xFF281C22), Color(0xFF14131D)))
                                "Samsong" -> Brush.verticalGradient(listOf(Color(0xFF101B2E), Color(0xFF241528)))
                                "TECCNO" -> Brush.verticalGradient(listOf(Color(0xFF12222E), Color(0xFF380720)))
                                "No-Thing" -> Brush.verticalGradient(listOf(Color(0xFF0A0A0A), Color(0xFF030303)))
                                "Xiaomax" -> Brush.verticalGradient(listOf(Color(0xFF361811), Color(0xFF111E30)))
                                "Pixxelate" -> Brush.verticalGradient(listOf(Color(0xFF2E1914), Color(0xFF141525)))
                                else -> Brush.verticalGradient(listOf(Color(0xFF0F1115), Color(0xFF1A1D24)))
                            }
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
                                        val dotRadius = 2.5f
                                        val spacing = 50f
                                        for (x in 0..(w / spacing).toInt()) {
                                            for (y in 0..(h / spacing).toInt()) {
                                                drawCircle(color = Color.White.copy(alpha = 0.08f), radius = dotRadius, center = androidx.compose.ui.geometry.Offset(x * spacing + 25f, y * spacing + 25f))
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
                            }
                        }
                    }"""

content = content.replace(old_bg, new_bg)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
