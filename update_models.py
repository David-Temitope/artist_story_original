import re

with open('app/src/main/java/com/example/data/Models.kt', 'r') as f:
    text = f.read()

if "isPhoneLocked: Boolean" not in text:
    text = text.replace('val avatarJewelryId: String = "none",', 'val avatarJewelryId: String = "none",\n    val isPhoneLocked: Boolean = false,')
    text = text.replace('val imageUrl: String? = null', 'val imageUrl: String? = null,\n    val customCoverUrl: String? = null')
    
    with open('app/src/main/java/com/example/data/Models.kt', 'w') as f:
        f.write(text)

