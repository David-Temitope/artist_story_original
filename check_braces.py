import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r', encoding='utf-8') as f:
    text = f.read()

depth = 0
in_block_comment = False
lines = text.split('\n')

for i, line in enumerate(lines):
    # simple scan character by character
    j = 0
    in_string = False
    escape = False
    while j < len(line):
        ch = line[j]
        if in_string:
            if escape:
                escape = False
            elif ch == '\\\\':
                escape = True
            elif ch == '"':
                in_string = False
        else:
            if ch == '"':
                in_string = True
            elif ch == '/' and j + 1 < len(line) and line[j+1] == '/':
                break # rest of line is comment
            elif ch == '{':
                depth += 1
            elif ch == '}':
                depth -= 1
                if depth == 0:
                    print(f"Brace depth hit 0 at line {i+1}: {line}")
        j += 1

print(f"Final depth: {depth} at line {len(lines)}")
