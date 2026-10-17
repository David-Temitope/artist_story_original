import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    vm_content = f.read()

pattern = r"(            val selectedSongs = state\.songs\.filter \{ it\.id in songIds \}\n            if \(selectedSongs\.size != songIds\.size\) \{\n                showToast\(\"Error finding selected songs!\"\)\n                return@updateState state\n            \}\n)"

new_logic = """            val selectedSongs = state.songs.filter { it.id in songIds }
            if (selectedSongs.size != songIds.size) {
                showToast("Error finding selected songs!")
                return@updateState state
            }
            
            // Check for already-released songs to apply synergy
            var totalPriorStreams = 0L
            selectedSongs.forEach { song ->
                if (song.isUploadedMap.isNotEmpty()) {
                    totalPriorStreams += song.isUploadedMap.values.sum()
                }
            }
            
            // Boost album hype based on prior streams of pre-released singles (e.g. max +30 hype)
            val streamBonusHype = (totalPriorStreams / 100_000f).coerceIn(0f, 30f)
            
            val initialHype = when (marketingTier) {
                "Budget" -> 15f
                "Standard" -> 35f
                "Cinematic" -> 70f
                "Global Campaign" -> 95f
                else -> 5f
            } + streamBonusHype
"""

vm_content = re.sub(pattern, new_logic, vm_content)

# We also need to boost the streams of the released songs if the new album's rating is high!
pattern2 = r"            val newAlbum = Album\(\n"
new_logic2 = """            // Boost the released single streams if the album is good
            val avgRating = selectedSongs.map { it.rating }.average().toFloat()
            var updatedSongs = state.songs
            if (avgRating > 3.5f) {
                updatedSongs = state.songs.map { song ->
                    if (song.id in songIds && song.isUploadedMap.isNotEmpty()) {
                        // Boost streams by 15% due to album synergy
                        val boostedMap = song.isUploadedMap.mapValues { (_, streams) -> (streams * 1.15).toLong() }
                        song.copy(isUploadedMap = boostedMap)
                    } else song
                }
            }
            
            val newAlbum = Album(
"""
vm_content = re.sub(pattern2, new_logic2, vm_content)

# update state with updatedSongs
pattern3 = r"            state\.copy\(\n                energy = state\.energy - 40,\n                cash = state\.cash - marketingCost,\n                albums = state\.albums \+ newAlbum,\n"
new_logic3 = """            state.copy(
                energy = state.energy - 40,
                cash = state.cash - marketingCost,
                songs = updatedSongs,
                albums = state.albums + newAlbum,
"""
vm_content = re.sub(pattern3, new_logic3, vm_content)


with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(vm_content)
print("Album synergy applied.")
