import re

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'r') as f:
    text = f.read()

if "isPhoneLocked: Boolean" not in text:
    text = text.replace('val avatarOwnedItemIds: List<String> get() = avatar.avatarOwnedItemIds', 'val avatarOwnedItemIds: List<String> get() = avatar.avatarOwnedItemIds\n    val isPhoneLocked: Boolean = false\n    val savedPhotos: List<String> = emptyList()')

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'w') as f:
    f.write(text)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text2 = f.read()

methods = """
    fun unlockPhone() {
        updateState { it.copy(isPhoneLocked = false) }
    }

    fun lockPhone() {
        updateState { 
            if (it.activePhone == "hiPhone" || it.activePhone == "Samsong") {
                it.copy(isPhoneLocked = true) 
            } else {
                it
            }
        }
    }
    
    fun savePhotoToPhone(photoId: String) {
        updateState { it.copy(savedPhotos = it.savedPhotos + photoId) }
    }
"""
text2 = text2.replace('// --- MISC / SETTINGS ---', methods + '\n    // --- MISC / SETTINGS ---')

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text2)

