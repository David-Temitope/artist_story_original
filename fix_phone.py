import re

with open('app/src/main/java/com/example/MainActivity.kt', 'r') as f:
    text = f.read()

text = text.replace('onDismiss = { isPhoneOpen = false }', 'onDismiss = { \n            isPhoneOpen = false\n            viewModel.lockPhone()\n        }')

with open('app/src/main/java/com/example/MainActivity.kt', 'w') as f:
    f.write(text)

