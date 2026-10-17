import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8", errors="surrogateescape") as f:
    content = f.read()

old_feed_block = """        // Timeline Feed
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            if (state.castPosts.isEmpty()) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 60.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Welcome to CAST!", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                        Text("Timeline is quiet. Post something to start trending!", color = Color(0xFF71767B), fontSize = 12.sp, modifier = Modifier.padding(top = 4.dp))
                    }
                }
            } else {
                items(state.castPosts) { post ->"""

new_feed_block = """        if (selectedTab == "Following") {
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

            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
                if (displayedPosts.isEmpty()) {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 60.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text("Welcome to CAST!", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                            Text(if (selectedTab == "Following") "No posts from followed artists yet. Follow artists in Directory!" else "Timeline is quiet. Post something to start trending!", color = Color(0xFF71767B), fontSize = 12.sp, modifier = Modifier.padding(top = 4.dp))
                        }
                    }
                } else {
                    items(displayedPosts) { post ->"""

if old_feed_block in content:
    content = content.replace(old_feed_block, new_feed_block, 1)
    # add the extra closing brace for the else block
    old_end = """                                Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = Color(0xFF71767B), modifier = Modifier.size(15.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}"""
    new_end = """                                Icon(imageVector = Icons.Default.Share, contentDescription = "Share", tint = Color(0xFF71767B), modifier = Modifier.size(15.dp))
                            }
                        }
                    }
                }
            }
        }
        }
    }
}"""
    if old_end in content:
        content = content.replace(old_end, new_end, 1)
        print("✓ Successfully replaced Cast feed & closed blocks")
    else:
        print("! Could not find old_end")
else:
    print("! Could not find old_feed_block")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8", errors="surrogateescape") as f:
    f.write(content)

print("apply_cast_feed.py completed.")
