with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    code = f.read()

code = code.replace("spiritualJournal = newJournal", "spiritual = state.spiritual.copy(spiritualJournal = newJournal)")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(code)
