import re

def fix_viewmodel_methods():
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r', encoding='utf-8') as f:
        content = f.read()

    # Remove any broken duplicate methods at the bottom of the file
    marker = "// --- PLATFORM & FEATURE EXTENSIONS ---"
    if marker in content:
        content = content[:content.find(marker)]
    
    # Strip any trailing braces so we can cleanly close the class
    content = content.rstrip()
    while content.endswith('}'):
        content = content[:-1].rstrip()

    methods_to_add = """
    // --- PLATFORM & FEATURE EXTENSIONS ---
    fun setCryptoAutoInvest(coin: String, percent: Float) {
        updateState { it.copy(cryptoAutoInvestPercent = percent) }
    }

    fun setAccountantAutoInvest(percent: Float) {
        updateState { it.copy(accountantAutoInvestPercent = percent) }
    }

    fun calculateTotalAssets(state: GameStateEntity): Double {
        val stocksVal = state.stocks.sumOf { (it.quantity.toDouble() * it.currentPrice) }
        val cryptosVal = state.cryptos.sumOf { (it.quantity * it.currentPrice) }
        val bizVal = state.ownedBusinesses.sumOf { it.purchaseCost }
        val carsVal = state.ownedCars.sumOf { it.cost * 0.8 }
        val housesVal = state.ownedHouses.sumOf { it.cost }
        val gearVal = state.ownedInstruments.sumOf { it.cost }
        return state.cash + state.banking.savingsBalance + state.wealth.emergencyFundBalance + state.wealth.payrollReserve + state.wealth.businessReserve + state.wealth.bondsBalance + stocksVal + cryptosVal + bizVal + carsVal + housesVal + gearVal
    }

    fun calculateTotalLiabilities(state: GameStateEntity): Double {
        return state.banking.loanAmount + state.banking.taxDebt + state.banking.titheDebt + state.banking.mortgageAmount + state.banking.accumulatedLoanInterest
    }

    fun calculateNetWorth(state: GameStateEntity): Double {
        return calculateTotalAssets(state) - calculateTotalLiabilities(state)
    }

    fun transferWealthFunds(fromAccount: String, toAccount: String, amount: Double) {
        updateState { state ->
            var cash = state.cash
            var savings = state.banking.savingsBalance
            var emergency = state.wealth.emergencyFundBalance
            var payroll = state.wealth.payrollReserve
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
                banking = state.banking.copy(savingsBalance = savings.coerceAtLeast(0.0)),
                wealth = state.wealth.copy(
                    emergencyFundBalance = emergency.coerceAtLeast(0.0),
                    payrollReserve = payroll.coerceAtLeast(0.0)
                )
            )
        }
    }

    fun takeConcertPhoto() {
        updateState { state ->
            showToast("Snapped a vibrant behind-the-scenes concert photo! Saved to Gallery.")
            val newPhotos = state.savedPhotos + ("Concert Flash: Week ${state.currentWeek}, Year ${state.currentYear}")
            state.copy(savedPhotos = newPhotos)
        }
    }

    fun updateMerchPrice(styleId: String, newPrice: Double) {
        updateState { state ->
            val updated = state.merchStyles.map {
                if (it.id == styleId) it.copy(sellPrice = newPrice) else it
            }
            state.copy(merchStyles = updated)
        }
    }

    fun restockMerchStyle(styleId: String, units: Int) {
        updateState { state ->
            val style = state.merchStyles.find { it.id == styleId }
            if (style == null) return@updateState state
            val cost = units * style.unitCost
            if (state.cash < cost) {
                showToast("Insufficient cash to order $units units! Need \$$cost")
                return@updateState state
            }
            showToast("Ordered $units units of ${style.name} for \$$cost")
            val updated = state.merchStyles.map {
                if (it.id == styleId) it.copy(stockRemaining = it.stockRemaining + units) else it
            }
            state.copy(cash = state.cash - cost, merchStyles = updated)
        }
    }

    fun designMerchStyle(name: String, type: String, unitCost: Double, price: Double, initialStock: Int) {
        updateState { state ->
            val totalCost = initialStock * unitCost
            if (state.cash < totalCost) {
                showToast("Insufficient cash for production! Need \$$totalCost")
                return@updateState state
            }
            val newStyle = MerchStyle(
                id = "merch_" + java.util.UUID.randomUUID().toString().take(6),
                name = name,
                type = type,
                unitCost = unitCost,
                sellPrice = price,
                stockRemaining = initialStock
            )
            showToast("Produced $initialStock units of $name!")
            state.copy(cash = state.cash - totalCost, merchStyles = state.merchStyles + newStyle)
        }
    }

    fun buyWikipediaPage() {
        updateState { state ->
            if (state.cash < 5000.0) {
                showToast("Need $5,000 to hire Wiki editors.")
                state
            } else {
                showToast("Official verified Wikipedia page published!")
                state.copy(cash = state.cash - 5000.0, legacy = state.legacy.copy(hasWikipediaPage = true))
            }
        }
    }

    fun buyBiography() {
        updateState { state ->
            if (state.cash < 15000.0) {
                showToast("Need $15,000 for ghostwriters & publisher deal.")
                state
            } else {
                showToast("Published authorized career biography!")
                state.copy(cash = state.cash - 15000.0, legacy = state.legacy.copy(hasBiography = true))
            }
        }
    }

    fun buyDocumentary() {
        updateState { state ->
            if (state.cash < 50000.0) {
                showToast("Need $50,000 for cinematic documentary production.")
                state
            } else {
                showToast("Feature-length documentary premiered!")
                state.copy(cash = state.cash - 50000.0, legacy = state.legacy.copy(hasDocumentary = true))
            }
        }
    }

    fun buyNetflixSeries() {
        updateState { state ->
            if (state.cash < 150000.0) {
                showToast("Need $150,000 for docuseries licensing.")
                state
            } else {
                showToast("Streaming multi-part docuseries premiered!")
                state.copy(cash = state.cash - 150000.0, legacy = state.legacy.copy(hasNetflixSeries = true))
            }
        }
    }

    fun toggleScholarships() {
        updateState { state ->
            val next = !state.legacy.hasScholarships
            showToast(if (next) "Endowed annual youth music scholarship fund ($1,000/wk)" else "Paused scholarship endowments.")
            state.copy(legacy = state.legacy.copy(hasScholarships = next))
        }
    }

    fun buyMuseum() {
        updateState { state ->
            if (state.cash < 500000.0) {
                showToast("Need $500,000 for museum acquisition.")
                state
            } else {
                showToast("Opened personal music & artifact museum!")
                state.copy(cash = state.cash - 500000.0, legacy = state.legacy.copy(hasMuseum = true))
            }
        }
    }

    fun buyHallOfFame() {
        updateState { state ->
            if (state.cash < 1000000.0) {
                showToast("Need $1,000,000 for Hall of Fame induction exhibit.")
                state
            } else {
                showToast("Inducted into the Global Music Hall of Fame!")
                state.copy(cash = state.cash - 1000000.0, legacy = state.legacy.copy(hasHallOfFame = true))
            }
        }
    }

    fun hireSecurityCompany(companyName: String, weeklyFee: Double) {
        updateState { state ->
            if (companyName.isEmpty() || companyName == "None") {
                showToast("Cancelled private security retainer.")
                state.copy(security = state.security.copy(hiredSecurityCompany = "None"))
            } else {
                showToast("Contracted $companyName for executive protection (\$$weeklyFee/wk).")
                state.copy(security = state.security.copy(hiredSecurityCompany = companyName))
            }
        }
    }

    fun toggleCyberInsurance() {
        updateState { state ->
            val next = !state.security.hasCyberInsurance
            showToast(if (next) "Enrolled in Cyber Breach & Social Insurance ($250/wk)" else "Cancelled Cyber Insurance")
            state.copy(security = state.security.copy(hasCyberInsurance = next))
        }
    }

    fun toggleStudioInsurance() {
        updateState { state ->
            val next = !state.security.hasStudioInsurance
            showToast(if (next) "Enrolled in Studio Gear & Master Tape Insurance ($350/wk)" else "Cancelled Studio Insurance")
            state.copy(security = state.security.copy(hasStudioInsurance = next))
        }
    }

    fun recoverStolenAccount() {
        updateState { state ->
            if (state.cash < 2500.0) {
                showToast("Insufficient cash! Need $2,500.")
                state
            } else {
                showToast("Successfully reclaimed hacked social media accounts!")
                state.copy(cash = state.cash - 2500.0)
            }
        }
    }

    fun runUnderworldAction(actionType: String) {
        updateState { state ->
            when (actionType) {
                "stream_bot" -> {
                    if (state.cash < 3000.0) { showToast("Need $3,000"); return@updateState state }
                    showToast("Purchased artificial stream package. High detection risk!")
                    state.copy(cash = state.cash - 3000.0, popularity = (state.popularity + 4f).coerceAtMost(100f))
                }
                "smear_campaign" -> {
                    if (state.cash < 5000.0) { showToast("Need $5,000"); return@updateState state }
                    showToast("Launched anonymous smear campaign against industry rival.")
                    state.copy(cash = state.cash - 5000.0, industryRespect = (state.industryRespect - 5f).coerceAtLeast(0f))
                }
                "payola" -> {
                    if (state.cash < 8000.0) { showToast("Need $8,000"); return@updateState state }
                    showToast("Under-the-table radio payola payment delivered.")
                    state.copy(cash = state.cash - 8000.0, soundstreamMonthlyListeners = state.soundstreamMonthlyListeners + 5000)
                }
                "fake_hype" -> {
                    if (state.cash < 2000.0) { showToast("Need $2,000"); return@updateState state }
                    showToast("Purchased fake comments and astroturf engagement.")
                    state.copy(cash = state.cash - 2000.0, sentiment = state.sentiment.copy(followers = state.followers + 2500))
                }
                "chart_hack" -> {
                    if (state.cash < 15000.0) { showToast("Need $15,000"); return@updateState state }
                    showToast("Algorithmic playlist exploit triggered!")
                    state.copy(cash = state.cash - 15000.0, soundstreamMonthlyListeners = state.soundstreamMonthlyListeners + 25000)
                }
                else -> state
            }
        }
    }

    fun applyToWhoIsGotTalent() {
        updateState { state ->
            if (state.wgtApplied) {
                showToast("Already registered for Who Is Got Talent auditions!")
                state
            } else {
                val auditionWeek = if (state.currentWeek <= 20) 20 else 44
                val auditionYear = if (state.currentWeek <= 44) state.currentYear else state.currentYear + 1
                showToast("Application submitted! Auditions scheduled for Week $auditionWeek, Year $auditionYear.")
                val mail = MailMessage(
                    id = "wgt_confirm_" + java.util.UUID.randomUUID().toString().take(6),
                    sender = "Who Is Got Talent",
                    subject = "📺 Audition Confirmation: Week $auditionWeek",
                    body = "Congratulations ${state.artistName}!\\n\\nYour audition for Who Is Got Talent Season has been confirmed for Week $auditionWeek, Year $auditionYear.\\n\\nPrepare your best vocal & stage performance!",
                    type = "NORMAL",
                    expiresWeek = auditionWeek + 2,
                    expiresYear = auditionYear
                )
                state.copy(
                    webHub = state.webHub.copy(
                        wgtApplied = true,
                        wgtAuditionWeek = auditionWeek,
                        wgtAuditionYear = auditionYear
                    ),
                    mailbox = state.mailbox + mail
                )
            }
        }
    }

    fun submitDemoToApexRecords() {
        updateState { state ->
            showToast("Demo submitted to A&R executives at Apex Records.")
            state
        }
    }

    fun voteInOmegaElection(candidateId: String) {
        updateState { state ->
            showToast("Voted for $candidateId in the local municipal elections.")
            state
        }
    }

    fun executeBlackHatPurchase(itemId: String) {
        updateState { state ->
            runUnderworldAction(itemId)
            state
        }
    }

    fun requestGrandAwardsInvitation() {
        updateState { state ->
            showToast("Sent RSVP request for the Annual Music Awards Gala.")
            state
        }
    }

    fun paySccGovernmentFine() {
        updateState { state ->
            if (state.cash < 5000.0) {
                showToast("Insufficient funds to settle SCC compliance fine!")
                state
            } else {
                showToast("SCC compliance fine paid in full.")
                state.copy(cash = state.cash - 5000.0)
            }
        }
    }

    fun addHistoryEntryToState(state: GameStateEntity, entry: String): GameStateEntity {
        return state.copy(timelineEvents = listOf(entry) + state.timelineEvents)
    }

    fun simulateEmployeeWorkforce(state: GameStateEntity): GameStateEntity {
        return state
    }

    fun generateMonthlyFinancialReview(state: GameStateEntity, currentCash: Double, currentWeeklyCashFlow: Double): String {
        return "Monthly Financial Review: Cash: \$$currentCash, Net Worth: \$${calculateNetWorth(state)}. Keep building sustainable wealth!"
    }

    fun simulateWorldEcosystem(
        state: GameStateEntity,
        reportBuilder: StringBuilder,
        updatedMail: MutableList<MailMessage>,
        finalNPCs: List<NPCEntity>
    ): Pair<GameStateEntity, List<NPCEntity>> {
        return Pair(state, finalNPCs)
    }
}
"""

    new_content = content + "\n" + methods_to_add
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w', encoding='utf-8') as f:
        f.write(new_content)
    print("Methods integrated into GameViewModel.kt successfully!")

if __name__ == '__main__':
    fix_viewmodel_methods()
