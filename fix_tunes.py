import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

tunes_tabs_bad = """val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
tunes_tabs_good = """val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(tunes_tabs_bad, tunes_tabs_good)

# Add Premium into `when (selectedTab)` for Tunes
# Let's find "Search" in Tunes first... Wait, is there a "Search" in Tunes when block?
# Let's check with grep first.
