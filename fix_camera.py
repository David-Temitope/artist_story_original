import re
with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'r') as f:
    text = f.read()

# Replace the camera URL with dynamic URL based on selfie mode
old_str = 'val newPhotoUrl = "https://images.unsplash.com/photo-1520114878144-6123749968dd?q=80&w=400&auto=format&fit=crop&sig=${System.currentTimeMillis()}"'
new_str = 'val newPhotoUrl = if(isSelfieMode) "https://images.unsplash.com/photo-1544005313-94ddf0286df2?q=80&w=400&auto=format&fit=crop&sig=${System.currentTimeMillis()}" else "https://images.unsplash.com/photo-1520114878144-6123749968dd?q=80&w=400&auto=format&fit=crop&sig=${System.currentTimeMillis()}"'

text = text.replace(old_str, new_str)
with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'w') as f:
    f.write(text)
