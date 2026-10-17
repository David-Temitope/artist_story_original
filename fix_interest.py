with open("app/src/main/java/com/example/data/GameStateEntity.kt", "r") as f:
    content = f.read()

content = content.replace("val savingsInterestRate: Float = 0.012f,", "val savingsInterestRate: Float = 0.025f, // 2.5% weekly interest")

with open("app/src/main/java/com/example/data/GameStateEntity.kt", "w") as f:
    f.write(content)

print("Interest rate updated.")
