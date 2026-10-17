with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# Replace literal \n with real newline
text = text.replace("\\n", "\n")
text = text.replace("import ", "\nimport ")
text = text.replace("package com.example\n\n\nimport ", "package com.example\n\nimport ")

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

