import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

produce_function_old = """    fun produceForNPC(npcId: String) {
        updateState { state ->
            val npc = state.npcs.find { it.id == npcId }
            if (npc == null) return@updateState state

            if (state.energy < 35) {
                showToast("Not enough energy (35 required) to write/produce for others!")
                state
            } else {
                // Interconnected logic: payout scales with NPC wealth and your business skill!
                // Greedy NPCs with high businessIntel try to pay less, but wealthy NPCs can afford more.
                val greedFactor = if (npc.personality == "Hustler" || npc.personality == "Diva") 0.85 else 1.05
                val scaleMultiplier = 1.0 + (state.businessSkill / 100f) + (npc.wealth / 250000.0).coerceAtMost(1.0)
                val payout = 3500.0 * scaleMultiplier * greedFactor
                
                showToast("Produced a track for ${npc.name}! Earned $${String.format("%,.0f", payout)}.")
                
                // Update NPC relationship and state
                val updatedNPCs = state.npcs.map { n ->
                    if (n.id == npcId) {
                        n.copy(
                            relationshipWithPlayer = (n.relationshipWithPlayer + 15f).coerceAtMost(100f),
                            popularity = (n.popularity + 2f).coerceAtMost(100f),
                            creativeRespect = (n.creativeRespect + 15f).coerceAtMost(100f),
                            professionalRespect = (n.professionalRespect + 10f).coerceAtMost(100f),
                            businessTrust = (n.businessTrust + 8f).coerceAtMost(100f),
                            reliability = (n.reliability + 8f).coerceAtMost(100f)
                        )
                    } else n
                }

                state.copy(
                energy = state.energy - 35,
                cash = state.cash + payout,
                industryRespect = (state.industryRespect + 3f).coerceAtMost(100f),
                npcs = updatedNPCs,
                timelineEvents = state.timelineEvents + "Year ${state.currentYear}, Week ${state.currentWeek}: Worked as a producer for ${npc.name}, solidifying industry bonds."
            )
            }
        }
    }"""

produce_function_new = """    fun produceForNPC(npcId: String) {
        updateState { state ->
            val npc = state.npcs.find { it.id == npcId }
            if (npc == null) return@updateState state

            if (state.energy < 35) {
                showToast("Not enough energy (35 required) to write/produce for others!")
                return@updateState state
            }
            
            // Check 1: Good terms (relationship)
            if (npc.relationshipWithPlayer < 40f) {
                showToast("${npc.name} declined. Your relationship is too poor to work together.")
                return@updateState state
            }
            
            // Check 2: Skill matching artist status (Player needs sufficient writingSkill/popularity vs NPC's popularity)
            val playerSkillScore = state.writingSkill + (state.popularity * 0.5f) + (state.industryRespect * 0.5f)
            val npcStatusScore = npc.popularity + (npc.influence * 0.5f)
            
            // Allow some leniency, but high status artists will reject low skill players
            if (playerSkillScore < npcStatusScore * 0.7f) {
                showToast("${npc.name} declined. Your production skills and industry status aren't high enough for them yet.")
                return@updateState state
            }
            
            // Check 3: Not recently produced a track
            val recentCollab = npc.memories.find { it.memoryType == "PRODUCED_TRACK" && 
                (state.currentYear == it.yearRecorded && (state.currentWeek - it.weekRecorded) < 24 || 
                 state.currentYear > it.yearRecorded && (52 - it.weekRecorded + state.currentWeek) < 24)
            }
            
            if (recentCollab != null) {
                showToast("${npc.name} declined. You just recently produced a track together. They want to spread out their releases.")
                return@updateState state
            }

            // Interconnected logic: payout scales with NPC wealth and your business skill!
            // Greedy NPCs with high businessIntel try to pay less, but wealthy NPCs can afford more.
            val greedFactor = if (npc.personality == "Hustler" || npc.personality == "Diva") 0.85 else 1.05
            val scaleMultiplier = 1.0 + (state.businessSkill / 100f) + (npc.wealth / 250000.0).coerceAtMost(1.0)
            val payout = 3500.0 * scaleMultiplier * greedFactor
            
            showToast("Produced a track for ${npc.name}! Earned $${String.format("%,.0f", payout)}.")
            
            // Create a memory of this collaboration
            val collabMemory = NPCMemory(
                id = java.util.UUID.randomUUID().toString(),
                description = "Produced a track together with ${state.artistName}",
                emotionalImpact = 15f,
                memoryType = "PRODUCED_TRACK",
                weekRecorded = state.currentWeek,
                yearRecorded = state.currentYear,
                isCoreMemory = false
            )
            
            // Update NPC relationship and state
            val updatedNPCs = state.npcs.map { n ->
                if (n.id == npcId) {
                    n.copy(
                        relationshipWithPlayer = (n.relationshipWithPlayer + 15f).coerceAtMost(100f),
                        popularity = (n.popularity + 2f).coerceAtMost(100f),
                        creativeRespect = (n.creativeRespect + 15f).coerceAtMost(100f),
                        professionalRespect = (n.professionalRespect + 10f).coerceAtMost(100f),
                        businessTrust = (n.businessTrust + 8f).coerceAtMost(100f),
                        reliability = (n.reliability + 8f).coerceAtMost(100f),
                        memories = n.memories + collabMemory
                    )
                } else n
            }

            state.copy(
                energy = state.energy - 35,
                cash = state.cash + payout,
                industryRespect = (state.industryRespect + 3f).coerceAtMost(100f),
                npcs = updatedNPCs,
                timelineEvents = state.timelineEvents + "Year ${state.currentYear}, Week ${state.currentWeek}: Worked as a producer for ${npc.name}, solidifying industry bonds."
            )
        }
    }"""

if produce_function_old in content:
    content = content.replace(produce_function_old, produce_function_new)
    print("Function replaced successfully!")
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
else:
    print("Function not found, looking for partial match...")
