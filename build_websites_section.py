import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8") as f:
    full_text = f.read()

# Locate start of WebHubSearchFeed
start_marker = "fun WebHubSearchFeed("
start_idx = full_text.find(start_marker)
if start_idx == -1:
    print("Error: start marker not found!")
    exit(1)

# Find the start of the line containing start_marker
start_pos = full_text.rfind("@Composable", 0, start_idx)
if start_pos == -1:
    start_pos = full_text.rfind("fun WebHubSearchFeed", 0, start_idx)

# Locate end marker before CameraAppScreen
end_marker = "// =================== 13. CAMERA & PHOTO GALLERY SCREEN ==================="
end_pos = full_text.find(end_marker)
if end_pos == -1:
    end_marker = "fun CameraAppScreen("
    end_pos = full_text.rfind("@Composable", 0, full_text.find(end_marker))

print(f"Replacing section from character {start_pos} to {end_pos}")

new_websites_section = r'''@Composable
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
                if (searchQuery.isBlank() || "apex records demo label contract sign artist".contains(searchQuery, ignoreCase = true)) {
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

// =================== 1. WHO IS GOT TALENT (WGT) WEBSITE ===================
@Composable
fun WgtWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedWgtNav by remember { mutableStateOf("HOME") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B0D14))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Top WGT Navigation Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF131722))
                .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(Color(0xFFFFA000), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "WGT Logo",
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                }
                Text(
                    text = "WGT",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                listOf("HOME", "AUDITIONS", "VOTING", "NEWS").forEach { nav ->
                    Text(
                        text = nav,
                        color = if (selectedWgtNav == nav) Color(0xFFFFA000) else Color.Gray,
                        fontSize = 10.sp,
                        fontWeight = if (selectedWgtNav == nav) FontWeight.Bold else FontWeight.Medium,
                        modifier = Modifier.clickable { selectedWgtNav = nav }
                    )
                }
            }
        }

        // 2. High-Impact Hero Banner
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF20163B),
                            Color(0xFF0B0D14)
                        )
                    )
                )
                .padding(horizontal = 16.dp, vertical = 24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Surface(
                    color = Color(0xFFFFA000).copy(alpha = 0.15f),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color(0xFFFFA000).copy(alpha = 0.5f))
                ) {
                    Text(
                        text = "✨ THE NATION'S PREMIERE TALENT SHOWCASE",
                        color = Color(0xFFFFA000),
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }

                Text(
                    text = "THE STAGE IS SET.\nYOUR MOMENT AWAITS.",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    lineHeight = 24.sp
                )

                Text(
                    text = "Join thousands of visionary performers competing for national acclaim, a $30,000 recording contract prize, and millions of global fans.",
                    color = Color(0xFFB0B7C3),
                    fontSize = 11.sp,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                    lineHeight = 15.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                if (state.wgtApplied) {
                    Surface(
                        color = Color(0xFF10B981).copy(alpha = 0.2f),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color(0xFF10B981))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(16.dp))
                            Text(
                                text = "AUDITION CONFIRMED: WEEK ${state.wgtAuditionWeek}, YEAR ${state.wgtAuditionYear}",
                                color = Color(0xFF10B981),
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                } else {
                    Button(
                        onClick = { viewModel.applyToWhoIsGotTalent() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA000)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .height(42.dp)
                            .testTag("wgt_register_now_button")
                    ) {
                        Text(
                            text = "REGISTER NOW ($2,000 SCREENING FEE)",
                            color = Color.Black,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Black
                        )
                    }
                }
            }
        }

        // 3. Featured Auditions / Live Cohort
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "SEASON HIGHLIGHTS & JUDGES PANEL",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF151926)),
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("⭐ Industry Judges Criteria", color = Color(0xFFFFA000), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        Text("3 Major Disciplines", color = Color.Gray, fontSize = 10.sp)
                    }
                    Text(
                        text = "• Vocal Mastery (Minimum 35 required for Semi-Finals)\n• Lyric Artistry & Concept Polish\n• Stage Charisma & Public Acclaim",
                        color = Color(0xFFCBD5E1),
                        fontSize = 11.sp,
                        lineHeight = 16.sp
                    )
                }
            }
        }
    }
}

// =================== 2. APEX RECORDS WEBSITE (Matches uploaded Image 1) ===================
@Composable
fun ApexRecordsWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    var showDemoSubmissionModal by remember { mutableStateOf(false) }
    var selectedSongForDemo by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F0E17))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Top Header (Matches Image 1)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF161524))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "APEX RECORDS",
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 1.sp
            )

            Button(
                onClick = { showDemoSubmissionModal = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6)),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp),
                modifier = Modifier.height(32.dp).testTag("apex_header_submit_demo_btn")
            ) {
                Text(
                    text = "SUBMIT DEMO",
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // 2. Big Typography Hero Section (Matches Image 1)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xFF2E1065),
                            Color(0xFF1E1035),
                            Color(0xFF0F0E17)
                        )
                    )
                )
                .padding(horizontal = 20.dp, vertical = 28.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                // Large Headline Stacks
                Text(
                    text = "YOUR\nSOUND.\nOUR\nPLATFORM.",
                    color = Color.White,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Black,
                    lineHeight = 36.sp
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "We don't just sign artists; we architect careers. Apex Records provides the infrastructure, vision, and relentless drive to amplify your unique frequency to a global audience.",
                    color = Color(0xFFB4B0C8),
                    fontSize = 11.sp,
                    lineHeight = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                // If player is already signed
                if (state.signedLabelId == "apex_records") {
                    Surface(
                        color = Color(0xFF8B5CF6).copy(alpha = 0.2f),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color(0xFF8B5CF6))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Icon(Icons.Default.Verified, contentDescription = null, tint = Color(0xFF8B5CF6), modifier = Modifier.size(16.dp))
                            Text(
                                text = "OFFICIALLY SIGNED ARTIST • ${( (1f - state.signedLabelCut) * 100 ).toInt()}% ROYALTY SHARE",
                                color = Color.White,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                } else {
                    Button(
                        onClick = { showDemoSubmissionModal = true },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6)),
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(44.dp)
                            .testTag("apex_hero_submit_demo_btn")
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = "SUBMIT DEMO",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
        }

        // 3. Current Roster Section (Matches Image 1)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(3.dp)
                        .height(14.dp)
                        .background(Color(0xFF8B5CF6))
                )
                Text(
                    text = "CURRENT ROSTER",
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Roster Item 1: Echo Vane
            RosterArtistCard(
                badge = "ALT-R&B",
                name = "ECHO VANE",
                latestRelease = "LATEST: \"VOID CALLING\""
            )

            // Roster Item 2: KXNG
            RosterArtistCard(
                badge = "TRAP",
                name = "KXNG",
                latestRelease = "LATEST: \"CROWN HEAVY\""
            )

            // Roster Item 3: Lyric Nova
            RosterArtistCard(
                badge = "INDIE SOUL",
                name = "LYRIC NOVA",
                latestRelease = "LATEST: \"ELECTRIC WHISPERS\""
            )

            if (state.signedLabelId == "apex_records") {
                RosterArtistCard(
                    badge = "EXCLUSIVE SIGNING",
                    name = state.playerName.uppercase(),
                    latestRelease = "DISCOGRAPHY: ${state.songs.size} TRACKS • GLOBAL SOUNDSTREAM"
                )
            }
        }

        // 4. Footer
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0A0910))
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "APEX RECORDS",
                color = Color.Gray,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Privacy Policy", color = Color.DarkGray, fontSize = 10.sp)
                Text("•", color = Color.DarkGray, fontSize = 10.sp)
                Text("Terms of Service", color = Color.DarkGray, fontSize = 10.sp)
                Text("•", color = Color.DarkGray, fontSize = 10.sp)
                Text("Artist Portal", color = Color.DarkGray, fontSize = 10.sp)
            }
            Text("© 2024 APEX RECORDS. ALL RIGHTS RESERVED.", color = Color.DarkGray, fontSize = 9.sp)
        }
    }

    // Demo Submission Modal
    if (showDemoSubmissionModal) {
        AlertDialog(
            onDismissRequest = { showDemoSubmissionModal = false },
            containerColor = Color(0xFF1E1B2E),
            title = {
                Text("Apex Records A&R Demo Portal", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 15.sp)
            },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text(
                        text = "Select a mastered studio track to submit directly to the Apex A&R Committee. If your demo meets our threshold, you will receive an official recording contract offer in your Email inbox.",
                        color = Color(0xFFCBD5E1),
                        fontSize = 11.sp
                    )

                    if (state.songs.isEmpty()) {
                        Text(
                            text = "No recorded songs found. You can submit an Artist Pitch package based on your current Vocal (${state.vocalSkill}%) and Lyrics (${state.lyricsSkill}%) ratings.",
                            color = Color(0xFFFBBF24),
                            fontSize = 11.sp
                        )
                    } else {
                        LazyColumn(modifier = Modifier.height(140.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                            items(state.songs) { song ->
                                Surface(
                                    onClick = { selectedSongForDemo = song.id },
                                    color = if (selectedSongForDemo == song.id) Color(0xFF8B5CF6).copy(alpha = 0.3f) else Color(0xFF28253B),
                                    shape = RoundedCornerShape(6.dp),
                                    border = BorderStroke(1.dp, if (selectedSongForDemo == song.id) Color(0xFF8B5CF6) else Color.Transparent),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier.padding(8.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column {
                                            Text(song.title, color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                                            Text("Rating: ${String.format("%.1f", song.rating)} ⭐ • ${song.genre}", color = Color.Gray, fontSize = 10.sp)
                                        }
                                        if (selectedSongForDemo == song.id) {
                                            Icon(Icons.Default.Check, contentDescription = null, tint = Color(0xFF8B5CF6), modifier = Modifier.size(16.dp))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        viewModel.submitDemoToApexRecords(selectedSongForDemo)
                        showDemoSubmissionModal = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B5CF6)),
                    modifier = Modifier.testTag("apex_submit_confirm_button")
                ) {
                    Text("Submit to A&R", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showDemoSubmissionModal = false }) {
                    Text("Cancel", color = Color.Gray, fontSize = 11.sp)
                }
            }
        )
    }
}

@Composable
fun RosterArtistCard(badge: String, name: String, latestRelease: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1C1A29)),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Surface(
                color = Color(0xFF8B5CF6).copy(alpha = 0.2f),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(
                    text = badge,
                    color = Color(0xFFC4B5FD),
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                )
            }
            Text(text = name, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Black)
            Text(text = latestRelease, color = Color(0xFF94A3B8), fontSize = 11.sp)
        }
    }
}

// =================== 3. ALPHADOM STORE WEBSITE (Matches uploaded Image 2) ===================
@Composable
fun AlphadomStoreWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedCategory by remember { mutableStateOf("All") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121214))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 2)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF18181B))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White, modifier = Modifier.size(24.dp))

            Text(
                text = "ALPHADOM",
                color = Color(0xFFD4AF37),
                fontSize = 17.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 1.sp
            )

            BadgedBox(
                badge = {
                    Badge(containerColor = Color(0xFFD4AF37)) {
                        Text("${state.ownedInstruments.size}", color = Color.Black, fontSize = 9.sp)
                    }
                }
            ) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart", tint = Color.White, modifier = Modifier.size(22.dp))
            }
        }

        // 2. Hero Banner (Matches Image 2)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF262115), Color(0xFF181611), Color(0xFF121214))
                    )
                )
                .padding(horizontal = 20.dp, vertical = 24.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Surface(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(16.dp),
                    border = BorderStroke(1.dp, Color(0xFFD4AF37).copy(alpha = 0.6f))
                ) {
                    Text(
                        text = "PREMIUM AUDIO INSTRUMENTS",
                        color = Color(0xFFD4AF37),
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }

                Text(
                    text = "ENGINEERED FOR SOUND",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    text = "Discover uncompromising quality in our curated collection of professional synthesizers, guitars, and studio gear.",
                    color = Color(0xFFA1A1AA),
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                Button(
                    onClick = { selectedCategory = "Synthesizers" },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD4AF37)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.height(38.dp)
                ) {
                    Text("EXPLORE COLLECTION", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Black)
                }
            }
        }

        // 3. Category Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            listOf("All", "Synthesizers", "Guitars", "Studio Gear", "Microphones", "Luxury").forEach { cat ->
                val isSelected = selectedCategory == cat
                Surface(
                    onClick = { selectedCategory = cat },
                    shape = RoundedCornerShape(14.dp),
                    color = if (isSelected) Color(0xFFD4AF37) else Color(0xFF202024),
                    border = BorderStroke(1.dp, if (isSelected) Color(0xFFD4AF37) else Color(0xFF33333A))
                ) {
                    Text(
                        text = cat,
                        color = if (isSelected) Color.Black else Color.LightGray,
                        fontSize = 11.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    )
                }
            }
        }

        // 4. Products Catalog Grid
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            val storeProducts = listOf(
                // Synthesizers
                StoreItemDef("synth_prophet", "Prophet Rev2 8-Voice", "Synthesizers", 2200.0, "+0.35 Song Quality • Analog warmth", 0.35f, false),
                StoreItemDef("synth_moog", "Moog Modular System Studio 55", "Synthesizers", 14500.0, "+0.70 Song Quality • Iconic modular bass", 0.70f, false),
                StoreItemDef("synth_jupiter", "Roland Jupiter-X Synthesizer", "Synthesizers", 2800.0, "+0.40 Song Quality • Modern polyphonic beast", 0.40f, false),
                StoreItemDef("synth_kronos", "Korg Kronos 88-Key Flagship", "Synthesizers", 3900.0, "+0.45 Song Quality • Complete workstation", 0.45f, false),

                // Guitars
                StoreItemDef("strat_60s", "Fender Custom 1960 Stratocaster", "Guitars", 4500.0, "+0.45 Song Quality • Handwound pickups", 0.45f, false),
                StoreItemDef("gibson_lespaul", "Gibson Les Paul 1959 Reissue", "Guitars", 6800.0, "+0.55 Song Quality • Holy grail tone", 0.55f, false),
                StoreItemDef("martin_d28", "Martin D-28 Authentic Acoustic", "Guitars", 3600.0, "+0.40 Song Quality • Resonant Brazilian Rosewood", 0.40f, false),

                // Studio Gear
                StoreItemDef("ssl_console", "SSL 4000 G-Series Console Unit", "Studio Gear", 18500.0, "+0.80 Song Quality • Pro master summing", 0.80f, false),
                StoreItemDef("neve_1073", "Neve 1073 Dual Preamp Strip", "Studio Gear", 3800.0, "+0.45 Song Quality • British class-A drive", 0.45f, false),
                StoreItemDef("la2a_comp", "Teletronix LA-2A Leveling Amplifier", "Studio Gear", 4200.0, "+0.50 Song Quality • Smooth optical compression", 0.50f, false),

                // Microphones
                StoreItemDef("mic_u87", "Neumann U87 Ai Multi-Pattern", "Microphones", 3600.0, "+0.45 Song Quality • Industry vocal standard", 0.45f, false),
                StoreItemDef("mic_c800g", "Sony C-800G Tube Studio Condenser", "Microphones", 11000.0, "+0.75 Song Quality • Elite modern clarity", 0.75f, false),

                // Luxury
                StoreItemDef("lux_rolex", "Rolex Oyster Perpetual Gold", "Luxury", 35000.0, "+20 Public Image • +15 Prestige", 0f, true),
                StoreItemDef("lux_cuban", "18k Solid Diamond Cuban Chain", "Luxury", 28000.0, "+18 Public Image • +12 Prestige", 0f, true),
                StoreItemDef("lux_tailor", "Italian Bespoke Tailored Wardrobe", "Luxury", 12000.0, "+15 Public Image • +10 Prestige", 0f, true)
            )

            val filteredProducts = if (selectedCategory == "All") storeProducts else storeProducts.filter { it.category == selectedCategory }

            filteredProducts.forEach { item ->
                val isOwned = if (item.isLuxury) {
                    state.timelineEvents.any { it.contains(item.name) }
                } else {
                    state.ownedInstruments.any { it.name == item.name || it.id == item.id }
                }

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1B1B20)),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, Color(0xFF2A2A33)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = item.name, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                            Text(text = "$${String.format("%,.0f", item.price)}", color = Color(0xFFD4AF37), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        }

                        Text(text = item.benefit, color = Color(0xFF94A3B8), fontSize = 11.sp)

                        Spacer(modifier = Modifier.height(2.dp))

                        if (isOwned) {
                            Surface(
                                color = Color(0xFF10B981).copy(alpha = 0.2f),
                                shape = RoundedCornerShape(6.dp),
                                border = BorderStroke(1.dp, Color(0xFF10B981))
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 6.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Check, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(14.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("OWNED & IN STUDIO", color = Color(0xFF10B981), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        } else {
                            Button(
                                onClick = {
                                    if (item.isLuxury) {
                                        viewModel.buyLuxuryItem(item.id)
                                    } else {
                                        viewModel.buyInstrument(item.id)
                                    }
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD4AF37)),
                                shape = RoundedCornerShape(6.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(34.dp)
                            ) {
                                Text("BUY NOW", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Black)
                            }
                        }
                    }
                }
            }
        }
    }
}

data class StoreItemDef(
    val id: String,
    val name: String,
    val category: String,
    val price: Double,
    val benefit: String,
    val bonus: Float,
    val isLuxury: Boolean
)

// =================== 4. OMEGA ELECTORAL COMMISSION (Matches uploaded Image 3) ===================
@Composable
fun OecPortalWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D1B2A))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 3)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1B263B))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White, modifier = Modifier.size(24.dp))

            Text(
                text = "Omega Electoral Co...",
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.White, modifier = Modifier.size(22.dp))
        }

        // 2. Deep Blue Graphic Card (Matches Image 3)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF1E3A8A), Color(0xFF172554), Color(0xFF0D1B2A))
                    )
                )
                .padding(horizontal = 18.dp, vertical = 22.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(22.dp)
                            .background(Color(0xFF60A5FA), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.HowToVote, contentDescription = null, tint = Color.Black, modifier = Modifier.size(14.dp))
                    }
                    Text(
                        text = "OFFICIAL ELECTION PORTAL",
                        color = Color(0xFF93C5FD),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "MAYORAL ELECTIONS ${state.currentYear}",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    text = "Prepare for the upcoming civic duties. Ensure your information is up to date and explore live reporting.",
                    color = Color(0xFFBFDBFE),
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { viewModel.showToast("Citizen Voter ID verified active for ${state.playerName}.") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3B82F6)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.weight(1f).height(38.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.Default.Person, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                            Text("VOTER REG", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    OutlinedButton(
                        onClick = { viewModel.showToast("Current Turnout: 68.4% across 14 municipal districts.") },
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                        border = BorderStroke(1.dp, Color(0xFF60A5FA)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.weight(1f).height(38.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Icon(Icons.Default.BarChart, contentDescription = null, tint = Color(0xFF60A5FA), modifier = Modifier.size(14.dp))
                            Text("LIVE RESULTS", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        // 3. Candidates & Agendas
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "CERTIFIED CANDIDATES & AGENDAS",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )

            val candidates = listOf(
                Triple("cand_elena", "Elena Vance", "Civic Progressive Alliance") to """• $500,000 State Creative Arts & Studio Grant Subsidies
• Nightlife & Live Music Entertainment Zone Deregulation
• 3% Tax Relief for Registered Music Creators""",
                Triple("cand_marcus", "Marcus Sterling", "Fiscal Conservative Front") to """• 0% Capital Gains on Music Intellectual Property & Master Catalogs
• Private Commercial Studio Security Tax Credits
• Corporate Brand Sponsorship Write-Off Incentives""",
                Triple("cand_aria", "Aria Chen", "Digital Rights & Innovation Party") to """• Strict AI Voice Cloning & Deepfake Copyright Protection
• Municipal High-Speed Fiber Backbone for Recording Studios
• Mandatory Streaming Royalty Fair Wage Floor"""
            )

            candidates.forEach { (cand, agenda) ->
                val (id, name, party) = cand
                val isVotedForThis = state.electionVotedCandidateId == id

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1B263B)),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, if (isVotedForThis) Color(0xFF60A5FA) else Color(0xFF2D3E5B)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(name, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                                Text(party, color = Color(0xFF93C5FD), fontSize = 10.sp)
                            }
                            if (isVotedForThis) {
                                Surface(color = Color(0xFF10B981).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                                    Text("VOTED", color = Color(0xFF10B981), fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                                }
                            }
                        }

                        Text(agenda, color = Color(0xFFE2E8F0), fontSize = 11.sp, lineHeight = 16.sp)

                        if (!isVotedForThis) {
                            Button(
                                onClick = { viewModel.voteInOmegaElection(id, name, party) },
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2563EB)),
                                shape = RoundedCornerShape(6.dp),
                                modifier = Modifier.fillMaxWidth().height(34.dp).testTag("vote_btn_$id")
                            ) {
                                Text("CAST BALLOT FOR $name", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }
        }

        // 4. Official Announcements (Matches Image 3)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Official Announcements",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1B263B)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Surface(color = Color(0xFFEF4444).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                        Text("URGENT", color = Color(0xFFEF4444), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                    }
                    Text("Polling Station Relocations in District 4", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Text("Due to unforeseen maintenance, polling stations 4A and 4C have been relocated to Central High.", color = Color.Gray, fontSize = 10.sp)
                }
            }
        }
    }
}

// =================== 5. PULSEWIRE NEWS WEBSITE (Matches uploaded Image 4) ===================
@Composable
fun PulsewireNewsWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF111827))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 4)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1F2937))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White, modifier = Modifier.size(24.dp))

            Text(
                text = "⚡ PULSEWIRE",
                color = Color(0xFF00E5FF),
                fontSize = 17.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 1.sp
            )

            Icon(imageVector = Icons.Default.Search, contentDescription = "Search", tint = Color.White, modifier = Modifier.size(22.dp))
        }

        // 2. Cyan Breaking Ticker (Matches Image 4)
        Surface(
            color = Color(0xFF00E5FF),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "BREAKING: WGT COHORT ANNOUNCED // PRODUCER BATTLE HEATS UP // ROYALTIES SURGE //",
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }

        // 3. Exclusive Hero Article (Matches Image 4)
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1F2937)),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(color = Color(0xFF00E5FF).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                        Text("EXCLUSIVE", color = Color(0xFF00E5FF), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                    }
                    Text("LATEST", color = Color.Gray, fontSize = 10.sp)
                }

                Text(
                    text = "WGT COHORT ANNOUNCED - WHO'S IN?",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    text = "The highly anticipated list is finally here. We break down the names, the controversies, and what it means for the industry.",
                    color = Color(0xFF9CA3AF),
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )

                Button(
                    onClick = { viewModel.showToast("Opening exclusive editorial breakdown...") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00E5FF)),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.height(34.dp)
                ) {
                    Text("READ FULL STORY", color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.Black)
                }
            }
        }

        // 4. Feature Cards Grid (Matches Image 4)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Card 1: Tech
            PulsewireArticleRow(
                badge = "TECH",
                badgeColor = Color(0xFF10B981),
                title = "TOP 10 GEAR TO BOOST PRODUCTION",
                description = "The renaissance of analog polyphonic synths in modern chart-topping records."
            )

            // Card 2: Gossip
            PulsewireArticleRow(
                badge = "GOSSIP",
                badgeColor = Color(0xFFF59E0B),
                title = "STUDIO BRAWL: WHO THREW THE FIRST PUNCH?",
                description = "Behind the scenes at Sector 4 recording facility: ego clashes and master tape disputes."
            )

            // Card 3: Live Battle
            PulsewireArticleRow(
                badge = "● LIVE NOW",
                badgeColor = Color(0xFFEF4444),
                title = "PRODUCER BATTLE: ROUND 1",
                description = "Live tournament streaming on digital waves right now."
            )
        }

        // 5. Trending Section (Matches Image 4)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0F172A))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "📈 TRENDING",
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )

            listOf(
                "01. BASS DROP PLUGIN REVIEW ➔",
                "02. SYNTH WARS 2024 ➔",
                "03. INDIE LABEL TAKEOVER ➔"
            ).forEach { item ->
                Text(
                    text = item,
                    color = Color(0xFF00E5FF),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.clickable { viewModel.showToast("Loading article: $item") }
                )
            }
        }
    }
}

@Composable
fun PulsewireArticleRow(badge: String, badgeColor: Color, title: String, description: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1F2937)),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Surface(color = badgeColor.copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                Text(badge, color = badgeColor, fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
            }
            Text(title, color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text(description, color = Color(0xFF9CA3AF), fontSize = 10.sp)
        }
    }
}

// =================== 6. BLACK HAT DARKNET WEBSITE (Matches uploaded Image 5) ===================
@Composable
fun BlackHatWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF080C08))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Monospace Header (Matches Image 5)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0F170F))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Text("[>]", color = Color(0xFF00FF66), fontSize = 14.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
                Text("BH.ONLINE", color = Color(0xFF00FF66), fontSize = 15.sp, fontWeight = FontWeight.Black, fontFamily = FontFamily.Monospace)
            }

            Icon(imageVector = Icons.Default.Shield, contentDescription = "Encrypted", tint = Color(0xFF00FF66), modifier = Modifier.size(18.dp))
        }

        // 2. Terminal Alert Box (Matches Image 5)
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF140808)),
            border = BorderStroke(1.dp, Color(0xFFEF4444)),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Column(modifier = Modifier.padding(10.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    text = "⚠️ >> ALERT: SCC TRACKING DETECTED IN SECTOR 7G",
                    color = Color(0xFFEF4444),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )
                Text(
                    text = "Evade active surveillance nodes. All communications encrypted via P2P escrow. Purge local cache before exit.",
                    color = Color(0xFFFCA5A5),
                    fontSize = 9.sp,
                    fontFamily = FontFamily.Monospace
                )
            }
        }

        // 3. Risk Status Shield Indicator
        val isSafe = state.reliability >= 70f && (state.industryRespect >= 30f || state.influence >= 30f)
        Surface(
            color = if (isSafe) Color(0xFF00FF66).copy(alpha = 0.15f) else Color(0xFFEF4444).copy(alpha = 0.15f),
            border = BorderStroke(1.dp, if (isSafe) Color(0xFF00FF66) else Color(0xFFEF4444)),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Icon(
                    imageVector = if (isSafe) Icons.Default.CheckCircle else Icons.Default.Warning,
                    contentDescription = null,
                    tint = if (isSafe) Color(0xFF00FF66) else Color(0xFFEF4444),
                    modifier = Modifier.size(16.dp)
                )
                Text(
                    text = if (isSafe) {
                        "ESCROW SHIELD SECURE (Reliability: ${state.reliability.toInt()}%, Influence: ${state.industryRespect.toInt()}%)"
                    } else {
                        "CRITICAL RISK: SCC INTERCEPTION RISK 85% (Need ≥70% Rel & ≥30% Inf)"
                    },
                    color = if (isSafe) Color(0xFF00FF66) else Color(0xFFEF4444),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )
            }
        }

        // 4. Market Listings (Matches Image 5)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("> MARKET_LISTINGS.exe", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
                Text("STATUS: ACTIVE", color = Color(0xFF00FF66), fontSize = 10.sp, fontFamily = FontFamily.Monospace)
            }

            // Item 1: Cast Followers
            BlackHatListingItem(
                title = "CAST FOLLOWERS (10K BULK)",
                description = "Botnet deployed via decentralized nodes. High retention rate.",
                priceBtc = "0.05 BTC ($3,200)",
                reqTag = null,
                onExecute = { viewModel.executeBlackHatPurchase("CAST_FOLLOWERS") }
            )

            // Item 2: Streams Pack
            BlackHatListingItem(
                title = "INSTANT STREAMS PACK (50K STREAMS)",
                description = "Automated playback across 500+ proxy IPs. Bypass standard detection algorithms.",
                priceBtc = "0.12 BTC ($5,500)",
                reqTag = null,
                onExecute = { viewModel.executeBlackHatPurchase("STREAM_PACK") }
            )

            // Item 3: Politician Votes
            BlackHatListingItem(
                title = "BLACK MARKET CIVIC PROXY VOTES (5K VOTES)",
                description = "Syndicate proxy ballot stuffing for regional municipal elections.",
                priceBtc = "0.20 BTC ($8,000)",
                reqTag = null,
                onExecute = { viewModel.executeBlackHatPurchase("POLITICIAN_VOTES") }
            )

            // Item 4: Stolen Hardware
            BlackHatListingItem(
                title = "SURPLUS STUDIO HARDWARE (UNMARKED)",
                description = "High-end audio interfaces and mics. Serial numbers expunged. Shipped via dark-drop.",
                priceBtc = "0.15 BTC ($3,500)",
                reqTag = "REQ: VERIFIED ACC",
                onExecute = { viewModel.executeBlackHatPurchase("STOLEN_HARDWARE") }
            )
        }

        // 5. Recent Transactions Log (Matches Image 5)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0A100A))
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text("> RECENT_TX_LOG", color = Color(0xFF00FF66), fontSize = 11.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
            Text("0x7A...3F9: 0.05 BTC [DELIVERED]", color = Color.Gray, fontSize = 9.sp, fontFamily = FontFamily.Monospace)
            Text("0xB2...1C4: 0.12 BTC [DELIVERED]", color = Color.Gray, fontSize = 9.sp, fontFamily = FontFamily.Monospace)
            Text("0x9F...E2A: 0.20 BTC [CONFIRMED]", color = Color.Gray, fontSize = 9.sp, fontFamily = FontFamily.Monospace)
        }
    }
}

@Composable
fun BlackHatListingItem(title: String, description: String, priceBtc: String, reqTag: String?, onExecute: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF0E160E)),
        border = BorderStroke(1.dp, Color(0xFF1E331E)),
        shape = RoundedCornerShape(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(title, color = Color(0xFF00FF66), fontSize = 11.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
                if (reqTag != null) {
                    Text(reqTag, color = Color(0xFFFBBF24), fontSize = 8.sp, fontFamily = FontFamily.Monospace)
                }
            }

            Text(description, color = Color(0xFF86EFAC), fontSize = 9.sp, fontFamily = FontFamily.Monospace)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(priceBtc, color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)

                Button(
                    onClick = { onExecute() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00FF66)),
                    shape = RoundedCornerShape(2.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 2.dp),
                    modifier = Modifier.height(26.dp)
                ) {
                    Text("[EXECUTE]", color = Color.Black, fontSize = 9.sp, fontWeight = FontWeight.Black, fontFamily = FontFamily.Monospace)
                }
            }
        }
    }
}

// =================== 7. THE GRAND AWARDS WEBSITE (Matches uploaded Image 6) ===================
@Composable
fun GrandAwardsWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E0C0A))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 6)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF17130F))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color(0xFFE5C07B), modifier = Modifier.size(16.dp))
                Text(
                    text = "THE GRAND AWARDS",
                    color = Color(0xFFE5C07B),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp
                )
            }

            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White, modifier = Modifier.size(22.dp))
        }

        // 2. Hero Section (Matches Image 6)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF261D12), Color(0xFF18130D), Color(0xFF0E0C0A))
                    )
                )
                .padding(horizontal = 20.dp, vertical = 28.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Surface(
                    color = Color.Transparent,
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color(0xFFE5C07B).copy(alpha = 0.6f))
                ) {
                    Text(
                        text = "WELCOME TO",
                        color = Color(0xFFE5C07B),
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp)
                    )
                }

                Text(
                    text = "THE\nPINNACLE\nOF\nACHIEVEMENT",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black,
                    lineHeight = 32.sp
                )

                Text(
                    text = "Celebrating visionary artistry, unparalleled creativity, and defining moments of the industry in a night of uncompromising elegance.",
                    color = Color(0xFFD1C7BD),
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Button(
                        onClick = { viewModel.showToast("Laureate Spotlight: Shadow Collective & Top Producers.") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE5C07B)),
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.weight(1f).height(38.dp)
                    ) {
                        Text("VIEW WINNERS", color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }

                    OutlinedButton(
                        onClick = { viewModel.requestGrandAwardsInvitation() },
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFFE5C07B)),
                        border = BorderStroke(1.dp, Color(0xFFE5C07B)),
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.weight(1f).height(38.dp)
                    ) {
                        Text(
                            if (state.grandAwardVipAccess) "VIP CONFIRMED" else "GALA DETAILS",
                            color = Color(0xFFE5C07B),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

        // 3. Latest Laureates & Categories (Matches Image 6)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text("LATEST LAUREATES", color = Color(0xFFE5C07B), fontSize = 12.sp, fontWeight = FontWeight.Bold)

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1B1611)),
                border = BorderStroke(1.dp, Color(0xFF33271C)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(Color(0xFFE5C07B).copy(alpha = 0.2f), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.EmojiEvents, contentDescription = null, tint = Color(0xFFE5C07B), modifier = Modifier.size(20.dp))
                    }
                    Column {
                        Text("ARTIST OF THE YEAR", color = Color(0xFFE5C07B), fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        Text(if (state.grandAwardWon) state.playerName else "Midnight Reverie", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        Text("Album: Electric Constellations", color = Color.Gray, fontSize = 10.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text("THE DISCIPLINES", color = Color(0xFFE5C07B), fontSize = 12.sp, fontWeight = FontWeight.Bold)

            listOf("🎧 Contemporary Pop", "🎙️ Urban & R&B", "🎸 Alternative & Indie", "🎛️ Electronic & Dance").forEach { disc ->
                Surface(
                    color = Color(0xFF17130F),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(disc, color = Color.White, fontSize = 11.sp, modifier = Modifier.padding(10.dp))
                }
            }
        }
    }
}

// =================== 8. SOLD.COM REAL ESTATE & ASSETS (Matches uploaded Image 7) ===================
@Composable
fun SoldRealEstateWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedFilter by remember { mutableStateOf("All") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF14171C))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 7)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1C222B))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", tint = Color.White, modifier = Modifier.size(24.dp))

            Text(
                text = "SOLD.COM",
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 1.sp
            )

            Icon(imageVector = Icons.Default.Person, contentDescription = "Profile", tint = Color.White, modifier = Modifier.size(22.dp))
        }

        // 2. Urgent Banner (Matches Image 7)
        Surface(
            color = Color(0xFFF59E0B),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "⚠️ AUCTION ENDING SOON: THE SKYLINE VIEW STUDIO CLOSES IN 2H 14M",
                color = Color.Black,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)
            )
        }

        // 3. Hero Section (Matches Image 7)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF1E293B), Color(0xFF14171C))
                    )
                )
                .padding(horizontal = 16.dp, vertical = 20.dp)
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Text(
                    text = "Discover Extraordinary Assets",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    text = "Exclusive access to off-market real estate, premier businesses, and high-value acquisitions.",
                    color = Color(0xFF94A3B8),
                    fontSize = 11.sp,
                    lineHeight = 15.sp
                )
            }
        }

        // 4. Asset Listings
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Asset 1: Skyline View Studio Penthouse
            SoldAssetCard(
                title = "Skyline View Penthouse & Studio",
                location = "Upper West Side, Sector 1",
                price = 4250000.0,
                specs = "+35 Energy / Week • +15 Prestige • Private Rooftop Heliport",
                isOwned = state.ownedHouses.any { it.name.contains("Skyline") || it.name.contains("Penthouse") },
                onBuy = { viewModel.buyHouse("skyline_penthouse") }
            )

            // Asset 2: Coastal Villa
            SoldAssetCard(
                title = "Coastal Villa - The Glass Pavilion",
                location = "Pacific Coastline, Sector 8",
                price = 5100000.0,
                specs = "+50 Energy / Week • Oceanfront Infinity Pool & Studio",
                isOwned = state.ownedHouses.any { it.name.contains("Coastal") || it.name.contains("Villa") },
                onBuy = { viewModel.buyHouse("coastal_villa") }
            )

            // Asset 3: Ferrari SF90 Stradale
            SoldAssetCard(
                title = "Ferrari SF90 Stradale Hybrid",
                location = "Hypercar Division",
                price = 620000.0,
                specs = "+25 Prestige • +15 Energy • 0-60 in 2.5s",
                isOwned = state.ownedCars.any { it.name.contains("Ferrari") || it.name.contains("SF90") },
                onBuy = { viewModel.buyCar("ferrari_sf90") }
            )

            // Asset 4: Rolls-Royce Phantom
            SoldAssetCard(
                title = "Rolls-Royce Phantom Series II",
                location = "Ultra-Luxury Vehicles",
                price = 480000.0,
                specs = "+20 Prestige • +12 Energy • Bespoke Starlight Headliner",
                isOwned = state.ownedCars.any { it.name.contains("Phantom") || it.name.contains("Rolls") },
                onBuy = { viewModel.buyCar("rolls_phantom") }
            )
        }
    }
}

@Composable
fun SoldAssetCard(title: String, location: String, price: Double, specs: String, isOwned: Boolean, onBuy: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E242E)),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(title, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    Text(location, color = Color.Gray, fontSize = 10.sp)
                }
                Text("$${String.format("%,.0f", price)}", color = Color(0xFF38BDF8), fontSize = 13.sp, fontWeight = FontWeight.Bold)
            }

            Text(specs, color = Color(0xFFCBD5E1), fontSize = 11.sp)

            if (isOwned) {
                Surface(
                    color = Color(0xFF10B981).copy(alpha = 0.2f),
                    shape = RoundedCornerShape(4.dp),
                    border = BorderStroke(1.dp, Color(0xFF10B981))
                ) {
                    Text("OWNED & REGISTERED", color = Color(0xFF10B981), fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp))
                }
            } else {
                Button(
                    onClick = { onBuy() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF38BDF8)),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.fillMaxWidth().height(34.dp)
                ) {
                    Text("ACQUIRE ASSET", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

// =================== 9. STATE CRIME COMMAND WEBSITE (Matches uploaded Image 8) ===================
@Composable
fun StateCrimeCommandWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0A0F1D))
            .verticalScroll(rememberScrollState())
    ) {
        // 1. Header (Matches Image 8)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF111936))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                Icon(imageVector = Icons.Default.Security, contentDescription = null, tint = Color(0xFF60A5FA), modifier = Modifier.size(18.dp))
                Text(
                    text = "STATE CRIME COMMAND",
                    color = Color(0xFF60A5FA),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    letterSpacing = 1.sp
                )
            }

            Surface(color = Color(0xFF10B981).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                Text("● LIVE", color = Color(0xFF10B981), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
            }
        }

        // 2. Critical Wanted Player Card (If Wanted!)
        if (state.isSccWanted) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF260D0D)),
                border = BorderStroke(1.5.dp, Color(0xFFEF4444)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(color = Color(0xFFEF4444), shape = RoundedCornerShape(4.dp)) {
                            Text("🚨 CRITICAL THREAT - TARGET WANTED", color = Color.White, fontSize = 9.sp, fontWeight = FontWeight.Black, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                        }
                        Text("ID: XH-771", color = Color.Gray, fontSize = 10.sp)
                    }

                    Text(
                        text = "SUBJECT: ${state.playerName.uppercase()}",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Black
                    )

                    Text(
                        text = "WANTED FOR: ${state.sccCrimeReason}",
                        color = Color(0xFFFCA5A5),
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "SANCTIONS: Brand deals frozen • Commercial assets under federal surveillance • Public integrity penalized 50%.",
                        color = Color(0xFFCBD5E1),
                        fontSize = 10.sp
                    )

                    Button(
                        onClick = { viewModel.paySccGovernmentFine() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
                        shape = RoundedCornerShape(6.dp),
                        modifier = Modifier.fillMaxWidth().height(38.dp).testTag("pay_scc_fine_button")
                    ) {
                        Text("PAY GOVERNMENT FINE ($${String.format("%,.0f", state.sccFineAmount)}) & EXPUNGE DOSSIER", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Black)
                    }
                }
            }
        } else {
            Surface(
                color = Color(0xFF10B981).copy(alpha = 0.15f),
                shape = RoundedCornerShape(6.dp),
                border = BorderStroke(1.dp, Color(0xFF10B981)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp)
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Color(0xFF10B981), modifier = Modifier.size(16.dp))
                    Text(
                        text = "CITIZEN STATUS: CLEAR (No active warrants or federal tracking)",
                        color = Color(0xFF10B981),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        // 3. Priority Targets: Most Wanted (Matches Image 8)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "// PRIORITY TARGETS: MOST WANTED",
                color = Color(0xFF60A5FA),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )

            listOf(
                Triple("HIGH", "XH-992", "\"GHOST_NODE\" • WANTED: CYBER-EXTORTION"),
                Triple("MED", "XH-993", "UNKNOWN • WANTED: DATA THEFT"),
                Triple("HIGH", "XH-994", "\"SILVER_FOX\" • WANTED: INFRASTRUCTURE SABOTAGE"),
                Triple("LOW", "XH-995", "\"CIPHER\" • WANTED: WIRE FRAUD")
            ).forEach { (threat, id, crime) ->
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF131D36)),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Row(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    color = if (threat == "HIGH") Color(0xFFEF4444) else Color(0xFFF59E0B),
                                    shape = RoundedCornerShape(2.dp)
                                ) {
                                    Text(threat, color = Color.White, fontSize = 8.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.dp))
                                }
                                Text("ID: $id", color = Color.Gray, fontSize = 10.sp)
                            }
                            Text(crime, color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
        }

        // 4. Activity Map (Matches Image 8)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("// ILLEGAL ACTIVITY MAP: SECTOR 4", color = Color(0xFF60A5FA), fontSize = 12.sp, fontWeight = FontWeight.Bold)

            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF0F182E)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text("LAT: 34.0522 N, LON: 118.2437 W", color = Color.Gray, fontSize = 9.sp)
                    Text("DETECTED ANOMALIES: 3 • THREAT LEVEL: ELEVATED", color = Color(0xFFFCA5A5), fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    Button(
                        onClick = { viewModel.showToast("Anonymous cyber intel submitted to Sector 4 dispatch.") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2563EB)),
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.fillMaxWidth().height(32.dp)
                    ) {
                        Text("SUBMIT ANONYMOUS TIP", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

// =================== 10. GLOBAL MARKET INTELLIGENCE ===================
@Composable
fun MarketIntelligenceWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0F172A))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1E293B))
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text("GLOBAL MARKET INTELLIGENCE", color = Color(0xFF38BDF8), fontSize = 15.sp, fontWeight = FontWeight.Black)
                Text("omnisearch.com/market • Macroeconomic Feed", color = Color.Gray, fontSize = 10.sp)
            }
            Surface(color = Color(0xFF38BDF8).copy(alpha = 0.2f), shape = RoundedCornerShape(6.dp)) {
                Text(state.economyCycle, color = Color(0xFF38BDF8), fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp))
            }
        }

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF1E293B))) {
                    Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text("Macro Indicators", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Economic Cycle:", color = Color.Gray, fontSize = 11.sp)
                            Text(state.economyCycle, color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Inflation Rate:", color = Color.Gray, fontSize = 11.sp)
                            Text("${String.format("%.1f", state.inflationRate * 100)}%", color = Color(0xFFF43F5E), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text("Fuel Price:", color = Color.Gray, fontSize = 11.sp)
                            Text("$${state.fuelPrice}/L", color = Color(0xFF10B981), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}

// =================== 11. WIKIPEDIA ARTIST REGISTRY ===================
@Composable
fun WikipediaArtistsWebsitePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181A1B))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF23272A))
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text("WIKIPEDIA", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("wikipedia.org • City Music Artist Registry", color = Color.Gray, fontSize = 10.sp)
            }
            Surface(color = Color(0xFF3B82F6).copy(alpha = 0.2f), shape = RoundedCornerShape(6.dp)) {
                Text("${state.npcs.size} Entries", color = Color(0xFF93C5FD), fontSize = 10.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp))
            }
        }

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(state.npcs) { npc ->
                Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF23272A))) {
                    Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Text(npc.name, color = Color(0xFF93C5FD), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        Text("Genre: ${npc.genrePreference} • Fans: ${String.format("%,d", npc.fans)} • Influence: ${npc.influence.toInt()}/100", color = Color.LightGray, fontSize = 10.sp)
                        Text(
                            text = "A prominent musician based in the city. Relationship affinity with you is ${npc.relationshipWithPlayer.toInt()}%.",
                            color = Color.Gray,
                            fontSize = 10.sp
                        )
                    }
                }
            }
        }
    }
}
'''

new_full_text = full_text[:start_pos] + new_websites_section + "\n" + full_text[end_pos:]

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8") as f:
    f.write(new_full_text)

print("Websites section successfully integrated into SmartphoneComponent.kt!")
