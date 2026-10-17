import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Replace Songify
text = text.replace('PremiumUpgradeTab(state, viewModel, "songify", "Songify", songifyColor, songifyDarkBg, songifyCardBg, 250.0)',
                    'PremiumUpgradeTab(state, viewModel, "songify", "Songify", songifyColor, songifyDarkBg, songifyCardBg, 200000.0)')

# Replace Megaphone
text = text.replace('PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)',
                    'PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 100000.0)')

# Replace Jams
text = text.replace('PremiumUpgradeTab(state, viewModel, "jams", "JAMS", jamsColor, jamsDarkBg, jamsCardBg, 120.0)',
                    'PremiumUpgradeTab(state, viewModel, "jams", "JAMS", jamsColor, jamsDarkBg, jamsCardBg, 80000.0)')

# Replace Sharp
text = text.replace('PremiumUpgradeTab(state, viewModel, "sharp", "SHARP", sharpColor, sharpDarkBg, sharpCardBg, 300.0)',
                    'PremiumUpgradeTab(state, viewModel, "sharp", "SHARP", sharpColor, sharpDarkBg, sharpCardBg, 70000.0)')

# Replace Tunes
text = text.replace('PremiumUpgradeTab(state, viewModel, "tunes", "TUNES", tunesColor, tunesDarkBg, tunesCardBg, 180.0)',
                    'PremiumUpgradeTab(state, viewModel, "tunes", "TUNES", tunesColor, tunesDarkBg, tunesCardBg, 50000.0)')

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)

