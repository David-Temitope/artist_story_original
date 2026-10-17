import glob
import re

for filename in glob.glob('app/src/main/java/com/example/**/*.kt', recursive=True):
    with open(filename, 'r') as f:
        text = f.read()
    
    text = re.sub(r'package com\.exampleimport', 'package com.example\nimport', text)
    text = re.sub(r'(\w)import androidx', r'\1\nimport androidx', text)
    text = re.sub(r'(\*)import androidx', r'\1\nimport androidx', text)
    text = re.sub(r'(\*)import com\.', r'\1\nimport com.', text)
    text = re.sub(r'(\w)import com\.', r'\1\nimport com.', text)
    
    with open(filename, 'w') as f:
        f.write(text)
