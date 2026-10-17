import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Fix Megaphone
text = re.sub(
    r'val tabs = listOf\(\s*Triple\("Listen Now", Icons.Default.PlayCircleFilled, "listen_tab"\),\s*Triple\("Browse", Icons.Default.GridView, "browse_tab"\),\s*Triple\("Radio", Icons.Default.Radio, "radio_tab"\),\s*Triple\("Search", Icons.Default.Search, "search_tab"\)\s*\)',
    'val tabs = listOf(\n                        Triple("Listen Now", Icons.Default.PlayCircleFilled, "listen_tab"),\n                        Triple("Browse", Icons.Default.GridView, "browse_tab"),\n                        Triple("Radio", Icons.Default.Radio, "radio_tab"),\n                        Triple("Search", Icons.Default.Search, "search_tab"),\n                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")\n                    )',
    text
)
# Fix Jams
text = re.sub(
    r'val tabs = listOf\(\s*Triple\("Music", Icons.Default.MusicNote, "music_tab"\),\s*Triple\("Trending", Icons.Default.Whatshot, "trending_tab"\),\s*Triple\("Library", Icons.Default.Folder, "library_tab"\),\s*Triple\("Account", Icons.Default.Person, "account_tab"\)\s*\)',
    'val tabs = listOf(\n                        Triple("Music", Icons.Default.MusicNote, "music_tab"),\n                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),\n                        Triple("Library", Icons.Default.Folder, "library_tab"),\n                        Triple("Account", Icons.Default.Person, "account_tab"),\n                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")\n                    )',
    text
)
text = re.sub(
    r'val tabs = listOf\(\s*Triple\("Music", Icons.Default.MusicNote, "music_tab"\),\s*Triple\("Trending", Icons.Default.Whatshot, "trending_tab"\),\s*Triple\("Library", Icons.Default.Folder, "library_tab"\),\s*Triple\("Account", Icons.Default.Person, "account_tab"\),\s*Triple\("Premium", Icons.Default.WorkspacePremium, "premium_tab"\)\s*\)',
    'val tabs = listOf(\n                        Triple("Music", Icons.Default.MusicNote, "music_tab"),\n                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),\n                        Triple("Library", Icons.Default.Folder, "library_tab"),\n                        Triple("Account", Icons.Default.Person, "account_tab"),\n                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")\n                    )',
    text
)
# Let's just fix Sharp manually since it has duplicates
sharp_bad = """val tabs = listOf(
                        Triple("Feed", Icons.Default.Stream, "feed_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab"),
                        Triple("Library", Icons.Default.Favorite, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
sharp_good = """val tabs = listOf(
                        Triple("Feed", Icons.Default.Stream, "feed_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Library", Icons.Default.Favorite, "library_tab"),
                        Triple("Profile", Icons.Default.Person, "profile_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(sharp_bad, sharp_good)

# Tunes fix duplicate
tunes_bad = """val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
tunes_good = """val tabs = listOf(
                        Triple("Home", Icons.Default.Home, "home_tab"),
                        Triple("Trending", Icons.Default.Whatshot, "trending_tab"),
                        Triple("My Music", Icons.Default.Folder, "mymusic_tab"),
                        Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")
                    )"""
text = text.replace(tunes_bad, tunes_good)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
