import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('"politics" -> PoliticsAppScreen(state, viewModel)', '"politics" -> com.example.ui.PoliticsAppScreen(state, viewModel)')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

