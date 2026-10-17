import re
with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    content = f.read()

# Fix avgRating
content = content.replace(
    "val avgRating = selectedSongs.map { it.rating }.average().toFloat()\n            var updatedSongs = state.songs",
    "val newAlbumIsGood = initialAvgRating > 3.5f\n            var finalUpdatedSongs = state.songs"
)
content = content.replace("if (avgRating > 3.5f)", "if (newAlbumIsGood)")
content = content.replace("updatedSongs = state.songs.map { song ->", "finalUpdatedSongs = state.songs.map { song ->")

# Fix the second updatedSongs declaration
content = content.replace("val updatedSongs = state.songs.map { song ->", "finalUpdatedSongs = finalUpdatedSongs.map { song ->")
content = content.replace("songs = updatedSongs,", "songs = finalUpdatedSongs,")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(content)

print("Duplicates fixed.")
