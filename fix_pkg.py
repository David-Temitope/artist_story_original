with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('import com.example.ui.*\npackage com.example\n\n', 'package com.example\nimport com.example.ui.*\n\n')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)
