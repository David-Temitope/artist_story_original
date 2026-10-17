import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8") as f:
    text = f.read()

# 1. Update the router inside WebHubAppScreen
old_router = """            when (currentUrl) {
                "wgt.show", "www.whoisgottalent.show", "whoisgottalent.show" -> {
                    WgtWebsitePage(state = state, viewModel = viewModel)
                }
                "apexrecord.org", "www.apexrecord.org" -> {
                    ApexRecordsWebsitePage(state = state, viewModel = viewModel)
                }
                "omegaelectoralcommission.gov", "www.omegaelectoralcommission.gov" -> {
                    OecPortalWebsitePage(state = state, viewModel = viewModel)
                }
                "alphadom.online", "www.alphadom.online" -> {
                    AlphadomStoreWebsitePage(state = state, viewModel = viewModel)
                }
                "omnisearch.com/market", "finance.omnisearch.com" -> {
                    MarketIntelligenceWebsitePage(state = state, viewModel = viewModel)
                }
                "wikipedia.org/wiki/artists", "wikipedia.org" -> {
                    WikipediaArtistsWebsitePage(state = state, viewModel = viewModel)
                }
                else -> {
                    // Default Search Results View (Matching uploaded Image 2)
                    WebHubSearchFeed(
                        state = state,
                        viewModel = viewModel,
                        searchQuery = searchQuery,
                        selectedCategory = selectedCategory,
                        onCategorySelect = { selectedCategory = it },
                        onNavigate = { navigateTo(it) }
                    )
                }
            }"""

new_router = """            when (currentUrl) {
                "wgt.show", "www.whoisgottalent.show", "whoisgottalent.show" -> {
                    WgtWebsitePage(state = state, viewModel = viewModel)
                }
                "apexrecord.org", "www.apexrecord.org", "apexrecords.com" -> {
                    ApexRecordsWebsitePage(state = state, viewModel = viewModel)
                }
                "alphadom.online", "www.alphadom.online", "alphadom.com" -> {
                    AlphadomStoreWebsitePage(state = state, viewModel = viewModel)
                }
                "omegaelectoralcommission.gov", "www.omegaelectoralcommission.gov", "oec.gov" -> {
                    OecPortalWebsitePage(state = state, viewModel = viewModel)
                }
                "pulsewire.com", "www.pulsewire.com", "pulsewire.game" -> {
                    PulsewireNewsWebsitePage(state = state, viewModel = viewModel)
                }
                "bh.online", "www.bh.online", "blackhat.online" -> {
                    BlackHatWebsitePage(state = state, viewModel = viewModel)
                }
                "grandawards.org", "thegrandawards.org", "www.grandawards.org" -> {
                    GrandAwardsWebsitePage(state = state, viewModel = viewModel)
                }
                "sold.com", "www.sold.com" -> {
                    SoldRealEstateWebsitePage(state = state, viewModel = viewModel)
                }
                "statecrimecommand.gov", "www.statecrimecommand.gov", "scc.gov" -> {
                    StateCrimeCommandWebsitePage(state = state, viewModel = viewModel)
                }
                "omnisearch.com/market", "finance.omnisearch.com" -> {
                    MarketIntelligenceWebsitePage(state = state, viewModel = viewModel)
                }
                "wikipedia.org/wiki/artists", "wikipedia.org" -> {
                    WikipediaArtistsWebsitePage(state = state, viewModel = viewModel)
                }
                else -> {
                    WebHubSearchFeed(
                        state = state,
                        viewModel = viewModel,
                        searchQuery = searchQuery,
                        selectedCategory = selectedCategory,
                        onCategorySelect = { selectedCategory = it },
                        onNavigate = { navigateTo(it) }
                    )
                }
            }"""

if old_router in text:
    text = text.replace(old_router, new_router, 1)
    print("Router replaced successfully!")
else:
    print("Old router not found!")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8") as f:
    f.write(text)

