import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

text = text.replace(
    'AppConfig("capital_club", "Capital Club", Icons.Default.Favorite, Color(0xFFFFD700), 0)',
    'AppConfig("capital_club", "Crush", Icons.Default.Favorite, Color(0xFFE91E63), 0)'
)
text = text.replace(
    '"capital_club" -> "Capital Club"',
    '"capital_club" -> "Crush Dating"'
)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)
