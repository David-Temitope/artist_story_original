import re

with open('app/src/main/java/com/example/MainActivity.kt', 'r') as f:
    text = f.read()

text = text.replace('viewModel.lockPhone()', 'if (state.activePhone == "hiPhone" || state.activePhone == "Samsong") {\n                viewModel.setPhoneLocked(true)\n            }')

with open('app/src/main/java/com/example/MainActivity.kt', 'w') as f:
    f.write(text)

