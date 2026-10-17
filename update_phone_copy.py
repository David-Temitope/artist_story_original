import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

# Add to top of progressToNextWeek
top_of_func = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = java.lang.StringBuilder()
            var newSavingsBalance = state.savingsBalance"""
top_of_func_new = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = java.lang.StringBuilder()
            var newSavingsBalance = state.savingsBalance
            var updatedActivePhone = state.activePhone
            var updatedOwnedPhones = state.ownedPhones"""
text = text.replace(top_of_func, top_of_func_new)

# Add to the PHONE_THEFT logic
old_phone_theft = """                        "PHONE_THEFT" -> {
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
new_phone_theft = """                        "PHONE_THEFT" -> {
                            updatedOwnedPhones = updatedOwnedPhones - updatedActivePhone
                            updatedActivePhone = "TECCNO"
                            if (!updatedOwnedPhones.contains("TECCNO")) updatedOwnedPhones = updatedOwnedPhones + "TECCNO"
                            
                            if (state.isPhoneLocked) {
                                reportBuilder.append("📱 PHONE THEFT: Your smartphone was stolen! Thankfully, you locked your device before the theft. Your accounts are safe, but you'll have to use a spare TECCNO until you buy a replacement.\\n")
                            } else {
                                currentPublicImage = (currentPublicImage - 20f).coerceIn(0f, 100f)
                                updatedFollowers = (updatedFollowers - 15000L).coerceAtLeast(1500L)
                                updatedNegativeSentiment = (updatedNegativeSentiment + 25f).coerceIn(0f, 100f)
                                val savingsLoss = (newSavingsBalance * 0.1).coerceAtMost(50000.0)
                                newSavingsBalance = (newSavingsBalance - savingsLoss).coerceAtLeast(0.0)
                                updatedSpiritualJournal.add("phone_stolen_followers_lost:15000")
                                reportBuilder.append("📱 PHONE THEFT: Your UNLOCKED smartphone was stolen! Rogue actors posted offensive comments on Cast (-15,000 followers) and breached your banking app, stealing $${String.format("%,.2f", savingsLoss)} from savings! You are now using a spare TECCNO. Lock your phone next time!\\n")
                            }
                        }"""
text = text.replace(old_phone_theft, new_phone_theft)

# Add to state.copy at the end
copy_str = """                legacyPoints = currentLegacyPoints,"""
copy_str_new = """                legacyPoints = currentLegacyPoints,
                activePhone = updatedActivePhone,
                ownedPhones = updatedOwnedPhones,"""
text = text.replace(copy_str, copy_str_new)


with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)
