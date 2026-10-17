import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# Increase height of thumbnail to 220.dp
text = text.replace('.height(130.dp)', '.height(220.dp)')

# Increase font size of video type badge to 10.sp
text = text.replace('fontSize = 7.sp,', 'fontSize = 10.sp,')

# Increase font sizes and padding in MeTube and Cast
with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

