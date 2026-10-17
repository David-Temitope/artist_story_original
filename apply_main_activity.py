import re

print("Updating MainActivity.kt...")

with open("app/src/main/java/com/example/MainActivity.kt", "r", encoding="utf-8", errors="surrogateescape") as f:
    content = f.read()

# 1. Update Artist Command Center stat card level calculation & add advance week arrow
old_stat_card_header = """        // 1. ARTIST COMMAND CENTER PROFILE HERO (Identity, Level, Momentum, Resources)
        item {
            val calculatedLevel = (state.fans / 150000L).toInt().coerceAtLeast(1)
            val currentLevelBase = (calculatedLevel - 1) * 150000L
            val progressPercent = if (calculatedLevel < 10) {
                ((state.fans - currentLevelBase).toFloat() / 150000f).coerceIn(0.05f, 0.98f)
            } else 1.0f"""

new_stat_card_header = """        // 1. ARTIST COMMAND CENTER PROFILE HERO (Identity, Level, Momentum, Resources)
        item {
            // Dynamic multi-pillar Career Mastery (Skills, Reach, Catalog & Industry Standing)
            val totalSkills = (state.vocalSkill + state.songwritingSkill + state.instrumentSkill + state.productionSkill + state.marketingSkill + state.stagePresenceSkill).coerceIn(0f, 600f)
            val skillRatio = totalSkills / 600f
            val reachRatio = ((state.fans + state.followers).toFloat() / 1000000f).coerceIn(0f, 1.0f)
            val catalogRatio = (state.songs.count { it.isReleased }.toFloat() / 15f).coerceIn(0f, 1.0f)
            val avgNpcRel = if (state.npcs.isNotEmpty()) state.npcs.map { it.relationshipWithPlayer }.average().toFloat() / 100f else 0.5f
            val industryRatio = ((state.industryFollowers.toFloat() / 50000f).coerceIn(0f, 1.0f) * 0.5f + avgNpcRel * 0.5f).coerceIn(0f, 1.0f)
            val overallMastery = (skillRatio * 0.35f + reachRatio * 0.30f + catalogRatio * 0.15f + industryRatio * 0.20f).coerceIn(0.0f, 1.0f)
            val calculatedLevel = (overallMastery * 9f).toInt() + 1
            val levelFloor = (calculatedLevel - 1) / 9f
            val levelCeil = calculatedLevel / 9f
            val progressPercent = if (calculatedLevel >= 10) 1.0f else ((overallMastery - levelFloor) / (levelCeil - levelFloor)).coerceIn(0.05f, 0.98f)"""

if old_stat_card_header in content:
    content = content.replace(old_stat_card_header, new_stat_card_header, 1)
    print("✓ Updated stat card level calculation")
else:
    print("! Could not find old_stat_card_header")

# Add Next Week arrow in Stat Card header
old_status_chip = """                                StatusChip(
                                    text = "LVL $calculatedLevel",
                                    color = PrimaryBrandLight
                                )"""

new_status_chip = """                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    StatusChip(
                                        text = "LVL $calculatedLevel",
                                        color = PrimaryBrandLight
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    IconButton(
                                        onClick = { showWeeklyTransitionDialog = true },
                                        modifier = Modifier
                                            .size(32.dp)
                                            .clip(CircleShape)
                                            .background(PrimaryBrandColor.copy(alpha = 0.25f))
                                            .border(1.dp, PrimaryBrandLight.copy(alpha = 0.6f), CircleShape)
                                            .testTag("advance_week_arrow_btn")
                                    ) {
                                        Icon(
                                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                            contentDescription = "Advance to Week ${state.currentWeek + 1}",
                                            tint = PrimaryBrandLight,
                                            modifier = Modifier.size(16.dp)
                                        )
                                    }
                                }"""

if old_status_chip in content:
    content = content.replace(old_status_chip, new_status_chip, 1)
    print("✓ Added Next Week arrow button to stat card")
else:
    print("! Could not find old_status_chip")

# 2. Remove Current Objective card
obj_pattern = r'        // 2\. PRIMARY CAREER OBJECTIVE & RECOMMENDED NEXT ACTION\s+item \{[\s\S]*?\}\n        \}\n'
if re.search(obj_pattern, content):
    content = re.sub(obj_pattern, '', content, count=1)
    print("✓ Removed Current Objective card")
