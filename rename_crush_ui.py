import re

with open("app/src/main/java/com/example/ui/social/CapitalClubScreen.kt", "r") as f:
    text = f.read()

text = text.replace('"Capital Club"', '"Crush"')
text = text.replace('Capital Club', 'Crush')
text = text.replace('Color(0xFFFFD166)', 'Color(0xFFE91E63)')
text = text.replace('Color(0xFFB39659)', 'Color(0xFFAD1457)')

with open("app/src/main/java/com/example/ui/social/CapitalClubScreen.kt", "w") as f:
    f.write(text)
