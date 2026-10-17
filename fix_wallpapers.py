import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

old_wallpapers = """val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop")
)"""

new_wallpapers = """val imageWallpapers = listOf(
    Triple("porsche", "Porsche 911", "https://images.unsplash.com/photo-1503376713356-1a6d902cb25c?q=80&w=1440&h=2560&fit=crop"),
    Triple("spiderman", "Hero", "https://images.unsplash.com/photo-1612036782180-6f0b6cd846fe?q=80&w=1440&h=2560&fit=crop"),
    Triple("mountain", "Mountain Sunset", "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?q=80&w=1440&h=2560&fit=crop"),
    Triple("mustang", "Mustang GT", "https://images.unsplash.com/photo-1584345604476-8ec5e12e42a5?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_blue", "Hyper Blue", "https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("hyper_red", "Hyper Red", "https://images.unsplash.com/photo-1618005192384-a83a8bd57fbe?q=80&w=1440&h=2560&fit=crop"),
    Triple("cyberpunk", "Neon City", "https://images.unsplash.com/photo-1515462277126-2dd0c162007a?q=80&w=1440&h=2560&fit=crop"),
    Triple("nature", "Forest Mist", "https://images.unsplash.com/photo-1448375240586-882707db888b?q=80&w=1440&h=2560&fit=crop"),
    Triple("space", "Deep Space", "https://images.unsplash.com/photo-1462331940025-496dfbfc7564?q=80&w=1440&h=2560&fit=crop"),
    Triple("minimal", "Dark Minimal", "https://images.unsplash.com/photo-1494438639946-1ebd1d20bf85?q=80&w=1440&h=2560&fit=crop")
)"""

content = content.replace(old_wallpapers, new_wallpapers)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
