with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

# Replace any newlines inside body = "..." with \n
import re
def replacer(match):
    return match.group(0).replace('\n', '\\n')

text = re.sub(r'body\s*=\s*"[^"]*"', replacer, text, flags=re.DOTALL)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)
