import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_logic = """            val current = if (currentFromDb.capitalClubMembers.isEmpty()) {
                currentFromDb.copy(
                    capitalClubMembers = getInitialCapitalClubMembers()
                )
            } else currentFromDb"""

new_logic = """            val current = if (currentFromDb.capitalClubMembers.isEmpty()) {
                currentFromDb.copy(
                    capitalClubMembers = getInitialCapitalClubMembers()
                )
            } else {
                val hasEmptyImage = currentFromDb.capitalClubMembers.any { it.imageUrl.isEmpty() }
                if (hasEmptyImage) {
                    val initialMembers = getInitialCapitalClubMembers()
                    val mergedMembers = currentFromDb.capitalClubMembers.map { member ->
                        if (member.imageUrl.isEmpty()) {
                            val initial = initialMembers.find { it.id == member.id }
                            if (initial != null) member.copy(imageUrl = initial.imageUrl) else member
                        } else {
                            member
                        }
                    }
                    val missingMembers = initialMembers.filter { init -> currentFromDb.capitalClubMembers.none { it.id == init.id } }
                    currentFromDb.copy(capitalClubMembers = mergedMembers + missingMembers)
                } else currentFromDb
            }"""

content = content.replace(old_logic, new_logic)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)
