import re

with open('app/src/main/java/com/example/data/Models.kt', 'r') as f:
    text = f.read()

text = text.replace('val investedCapital: Double = 0.0,', 'val investedCapital: Double = 0.0,\n    val totalWithdrawn: Double = 0.0,')

with open('app/src/main/java/com/example/data/Models.kt', 'w') as f:
    f.write(text)

