import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

replacement = """    fun setPhoneLocked(locked: Boolean) {
        updateState { state ->
            state.copy(isPhoneLocked = locked)
        }
    }

    fun savePhotoToPhone(photoUrl: String) {
        updateState { state ->
            state.copy(savedPhotos = state.savedPhotos + photoUrl)
        }
    }"""

text = text.replace("""    fun setPhoneLocked(locked: Boolean) {
        updateState { state ->
            state.copy(isPhoneLocked = locked)
        }
    }""", replacement)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

