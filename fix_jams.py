import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

jams_tabs_bad = """val tabs = listOf(
                        Triple("Music", Icons.Default.MusicNote, "music_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("Library", Icons.Default.Folder, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
jams_tabs_good = """val tabs = listOf(
                        Triple("Music", Icons.Default.MusicNote, "music_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("Library", Icons.Default.Folder, "library_tab"),
                        Triple("Account", Icons.Default.Person, "account_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(jams_tabs_bad, jams_tabs_good)

jams_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "jams", "JAMS", jamsColor, jamsDarkBg, jamsCardBg, 120.0)
                }
                
                "Account" -> {"""
text = text.replace('                "Account" -> {', jams_premium)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