else:
    print("! Could not regex remove Current Objective card")

# 3. Remove Weekly Overview card
overview_pattern = r'        // Weekly Financial Overview Card with custom Canvas Trend Chart\s+item \{[\s\S]*?\}\n        \}\n'
if re.search(overview_pattern, content):
    content = re.sub(overview_pattern, '', content, count=1)
    print("✓ Removed Weekly Overview card")
else:
    print("! Could not regex remove Weekly Overview card")

# 4. Replace Top Track and Top Country with dynamic calculation across world
old_top_grid_pattern = r'        // Two-Column Grid: Top Song & Top Country\s+item \{[\s\S]*?\}\n        \}'
new_top_grid = """        // Two-Column Grid: Top Song & Top Country (Dynamic across Global Music Industry)
        item {
            val playerBestSong = state.songs.filter { it.isReleased }.maxByOrNull { it.totalStreams }
            val npcBestSong = state.npcs.filter { !it.isRetired }.maxByOrNull { it.bestSongStreams }

            val topTrackTitle: String
            val topTrackArtist: String
            val topTrackStreams: Long
            val isPlayerTrack: Boolean

            if (playerBestSong != null && (npcBestSong == null || playerBestSong.totalStreams >= npcBestSong.bestSongStreams)) {
                topTrackTitle = playerBestSong.title
                topTrackArtist = state.artistName
                topTrackStreams = playerBestSong.totalStreams
                isPlayerTrack = true
            } else if (npcBestSong != null) {
                topTrackTitle = npcBestSong.bestSongTitle
                topTrackArtist = npcBestSong.name
                topTrackStreams = npcBestSong.bestSongStreams
                isPlayerTrack = false
            } else {
                topTrackTitle = "Midnight Echoes"
                topTrackArtist = "Elena Vance"
                topTrackStreams = 4500000L
                isPlayerTrack = false
            }

            val countries = listOf("United States", "United Kingdom", "Japan", "Germany", "Canada", "Brazil", "Australia", "France", "South Korea")
            val countryIndex = ((topTrackStreams / 100000L) + state.currentWeek).toInt() % countries.size
            val topCountryName = countries[countryIndex.coerceAtLeast(0)]
            val countryListeners = (topTrackStreams * 0.38).toLong().coerceAtLeast(1200L)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Top Track Card
                Card(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = CardBg),
                    border = BorderStroke(1.dp, if (isPlayerTrack) NeonTeal.copy(alpha = 0.5f) else BorderColor)
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Top Track", color = TextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            Icon(imageVector = Icons.Default.MusicNote, contentDescription = null, tint = if (isPlayerTrack) NeonTeal else PrimaryBrandLight, modifier = Modifier.size(14.dp))
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = topTrackTitle,
                            color = Color.White,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "by $topTrackArtist",
                            color = if (isPlayerTrack) NeonTeal else TextSecondary,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "${String.format("%,d", topTrackStreams)} streams",
                            color = AccentGreen,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }

                // Top Country Card
                Card(
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = CardBg),
                    border = BorderStroke(1.dp, BorderColor)
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Top Market", color = TextSecondary, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            Icon(imageVector = Icons.Default.Public, contentDescription = null, tint = AccentGold, modifier = Modifier.size(14.dp))
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = topCountryName,
                            color = Color.White,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "Global Hub",
                            color = TextSecondary,
                            fontSize = 11.sp
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "${String.format("%,d", countryListeners)} listeners",
                            color = AccentGold,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }
            }
        }"""

if re.search(old_top_grid_pattern, content):
    content = re.sub(old_top_grid_pattern, new_top_grid, content, count=1)
    print("✓ Replaced Top Track and Top Country with dynamic world charts")
else:
    print("! Could not find old_top_grid_pattern")

# 5. Remove Today's Schedule Timeline Widget
schedule_pattern = r'        // Today\'s Schedule Timeline Widget[\s\S]*?\}\n        \}\n'
if re.search(schedule_pattern, content):
    content = re.sub(schedule_pattern, '', content, count=1)
    print("✓ Removed Today's Schedule timeline card")
else:
    print("! Could not regex remove Today's Schedule")

