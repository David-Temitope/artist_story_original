import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

megaphone_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)
                }

                "Search" -> {"""
text = text.replace('                "Search" -> {', megaphone_premium, 1)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)

