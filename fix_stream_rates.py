import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

target = """                            val finalWeeklyStream = (baseGrowth * song.rating * qualityBoost * trendMult * eventMult * wordOfMouth * prestigeFactor * viralMultiplier * promoMult * countryMult * labelMarketingMult * hypeMult * distMult * biopicMult * (Random.nextFloat() * 0.3f + 0.85f)).toLong()
                            totalWeeklyStreamsForSong += finalWeeklyStream
                            val newStreamsTotal = currentStreams + finalWeeklyStream

                            val rate = when (platformId) {
                                "tunes" -> 0.003
                                "sharp" -> 0.005
                                "jams" -> 0.006
                                "megaphone" -> 0.008
                                "songify" -> 0.010
                                else -> 0.0
                            }"""

replacement = """                            val platformDifficultyMod = when (platformId) {
                                "tunes" -> 5.0f // Very easy
                                "sharp" -> 2.5f // Easy
                                "jams" -> 1.0f // Normal
                                "megaphone" -> 0.25f // Tough
                                "songify" -> 0.05f // Very tough
                                else -> 1.0f
                            }
                            
                            val rawWeeklyStream = (baseGrowth * song.rating * qualityBoost * trendMult * eventMult * wordOfMouth * prestigeFactor * viralMultiplier * promoMult * countryMult * labelMarketingMult * hypeMult * distMult * biopicMult * (Random.nextFloat() * 0.3f + 0.85f)) * platformDifficultyMod
                            val finalWeeklyStream = rawWeeklyStream.toLong()
                            
                            totalWeeklyStreamsForSong += finalWeeklyStream
                            val newStreamsTotal = currentStreams + finalWeeklyStream

                            val isPremium = state.upgradedPlatforms.contains(platformId)
                            val rate = when (platformId) {
                                "tunes" -> if (isPremium) 0.5 else 0.0
                                "sharp" -> if (isPremium) 1.5 else 0.02
                                "jams" -> if (isPremium) 1.87 else 0.3
                                "megaphone" -> if (isPremium) 2.0 else 0.1
                                "songify" -> if (isPremium) 3.0 else 0.35
                                else -> 0.0
                            }"""

text = text.replace(target, replacement)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)