# 6. Remove Proceed to Next Week Card at bottom of Home
next_week_pattern = r'        // Proceed to Next Week Card\s+item \{[\s\S]*?\}\n        \}\n'
if re.search(next_week_pattern, content):
    content = re.sub(next_week_pattern, '', content, count=1)
    print("✓ Removed bottom Proceed to Next Week Card")
else:
    print("! Could not regex remove bottom Proceed to Next Week Card")

# 7. Remove Fan Segmentation Panel from Home
fan_seg_home_pattern = r'        // Fan Segmentation Panel\s+item \{[\s\S]*?\}\n        \}\n'
if re.search(fan_seg_home_pattern, content):
    content = re.sub(fan_seg_home_pattern, '', content, count=1)
    print("✓ Removed Fan Segmentation Panel from Home screen")
else:
    print("! Could not regex remove Fan Segmentation Panel from Home")

# 8. Update ShopProfilePage to have confirmation dialog, audience segments, and remove Diamond Pro & Booster store
old_shop_profile = """@Composable
fun ShopProfilePage(state: GameStateEntity, viewModel: GameViewModel) {
    var reqType by remember { mutableStateOf("CASH") }
    var reqAmount by remember { mutableStateOf("10000") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {"""

new_shop_profile_head = """@Composable
fun ShopProfilePage(state: GameStateEntity, viewModel: GameViewModel) {
    var showResetConfirmDialog by remember { mutableStateOf(false) }

    if (showResetConfirmDialog) {
        AlertDialog(
            onDismissRequest = { showResetConfirmDialog = false },
            containerColor = Color(0xFF1E1C29),
            title = {
                Text(
                    text = "Reset Career & Restart Game?",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            },
            text = {
                Text(
                    text = "Are you sure you want to reset your career? All your progress, songs, releases, fans, bank accounts, and relationships will be permanently erased.",
                    color = TextSecondary,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showResetConfirmDialog = false
                        viewModel.restartGame()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = NeonPink)
                ) {
                    Text("Yes, Reset Everything", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(
                    onClick = { showResetConfirmDialog = false },
                    border = BorderStroke(1.dp, BorderColor)
                ) {
                    Text("Cancel", color = TextPrimary)
                }
            }
        )
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {"""

if old_shop_profile in content:
    content = content.replace(old_shop_profile, new_shop_profile_head, 1)
    print("✓ Added confirmation dialog state to ShopProfilePage")
else:
    print("! Could not find old_shop_profile")

# Update restart button in ShopProfilePage to show dialog
old_restart_btn = """                    Button(
                        onClick = { viewModel.restartGame() },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C1929)),
                        border = BorderStroke(1.dp, NeonPink.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("RESET CAREER & RESTART GAME", color = NeonPink, fontWeight = FontWeight.Bold)
                    }"""

new_restart_btn = """                    Button(
                        onClick = { showResetConfirmDialog = true },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C1929)),
                        border = BorderStroke(1.dp, NeonPink.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth().testTag("reset_career_btn")
                    ) {
                        Text("RESET CAREER & RESTART GAME", color = NeonPink, fontWeight = FontWeight.Bold)
                    }"""

if old_restart_btn in content:
    content = content.replace(old_restart_btn, new_restart_btn, 1)
    print("✓ Updated restart button to trigger confirmation dialog")
else:
    print("! Could not find old_restart_btn")

# Remove Diamond Pro Banner from ShopProfilePage and add Audience Segments
old_diamond_pro = """        // Diamond Pro Premium Promotion Banner
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1B1525)),
                border = BorderStroke(1.dp, NeonPurple.copy(alpha = 0.6f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "DIAMOND PRO STATUS",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = AccentGold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Supercharge Your Growth",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "+20% starting popularity, unlimited contract slots, and priority tour setups.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Button(
                        onClick = { /* Simulated unlock */ },
                        colors = ButtonDefaults.buttonColors(containerColor = AccentGold),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("ACTIVE", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    }
                }
            }
        }"""

