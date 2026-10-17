import sys

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r', encoding='utf-8') as f:
    text = f.read()

s_cry = text.find('// First: Scan all cryptos for profit margin auto-selling based on strategy style')
e_cry = text.find('"PR Manager" -> {', s_cry)

new_crypto_trading = '''// Skill-driven Crypto Management: Skill rating dictates timing, risk controls, and scaling
                        val crySkill = emp.skillRatingPercent / 100f
                        
                        // First: Scan all cryptos for smart selling / profit-taking / stop-loss
                        mutCryptos.forEachIndexed { idx, cr ->
                            if (cr.quantity > 0.0) {
                                val basePrice = if (cr.averagePurchasePrice > 0.0) cr.averagePurchasePrice else (GameData.CRYPTOS.find { it.id == cr.id }?.currentPrice ?: cr.currentPrice)
                                val profitRatio = (cr.currentPrice - basePrice) / basePrice
                                val actualTrendDropped = cr.currentPrice < (cr.history.lastOrNull() ?: cr.currentPrice)
                                
                                // Higher skill analyst accurately forecasts trend reversals
                                val predictPriceDrop = if (emp.skillRatingPercent >= 65) {
                                    if (Random.nextFloat() < (0.45f + 0.50f * crySkill)) actualTrendDropped else !actualTrendDropped
                                } else {
                                    Random.nextBoolean() // low skill guessing
                                }
                                
                                var shouldSellFull = false
                                var shouldScaleOutPartial = false
                                var sellReason = ""
                                
                                when {
                                    // 1. Low skill (<60%): Poor discipline, panic sells at small dip or greedily holds until massive crash
                                    emp.skillRatingPercent < 60 -> {
                                        if (profitRatio <= -0.05 && Random.nextFloat() < 0.60f) {
                                            shouldSellFull = true
                                            sellReason = "amateur panic-sold at minor dip (-5%)"
                                        } else if (profitRatio >= 0.80) {
                                            shouldSellFull = true
                                            sellReason = "amateur exited at high surge (+80%)"
                                        }
                                    }
                                    // 2. High/Elite Skill (>=80%): Advanced scaling out, tight protection, and intelligent top-taking
                                    emp.skillRatingPercent >= 80 -> {
                                        if (profitRatio <= -0.08) {
                                            shouldSellFull = true
                                            sellReason = "elite protective stop-loss (-8% threshold)"
                                        } else if (profitRatio >= 0.50) {
                                            shouldScaleOutPartial = true
                                            sellReason = "elite scaling: locked in 50% partial profits on massive rally (+50%)"
                                        } else if (profitRatio >= 0.20 && predictPriceDrop) {
                                            shouldScaleOutPartial = true
                                            sellReason = "elite predictive forecast: scaled out 50% ahead of forecasted dip"
                                        } else if (profitRatio >= state.cryptoAutoSellProfitMargin.toDouble().coerceAtLeast(0.20)) {
                                            shouldSellFull = true
                                            sellReason = "reached optimal target margin (${(state.cryptoAutoSellProfitMargin * 100).toInt()}%)"
                                        }
                                    }
                                    // 3. Mid Skill (60-79%): Standard disciplined rules
                                    else -> {
                                        if (profitRatio <= -0.15) {
                                            shouldSellFull = true
                                            sellReason = "disciplined stop-loss (-15% threshold)"
                                        } else if (profitRatio >= state.cryptoAutoSellProfitMargin.toDouble().coerceAtLeast(0.20)) {
                                            shouldSellFull = true
                                            sellReason = "reached target margin (${(state.cryptoAutoSellProfitMargin * 100).toInt()}%)"
                                        }
                                    }
                                }
                                
                                if (shouldScaleOutPartial && cr.quantity > 0.0001) {
                                    val sellQty = cr.quantity * 0.50
                                    val payout = cr.currentPrice * sellQty
                                    newSavingsBalance += payout
                                    reportBuilder.append("🪙 Smart Partial Profit: Crypto Analyst ${emp.name} (${emp.skillRatingPercent}% Skill) scaled out ${String.format("%.4f", sellQty)} coins of ${cr.name} at $${String.format("%.2f", cr.currentPrice)} ($sellReason, payout: $${String.format("%,.2f", payout)})! Remaining holding retained for upside.\\n")
                                    historyLog.add("Week ${state.currentWeek}: Analyst scaled out ${String.format("%.4f", sellQty)} of ${cr.name} for $${String.format("%.2f", payout)}.")
                                    mutCryptos[idx] = cr.copy(quantity = cr.quantity - sellQty)
                                } else if (shouldSellFull) {
                                    val payout = cr.currentPrice * cr.quantity
                                    newSavingsBalance += payout
                                    reportBuilder.append("🪙 Auto Selling: Crypto Analyst ${emp.name} (${emp.skillRatingPercent}% Skill) liquidated ${String.format("%.4f", cr.quantity)} coins of ${cr.name} at $${String.format("%.2f", cr.currentPrice)} ($sellReason, payout: $${String.format("%,.2f", payout)})!\\n")
                                    historyLog.add("Week ${state.currentWeek}: Analyst auto-sold ${String.format("%.4f", cr.quantity)} coins of ${cr.name} for $${String.format("%.2f", payout)}.")
                                    mutCryptos[idx] = cr.copy(quantity = 0.0)
                                }
                            }
                        }
                        
                        // Second: Smart Buying - High skill buys dips, low skill buys randomly
                        if (emp.permissions["auto_crypto"] == true) {
                            val targetCoin = when {
                                emp.skillRatingPercent >= 80 -> {
                                    // Elite: Buy the coin that had a pullback (dip buying) or high stability
                                    mutCryptos.minByOrNull { it.currentPrice / (it.history.lastOrNull() ?: it.currentPrice) } ?: coin
                                }
                                emp.skillRatingPercent >= 60 -> {
                                    // Mid: Balanced
                                    mutCryptos.find { it.riskLevel != "Extreme" } ?: coin
                                }
                                else -> {
                                    // Low skill: Random or FOMO buys whatever is most expensive
                                    mutCryptos.random()
                                }
                            }
                            
                            val cost = newSavingsBalance * state.cryptoAutoInvestPercent.toDouble()
                            val qty = if (targetCoin.currentPrice > 0.0) cost / targetCoin.currentPrice else 0.0
                            if (cost > 0.0 && qty > 0.0) {
                                if (newSavingsBalance >= cost) {
                                    newSavingsBalance -= cost
                                    
                                    val oldTotalCost = targetCoin.averagePurchasePrice * targetCoin.quantity
                                    val newCostValue = targetCoin.currentPrice * qty
                                    val newQty = targetCoin.quantity + qty
                                    val newAvgPrice = if (newQty > 0.0) (oldTotalCost + newCostValue) / newQty else 0.0
                                    
                                    val updatedCoinObj = targetCoin.copy(quantity = newQty, averagePurchasePrice = newAvgPrice)
                                    val index = mutCryptos.indexOfFirst { it.id == targetCoin.id }
                                    if (index != -1) mutCryptos[index] = updatedCoinObj
                                    
                                    reportBuilder.append("🔔 Auto Investing: Crypto Analyst ${emp.name} (${emp.skillRatingPercent}% Skill) purchased ${String.format("%.4f", qty)} of ${targetCoin.name} for $${String.format("%.2f", cost)} using ${(state.cryptoAutoInvestPercent * 100).toInt()}% of Bank funds!\\n")
                                    historyLog.add("Week ${state.currentWeek}: Executed automated crypto purchase of ${String.format("%.4f", qty)} of ${targetCoin.name}.")
                                } else {
                                    val alertEmail = MailMessage(
                                        id = "funding_needed_crypto_" + java.util.UUID.randomUUID().toString().take(6),
                                        sender = "${emp.name} (Crypto Analyst)",
                                        subject = "⚠️ Bank Balance Low - Crypto Funding Required",
                                        body = "Hi ${state.artistName},\\n\\nI wanted to purchase our automated portfolio coins, but our Apex Bank balance is insufficient ($${String.format("%,.2f", newSavingsBalance)}). Please deposit funds into your Savings account so we can resume weekly crypto investments.",
                                        type = "NORMAL",
                                        expiresWeek = state.currentWeek + 2,
                                        expiresYear = state.currentYear
                                    )
                                    updatedMailList.add(alertEmail)
                                }
                            }
                        }
                    }
                }
                '''

if s_cry != -1 and e_cry != -1:
    text = text[:s_cry] + new_crypto_trading + text[e_cry:]
    print('Updated Crypto Analyst trading algorithms successfully!')
else:
    print('WARN: Crypto Analyst range not found')

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w', encoding='utf-8') as f:
    f.write(text)
