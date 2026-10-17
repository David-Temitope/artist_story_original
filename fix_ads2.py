import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    vm_content = f.read()

vm_content = vm_content.replace("state.releasedSongs.find", "state.songs.find")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(vm_content)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    sc_content = f.read()

sc_content = sc_content.replace("state.releasedSongs", "state.songs.filter { it.isUploadedMap.isNotEmpty() }")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(sc_content)
print("Fixed releasedSongs reference.")
