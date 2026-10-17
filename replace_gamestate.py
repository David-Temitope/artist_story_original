import re

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'r') as f:
    text = f.read()

text = re.sub(r'val stocks: List<Stock> = emptyList\(\),', r'val businessVentures: List<BusinessVenture> = emptyList(),\n    val stocks: List<Stock> = emptyList(),', text)

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'w') as f:
    f.write(text)

