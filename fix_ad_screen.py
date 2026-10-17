with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    content = f.read()

content = content.replace(r"remember \{ mutableStateOf\(\"Campaigns\"\) \}", r"remember { mutableStateOf(\"Campaigns\") }")
content = content.replace(r"listOf\(\"Campaigns\", \"Advertisers\", \"Analytics\"\)", r"listOf(\"Campaigns\", \"Advertisers\", \"Analytics\")")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(content)
