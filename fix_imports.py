import glob
import re

for filename in glob.glob('app/src/main/java/com/example/**/*.kt', recursive=True):
    with open(filename, 'r') as f:
        text = f.read()
    
    # If the file has imports glued together like "package com.exampleimport"
    # or "import com.example.ui.npackage com.example"
    text = text.replace('package com.exampleimport ', 'package com.example\nimport ')
    text = text.replace('*import ', '*\nimport ')
    text = text.replace('.ktimport ', '.kt\nimport ')
    text = text.replace('pointerInputimport ', 'pointerInput\nimport ')
    text = text.replace('DragGesturesimport ', 'DragGestures\nimport ')
    text = text.replace('Foundationimport ', 'Foundation\nimport ')
    text = text.replace('layout.*import ', 'layout.*\nimport ')
    text = text.replace('animation.*import ', 'animation.*\nimport ')
    
    with open(filename, 'w') as f:
        f.write(text)
