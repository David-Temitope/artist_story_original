with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    lines = f.readlines()

first_line = lines[0]
first_line = first_line.replace("package com.example\\n\\n", "package com.example\\n")
first_line = first_line.replace("import ", "\\nimport ")

lines[0] = first_line

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.writelines(lines)

print("Fixed again")
