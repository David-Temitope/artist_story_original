import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('"weshare" -> "WESHARE Brokerage"', '"ventures" -> "Business Ventures"')
text = text.replace('"genesis" -> "Genesis Exchange"\n', '')

text = text.replace('"weshare" -> com.example.ui.weshare.WeShareExchangeScreen(state, viewModel)', '"ventures" -> com.example.ui.ventures.VenturesAppScreen(state, viewModel)')
text = text.replace('"genesis" -> com.example.ui.genesis.GenesisExchangeScreen(state, viewModel)\n', '')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

