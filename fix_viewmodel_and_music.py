import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

# 1. Fix GameState loading so old saves get the Capital Club Members populated if empty.
# Find `val gameState: StateFlow<GameStateEntity?> = _currentUserEmail`
game_state_flow_old = """    val gameState: StateFlow<GameStateEntity?> = _currentUserEmail
        .flatMapLatest { email ->
            if (email != null) dao.getGameState(email) else flowOf(null)
        }
        .catch { e ->
            android.util.Log.e("GameViewModel", "Error observing game state: ${e.message}", e)
            emit(null)
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)"""

game_state_flow_new = """    val gameState: StateFlow<GameStateEntity?> = _currentUserEmail
        .flatMapLatest { email ->
            if (email != null) {
                dao.getGameState(email).map { state ->
                    if (state != null && state.capitalClubMembers.isEmpty()) {
                        state.copy(
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
                    } else state
                }
            } else kotlinx.coroutines.flow.flowOf(null)
        }
        .catch { e ->
            android.util.Log.e("GameViewModel", "Error observing game state: ${e.message}", e)
            emit(null)
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)"""

text = text.replace(game_state_flow_old, game_state_flow_new)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)

