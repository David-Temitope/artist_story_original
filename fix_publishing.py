import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_mech_rate = """                            val baseMechanicalRate = 0.0015
                            val mechanicalMult = when (state.activePublishingDeal) {
                                "CoPublishing" -> 1.5
                                "AdminOnly" -> 1.2
                                else -> 1.0
                            }
                            var finalMechRate = baseMechanicalRate * mechanicalMult"""

new_mech_rate = """                            // Realistic Publishing Mechanicals (~$0.0009 to $0.0012 per stream)
                            val baseMechanicalRate = 0.0009
                            val mechanicalMult = when (state.activePublishingDeal) {
                                "CoPublishing" -> 1.5
                                "AdminOnly" -> 1.2
                                else -> 1.0
                            }
                            var finalMechRate = baseMechanicalRate * mechanicalMult"""

if old_mech_rate in content:
    content = content.replace(old_mech_rate, new_mech_rate)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Mechanical rate updated!")
else:
    print("Old mechanical rate block not found!")
