import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Remove the bad one from Songify
bad_megaphone = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)
                }

                "Search" -> {"""
text = text.replace(bad_megaphone, '                "Search" -> {', 1)

# Now inject it properly into Megaphone
# Let's find Megaphone's "Search" -> {
# Megaphone starts around line 1275 with 'fun MegaphoneScreen'
megaphone_start = text.find('fun MegaphoneScreen')
megaphone_search_idx = text.find('                "Search" -> {', megaphone_start)

if megaphone_search_idx != -1:
    text = text[:megaphone_search_idx] + bad_megaphone + text[megaphone_search_idx + len('                "Search" -> {'):]

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
