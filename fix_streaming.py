import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_rates = """                            val rate = when (platformId) {
                                "tunes" -> if (isPremium) 0.5 else 0.0
                                "sharp" -> if (isPremium) 1.5 else 0.02
                                "jams" -> if (isPremium) 1.87 else 0.3
                                "megaphone" -> if (isPremium) 2.0 else 0.1
                                "songify" -> if (isPremium) 3.0 else 0.35
                                else -> 0.0
                            }"""

new_rates = """                            // Realistic streaming payouts (e.g. $0.003 to $0.008 per stream)
                            val rate = when (platformId) {
                                "tunes" -> if (isPremium) 0.003 else 0.001
                                "sharp" -> if (isPremium) 0.005 else 0.002
                                "jams" -> if (isPremium) 0.006 else 0.003
                                "megaphone" -> if (isPremium) 0.008 else 0.004
                                "songify" -> if (isPremium) 0.012 else 0.005
                                else -> 0.0
                            }"""

if old_rates in content:
    content = content.replace(old_rates, new_rates)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Streaming rates updated!")
else:
    print("Old rates block not found!")
