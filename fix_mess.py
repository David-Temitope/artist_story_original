import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Fix Songify tabs: It originally had "Search", "Library", "Premium".
# My script replaced 'Triple("Search", Icons.Default.Search, "search_tab")' 
# with 'Triple("Search", Icons.Default.Search, "search_tab"),\n                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")'
# So now it has TWO premiums. Let's revert that specific part.
# The original was:
# Triple("Search", Icons.Default.Search, "search_tab"),
# Triple("Library", Icons.Default.LibraryMusic, "library_tab"),
# Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")

# Wait, my script did:
# text.replace('Triple("Search", Icons.Default.Search, "search_tab")', megaphone_tabs, 1)
# So it became:
# Triple("Search", Icons.Default.Search, "search_tab"),
# Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab"),
# Triple("Library", Icons.Default.LibraryMusic, "library_tab"),
# Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")

bad_tabs = """Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab"),
                        Triple("Library", Icons.Default.LibraryMusic, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
good_tabs = """Triple("Search", Icons.Default.Search, "search_tab"),
                        Triple("Library", Icons.Default.LibraryMusic, "library_tab"),
                        Triple("Premium", Icons.Default.WorkspacePremium, "premium_tab")"""
text = text.replace(bad_tabs, good_tabs)

# Fix the injected Megaphone Premium inside Songify
bad_premium = """                "Premium" -> {
                    PremiumUpgradeTab(state, viewModel, "megaphone", "Megaphone", megaphoneColor, megaphoneDarkBg, megaphoneCardBg, 200.0)
                }

                "Search" -> {"""
good_search = """                "Search" -> {"""
text = text.replace(bad_premium, good_search)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)

