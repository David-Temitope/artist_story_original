import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

replacement = """    fun progressToNextWeek() {
        val currentState = gameState.value ?: return
        if (currentState.isElectionSeason && (currentState.currentWeek == 14 || currentState.currentWeek == 38) && currentState.endorsedCandidateId.isNullOrEmpty()) {
            showToast("It is voting week! You must open the Politics app and vote for a candidate to advance.")
            return
        }

        updateState { state ->"""

text = text.replace("""    fun progressToNextWeek() {
        if (state.value.isElectionSeason && (state.value.currentWeek == 14 || state.value.currentWeek == 38) && state.value.endorsedCandidateId.isNullOrEmpty()) {
            showToast("It is voting week! You must open the Politics app and vote for a candidate to advance.")
            return
        }

        updateState { state ->""", replacement)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

