sed -i '/var newEmergency = state.wealth.emergencyFundBalance/a \            var newBonds = state.wealth.bondsBalance' app/src/main/java/com/example/data/GameViewModel.kt

sed -i '/"Emergency Fund", "EMERGENCY" -> {/i \                "BONDS" -> {\n                    if (newBonds < amount) {\n                        showToast("Insufficient Bonds Balance!")\n                        return@updateState state\n                    }\n                    newBonds -= amount\n                }' app/src/main/java/com/example/data/GameViewModel.kt

sed -i '/"Emergency Fund", "EMERGENCY" -> newEmergency += amount/a \                "BONDS" -> newBonds += amount' app/src/main/java/com/example/data/GameViewModel.kt

sed -i 's/emergencyFundBalance = newEmergency/emergencyFundBalance = newEmergency,\n                    bondsBalance = newBonds/g' app/src/main/java/com/example/data/GameViewModel.kt
