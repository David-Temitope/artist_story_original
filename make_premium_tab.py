with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

premium_composable = """
@Composable
fun PremiumUpgradeTab(
    state: GameStateEntity,
    viewModel: GameViewModel,
    platformId: String,
    platformName: String,
    themeColor: androidx.compose.ui.graphics.Color,
    bgColor: androidx.compose.ui.graphics.Color,
    cardBg: androidx.compose.ui.graphics.Color,
    upgradeCost: Double
) {
    val isPremium = state.upgradedPlatforms.contains(platformId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Icon(
            imageVector = Icons.Default.WorkspacePremium,
            contentDescription = null,
            tint = themeColor,
            modifier = Modifier.size(56.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "$platformName Premium",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Black
        )
        Text(
            text = if (isPremium) "Active Subscription • Artist Tier" else "Unlock Premium Artist Features",
            color = themeColor,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Surface(
            shape = RoundedCornerShape(12.dp),
            color = cardBg,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Features Included:", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                listOf(
                    "✓ Ad-free continuous music playback",
                    "✓ Offline listening downloads",
                    "✓ Ultra High Definition 320kbps Streaming",
                    "✓ Real-time Artist Analytics & Chart Tracking",
                    "✓ Instant playlist submission to Curators"
                ).forEach { perk ->
                    Text(text = perk, color = Color.LightGray, fontSize = 12.sp, modifier = Modifier.padding(vertical = 2.dp))
                }
                
                Spacer(modifier = Modifier.height(24.dp))
                if (isPremium) {
                    Text(
                        text = "You are currently a Premium Member.",
                        color = Color.Gray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                } else {
                    Button(
                        onClick = { viewModel.upgradePlatform(platformId, upgradeCost) },
                        colors = ButtonDefaults.buttonColors(containerColor = themeColor),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Upgrade for $${java.text.NumberFormat.getNumberInstance(java.util.Locale.US).format(upgradeCost)}",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
"""

if "fun PremiumUpgradeTab(" not in text:
    text += "\n" + premium_composable

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "w") as f:
    f.write(text)
