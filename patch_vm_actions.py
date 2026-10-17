import os

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r", encoding="utf-8") as f:
    code = f.read()

actions = """
    fun askOutCapitalClubMember(memberId: String) {
        updateState { state ->
            val member = state.capitalClubMembers.find { it.id == memberId } ?: return@updateState state
            
            // Cannot ask out if already locked out
            if (member.isLockedOut) {
                return@updateState state
            }
            
            // Cheating penalty: if player already has a dating partner/spouse, and they ask someone else out,
            // current partner's relationship score drops drastically.
            val currentPartners = state.capitalClubMembers.filter { it.isDating || it.isSpouse }
            var updatedMembers = state.capitalClubMembers
            if (currentPartners.isNotEmpty()) {
                updatedMembers = updatedMembers.map {
                    if (it.isDating || it.isSpouse) it.copy(relationshipScore = maxOf(0, it.relationshipScore - 60)) else it
                }
            }

            // Chance to be accepted
            val random = java.util.Random()
            val accepted = random.nextFloat() < 0.6f // 60% chance for now

            val responseMsg = if (accepted) {
                "Hey! I'd love to go out with you. Let's get to know each other better. :)"
            } else {
                "Hey, thanks for reaching out, but I don't think we're a match right now. Best of luck!"
            }

            val newMembers = updatedMembers.map {
                if (it.id == memberId) {
                    it.copy(
                        isDating = accepted,
                        isLockedOut = !accepted,
                        relationshipScore = if (accepted) 10 else 0
                    )
                } else {
                    it
                }
            }
            
            val newChatContact = ChatContact(
                id = member.id,
                name = member.name,
                isOnline = true,
                hasUnread = true,
                relationship = if (accepted) 10f else 0f,
                messages = listOf(
                    ChatMessage(
                        id = generateId(),
                        senderId = member.id,
                        text = responseMsg,
                        timestamp = System.currentTimeMillis(),
                        isRead = false,
                        isFromPlayer = false
                    )
                )
            )
            
            val updatedContacts = state.chatContacts.filter { it.id != member.id } + newChatContact

            state.copy(
                capitalClubMembers = newMembers,
                chatContacts = updatedContacts
            )
        }
    }

    fun interactWithCapitalClubPartner(memberId: String, action: String) {
        updateState { state ->
            val member = state.capitalClubMembers.find { it.id == memberId } ?: return@updateState state
            if (!member.isDating && !member.isSpouse) return@updateState state
            
            var relationshipChange = 0
            var moneyChange = 0.0
            
            val random = java.util.Random()
            var responseMsg = ""
            
            when (action) {
                "propose" -> {
                    if (member.relationshipScore >= 90) {
                        responseMsg = "Yes! A million times yes! <3"
                        relationshipChange = 10
                    } else {
                        responseMsg = "I'm sorry, I don't think we're ready for that step yet..."
                        relationshipChange = -20
                    }
                }
                "buy_gift" -> {
                    if (state.banking.savingsBalance >= 5000.0) {
                        moneyChange = -5000.0
                        relationshipChange = 15
                        responseMsg = "Oh my goodness, you shouldn't have! I love it so much!"
                    } else {
                        responseMsg = "It's the thought that counts..."
                    }
                }
                "ask_for_gift" -> {
                    // Only applicable if member is Male and player is female, but we'll let it happen
                    if (member.gender == "Male") {
                        if (member.relationshipScore > 50 && random.nextFloat() < 0.7f) {
                            relationshipChange = -5
                            moneyChange = 2000.0
                            responseMsg = "Of course babe, I just sent it to your account. Treat yourself!"
                        } else {
                            relationshipChange = -15
                            responseMsg = "Are you seriously asking me for money right now? Not cool."
                        }
                    } else {
                        responseMsg = "I'm not your sugar mama!"
                        relationshipChange = -10
                    }
                }
                "go_on_date" -> {
                    if (state.banking.savingsBalance >= 1000.0) {
                        moneyChange = -1000.0
                        relationshipChange = 5
                        responseMsg = "That was an amazing evening. Thank you."
                    } else {
                        responseMsg = "Maybe we can just stay in?"
                    }
                }
            }

            val newMembers = state.capitalClubMembers.map {
                if (it.id == memberId) {
                    it.copy(
                        relationshipScore = (it.relationshipScore + relationshipChange).coerceIn(0, 100),
                        isSpouse = if (action == "propose" && relationshipChange > 0) true else it.isSpouse
                    )
                } else it
            }
            
            val updatedContacts = state.chatContacts.map { contact ->
                if (contact.id == memberId && responseMsg.isNotEmpty()) {
                    contact.copy(
                        relationship = (contact.relationship + relationshipChange).coerceIn(0f, 100f),
                        hasUnread = true,
                        messages = contact.messages + ChatMessage(
                            id = generateId(),
                            senderId = memberId,
                            text = responseMsg,
                            timestamp = System.currentTimeMillis(),
                            isRead = false,
                            isFromPlayer = false
                        )
                    )
                } else contact
            }

            state.copy(
                capitalClubMembers = newMembers,
                chatContacts = updatedContacts,
                banking = state.banking.copy(savingsBalance = state.banking.savingsBalance + moneyChange)
            )
        }
    }
    
    fun togglePhoneLock() {
        updateState { it.copy(isPhoneLocked = !it.isPhoneLocked) }
    }
"""

last_brace_idx = code.rfind('}')
code = code[:last_brace_idx] + actions + "\n}\n"

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w", encoding="utf-8") as f:
    f.write(code)

print("Added Capital Club actions to GameViewModel.")
