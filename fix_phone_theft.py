import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

# 1. Pull up `var newSavingsBalance = state.savingsBalance` to right before the breach consequence
theft_block = """                // Breach consequence
                when (threatType) {"""
theft_block_new = """                // Breach consequence
                var newSavingsBalance = state.savingsBalance
                when (threatType) {"""
text = text.replace(theft_block, theft_block_new)

# 2. Remove `var ` from the savings interest area
interest_area = """            // Accrue savings interest
            var newSavingsBalance = state.savingsBalance"""
interest_area_new = """            // Accrue savings interest
            newSavingsBalance = newSavingsBalance // already declared above"""
text = text.replace(interest_area, interest_area_new)

# 3. Modify PHONE_THEFT
old_phone_theft = """                        "PHONE_THEFT" -> {
                            currentPublicImage = (currentPublicImage - 20f).coerceIn(0f, 100f)
                            updatedFollowers = (updatedFollowers - 15000L).coerceAtLeast(1500L)
                            updatedNegativeSentiment = (updatedNegativeSentiment + 25f).coerceIn(0f, 100f)
                            updatedSpiritualJournal.add("phone_stolen_followers_lost:15000")
                            reportBuilder.append("📱 PHONE THEFT: Your smartphone was stolen! Rogue actors posted offensive comments on Cast, decaying followers by -15,000 and tanking your Public Image! Recover your lost accounts under 'Cyber Shield' immediately.\\n")
                        }"""
new_phone_theft = """                        "PHONE_THEFT" -> {
                            if (state.isPhoneLocked) {
                                reportBuilder.append("📱 PHONE THEFT: Your smartphone was stolen! Thankfully, you locked your device before the theft. Your accounts are safe, and you only need a replacement device.\\n")
                            } else {
                                currentPublicImage = (currentPublicImage - 20f).coerceIn(0f, 100f)
                                updatedFollowers = (updatedFollowers - 15000L).coerceAtLeast(1500L)
                                updatedNegativeSentiment = (updatedNegativeSentiment + 25f).coerceIn(0f, 100f)
                                val savingsLoss = (newSavingsBalance * 0.1).coerceAtMost(50000.0)
                                newSavingsBalance = (newSavingsBalance - savingsLoss).coerceAtLeast(0.0)
                                updatedSpiritualJournal.add("phone_stolen_followers_lost:15000")
                                reportBuilder.append("📱 PHONE THEFT: Your UNLOCKED smartphone was stolen! Rogue actors posted offensive comments on Cast (-15,000 followers) and breached your banking app, stealing $${String.format("%,.2f", savingsLoss)} from savings! Lock your phone next time!\\n")
                            }
                        }"""
text = text.replace(old_phone_theft, new_phone_theft)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)
