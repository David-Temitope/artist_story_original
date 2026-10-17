import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

text = text.replace('stocks = finalStocks,', 'stocks = finalStocks,\n                        businessVentures = updatedVentures,')

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

