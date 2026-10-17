import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

target = """    fun updateState(block: (GameStateEntity) -> GameStateEntity) {
        val email = _currentUserEmail.value ?: return
        viewModelScope.launch {
            val current = dao.getGameStateDirect(email) ?: return@launch
            val updated = block(current)
            dao.insertGameState(updated)
        }
    }"""

replacement = """    fun updateState(block: (GameStateEntity) -> GameStateEntity) {
        val email = _currentUserEmail.value ?: return
        viewModelScope.launch {
            val currentFromDb = dao.getGameStateDirect(email) ?: return@launch
            val current = if (currentFromDb.capitalClubMembers.isEmpty()) {
                currentFromDb.copy(
                    capitalClubMembers = listOf(
                        com.example.data.CapitalClubMember(
                            id = "cc_1", name = "Victoria Sterling", age = 26, gender = "Female", title = "Venture Capitalist",
                            matchPct = "98%", tag = "WEALTH", imageUrl = "", quote = "I invest in futures, not pasts.",
                            tags = listOf("Ambitious", "Networking", "Finance"), synergyText = "+15% Business Revenue"
                        ),
                        com.example.data.CapitalClubMember(
                            id = "cc_2", name = "Julian Vance", age = 29, gender = "Male", title = "Tech Entrepreneur",
                            matchPct = "94%", tag = "INNOVATION", imageUrl = "", quote = "Disruption is my love language.",
                            tags = listOf("Visionary", "Workaholic", "Crypto"), synergyText = "+10% App Monetization"
                        ),
                        com.example.data.CapitalClubMember(
                            id = "cc_3", name = "Sienna Rossi", age = 24, gender = "Female", title = "Supermodel",
                            matchPct = "89%", tag = "FAME", imageUrl = "", quote = "The runway is just a stepping stone.",
                            tags = listOf("Fashion", "High Profile", "Glamour"), synergyText = "+25% Public Image"
                        ),
                        com.example.data.CapitalClubMember(
                            id = "cc_4", name = "Marcus Thorne", age = 31, gender = "Male", title = "Film Director",
                            matchPct = "87%", tag = "ART", imageUrl = "", quote = "I see the world in cinematic cuts.",
                            tags = listOf("Creative", "Moody", "Hollywood"), synergyText = "+20% Music Video Quality"
                        )
                    )
                )
            } else currentFromDb
            val updated = block(current)
            dao.insertGameState(updated)
        }
    }"""

text = text.replace(target, replacement)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)

