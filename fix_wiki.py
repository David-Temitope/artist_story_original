import re

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'r') as f:
    content = f.read()

old_wiki = """        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Text("Search Results for: \"Top Artists 2024\"", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            items(5) {
                Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF23272A))) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text("Artist Name $it", color = Color(0xFF60A5FA), fontSize = 14.sp, fontWeight = FontWeight.Bold)
                        Text("Genres: Pop, Electronic • Label: Apex Records", color = Color.Gray, fontSize = 11.sp)
                        Text("Active Years: 2020-Present • Estimated Value: $${(it+1)*15}M", color = Color.Gray, fontSize = 11.sp)
                    }
                }
            }
        }"""

new_wiki = """        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Text("Search Results for: \"Top Global Artists\"", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            
            val activeNpcs = state.npcs.filter { !it.isRetired }.sortedByDescending { it.popularity }
            
            items(activeNpcs.take(10)) { npc ->
                Card(colors = CardDefaults.cardColors(containerColor = Color(0xFF23272A))) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                            Text(npc.name, color = Color(0xFF60A5FA), fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            Surface(color = Color.Black.copy(alpha=0.3f), shape = RoundedCornerShape(4.dp)) {
                                Text("Rank #${activeNpcs.indexOf(npc) + 1}", color = Color.White, fontSize = 9.sp, modifier = Modifier.padding(4.dp))
                            }
                        }
                        Text("Genre: ${npc.networks.firstOrNull() ?: "Pop"} • Status: ${if (npc.isOnTour) "On Tour" else "Active"}", color = Color.Gray, fontSize = 11.sp)
                        Text("Est. Net Worth: $${String.format("%,.0f", npc.wealth)} • Monthly Listeners: ${String.format("%,.0f", npc.fans)}", color = Color.LightGray, fontSize = 11.sp)
                    }
                }
            }
        }"""

content = content.replace(old_wiki, new_wiki)

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'w') as f:
    f.write(content)

print("Wiki updated!")
