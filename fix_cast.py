import re

with open('app/src/main/java/com/example/ui/social/CastSocialScreen.kt', 'r') as f:
    text = f.read()

text = text.replace('shape = RoundedCornerShape(0.dp),', 'shape = RoundedCornerShape(12.dp),')
text = text.replace('modifier = Modifier.fillMaxWidth()', 'modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp)')

text = text.replace('modifier = Modifier\n                .fillMaxWidth()\n                .padding(12.dp)', 'modifier = Modifier\n                .fillMaxWidth()\n                .padding(16.dp)')

text = text.replace("""                text = post.content,
                color = Color.White,
                fontSize = 13.sp,
                lineHeight = 18.sp""", """                text = post.content,
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 22.sp""")

# Add spacing between posts
with open('app/src/main/java/com/example/ui/social/CastSocialScreen.kt', 'w') as f:
    f.write(text)

