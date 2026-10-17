import re

with open("app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt", "r") as f:
    text = f.read()

# Let's just restore the file from git to be safe, since it's hard to revert multiple bad string replacements.
import subprocess
subprocess.run(["git", "checkout", "app/src/main/java/com/example/ui/music/MusicPlatformScreens.kt"])
