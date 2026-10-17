import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

text = text.replace("""                }
                }
                
                // Active App Screen Injection""", """                }
                
                // Active App Screen Injection""")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)
