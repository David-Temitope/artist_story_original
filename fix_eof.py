with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    lines = f.readlines()

# find buyPhone
start_idx = -1
for i, line in enumerate(lines):
    if "fun buyPhone(" in line:
        start_idx = i
        break

if start_idx != -1:
    lines = lines[:start_idx-3] + lines[start_idx:] + ["}\n"]

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write("".join(lines))
