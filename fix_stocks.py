import re

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'r') as f:
    content = f.read()

old_stock_logic = """        val updatedStocks = state.stocks.map { stock ->
            val cfg = stockConfigs[stock.id] ?: StockConfig(stock.currentPrice.coerceAtLeast(20.0), stock.sector, 1.0, 15.0, "Stable")
            val initialBase = if (stock.initialPrice > 0.0) stock.initialPrice else cfg.anchorPrice
            val currentATH = maxOf(stock.allTimeHigh, stock.currentPrice, initialBase)

            val healthDrift = when (cfg.health) {
                "Strong" -> Random.nextDouble(1.0, 3.2)
                "Stable" -> Random.nextDouble(0.5, 2.0)
                else -> Random.nextDouble(-0.5, 1.5)
            }

            val macroPct = when (economyCycle) {
                "Boom" -> Random.nextDouble(1.0, 3.5) * cfg.beta
                "Stable Growth" -> Random.nextDouble(0.3, 1.8) * cfg.beta
                "Inflation Peak" -> Random.nextDouble(-1.5, 0.6) * cfg.beta
                "Recession" -> Random.nextDouble(-2.6, 0.3) * cfg.beta
                "Depression" -> Random.nextDouble(-3.8, 0.0) * cfg.beta
                else -> 0.0
            }

            val operationalNoise = Random.nextDouble(-2.2, 3.4)"""

new_stock_logic = """        val updatedStocks = state.stocks.map { stock ->
            val cfg = stockConfigs[stock.id] ?: StockConfig(stock.currentPrice.coerceAtLeast(20.0), stock.sector, 1.0, 15.0, "Stable")
            val initialBase = if (stock.initialPrice > 0.0) stock.initialPrice else cfg.anchorPrice
            val currentATH = maxOf(stock.allTimeHigh, stock.currentPrice, initialBase)

            val healthDrift = when (cfg.health) {
                "Strong" -> Random.nextDouble(1.0, 3.2)
                "Stable" -> Random.nextDouble(0.5, 2.0)
                else -> Random.nextDouble(-0.5, 1.5)
            }

            var macroPct = when (economyCycle) {
                "Boom" -> Random.nextDouble(1.0, 3.5) * cfg.beta
                "Stable Growth" -> Random.nextDouble(0.3, 1.8) * cfg.beta
                "Inflation Peak" -> Random.nextDouble(-1.5, 0.6) * cfg.beta
                "Recession" -> Random.nextDouble(-2.6, 0.3) * cfg.beta
                "Depression" -> Random.nextDouble(-3.8, 0.0) * cfg.beta
                else -> 0.0
            }

            // --- LIVING WORLD SIMULATION IMPULSES ---
            // Let player actions and game world events impact the stock market!
            var playerInfluence = 0.0
            var narrativeEventStr = ""
            
            // If the player is a global superstar, their streams alone can prop up digital streaming stocks
            if (stock.id == "stock_stream" && state.soundstreamMonthlyListeners > 10_000_000) {
                playerInfluence += 2.0
                if (Random.nextDouble() < 0.1) narrativeEventStr = "SoundStream stock surged following record-breaking streaming numbers."
            }
            // If the player is on a massive tour, live events / creative real estate sees a boost
            if (stock.id == "stock_space" && state.tours.any { it.status == "ACTIVE" && it.tier == "STADIUM" }) {
                playerInfluence += 1.5
                if (Random.nextDouble() < 0.1) narrativeEventStr = "Creative Real Estate spiked thanks to massive stadium tour demands."
            }
            // If the player just bought heavily into a stock, the market reacts to the celebrity endorsement
            if (stock.quantity > 5000 && Random.nextDouble() < 0.05) {
                playerInfluence += 3.0
                narrativeEventStr = "Retail investors flooded ${stock.name} after noticing a celebrity whale taking a huge position."
            }
            
            // Introduce random corporate events to make companies feel alive
            var corporateEvent = 0.0
            if (Random.nextDouble() < 0.03) {
                val events = listOf(
                    Pair(-4.0, "${stock.name} shares tanked after CEO scandal leaks."),
                    Pair(-3.0, "${stock.name} faces supply chain shortages, missing quarterly targets."),
                    Pair(5.0, "${stock.name} announced a surprise merger, sending stock soaring!"),
                    Pair(3.5, "Strong earnings report from ${stock.name} beat Wall Street expectations.")
                )
                val event = events.random()
                corporateEvent = event.first
                narrativeEventStr = event.second
            }
            
            if (narrativeEventStr.isNotEmpty() && !reportBuilder.contains(narrativeEventStr)) {
                reportBuilder.append("📈 MARKET ALERT: $narrativeEventStr\\n")
            }

            macroPct += (playerInfluence + corporateEvent)
            
            val operationalNoise = Random.nextDouble(-2.2, 3.4)"""

content = content.replace(old_stock_logic, new_stock_logic)

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'w') as f:
    f.write(content)

print("Market simulation updated!")
