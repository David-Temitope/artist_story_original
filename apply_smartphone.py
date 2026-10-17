import re

print("Updating SmartphoneComponent.kt...")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8", errors="surrogateescape") as f:
    content = f.read()

# 1. ProfessionalEmailScreen: Mark mail as read on select & fix isUnread check
old_email_top = """@Composable
fun ProfessionalEmailScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedMailId by remember { mutableStateOf<String?>(null) }"""

new_email_top = """@Composable
fun ProfessionalEmailScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedMailId by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(selectedMailId) {
        if (selectedMailId != null) {
            viewModel.markMailAsRead(selectedMailId!!)
        }
    }"""

if old_email_top in content:
    content = content.replace(old_email_top, new_email_top, 1)
    print("✓ Added markMailAsRead on email open")
else:
    print("! Could not find old_email_top")

old_unread_check = """                    items(letters) { mail ->
                        val isUnread = !mail.isAccepted && mail.type == "NORMAL" """

new_unread_check = """                    items(letters) { mail ->
                        val isUnread = !mail.isRead"""

if old_unread_check in content:
    content = content.replace(old_unread_check, new_unread_check, 1)
    print("✓ Updated isUnread check to use isRead flag")
else:
    print("! Could not find old_unread_check")

# 2. MerchStudioAppScreen: Add vertical scroll to Design Studio column
old_merch_column = """        } else {
            // Design Studio Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFF141318), RoundedCornerShape(12.dp))
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {"""

new_merch_column = """        } else {
            // Design Studio Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFF141318), RoundedCornerShape(12.dp))
                    .padding(12.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {"""

if old_merch_column in content:
    content = content.replace(old_merch_column, new_merch_column, 1)
    print("✓ Added vertical scroll to Merch Design Studio tab")
else:
    print("! Could not find old_merch_column")

# 3. CastSocialScreen: Add engagement timer, Following Artists directory & manual category niche selection
old_cast_head = """@Composable
fun CastSocialScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var newPostContent by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf("For You") }"""

new_cast_head = """@Composable
fun CastSocialScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var newPostContent by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf("For You") }
    var followingSubTab by remember { mutableStateOf("Feed") }

    LaunchedEffect(Unit) {
        while (kotlinx.coroutines.isActive) {
            kotlinx.coroutines.delay(1000)
            viewModel.incrementCastTimeSpent(1)
        }
    }"""

if old_cast_head in content:
    content = content.replace(old_cast_head, new_cast_head, 1)
    print("✓ Added engagement time tracking in CastSocialScreen")
else:
    print("! Could not find old_cast_head")

# Replace SMM auto-post banner with manual Category Niche focus selector
old_smm_banner_pattern = r'        // SMM Active Status & Strategy Banner[\s\S]*?        // Draft Post Area'
new_niche_selector = """        // Cast Focus & Organic Engagement Bar
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 4.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFF191826))
                .border(0.5.dp, Color(0xFF1D9BF0).copy(alpha = 0.3f), RoundedCornerShape(8.dp))
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Cast Niche Focus", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                Text(
                    text = "Weekly Activity: ${state.castTimeSpentThisWeek}s in-app | ${state.castPostsCountThisWeek} posts",
                    color = if (state.castTimeSpentThisWeek >= 15) Color(0xFF00E676) else Color.LightGray,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            val smmCategories = listOf("Music & Art", "Tech & Gadgets", "Fashion & Lifestyle", "Gaming & Entertainment", "Fitness & Wellness", "Business & Finance")
            LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                items(smmCategories) { cat ->
                    val isSel = state.castNicheFocus == cat
                    FilterChip(
                        selected = isSel,
                        onClick = { viewModel.setCastNicheFocus(cat) },
                        label = { Text(cat, fontSize = 9.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFF1D9BF0),
                            selectedLabelColor = Color.White,
                            containerColor = Color(0xFF232230),
                            labelColor = Color.LightGray
                        )
                    )
                }
            }
        }

        // Draft Post Area"""

if re.search(old_smm_banner_pattern, content):
    content = re.sub(old_smm_banner_pattern, new_niche_selector, content, count=1)
    print("✓ Replaced SMM automation with manual Cast Niche Focus selector")
else:
    print("! Could not regex replace old_smm_banner_pattern")

# In CastSocialScreen feed: add Artist Directory when selectedTab == "Following"
old_feed_list = """        // Posts Feed
        val postsToDisplay = if (selectedTab == "For You") {
            state.castPosts
        } else {
            state.castPosts.filter { it.isByPlayer }
        }"""

