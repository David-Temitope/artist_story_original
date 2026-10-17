import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

target = """                "Account" -> {
                    val totalPlays = playerUploadedSongs.sumOf { it.isUploadedMap["jams"] ?: 0L }
                    val estPayout = totalPlays * 0.006
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                        Text("Creator Dashboard", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(16.dp))
                        Surface(shape = RoundedCornerShape(10.dp), color = jamsCardBg, modifier = Modifier.fillMaxWidth()) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text("Total Plays on JAMS: ${String.format("%,d", totalPlays)}", color = Color.White, fontSize = 14.sp)
                                Spacer(modifier = Modifier.height(6.dp))
                                Text("Estimated Earnings: $${String.format("%,.2f", estPayout)}", color = jamsColor, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Text("Payout rate: $0.006 / play", color = Color.Gray, fontSize = 11.sp)
                            }
                        }
                    }
                }"""

replacement = """                "Account" -> {
                    val totalPlays = playerUploadedSongs.sumOf { it.isUploadedMap["jams"] ?: 0L }
                    val isPremium = state.upgradedPlatforms.contains("jams")
                    val rate = if (isPremium) 1.87 else 0.3
                    val estPayout = totalPlays * rate
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                        Text("Creator Dashboard", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(16.dp))
                        Surface(shape = RoundedCornerShape(10.dp), color = jamsCardBg, modifier = Modifier.fillMaxWidth()) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text("Total Plays on JAMS: ${String.format("%,d", totalPlays)}", color = Color.White, fontSize = 14.sp)
                                Spacer(modifier = Modifier.height(6.dp))
                                Text("Estimated Earnings: $${String.format("%,.2f", estPayout)}", color = jamsColor, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Text("Payout rate: $$rate / play", color = Color.Gray, fontSize = 11.sp)
                            }
                        }
                    }
                }"""

text = text.replace(target, replacement)

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)