audience_segments_profile = """        // Audience Segments Panel (Total Audience Demographics)
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = CardBg),
                border = BorderStroke(1.dp, BorderColor),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Audience Segments (Total: ${String.format("%,d", state.fans)})",
                        style = MaterialTheme.typography.titleMedium,
                        color = NeonPink,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                    val segments = listOf(
                        Triple("Casual Listeners", state.casualFans, "Regular streams & playlist views"),
                        Triple("Hardcore Devotees", state.hardcoreFans, "Buys physical merch & tour passes"),
                        Triple("Elite Collectors", state.collectors, "Rare editions & physical box sets"),
                        Triple("Concert Goers", state.concertGoers, "High attendance rate on world tours"),
                        Triple("International Base", state.internationalFans, "Overseas streaming listener hub"),
                        Triple("Online Supporters", state.onlineCommunity, "Boost social media metrics & trends")
                    )

                    segments.forEachIndexed { index, (name, count, desc) ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(text = name, style = MaterialTheme.typography.bodyMedium, color = Color.White, fontWeight = FontWeight.SemiBold)
                                Text(text = desc, style = MaterialTheme.typography.labelSmall, color = TextSecondary)
                            }
                            Text(
                                text = String.format("%,d", count),
                                style = MaterialTheme.typography.bodyMedium,
                                color = NeonTeal,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        if (index < segments.size - 1) {
                            Divider(color = BorderColor.copy(alpha = 0.5f), thickness = 0.5.dp)
                        }
                    }
                }
            }
        }"""

if old_diamond_pro in content:
    content = content.replace(old_diamond_pro, audience_segments_profile, 1)
    print("✓ Replaced Diamond Pro banner with Audience Segments on Profile page")
else:
    print("! Could not find old_diamond_pro")

# Remove Booster store card and Request Logs from Profile page
booster_pattern = r'        // Booster store card \(Image 5 store\)[\s\S]*?\}\n        \}\n    \}\n\}'
new_end_profile = """    }
}"""
if re.search(booster_pattern, content):
    content = re.sub(booster_pattern, new_end_profile, content, count=1)
    print("✓ Removed Booster store and Request logs from Profile page")
else:
    print("! Could not regex remove Booster store")

# Update Record Label gate in MainActivity
old_label_gate = """                            val meetsReqs = state.cash >= 5000000.0 && state.popularity >= 70f && state.influence >= 80f
                            Button(
                                onClick = { viewModel.createOwnRecordLabel(labelNameInput) },
                                enabled = labelNameInput.isNotBlank() && meetsReqs,
                                colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text("ESTABLISH ENTERTAINMENT COMPANY")
                            }"""

new_label_gate = """                            val totalSkills = (state.vocalSkill + state.songwritingSkill + state.instrumentSkill + state.productionSkill + state.marketingSkill + state.stagePresenceSkill).coerceIn(0f, 600f)
                            val skillRatio = totalSkills / 600f
                            val reachRatio = ((state.fans + state.followers).toFloat() / 1000000f).coerceIn(0f, 1.0f)
                            val catalogRatio = (state.songs.count { it.isReleased }.toFloat() / 15f).coerceIn(0f, 1.0f)
                            val avgNpcRel = if (state.npcs.isNotEmpty()) state.npcs.map { it.relationshipWithPlayer }.average().toFloat() / 100f else 0.5f
                            val industryRatio = ((state.industryFollowers.toFloat() / 50000f).coerceIn(0f, 1.0f) * 0.5f + avgNpcRel * 0.5f).coerceIn(0f, 1.0f)
                            val overallMastery = (skillRatio * 0.35f + reachRatio * 0.30f + catalogRatio * 0.15f + industryRatio * 0.20f).coerceIn(0.0f, 1.0f)
                            val calculatedLevel = (overallMastery * 9f).toInt() + 1

                            val meetsReqs = calculatedLevel >= 10 && state.cash >= 5000000.0 && state.popularity >= 70f && state.influence >= 80f
                            Button(
                                onClick = { viewModel.createOwnRecordLabel(labelNameInput) },
                                enabled = labelNameInput.isNotBlank() && meetsReqs,
                                colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(if (calculatedLevel < 10) "LOCKED (REQUIRES LEVEL 10 MASTER)" else "ESTABLISH ENTERTAINMENT COMPANY")
                            }"""

if old_label_gate in content:
    content = content.replace(old_label_gate, new_label_gate, 1)
    print("✓ Gated record label establishment behind Level 10 mastery")
else:
    print("! Could not find old_label_gate")

with open("app/src/main/java/com/example/MainActivity.kt", "w", encoding="utf-8", errors="surrogateescape") as f:
    f.write(content)

print("MainActivity.kt update done.")
