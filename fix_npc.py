import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_npc = """                val driftPop = Random.nextFloat() * 2f - 0.9f"""

new_npc = """                // Smart NPC Decisions: Based on their business intel and creativity
                var driftPop = Random.nextFloat() * 2f - 0.9f
                
                // Active moves: 
                // Highly creative artists might drop surprise music that boosts their fame but stresses them out
                if (npc.wealth > 100000.0 && !npc.isOnTour && Random.nextFloat() < 0.05f) {
                    if (npc.creativity > 70f && npc.stress < 50f) {
                        currentNPCStress += 20f
                        currentNPCWealth -= 50000.0
                        driftPop += 5.0f
                        reportBuilder.append("🚀 COMPETITION: ${npc.name} just dropped a surprise viral hit! Their popularity surged.\\n")
                    } else if (npc.businessIntel > 75f) {
                        // Smart business moves, brand deals
                        currentNPCWealth += 150000.0
                        driftPop += 2.0f
                        reportBuilder.append("💼 COMPETITION: ${npc.name} secured a massive brand deal and grew their influence.\\n")
                    }
                }
                
                // If they are broke, they might go on an emergency low-tier tour
                if (currentNPCWealth < 10000.0 && !npc.isOnTour && npc.popularity > 20f && Random.nextFloat() < 0.2f) {
                    finalIsOnTour = true
                    reportBuilder.append("🎤 COMPETITION: ${npc.name} went on an emergency club tour to avoid bankruptcy!\\n")
                }"""

content = content.replace(old_npc, new_npc)

# Crush app relationship decay
old_crush_decay = """            val rivalsList = finalNPCs.filter { !it.isRetired && it.relationshipWithPlayer < 25f }"""

new_crush_decay = """            // --- Crush App Partner Maintenance Decay ---
            val activePartner = state.capitalClubMembers.find { it.isDating || it.isSpouse }
            var crushAppDecayWarning = false
            if (activePartner != null) {
                // Decay relationship naturally if they aren't getting attention
                val partnerNeeds = if (activePartner.tag == "FAME" || activePartner.tag == "WEALTH") 2 else 1
                val newPartnerRel = (activePartner.relationshipScore - partnerNeeds).coerceAtLeast(0)
                if (newPartnerRel < 30 && activePartner.relationshipScore >= 30) {
                    crushAppDecayWarning = true
                    reportBuilder.append("💔 RELATIONSHIP ALERT: ${activePartner.name} feels ignored! Check your messages on Crush before they leave you!\\n")
                }
                // They can break up automatically
                if (newPartnerRel <= 5) {
                    reportBuilder.append("💔 BREAKUP: ${activePartner.name} dumped you because of neglect!\\n")
                }
            }
            
            // Also update the state for Crush members based on decay
            val updatedCrushMembers = state.capitalClubMembers.map { member ->
                if ((member.isDating || member.isSpouse) && state.currentWeek % 2 == 0) {
                    val partnerNeeds = if (member.tag == "FAME" || member.tag == "WEALTH") 3 else 1
                    val decayedScore = (member.relationshipScore - partnerNeeds).coerceAtLeast(0)
                    if (decayedScore <= 5) {
                        member.copy(relationshipScore = 0, isDating = false, isSpouse = false, isLockedOut = true)
                    } else {
                        member.copy(relationshipScore = decayedScore)
                    }
                } else member
            }

            val rivalsList = finalNPCs.filter { !it.isRetired && it.relationshipWithPlayer < 25f }"""

content = content.replace(old_crush_decay, new_crush_decay)

old_state_save = """                capitalClubMembers = state.capitalClubMembers,"""
new_state_save = """                capitalClubMembers = updatedCrushMembers,"""

if old_state_save in content:
    content = content.replace(old_state_save, new_state_save)
else:
    print("Could not update state save for capitalClubMembers")

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)

print("NPCs and Crush decay updated!")
