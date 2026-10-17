import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    content = f.read()

# Revert the global replacements
content = content.replace("songs = finalUpdatedSongs,", "songs = updatedSongs,")
content = content.replace("finalUpdatedSongs = state.songs.map { song ->", "val updatedSongs = state.songs.map { song ->")
content = content.replace("val finalUpdatedSongs = state.songs.map { song ->", "val updatedSongs = state.songs.map { song ->")
content = content.replace("finalUpdatedSongs = finalUpdatedSongs.map { song ->", "val updatedSongs = state.songs.map { song ->")
content = content.replace("var finalUpdatedSongs = state.songs", "var updatedSongs = state.songs")
content = content.replace("finalUpdatedSongs.map", "updatedSongs.map")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(content)
