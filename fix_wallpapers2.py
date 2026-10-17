import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# I will add imageWallpapers right before WallpaperSettingsScreen
img_wallpapers = """
val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)

"""

if "val imageWallpapers" not in content:
    content = content.replace('fun WallpaperSettingsScreen(', img_wallpapers + 'fun WallpaperSettingsScreen(')

# Now inject the UI for image wallpapers inside WallpaperSettingsScreen
# Look for `Text(text = "Ecosystem Wallpaper Theme", ...)`
ui_injection = """Text(text = "Ecosystem Wallpaper Theme", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)

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
"""
if "imageWallpapers.forEach" not in content:
    content = content.replace('Text(text = "Ecosystem Wallpaper Theme", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)', ui_injection)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
