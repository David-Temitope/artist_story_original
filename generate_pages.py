import re

code = r'''
// =================== WEBHUB SEARCH FEED (Matches uploaded search design) ===================
@Composable
fun WebHubSearchFeed(
    state: GameStateEntity,
    viewModel: GameViewModel,
    searchQuery: String,
    selectedCategory: String,
    onCategorySelect: (String) -> Unit,
    onNavigate: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 14.dp)
    ) {
        // Category Pills (All, Music, Commerce, Civic, News, Underground)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val categories = listOf(
                Pair("🌐 All", "All"),
                Pair("🎵 Music", "Music"),
                Pair("🛒 Commerce", "Commerce"),
                Pair("🏛️ Civic", "Civic"),
                Pair("⚡ News", "News"),
                Pair("🕵️ Underground", "Underground")
            )
            categories.forEach { (label, key) ->
                val isSelected = selectedCategory == key
                Surface(
                    onClick = { onCategorySelect(key) },
                    shape = RoundedCornerShape(16.dp),
                    color = if (isSelected) Color(0xFF00E676).copy(alpha = 0.15f) else Color(0xFF161E28),
                    border = BorderStroke(
                        width = 1.dp,
                        color = if (isSelected) Color(0xFF00E676) else Color(0xFF263242)
                    )
                ) {
                    Text(
                        text = label,
                        color = if (isSelected) Color(0xFF00E676) else Color(0xFF94A3B8),
                        fontSize = 11.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
                    )
                }
            }
        }

        // Search Results List
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 20.dp)
        ) {
            // 1. WGT Official
            if (selectedCategory == "All" || selectedCategory == "Music") {
                if (searchQuery.isBlank() || "who is got talent wgt audition show".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFFFFA000),
                            icon = Icons.Default.Star,
                            siteName = "WGT Official",
                            url = "wgt.show",
                            title = "Who Is Got Talent - The Grand Auditions",
                            description = "Official registration and screening portal for the bi-annual televised talent competition. Compete for $30,000 and major industry acclaim.",
                            subLinks = listOf(
                                Pair("Auditions", "wgt.show"),
                                Pair("Leaderboard", "wgt.show"),
                                Pair("Judges Panel", "wgt.show")
                            ),
                            onClick = { onNavigate("wgt.show") }
                        )
                    }
                }
            }

            // 2. Apex Records (Image 1)
            if (selectedCategory == "All" || selectedCategory == "Music") {
                if (searchQuery.isBlank() || "apex records demo label contract sign".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF8B5CF6),
                            icon = Icons.Default.Album,
                            siteName = "Apex Records",
                            url = "apexrecord.org",
                            title = "Apex Records - Your Sound. Our Platform.",
                            description = "Premier record label and artist development house. Submit demos directly to the A&R Committee, secure signing advances, and access global SoundStream distribution.",
                            subLinks = listOf(
                                Pair("Submit Demo", "apexrecord.org"),
                                Pair("Roster", "apexrecord.org"),
                                Pair("A&R Portal", "apexrecord.org")
                            ),
                            onClick = { onNavigate("apexrecord.org") }
                        )
                    }
                }
            }

            // 3. Alphadom Audio & Luxury (Image 2)
            if (selectedCategory == "All" || selectedCategory == "Commerce") {
                if (searchQuery.isBlank() || "alphadom instruments synth gear audio luxury shop store".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFFD4AF37),
                            icon = Icons.Default.ShoppingBag,
                            siteName = "Alphadom",
                            url = "alphadom.online",
                            title = "Alphadom - Engineered For Sound | Luxury Gear & Instruments",
                            description = "Curated collection of professional polyphonic synthesizers, vintage guitars, Neve preamps, Neumann microphones, and luxury timepieces.",
                            subLinks = listOf(
                                Pair("Synthesizers", "alphadom.online"),
                                Pair("Studio Gear", "alphadom.online"),
                                Pair("Prestige", "alphadom.online")
                            ),
                            onClick = { onNavigate("alphadom.online") }
                        )
                    }
                }
            }

            // 4. Sold.com Real Estate & Asset Auctions (Image 7)
            if (selectedCategory == "All" || selectedCategory == "Commerce") {
                if (searchQuery.isBlank() || "sold real estate cars property penthouse villa auction".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF3B82F6),
                            icon = Icons.Default.Home,
                            siteName = "Sold.com",
                            url = "sold.com",
                            title = "Sold.com - Discover Extraordinary Real Estate & Assets",
                            description = "Exclusive access to off-market luxury penthouses, oceanfront villas, recording studio compounds, exotic hypercars, and corporate label acquisitions.",
                            subLinks = listOf(
                                Pair("Real Estate", "sold.com"),
                                Pair("Hypercars", "sold.com"),
                                Pair("Auctions", "sold.com")
                            ),
                            onClick = { onNavigate("sold.com") }
                        )
                    }
                }
            }

            // 5. Omega Electoral Commission (Image 3)
            if (selectedCategory == "All" || selectedCategory == "Civic") {
                if (searchQuery.isBlank() || "omega electoral commission oec election vote mayor politician".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF1D4ED8),
                            icon = Icons.Default.HowToVote,
                            siteName = "Omega Electoral Commission",
                            url = "omegaelectoralcommission.gov",
                            title = "Omega Electoral Commission - Mayoral Elections 2024",
                            description = "Official municipal civic voting portal. Review certified candidate agendas on creative arts funding, cast official ballots, and monitor live district reporting.",
                            subLinks = listOf(
                                Pair("Cast Ballot", "omegaelectoralcommission.gov"),
                                Pair("Candidates", "omegaelectoralcommission.gov"),
                                Pair("Results", "omegaelectoralcommission.gov")
                            ),
                            onClick = { onNavigate("omegaelectoralcommission.gov") }
                        )
                    }
                }
            }

            // 6. Pulsewire News (Image 4)
            if (selectedCategory == "All" || selectedCategory == "News" || selectedCategory == "Music") {
                if (searchQuery.isBlank() || "pulsewire news journalism music gossip trending leaks".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF00E5FF),
                            icon = Icons.Default.FlashOn,
                            siteName = "Pulsewire News",
                            url = "pulsewire.com",
                            title = "Pulsewire - Breaking Music Journalism & Industry Intel",
                            description = "High-voltage music journalism, WGT tournament breakdowns, producer leaks, gear reviews, and real-time artist chart clashes.",
                            subLinks = listOf(
                                Pair("WGT Coverage", "pulsewire.com"),
                                Pair("Gear Tech", "pulsewire.com"),
                                Pair("Trending", "pulsewire.com")
                            ),
                            onClick = { onNavigate("pulsewire.com") }
                        )
                    }
                }
            }

            // 7. Black Hat Underground (Image 5)
            if (selectedCategory == "All" || selectedCategory == "Underground" || selectedCategory == "Commerce") {
                if (searchQuery.isBlank() || "black hat darknet bh online streams botnet votes hacker".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF00FF66),
                            icon = Icons.Default.Terminal,
                            siteName = "bh.online",
                            url = "bh.online",
                            title = "BH.ONLINE // Encrypted Escrow & Darknet Market",
                            description = "Decentralized P2P marketplace. Cast botnet followers, instant stream injectors, civic proxy vote bundles, and unmarked high-end studio hardware.",
                            subLinks = listOf(
                                Pair("Botnets", "bh.online"),
                                Pair("Stream Packs", "bh.online"),
                                Pair("P2P Escrow", "bh.online")
                            ),
                            onClick = { onNavigate("bh.online") }
                        )
                    }
                }
            }

            // 8. The Grand Awards (Image 6)
            if (selectedCategory == "All" || selectedCategory == "Music") {
                if (searchQuery.isBlank() || "the grand awards gala laureate ceremony trophy honor".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFFE5C07B),
                            icon = Icons.Default.EmojiEvents,
                            siteName = "The Grand Awards",
                            url = "thegrandawards.org",
                            title = "The Grand Awards - The Pinnacle of Achievement",
                            description = "Celebrating visionary artistry, unparalleled creativity, and defining moments of the global music industry in an evening of uncompromising elegance.",
                            subLinks = listOf(
                                Pair("Laureates", "thegrandawards.org"),
                                Pair("VIP Gala", "thegrandawards.org"),
                                Pair("Categories", "thegrandawards.org")
                            ),
                            onClick = { onNavigate("thegrandawards.org") }
                        )
                    }
                }
            }

            // 9. State Crime Command (Image 8)
            if (selectedCategory == "All" || selectedCategory == "Civic" || selectedCategory == "Underground") {
                if (searchQuery.isBlank() || "state crime command scc wanted police fine warrants cyber".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFFEF4444),
                            icon = Icons.Default.Security,
                            siteName = "State Crime Command",
                            url = "statecrimecommand.gov",
                            title = "State Crime Command // Federal Taskforce & Cyber Most Wanted",
                            description = "Official security agency registry. Tracks active criminal suspects, sector surveillance radar, darknet syndicates, and civic clearance settlement processing.",
                            subLinks = listOf(
                                Pair("Most Wanted", "statecrimecommand.gov"),
                                Pair("Cyber Map", "statecrimecommand.gov"),
                                Pair("Pay Settlement", "statecrimecommand.gov")
                            ),
                            onClick = { onNavigate("statecrimecommand.gov") }
                        )
                    }
                }
            }

            // 10. Wikipedia Artists Registry
            if (selectedCategory == "All") {
                if (searchQuery.isBlank() || "wikipedia artists encyclopedia biography".contains(searchQuery, ignoreCase = true)) {
                    item {
                        SearchResultCard(
                            iconBg = Color(0xFF475569),
                            icon = Icons.Default.MenuBook,
                            siteName = "Wikipedia",
                            url = "wikipedia.org/wiki/artists",
                            title = "Encyclopedia of City Music Artists & Living Legends",
                            description = "Open encyclopedic records of living musical artists, discographies, historical career milestones, and industry acclaim index.",
                            subLinks = listOf(
                                Pair("Top Artists", "wikipedia.org/wiki/artists"),
                                Pair("Discography", "wikipedia.org/wiki/artists")
                            ),
                            onClick = { onNavigate("wikipedia.org/wiki/artists") }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SearchResultCard(
    iconBg: Color,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    siteName: String,
    url: String,
    title: String,
    description: String,
    subLinks: List<Pair<String, String>>,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        verticalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(iconBg, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(14.dp)
                )
            }
            Column {
                Text(
                    text = siteName,
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "$url  ⋮",
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = title,
            color = Color(0xFF5B98FF),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            color = Color(0xFF94A3B8),
            fontSize = 11.sp,
            lineHeight = 15.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            subLinks.forEach { (name, linkUrl) ->
                Text(
                    text = name,
                    color = Color(0xFF00E676),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.clickable { onClick() }
                )
            }
        }
    }
}
'''

# Now let's append all 8 website composables
'''
'''
