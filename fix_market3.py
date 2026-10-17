import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

replacement = """            val isBullMarket = economyCycle == "BULL"
            var finalStocks = state.stocks.map { stock -> 
                val volatility = (1..5).random() / 100.0
                val trend = if (isBullMarket) 0.02 else -0.01
                val newPrice = stock.currentPrice * (1.0 + trend + (Math.random() * volatility * 2 - volatility))
                stock.copy(
                    currentPrice = newPrice.coerceAtLeast(1.0)
                )
            }
            var finalCryptos = state.cryptos.map { crypto -> 
                val volatility = (2..8).random() / 100.0
                val trend = if (isBullMarket) 0.04 else -0.03
                val newPrice = crypto.currentPrice * (1.0 + trend + (Math.random() * volatility * 2 - volatility))
                crypto.copy(
                    currentPrice = newPrice.coerceAtLeast(0.01)
                )
            }"""

# Use regex to replace everything from "val isBullMarket" to the end of the second "var finalCryptos = ... }"
text = re.sub(r'val isBullMarket = economyCycle == "BULL".*?priceHistory = \(crypto\.priceHistory \+ newPrice\)\.takeLast\(10\)\n                \)\n            \}', replacement, text, flags=re.DOTALL)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

