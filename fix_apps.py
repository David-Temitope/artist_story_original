import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = re.sub(r'AppConfig\("weshare".*?\),', r'AppConfig("ventures", "VENTURES", Icons.Default.BusinessCenter, Color(0xFF6200EA), 0),', text)
text = re.sub(r'AppConfig\("genesis".*?\),', r'', text)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

