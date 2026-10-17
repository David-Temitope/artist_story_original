import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_interact_end = """            val newMembers = state.capitalClubMembers.map {
                if (it.id == memberId) {
                    it.copy(
                        relationshipScore = (it.relationshipScore + relationshipChange).coerceIn(0, 100),
                        isSpouse = if (action == "propose" && relationshipChange > 0) true else it.isSpouse
                    )
                } else it
            }"""

new_interact_end = """            var brokeUp = false
            val newMembers = state.capitalClubMembers.map {
                if (it.id == memberId) {
                    val newScore = (it.relationshipScore + relationshipChange).coerceIn(0, 100)
                    if (newScore < 15 && it.isDating && !it.isSpouse) {
                        brokeUp = true
                        responseMsg = "This isn't working out anymore. I think we should see other people. It's over."
                        it.copy(relationshipScore = 0, isDating = false, isSpouse = false, isLockedOut = true)
                    } else if (newScore < 10 && it.isSpouse) {
                        brokeUp = true
                        responseMsg = "I can't do this anymore. I'm contacting my lawyers for a divorce."
                        it.copy(relationshipScore = 0, isDating = false, isSpouse = false, isLockedOut = true)
                    } else {
                        it.copy(
                            relationshipScore = newScore,
                            isSpouse = if (action == "propose" && relationshipChange > 0) true else it.isSpouse
                        )
                    }
                } else it
            }"""

content = content.replace(old_interact_end, new_interact_end)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)

print("Crush app interact updated!")
