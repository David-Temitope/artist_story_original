import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

# Let's check if the replacement worked by checking for vanceChance
if 'vanceChance' in text:
    print('Replacement succeeded')
else:
    print('Replacement failed')

