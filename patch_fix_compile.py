import re

# Fix GameStateEntity
with open("app/src/main/java/com/example/data/GameStateEntity.kt", "r", encoding="utf-8") as f:
    code = f.read()

target = """    val capitalClubMembers: List<CapitalClubMember> = emptyList(),
    val isPhoneLocked: Boolean = false,
    val phonePin: String? = null
) {"""

replacement = """    val capitalClubMembers: List<CapitalClubMember> = emptyList()
) {"""

if target in code:
    code = code.replace(target, replacement)

with open("app/src/main/java/com/example/data/GameStateEntity.kt", "w", encoding="utf-8") as f:
    f.write(code)


# Fix GameViewModel
with open("app/src/main/java/com/example/data/GameViewModel.kt", "r", encoding="utf-8") as f:
    vm_code = f.read()

vm_target = """    fun togglePhoneLock() {
        updateState { it.copy(isPhoneLocked = !it.isPhoneLocked) }
    }"""

vm_replacement = """    fun togglePhoneLock() {
        updateState { it.copy(isPhoneLocked = !it.isPhoneLocked) }
    }
    
    fun setPhoneLocked(locked: Boolean) {
        updateState { it.copy(isPhoneLocked = locked) }
    }"""

if vm_target in vm_code:
    vm_code = vm_code.replace(vm_target, vm_replacement)
else:
    print("Could not find togglePhoneLock in GameViewModel")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w", encoding="utf-8") as f:
    f.write(vm_code)

print("Fixed compile issues.")
