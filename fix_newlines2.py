import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# Replace any literal newline right after NOW inside Text(
text = re.sub(r'(Text\([^"]*"[A-Z]+ NOW)\n', r'\1\\n', text)
# Or just globally look for \n that's not \n but actual newline, but we only have a few cases.
# Let's fix SELL NOW
text = text.replace('Text("SELL NOW\n', 'Text("SELL NOW\\n')
text = text.replace('Text("BUY NOW\n', 'Text("BUY NOW\\n')
text = text.replace('Text("SWAP NOW\n', 'Text("SWAP NOW\\n')
text = text.replace('Text("EXCHANGE NOW\n', 'Text("EXCHANGE NOW\\n')
text = text.replace('change.consumePositionChange()', 'change.consume()')
text = text.replace('import androidx.compose.ui.input.pointer.pointerInput', 'import androidx.compose.ui.input.pointer.pointerInput\nimport androidx.compose.foundation.gestures.detectVerticalDragGestures')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

