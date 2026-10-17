with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace("androidx.compose.foundation.gestures.detectVerticalDragGestures(", "detectVerticalDragGestures(")
text = text.replace("change.consume()", "change.consumePositionChange()")
# If it's already consumePositionChange(), it will be change.consumePositionChange()PositionChange() if I'm not careful, but I checked the error logs and it literally said 'consume'.

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

