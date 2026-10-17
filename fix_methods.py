import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

business_methods = """
    fun startBusinessVenture(type: String) {
        updateState { state ->
            val minCost = when(type) {
                "Taxi Fleet" -> 5000.0
                "Restaurant" -> 25000.0
                "Crypto Token" -> 15000.0
                "Farming" -> 50000.0
                "Hotel Chain" -> 200000.0
                else -> 10000.0
            }
            if (state.cash < minCost) {
                showToast("Not enough cash to start $type! (Need $${String.format("%,.0f", minCost)})")
                return@updateState state
            }
            showToast("Successfully started $type business!")
            val newVenture = BusinessVenture(
                id = "biz_" + java.util.UUID.randomUUID().toString().take(6),
                name = "My $type",
                type = type,
                setupCost = minCost,
                minStartingCapital = minCost * 0.5,
                isOwned = true,
                investedCapital = 0.0,
                accumulatedProfit = 0.0,
                baseWeeklyRoi = when(type) {
                    "Crypto Token" -> 0.08
                    "Taxi Fleet" -> 0.03
                    "Restaurant" -> 0.02
                    "Farming" -> 0.015
                    "Hotel Chain" -> 0.025
                    else -> 0.02
                }
            )
            state.copy(
                cash = state.cash - minCost,
                businessVentures = state.businessVentures + newVenture
            )
        }
    }

    fun investBusinessCapital(id: String, amount: Double) {
        updateState { state ->
            if (state.cash < amount) {
                showToast("Insufficient cash!")
                return@updateState state
            }
            val ventures = state.businessVentures.map {
                if (it.id == id) it.copy(investedCapital = it.investedCapital + amount) else it
            }
            showToast("Deposited $${String.format("%,.0f", amount)} into business.")
            state.copy(cash = state.cash - amount, businessVentures = ventures)
        }
    }

    fun withdrawBusinessFunds(id: String, amount: Double) {
        updateState { state ->
            val ventures = state.businessVentures.map {
                if (it.id == id) {
                    val available = it.investedCapital + it.accumulatedProfit
                    if (amount > available) {
                        showToast("Cannot withdraw that much!")
                        return@updateState state
                    }
                    var remainingAmountToWithdraw = amount
                    var newProfit = it.accumulatedProfit
                    var newCap = it.investedCapital
                    
                    if (remainingAmountToWithdraw <= newProfit) {
                        newProfit -= remainingAmountToWithdraw
                    } else {
                        remainingAmountToWithdraw -= newProfit
                        newProfit = 0.0
                        newCap -= remainingAmountToWithdraw
                    }
                    
                    it.copy(
                        investedCapital = newCap,
                        accumulatedProfit = newProfit,
                        totalWithdrawn = it.totalWithdrawn + amount
                    )
                } else it
            }
            showToast("Withdrew $${String.format("%,.0f", amount)} from business.")
            state.copy(cash = state.cash + amount, businessVentures = ventures)
        }
    }
"""

text = text.replace('// --- Recruitment Hall Hiring ---', business_methods + '\n    // --- Recruitment Hall Hiring ---')

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

