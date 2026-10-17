import re

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'r') as f:
    text = f.read()

replacement = """                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(color = Color(0xFF00E5FF).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                            Text("BREAKING", color = Color(0xFF00E5FF), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                        }
                        Text("LATEST: BY ${heroArticle.author.uppercase()}", color = Color.Gray, fontSize = 10.sp)
                    }

                    coil.compose.AsyncImage(
                        model = heroArticle.coverImageId,
                        contentDescription = "Cover Image",
                        contentScale = androidx.compose.ui.layout.ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth().height(180.dp).clip(RoundedCornerShape(8.dp))
                    )

                    Text("""

text = text.replace("""                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(color = Color(0xFF00E5FF).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                            Text("BREAKING", color = Color(0xFF00E5FF), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                        }
                        Text("LATEST: BY ${heroArticle.author.uppercase()}", color = Color.Gray, fontSize = 10.sp)
                    }

                    Text(""", replacement)

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'w') as f:
    f.write(text)

