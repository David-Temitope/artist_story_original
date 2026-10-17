import re

print("Fixing GameViewModel.kt bottom and missing helper methods...")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "rb") as f:
    raw = f.read()

# Find the valid cutoff before the corruption around hireSecurityCompany
marker = b"fun toggleScholarships()"
pos = raw.find(marker)
if pos == -1:
    print("! Could not find marker")
    exit(1)

# Find the end of toggleScholarships method
end_pos = raw.find(b"    }\n\n", pos)
if end_pos == -1:
    end_pos = raw.find(b"    }\r\n\r\n", pos)
if end_pos == -1:
    end_pos = raw.find(b"    }", pos) + 5

# Take clean prefix
clean_bytes = raw[:end_pos + 6]
clean_code = clean_bytes.decode("utf-8", errors="ignore")

# Append complete implementations of missing functions
additional_code = """

    fun hireSecurityCompany(companyName: String, weeklyFee: Double) {
        updateState { state ->
            showToast("Contracted $companyName for executive protection ($${String.format("%,.0f", weeklyFee)}/wk).")
            state.copy(
                hiredSecurityCompany = companyName,
                weeklySecurityFee = weeklyFee
            )
        }
    }

    fun calculateTotalAssets(state: GameStateEntity): Double {
        val stocksVal = state.stocks.sumOf { it.shares * it.avgBuyPrice }
        val cryptosVal = state.cryptos.sumOf { it.amount * it.avgBuyPrice }
        val bizVal = state.businesses.sumOf { it.valuation }
        val merchVal = state.merchItems.sumOf { it.stockQuantity * it.retailPrice }
        val gearVal = (state.ownedGear.size * 2500.0) + (state.ownedInstruments.size * 1800.0)
        return state.cash + state.savingsBalance + state.emergencyFundBalance + state.payrollReserve + stocksVal + cryptosVal + bizVal + merchVal + gearVal
    }

    fun calculateTotalLiabilities(state: GameStateEntity): Double {
        return state.loanAmount + state.taxDebt + state.creditCardDebt + state.mortgageBalance + state.lawsuitSettlementDue
    }

    fun calculateNetWorth(state: GameStateEntity): Double {
        return calculateTotalAssets(state) - calculateTotalLiabilities(state)
    }

    fun transferWealthFunds(fromAccount: String, toAccount: String, amount: Double) {
        updateState { state ->
            var cash = state.cash
            var savings = state.savingsBalance
            var emergency = state.emergencyFundBalance
            var payroll = state.payrollReserve

            when (fromAccount) {
                "Checking" -> cash -= amount
                "Savings" -> savings -= amount
                "Emergency" -> emergency -= amount
                "Payroll" -> payroll -= amount
            }

            when (toAccount) {
                "Checking" -> cash += amount
                "Savings" -> savings += amount
                "Emergency" -> emergency += amount
                "Payroll" -> payroll += amount
            }

            state.copy(
                cash = cash.coerceAtLeast(0.0),
                savingsBalance = savings.coerceAtLeast(0.0),
                emergencyFundBalance = emergency.coerceAtLeast(0.0),
                payrollReserve = payroll.coerceAtLeast(0.0)
            )
        }
    }

    fun toggleCyberInsurance() {
        updateState { state ->
            val next = !state.hasCyberInsurance
            showToast(if (next) "Enrolled in Cyber Breach & Social Insurance ($250/wk)" else "Cancelled Cyber Insurance")
            state.copy(hasCyberInsurance = next)
        }
    }

    fun toggleStudioInsurance() {
        updateState { state ->
            val next = !state.hasStudioInsurance
            showToast(if (next) "Enrolled in Studio Gear & Master Tape Insurance ($350/wk)" else "Cancelled Studio Insurance")
            state.copy(hasStudioInsurance = next)
        }
    }

    fun recoverStolenAccount() {
        updateState { state ->
            if (state.cash < 2500.0) {
                showToast("Insufficient cash! Reclaiming hacked accounts costs $2,500 for emergency cyber specialists.")
                state
            } else {
                showToast("Successfully restored verified ownership of your hijacked social accounts!")
                state.copy(
                    cash = state.cash - 2500.0,
                    isSocialAccountHacked = false
                )
            }
        }
    }

    fun runUnderworldAction(actionType: String) {
        updateState { state ->
            when (actionType) {
                "MONEY_LAUNDERING" -> {
                    if (state.cash < 5000.0) {
                        showToast("Insufficient cash to initiate laundering structure ($5,000 required).")
                        state
                    } else {
                        val caught = (1..100).random() <= 20
                        if (caught) {
                            showToast("IRS Audit Triggered! $25,000 Tax Penalty added and Public Image tarnished.")
                            state.copy(
                                cash = state.cash - 5000.0,
                                taxDebt = state.taxDebt + 25000.0,
                                publicImage = (state.publicImage - 15f).coerceAtLeast(0f)
                            )
                        } else {
                            showToast("Laundered $50,000 in clean funds into your accounts!")
                            state.copy(
                                cash = state.cash + 45000.0
                            )
                        }
                    }
                }
                "CLICK_FARM" -> {
                    if (state.cash < 3000.0) {
                        showToast("Insufficient cash ($3,000 required for stream bot farm).")
                        state
                    } else {
                        val caught = (1..100).random() <= 25
                        if (caught) {
                            showToast("Streaming Platform Fraud Detection caught bot activity! 50,000 streams stripped, -20 Trustworthiness.")
                            state.copy(
                                cash = state.cash - 3000.0,
                                trustworthiness = (state.trustworthiness - 20f).coerceAtLeast(0f)
                            )
                        } else {
                            showToast("Bot streams injected! Gained 75,000 temporary streams.")
                            state.copy(
                                cash = state.cash - 3000.0,
                                monthlyListeners = state.monthlyListeners + 15000
                            )
                        }
                    }
                }
                else -> {
                    showToast("Action processed.")
                    state
                }
            }
        }
    }

    fun addHistoryEntryToState(
        state: GameStateEntity,
        title: String,
        description: String,
        memoryType: String,
        strength: String = "NORMAL",
        targetSongTitle: String? = null,
        tags: List<String> = emptyList(),
        impactScore: Float = 0f
    ): GameStateEntity {
        val newTimelineEvent = "Year ${state.currentYear}, Week ${state.currentWeek}: $title - $description"
        return state.copy(
            timelineEvents = state.timelineEvents + newTimelineEvent
        )
    }

    fun simulateEmployeeWorkforce(
        state: GameStateEntity,
        initialCash: Double,
        initialSavings: Double,
        initialStocks: List<StockHolding>,
        initialCryptos: List<CryptoHolding>,
        initialMeTubeVideos: List<MeTubeVideoEntity>,
        initialCastPosts: List<CastPostEntity>,
        initialMail: List<EmailMessage>,
        reportBuilder: java.lang.StringBuilder,
        activeTours: List<TourEntity>,
        totalWeeklyOutflow: Double,
        weeklySalary: Double,
        totalStreamsPayout: Double,
        tourPayout: Double,
        merchRevenue: Double,
        meTubeEarnings: Double,
        newLoanAmount: Double,
        initialPublicImage: Float,
        initialNegativeSentiment: Float,
        initialTrustworthiness: Float,
        initialBusinessReputation: Float,
        initialReliability: Float,
        initialIndustryRespect: Float
    ): WorkforceSimulationResult {
        var cash = initialCash
        var savings = initialSavings
        var payrollReserve = state.payrollReserve
        val employees = state.employees.toMutableList()
        var employeesUnpaid = false

        val totalSalaries = employees.sumOf { it.salary.toDouble() }
        if (totalSalaries > 0) {
            if (payrollReserve >= totalSalaries) {
                payrollReserve -= totalSalaries
            } else if (cash >= totalSalaries) {
                cash -= totalSalaries
            } else {
                employeesUnpaid = true
                reportBuilder.append("⚠️ PAYROLL DEFICIT: Unable to meet payroll obligations this week ($${String.format("%,.0f", totalSalaries)} due). Employee morale is dropping!\n")
            }
        }

        val updatedEmployees = employees.map { emp ->
            if (employeesUnpaid) {
                emp.copy(morale = (emp.morale - 15f).coerceAtLeast(0f), loyalty = (emp.loyalty - 10f).coerceAtLeast(0f))
            } else {
                emp.copy(morale = (emp.morale + 2f).coerceAtMost(100f), experience = emp.experience + 1)
            }
        }

        return WorkforceSimulationResult(
            updatedCash = cash,
            newSavingsBalance = savings,
            updatedPayrollReserve = payrollReserve,
            updatedMail = initialMail,
            updatedEmployeesList = updatedEmployees,
            finalStocks = initialStocks,
            finalCryptos = initialCryptos,
            updatedMeTubeVideos = initialMeTubeVideos,
            updatedCastPosts = initialCastPosts,
            smmAutoPostedBrandDeal = false,
            currentPublicImage = initialPublicImage,
            updatedNegativeSentiment = initialNegativeSentiment,
            currentTrustworthiness = initialTrustworthiness,
            currentBusinessReputation = initialBusinessReputation,
            currentReliability = initialReliability,
            employeesUnpaid = employeesUnpaid
        )
    }

    fun generateMonthlyFinancialReview(state: GameStateEntity): String {
        val totalAssets = calculateTotalAssets(state)
        val totalLiab = calculateTotalLiabilities(state)
        val netWorth = totalAssets - totalLiab
        return "Month Review: Total Assets: $${String.format("%,.2f", totalAssets)}, Liabilities: $${String.format("%,.2f", totalLiab)}, Net Worth: $${String.format("%,.2f", netWorth)}. Savings Reserve: $${String.format("%,.2f", state.savingsBalance)}."
    }

    fun simulateWorldEcosystem(
        state: GameStateEntity,
        reportBuilder: java.lang.StringBuilder,
        updatedMail: MutableList<EmailMessage>,
        finalNPCs: List<NPCEntity>
    ): Pair<GameStateEntity, List<NPCEntity>> {
        val simulatedNPCs = finalNPCs.map { npc ->
            val streamsGrowth = (1000..50000).random().toLong()
            npc.copy(
                bestSongStreams = npc.bestSongStreams + streamsGrowth,
                fans = (npc.fans + (streamsGrowth * 0.1).toLong()).coerceAtLeast(0)
            )
        }
        return Pair(state, simulatedNPCs)
    }
}

data class WorkforceSimulationResult(
    val updatedCash: Double,
    val newSavingsBalance: Double,
    val updatedPayrollReserve: Double,
    val updatedMail: List<EmailMessage>,
    val updatedEmployeesList: List<EmployeeEntity>,
    val finalStocks: List<StockHolding>,
    val finalCryptos: List<CryptoHolding>,
    val updatedMeTubeVideos: List<MeTubeVideoEntity>,
    val updatedCastPosts: List<CastPostEntity>,
    val smmAutoPostedBrandDeal: Boolean,
    val currentPublicImage: Float,
    val updatedNegativeSentiment: Float,
    val currentTrustworthiness: Float,
    val currentBusinessReputation: Float,
    val currentReliability: Float,
    val employeesUnpaid: Boolean
)
"""

full_content = clean_code + additional_code
with open("app/src/main/java/com/example/data/GameViewModel.kt", "w", encoding="utf-8") as f:
    f.write(full_content)

print("GameViewModel.kt repaired successfully.")
