import re

with open('app/src/main/java/com/example/ui/social/CastSocialScreen.kt', 'r') as f:
    text = f.read()

# Make Cast layout more spacious
text = text.replace('modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp)', 'modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp)')
text = text.replace('modifier = Modifier\n                .fillMaxWidth()\n                .padding(16.dp)', 'modifier = Modifier\n                .fillMaxWidth()\n                .padding(20.dp)')
text = text.replace('verticalArrangement = Arrangement.spacedBy(1.dp)', 'verticalArrangement = Arrangement.spacedBy(8.dp)')
text = text.replace('verticalArrangement = Arrangement.spacedBy(4.dp)', 'verticalArrangement = Arrangement.spacedBy(12.dp)')
text = text.replace('verticalArrangement = Arrangement.spacedBy(6.dp)', 'verticalArrangement = Arrangement.spacedBy(12.dp)')

with open('app/src/main/java/com/example/ui/social/CastSocialScreen.kt', 'w') as f:
    f.write(text)


with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# Make MeTube layout more spacious
text = text.replace('height(220.dp)', 'height(260.dp)')
text = text.replace('padding(horizontal = 14.dp, vertical = 12.dp)', 'padding(horizontal = 16.dp, vertical = 16.dp)')
text = text.replace('verticalArrangement = Arrangement.spacedBy(8.dp)', 'verticalArrangement = Arrangement.spacedBy(16.dp)')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

