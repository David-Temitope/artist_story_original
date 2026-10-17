import re

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'r') as f:
    content = f.read()

content = content.replace('it.tier == "STADIUM"', 'it.level == "Premium"')

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'w') as f:
    f.write(content)