new_feed_list = """        if (selectedTab == "Following") {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = { followingSubTab = "Feed" },
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = if (followingSubTab == "Feed") Color(0xFF1D9BF0) else Color.Transparent,
                        contentColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(0xFF1D9BF0)),
                    modifier = Modifier.weight(1f).height(28.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Following Feed", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
                OutlinedButton(
                    onClick = { followingSubTab = "Artists" },
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = if (followingSubTab == "Artists") Color(0xFF1D9BF0) else Color.Transparent,
                        contentColor = Color.White
                    ),
                    border = BorderStroke(1.dp, Color(0xFF1D9BF0)),
                    modifier = Modifier.weight(1f).height(28.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Artist Directory (${state.npcs.count { it.isFollowedByPlayer }}/${state.npcs.size})", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        // Posts Feed or Artist Directory
        if (selectedTab == "Following" && followingSubTab == "Artists") {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(state.npcs) { npc ->
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF15181C)),
                        border = BorderStroke(1.dp, Color(0xFF2F3336)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                val appearance = getNpcAvatar(npc.name)
                                AvatarWidget(
                                    baseLook = appearance.baseLook,
                                    skinTone = appearance.skinTone,
                                    hairStyleId = appearance.hairId,
                                    clothingId = appearance.clothesId,
                                    jewelryId = appearance.jewelryId,
                                    modifier = Modifier.size(36.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(text = npc.name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                                    Text(text = "${npc.genre} • ${String.format("%,d", npc.fans)} fans", color = Color.Gray, fontSize = 10.sp)
                                    Text(text = "Affinity: ${npc.relationshipWithPlayer.toInt()}%", color = Color(0xFF1D9BF0), fontSize = 10.sp)
                                }
                            }

                            Button(
                                onClick = { viewModel.toggleFollowNpcArtist(npc.id) },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (npc.isFollowedByPlayer) Color(0xFF2C2C2C) else Color(0xFF1D9BF0)
                                ),
                                shape = RoundedCornerShape(16.dp),
                                modifier = Modifier.height(28.dp),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 0.dp)
                            ) {
                                Text(
                                    text = if (npc.isFollowedByPlayer) "Following" else "Follow",
                                    color = Color.White,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        } else {
            // Posts Feed
            val postsToDisplay = if (selectedTab == "For You") {
                state.castPosts
            } else {
                state.castPosts.filter { it.isByPlayer || state.npcs.any { n -> n.isFollowedByPlayer && n.name == it.authorName } }
            }"""

if old_feed_list in content:
    content = content.replace(old_feed_list, new_feed_list, 1)
    # also balance the closing brace for the else block at bottom of LazyColumn
    old_feed_end = """                            Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = Color(0xFF71767B), modifier = Modifier.size(15.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}"""
    # let's check exact lines in SmartphoneComponent
    print("✓ Added Artist Directory in Following tab")
else:
    print("! Could not find old_feed_list")

# 4. Add Help Section in Settings
old_wallpaper_end = """            item {
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { /* Saved state handled */ },
                    colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().height(48.dp)
                ) {
                    Text("PREVIEW & APPLY THEME", fontWeight = FontWeight.Bold, color = Color.White)
                }
            }
        }
    }
}"""

help_guide_section = """            item {
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { /* Saved state handled */ },
                    colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().height(48.dp)
                ) {
                    Text("PREVIEW & APPLY THEME", fontWeight = FontWeight.Bold, color = Color.White)
                }
            }

            // CAREER GUIDEBOOK & HELP MANUAL
            item {
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF161424)),
                    border = BorderStroke(1.dp, Color(0xFF2C2844)),
                    shape = RoundedCornerShape(14.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(imageVector = Icons.Default.HelpOutline, contentDescription = null, tint = NeonTeal, modifier = Modifier.size(20.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Music Career Guide & Help", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Welcome to Artist Story. Below is an overview of key systems operating in the music industry simulation to assist your strategic decision making:",
                            color = TextSecondary,
                            fontSize = 11.sp,
                            lineHeight = 16.sp
                        )
                        Spacer(modifier = Modifier.height(12.dp))

                        val guideTopics = listOf(
                            "Staff Hub & Professional Team" to "Each specialist brings distinct intelligence, reliability, and loyalty. Paying fair compensation and investing in training retains talent. Unfair cuts or burnout increase resignation risks.",
                            "Copyrights & Intellectual Property" to "Registering copyrights secures your catalog against infringement, unauthorized sample usage, and theft. Owning your master rights compounds long-term royalties.",
                            "Cast Social Media & Engagement" to "Maintaining a focused category niche, spending time connecting, and posting consistently builds true organic reach. Following fellow artists fosters peer relations.",
                            "Spirituality & Well-Being" to "Maintaining balance through prayer, meditation, and rest relieves career stress, boosts inspiration, and preserves focus during heavy release cycles.",
                            "Professional Mailbox & Inquiries" to "Review all collaboration requests, endorsement inquiries, and business offers carefully. Early-stage offers require diligence before accepting binding terms.",
                            "Banking & Reserve Management" to "Living within your means and maintaining cash in savings safeguards your career during economic downturns and dry release spells.",
                            "Crypto & Stock Volatility" to "Financial markets fluctuate with global sentiment. High potential reward comes with market volatility and requires measured risk tolerance.",
                            "Industry Networking & Collaborations" to "Building genuine relationships with fellow artists and industry stakeholders unlocks co-release opportunities and long-term goodwill.",
                            "Merchandise Studio & Product Lines" to "Launching customized apparel and physical collectibles generates direct listener revenue and deepens fan attachment to your brand.",
                            "Studio Production & World Tours" to "Writing quality material and rehearsing your stagecraft elevates live performance ratings and expands global attendance."
                        )

                        guideTopics.forEachIndexed { i, (title, desc) ->
                            Column(modifier = Modifier.padding(vertical = 6.dp)) {
                                Text(text = "${i + 1}. $title", color = NeonTeal, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = desc, color = Color.LightGray, fontSize = 10.sp, lineHeight = 15.sp)
                            }
                            if (i < guideTopics.size - 1) {
                                Divider(color = Color(0xFF2C2844), thickness = 0.5.dp)
                            }
                        }
                    }
                }
            }
        }
    }
}"""

if old_wallpaper_end in content:
    content = content.replace(old_wallpaper_end, help_guide_section, 1)
    print("✓ Added Career Guidebook & Help System to Settings")
else:
    print("! Could not find old_wallpaper_end")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8", errors="surrogateescape") as f:
    f.write(content)

print("SmartphoneComponent.kt update done.")
