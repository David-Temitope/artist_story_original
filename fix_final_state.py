import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_final_state = """            var finalState = stateWithEcosystem.copy(
                currentWeek = nextWeek,"""

new_final_state = """            var finalState = stateWithEcosystem.copy(
                capitalClubMembers = updatedCrushMembers,
                currentWeek = nextWeek,"""

content = content.replace(old_final_state, new_final_state)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)

print("Final state CapitalClubMembers updated!")
