import re

with open('app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt', 'r') as f:
    content = f.read()

pattern = r'"Premium" -> \{\s*Column\(\s*modifier = Modifier\s*\.fillMaxSize\(\)\s*\.padding\(16\.dp\),\s*horizontalAlignment = Alignment\.CenterHorizontally\s*\)\s*\{[\s\S]*?You are currently a Premium Member\.",\s*color = Color\.Gray,\s*fontSize = 14\.sp,\s*fontWeight = FontWeight\.Bold,\s*modifier = Modifier\.align\(Alignment\.CenterHorizontally\)\s*\)\s*\}\s*\}\s*\}'

replacement = '"Premium" -> {\n                    PremiumUpgradeTab(state, viewModel, "songify", "Songify", songifyColor, songifyDarkBg, songifyCardBg, 150000.0)\n                }'

content = re.sub(pattern, replacement, content)

with open('app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt', 'w') as f:
    f.write(content)
