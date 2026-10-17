import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# I will use regex to find and remove the Portfolio & Financial Quick Glance row

pattern = r'            // Widget 2: Portfolio & Financial Quick Glance\s*Row\(\s*modifier = Modifier\.fillMaxWidth\(\),\s*horizontalArrangement = Arrangement\.spacedBy\(10\.dp\)\s*\)\s*\{[\s\S]*?\}\s*\}\s*\}'

content = re.sub(pattern, '', content)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
