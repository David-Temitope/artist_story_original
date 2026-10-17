import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

# Replace MarketSimulationHelper call with Business simulation
business_logic = """
            // 7. Update Business Ventures (Replacing Stock & Crypto Markets)
            var totalBusinessProfit = 0.0
            val updatedVentures = state.businessVentures.map { venture ->
                if (venture.isOwned && venture.investedCapital > 0.0) {
                    val weeklyProfit = venture.investedCapital * venture.baseWeeklyRoi
                    totalBusinessProfit += weeklyProfit
                    venture.copy(
                        accumulatedProfit = venture.accumulatedProfit + weeklyProfit,
                        history = (venture.history + (venture.accumulatedProfit + weeklyProfit)).takeLast(20)
                    )
                } else {
                    venture
                }
            }
            updatedCash += totalBusinessProfit
            if (totalBusinessProfit > 0.0) {
                reportBuilder.append("🏢 Business Ventures: Earned $${String.format("%,.2f", totalBusinessProfit)} in profits from your active businesses.\\n")
            }
"""

text = re.sub(
    r'// 7\. Update Stock & Crypto Markets.*?val remainingCryptoOrders = marketSimResult\.remainingCryptoOrders\n            updatedCash \+= marketSimResult\.addedCash\n            weeklySalary \+= marketSimResult\.addedSalary',
    business_logic,
    text,
    flags=re.DOTALL
)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

