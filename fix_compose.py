import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# I need to fix the @Composable placement
bad_placement = """@Composable

val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)

fun WallpaperSettingsScreen("""

good_placement = """val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)

@Composable
fun WallpaperSettingsScreen("""

content = content.replace(bad_placement, good_placement)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
