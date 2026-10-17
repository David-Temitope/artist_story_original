import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# We need to find places where a literal newline occurs inside a "..." string.
# A simple heuristic: if a line ends with a " but started one, or has an unclosed ", it's broken.
# Actually, since I know the exact pattern:
text = text.replace('Text("BUY NOW\n', 'Text("BUY NOW\\n')
text = text.replace('Text("SWAP NOW\n', 'Text("SWAP NOW\\n')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

