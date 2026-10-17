import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

target = """                val defaultState = GameStateEntity(
                castPosts = initialDefaultCastPosts,
                email = trimmedEmail,
                artistName = trimmedName,
                isAdmin = isAdmin,
                capitalClubMembers = listOf("""

# In GameViewModel, we need to make sure we populate capitalClubMembers if it's empty when loading.
# How does GameViewModel load state?
#     val gameState: StateFlow<GameStateEntity?> = _currentUserEmail
#        .flatMapLatest { email ->
#            if (email != null) dao.getGameState(email).map { it?.let { state ->
#                if (state.capitalClubMembers.isEmpty()) {
#                     val newState = state.copy(capitalClubMembers = getDefaultCapitalClubMembers())
#                     dao.insertGameState(newState)
#                     newState
#                } else state
#            } } else flowOf(null)
#        }
