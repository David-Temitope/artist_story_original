import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

replacement = """                val validContactIds = (state.npcs.map { it.id } + state.capitalClubMembers.filter { it.isDating || it.isSpouse }.map { it.id }).distinct()
                val chatsToDisplay = validContactIds.map { npcId ->
                    state.chatConversations.find { it.npcId == npcId } ?: com.example.data.ChatConversation(
                        npcId = npcId,
                        npcName = state.npcs.find { it.id == npcId }?.name ?: state.capitalClubMembers.find { it.id == npcId }?.name ?: "Unknown",
                        messages = emptyList(),
                        unreadCount = 0
                    )
                }.sortedWith(
                    compareByDescending<com.example.data.ChatConversation> { conv ->
                        conv.messages.lastOrNull()?.timestamp ?: 0L
                    }.thenByDescending { conv ->
                        conv.unreadCount
                    }
                )
                if (chatsToDisplay.isEmpty()) {"""

text = re.sub(r'                val validContactIds = .*?\n                if \(sortedChats\.isEmpty\(\)\) \{', replacement, text, flags=re.DOTALL)
text = text.replace('items(sortedChats) { conv ->', 'items(chatsToDisplay) { conv ->')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

