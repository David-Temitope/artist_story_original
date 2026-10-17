import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

text = text.replace('coverImageId = "ic_music_trend",', 'coverImageId = "https://source.unsplash.com/random/400x300?music,concert&sig=${System.currentTimeMillis()}_1",')
text = text.replace('coverImageId = "ic_financial",', 'coverImageId = "https://source.unsplash.com/random/400x300?business,finance&sig=${System.currentTimeMillis()}_2",')
text = text.replace('coverImageId = "ic_ecosystem",', 'coverImageId = "https://source.unsplash.com/random/400x300?technology,office&sig=${System.currentTimeMillis()}_3",')
text = text.replace('coverImageId = "ic_global",', 'coverImageId = "https://source.unsplash.com/random/400x300?world,news,politics&sig=${System.currentTimeMillis()}_4",')

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

