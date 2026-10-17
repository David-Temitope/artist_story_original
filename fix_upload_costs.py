import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

target = """            val cost = when(platformId) {
                "songify" -> 2500.0
                "jams" -> 800.0
                "megaphone" -> 50.0
                "tunes" -> 1500.0
                "sharp" -> 500.0
                else -> 0.0
            }"""

replacement = """            val cost = when(platformId) {
                "songify" -> 2500.0
                "jams" -> 800.0
                "megaphone" -> 50.0
                "tunes" -> 0.0
                "sharp" -> 500.0
                else -> 0.0
            }"""

text = text.replace(target, replacement)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)

