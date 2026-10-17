import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Megaphone
megaphone_tabs = """Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
text = text.replace('Triple("Search", Icons.Default.Search, "search_tab")', megaphone_tabs, 1)

megaphone_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)
                }"""
text = text.replace('                "Search" -> {', megaphone_premium + '\n\n                "Search" -> {', 1)

# Jams
jams_tabs = """Triple("Account", Icons.Default.Person, "account_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
text = text.replace('Triple("Account", Icons.Default.Person, "account_tab")', jams_tabs, 1)

jams_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "jams", "JAMS", jamsColor, jamsDarkBg, jamsCardBg, 120.0)
                }"""
text = text.replace('                "Account" -> {', jams_premium + '\n\n                "Account" -> {', 1)

# Sharp
sharp_tabs = """Triple("Profile", Icons.Default.Person, "profile_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
text = text.replace('Triple("Profile", Icons.Default.Person, "profile_tab")', sharp_tabs, 1)

sharp_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "sharp", "SHARP", sharpColor, sharpDarkBg, sharpCardBg, 300.0)
                }"""
text = text.replace('                "Profile" -> {', sharp_premium + '\n\n                "Profile" -> {', 1)

# Tunes
tunes_tabs = """Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
# There might be multiple Triple("Search", Icons.Default.Search, "search_tab"). 
# Tunes is the last one. Let's just do a string replacement on the last occurrence.
last_search_tab = text.rfind('Triple("Search", Icons.Default.Search, "search_tab")')
if last_search_tab != -1:
    text = text[:last_search_tab] + tunes_tabs + text[last_search_tab + len('Triple("Search", Icons.Default.Search, "search_tab")'):]

last_search_case = text.rfind('                "Search" -> {')
if last_search_case != -1:
    tunes_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "tunes", "TUNES", tunesColor, tunesDarkBg, tunesCardBg, 180.0)
                }\n\n"""
    text = text[:last_search_case] + tunes_premium + text[last_search_case:]

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
