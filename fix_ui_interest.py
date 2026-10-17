with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    content = f.read()

content = content.replace("1.20% wk", "2.50% wk")
content = content.replace("rate of 1.20% (62.4% APY equivalent)", "rate of 2.50% (130% APY equivalent)")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(content)
print("Updated UI text.")
