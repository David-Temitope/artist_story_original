import re

print("Applying Cast & Help enhancements to SmartphoneComponent.kt...")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8", errors="surrogateescape") as f:
    content = f.read()

# 1. Update isUnread in Email screen
old_unread_target = 'val isUnread = !mail.isAccepted && mail.type == "NORMAL"'
new_unread_target = 'val isUnread = !mail.isRead'
if old_unread_target in content:
    content = content.replace(old_unread_target, new_unread_target, 1)
    print("✓ Updated isUnread logic in Email screen")
else:
    print("! Could not find old_unread_target")

# 2. WallpaperSettingsScreen -> Add Help Section
old_settings_block = """// =================== 9. WALLPAPER SETTINGS SCREEN ===================
@Composable
fun WallpaperSettingsScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val options = listOf(
        Triple("Cosmic Nebula", "Cosmic Nebula", Brush.verticalGradient(listOf(Color(0xFF120C3F), Color(0xFF4A007A), Color(0xFF0B0720)))),
        Triple("Cyber Sunset", "Cyber Sunset", Brush.verticalGradient(listOf(Color(0xFFF07B50), Color(0xFF901C40), Color(0xFF1D0E25)))),
        Triple("Midnight Forest", "Midnight Forest", Brush.verticalGradient(listOf(Color(0xFF0A2E12), Color(0xFF031B08), Color(0xFF000C02)))),
        Triple("Golden Hour", "Golden Hour", Brush.verticalGradient(listOf(Color(0xFFF9D423), Color(0xFFFF4E50), Color(0xFF2C1014))))
    )

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Ecosystem Wallpaper Settings", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)

        options.forEach { (id, name, brush) ->
            val isCurrent = state.wallpaperId == id
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C29)),
                border = BorderStroke(2.dp, if (isCurrent) NeonTeal else Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.updateWallpaper(id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(brush)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }
    }
}"""

new_settings_block = """// =================== 9. WALLPAPER SETTINGS SCREEN & HELP GUIDE ===================
@Composable
fun WallpaperSettingsScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val options = listOf(
        Triple("Cosmic Nebula", "Cosmic Nebula", Brush.verticalGradient(listOf(Color(0xFF120C3F), Color(0xFF4A007A), Color(0xFF0B0720)))),
        Triple("Cyber Sunset", "Cyber Sunset", Brush.verticalGradient(listOf(Color(0xFFF07B50), Color(0xFF901C40), Color(0xFF1D0E25)))),
        Triple("Midnight Forest", "Midnight Forest", Brush.verticalGradient(listOf(Color(0xFF0A2E12), Color(0xFF031B08), Color(0xFF000C02)))),
        Triple("Golden Hour", "Golden Hour", Brush.verticalGradient(listOf(Color(0xFFF9D423), Color(0xFFFF4E50), Color(0xFF2C1014))))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Ecosystem Wallpaper Theme", color = Color.White, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)

        options.forEach { (id, name, brush) ->
            val isCurrent = state.wallpaperId == id
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C29)),
                border = BorderStroke(2.dp, if (isCurrent) NeonTeal else Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.updateWallpaper(id) }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(brush)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = name, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 13.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // CAREER GUIDEBOOK & HELP MANUAL
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
                    Text("Career Guide & Help Manual", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Understanding the dynamic systems operating in the music industry simulation will aid your strategic career development:",
                    color = TextSecondary,
                    fontSize = 11.sp,
                    lineHeight = 16.sp
                )
                Spacer(modifier = Modifier.height(12.dp))

                val guideTopics = listOf(
                    "Staff Hub & Professional Team" to "Each specialist brings distinct intelligence, reliability, and loyalty. Fair salaries and skill training retain valuable personnel. Unreasonable cuts increase burnout and resignation risks.",
                    "Copyrights & Intellectual Property" to "Registering copyrights safeguards your catalog against unauthorized sampling and infringement. Holding your master rights secures compounding catalog royalties.",
                    "Cast Social Media & Engagement" to "Maintaining a focused category niche, spending active time connecting, and posting consistently develops organic reach. Following other artists builds peer affinity.",
                    "Spirituality & Well-Being" to "Balancing your schedule through prayer, meditation, and adequate rest relieves career stress, boosts inspiration, and protects mental focus during heavy release cycles.",
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
}"""

if old_settings_block in content:
    content = content.replace(old_settings_block, new_settings_block, 1)
    print("✓ Added Career Guidebook to WallpaperSettingsScreen")
else:
    print("! Could not find old_settings_block")

# 3. In CastSocialScreen: Add Following feed vs Artist Directory
old_cast_feed_code = """        val isFeedEmpty = state.castPosts.isEmpty()
        if (isFeedEmpty) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.ChatBubbleOutline, contentDescription = null, tint = Color(0xFF71767B), modifier = Modifier.size(48.dp))
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Welcome to CAST!", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text("Timeline is quiet. Post something to start trending!", color = Color(0xFF71767B), fontSize = 12.sp, modifier = Modifier.padding(top = 4.dp))
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                items(state.castPosts) { post ->"""

new_cast_feed_code = """        if (selectedTab == "Following") {
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
            val displayedPosts = if (selectedTab == "For You") {
                state.castPosts
            } else {
                state.castPosts.filter { it.isByPlayer || state.npcs.any { n -> n.isFollowedByPlayer && n.name == it.authorName } }
            }

            val isFeedEmpty = displayedPosts.isEmpty()
            if (isFeedEmpty) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Default.ChatBubbleOutline, contentDescription = null, tint = Color(0xFF71767B), modifier = Modifier.size(48.dp))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Welcome to CAST!", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        Text(if (selectedTab == "Following") "You haven't followed any artists yet. Tap Artist Directory above!" else "Timeline is quiet. Post something to start trending!", color = Color(0xFF71767B), fontSize = 12.sp, modifier = Modifier.padding(top = 4.dp))
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    items(displayedPosts) { post ->"""

if old_cast_feed_code in content:
    content = content.replace(old_cast_feed_code, new_cast_feed_code, 1)
    # also add closing brace for the else block
    old_feed_end_target = """                                Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = Color(0xFF71767B), modifier = Modifier.size(15.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}"""
    new_feed_end_target = """                                Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = Color(0xFF71767B), modifier = Modifier.size(15.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}"""
    print("✓ Replaced Cast feed with Following feed and Artist Directory")
else:
    print("! Could not find old_cast_feed_code")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8", errors="surrogateescape") as f:
    f.write(content)

print("SmartphoneComponent.kt updated.")
