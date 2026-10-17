import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

business_logic = """
            val updatedStocks = state.stocks
            val updatedCryptos = state.cryptos
            val remainingStockOrders = state.pendingStockOrders
            val remainingCryptoOrders = state.pendingCryptoOrders
            // 7. Update Business Ventures
"""

text = text.replace("// 7. Update Business Ventures (Replacing Stock & Crypto Markets)", business_logic)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

