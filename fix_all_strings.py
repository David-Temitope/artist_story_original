with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

import re

# We want to match "..." but not """..."""
# A simple way is to find all " followed by anything except " or \n, but since there ARE \n in our broken strings, we want to match " then any char except " (including \n) until the next ".
# BUT wait, what if the string has an escaped quote `\"`? 
# A more robust way: iterate char by char.

new_text = []
in_string = False
in_triple = False
i = 0
while i < len(text):
    if text[i:i+3] == '"""':
        in_triple = not in_triple
        new_text.append('"""')
        i += 3
        continue
    
    if text[i] == '"' and not in_triple:
        # Check if it's escaped
        if i > 0 and text[i-1] == '\\':
            pass
        else:
            in_string = not in_string
            new_text.append('"')
            i += 1
            continue
            
    if in_string and not in_triple and text[i] == '\n':
        new_text.append('\\n')
    else:
        new_text.append(text[i])
    i += 1

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(''.join(new_text))
