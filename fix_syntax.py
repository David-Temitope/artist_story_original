import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('AppConfig("ventures", "VENTURES", Icons.Default.BusinessCenter, Color(0xFF6200EA), 0), state.pendingStockOrders.size),', 'AppConfig("ventures", "VENTURES", Icons.Default.BusinessCenter, Color(0xFF6200EA), 0),')
text = text.replace('                 state.pendingCryptoOrders.size),\n', '')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

