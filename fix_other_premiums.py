import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Megaphone
megaphone_tabs_old = """                    val tabs = listOf(
                        Triple("Listen Now", Icons.Default.PlayCircleFilled, "listen_tab"),
                        Triple("Browse", Icons.Default.GridView, "browse_tab"),
                        Triple("Radio", Icons.Default.Radio, "radio_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab")
                    )"""
megaphone_tabs_new = """                    val tabs = listOf(
                        Triple("Listen Now", Icons.Default.PlayCircleFilled, "listen_tab"),
                        Triple("Browse", Icons.Default.GridView, "browse_tab"),
                        Triple("Radio", Icons.Default.Radio, "radio_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(megaphone_tabs_old, megaphone_tabs_new)

megaphone_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)
                }"""
text = text.replace('                "Search" -> {\n                    // Basic placeholder\n                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {\n                        Text("Search coming soon...", color = Color.Gray)\n                    }\n                }', megaphone_premium)

# Jams
jams_tabs_old = """                    val tabs = listOf(
                        Triple("Music", Icons.Default.MusicNote, "music_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("Library", Icons.Default.Folder, "library_tab"),
                        Triple("Account", Icons.Default.Person, "account_tab")
                    )"""
jams_tabs_new = """                    val tabs = listOf(
                        Triple("Music", Icons.Default.MusicNote, "music_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("Library", Icons.Default.Folder, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(jams_tabs_old, jams_tabs_new)

jams_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "jams", "JAMS", jamsColor, jamsDarkBg, jamsCardBg, 120.0)
                }"""
text = text.replace('                "Account" -> {\n                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {\n                        Text("Account settings...", color = Color.Gray)\n                    }\n                }', jams_premium)

# Sharp
sharp_tabs_old = """                    val tabs = listOf(
                        Triple("Feed", Icons.Default.Stream, "feed_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Library", Icons.Default.Favorite, "library_tab"),
                        Triple("Profile", Icons.Default.Person, "profile_tab")
                    )"""
sharp_tabs_new = """                    val tabs = listOf(
                        Triple("Feed", Icons.Default.Stream, "feed_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Library", Icons.Default.Favorite, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(sharp_tabs_old, sharp_tabs_new)

sharp_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "sharp", "SHARP", sharpColor, sharpDarkBg, sharpCardBg, 300.0)
                }"""
text = text.replace('                "Profile" -> {\n                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {\n                        Text("User Profile", color = Color.Gray)\n                    }\n                }', sharp_premium)

# Tunes
tunes_tabs_old = """                    val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab")
                    )"""
tunes_tabs_new = """                    val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(tunes_tabs_old, tunes_tabs_new)

tunes_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "tunes", "TUNES", tunesColor, tunesDarkBg, tunesCardBg, 180.0)
                }"""
text = text.replace('                "Search" -> {\n                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {\n                        Text("TUNES Search", color = Color.Gray)\n                    }\n                }', tunes_premium)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
