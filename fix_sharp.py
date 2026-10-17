import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

sharp_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "sharp", "SHARP", sharpColor, sharpDarkBg, sharpCardBg, 300.0)
                }
                
                "Profile" -> {"""
text = text.replace('                "Profile" -> {', sharp_premium)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
