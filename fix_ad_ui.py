import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    content = f.read()

# Replace the "Advertisers" tab and add "Campaigns"
pattern = r"        when \(selectedTab\) \{\n            \"Advertisers\" -> \{\n                LazyColumn\(.*?(?=\n            \"Analytics\" -> \{)"

replacement = """        if (showSongSelectorForAgency != null) {
            AlertDialog(
                onDismissRequest = { showSongSelectorForAgency = null },
                containerColor = Color(0xFF131E15),
                title = { Text("Select Target Song", color = Color.White) },
                text = {
                    LazyColumn(modifier = Modifier.heightIn(max = 300.dp)) {
                        items(state.releasedSongs) { song ->
                            TextButton(
                                onClick = {
                                    viewModel.launchAdCampaign(showSongSelectorForAgency!!, song.id)
                                    showSongSelectorForAgency = null
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(song.title, color = Color(0xFF81C784))
                            }
                        }
                        if (state.releasedSongs.isEmpty()) {
                            item { Text("No released songs available.", color = Color.Gray) }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { showSongSelectorForAgency = null }) {
                        Text("Cancel", color = Color.Red)
                    }
                }
            )
        }

        when (selectedTab) {
            "Campaigns" -> {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.weight(1f).fillMaxWidth()
                ) {
                    items(state.activeAdCampaigns) { camp ->
                        val targetSong = state.releasedSongs.find { it.id == camp.targetId }
                        val targetName = targetSong?.title ?: "Unknown"
                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF131814)),
                            border = BorderStroke(1.dp, Color(0xFF81C784)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                                    Text(camp.agencyName, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                                    Text("$$${String.format("%,.0f", camp.weeklyBudget)}/wk", color = Color(0xFF81C784), fontSize = 10.sp)
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Text("Target: $targetName", color = Color.LightGray, fontSize = 10.sp)
                                Text("Remaining: ${camp.weeksRemaining} weeks", color = Color.Gray, fontSize = 9.sp)
                                Spacer(modifier = Modifier.height(8.dp))
                                Button(
                                    onClick = { viewModel.haltAdCampaign(camp.id) },
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red.copy(alpha=0.3f), contentColor = Color.White),
                                    shape = RoundedCornerShape(8.dp),
                                    modifier = Modifier.fillMaxWidth().height(30.dp)
                                ) {
                                    Text("HALT CAMPAIGN", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                    if (state.activeAdCampaigns.isEmpty()) {
                        item {
                            Text("No active campaigns. Go to 'Advertisers' to launch one.", color = Color.Gray, fontSize = 11.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(20.dp))
                        }
                    }
                }
            }
            "Advertisers" -> {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.weight(1f).fillMaxWidth()
                ) {
                    val advertisers = listOf(
                        AdvertiserConfig(
                            id = "beatwave",
                            title = "BeatWave Media (Social/Digital Ads)",
                            cost = 8000.0,
                            desc = "Hyper-targeted visual loops on SeeChat & Cast. Boosts weekly followers (+3K to +6K) & increases Trending score (+1.8).",
                            tag = "SOCIAL FOCUS"
                        ),
                        AdvertiserConfig(
                            id = "starvision",
                            title = "StarVision TV Network (Television Ads)",
                            cost = 22000.0,
                            desc = "Nationwide promotional broadcast spins. Delivers explosive mainstream fan volume (+11K to +24K) and boosts Public Image (+3.5).",
                            tag = "MAINSTREAM REACH"
                        ),
                        AdvertiserConfig(
                            id = "urban",
                            title = "UrbanBillboards (Transit Hub Outdoor)",
                            cost = 6500.0,
                            desc = "High-definition static placements in dense city centers. Expands brand familiarity, boosting respect (+1.2) & Public Image (+1.8).",
                            tag = "VISUAL PLACEMENT"
                        ),
                        AdvertiserConfig(
                            id = "soundspot",
                            title = "SoundSpot Radio (Podcast & Spins)",
                            cost = 4200.0,
                            desc = "Daily rotational loops on top channels. Enhances vocal training exposure (+1.0), Trending (+2.2) and hardcore fans.",
                            tag = "VOCAL ROTATIONS"
                        )
                    )
                    items(advertisers) { adv ->
                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF131814)),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.06f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(3.dp))
                                            .background(Color(0xFF222222))
                                            .padding(horizontal = 6.dp, vertical = 2.dp)
                                    ) {
                                        Text(
                                            text = adv.tag,
                                            color = Color.LightGray,
                                            fontSize = 7.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    Text(
                                        text = "$$${String.format("%,.0f", adv.cost)}/wk",
                                        color = Color(0xFF81C784),
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(adv.title, color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(3.dp))
                                Text(adv.desc, color = Color.LightGray, fontSize = 9.sp, lineHeight = 12.sp)
                                Spacer(modifier = Modifier.height(8.dp))
                                Button(
                                    onClick = { showSongSelectorForAgency = adv.id },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF81C784),
                                        contentColor = Color.Black
                                    ),
                                    shape = RoundedCornerShape(8.dp),
                                    modifier = Modifier.fillMaxWidth().height(30.dp)
                                ) {
                                    Text("LAUNCH CAMPAIGN", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }"""

if re.search(pattern, content, re.DOTALL):
    # Need to add `var showSongSelectorForAgency...` at the top of the function
    var_pattern = r"    var selectedTab by remember \{ mutableStateOf\(\"Campaigns\"\) \}\n    val tabs = listOf\(\"Campaigns\", \"Advertisers\", \"Analytics\"\)"
    var_replacement = var_pattern + "\n    var showSongSelectorForAgency by remember { mutableStateOf<String?>(null) }"
    
    content = re.sub(var_pattern, var_replacement, content)
    content = re.sub(pattern, replacement, content, flags=re.DOTALL)
    
    with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
        f.write(content)
    print("SmartphoneComponent updated for ads!")
else:
    print("Pattern not found in SmartphoneComponent.")

