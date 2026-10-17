import re

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'r') as f:
    content = f.read()

old_stock_logic = """            // Introduce random corporate events to make companies feel alive
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
            }"""

new_stock_logic = """            // Independent Market Factors (Side Hustle Reality)
            var independentEvent = 0.0
            
            // 1. Sector-wide trends (unrelated to the player)
            val sectorTrend = when (stock.sector) {
                "Tech" -> Random.nextDouble(-1.5, 2.5) // Tech is volatile
                "Finance" -> Random.nextDouble(-1.0, 1.2) // Finance is stable
                "Entertainment" -> Random.nextDouble(-2.0, 2.0)
                "Retail" -> Random.nextDouble(-1.2, 1.5)
                else -> 0.0
            }
            independentEvent += sectorTrend
            
            // 2. NPC / Competitor Actions Impacting Market
            // Find a random top NPC in the game
            val topNpcs = state.npcs.sortedByDescending { it.popularity }.take(5)
            val randomRival = if (topNpcs.isNotEmpty()) topNpcs.random().name else "A major global superstar"
            
            if (Random.nextDouble() < 0.04) {
                if (stock.id == "stock_stream") {
                    independentEvent += 3.5
                    narrativeEventStr = "SoundStream stock jumped after $randomRival dropped a surprise album that broke streaming records."
                } else if (stock.sector == "Entertainment") {
                    independentEvent += 2.0
                    narrativeEventStr = "Entertainment sector boosted by $randomRival's massive world tour announcement."
                }
            }

            // 3. Random Corporate events (Company specific)
            if (Random.nextDouble() < 0.04) {
                val events = listOf(
                    Pair(-5.0, "${stock.name} shares tanked after a major CEO scandal was leaked to Pulsewire."),
                    Pair(-3.5, "${stock.name} faces severe supply chain shortages, missing quarterly revenue targets."),
                    Pair(6.0, "${stock.name} announced a surprise acquisition, sending the stock soaring!"),
                    Pair(4.0, "Strong earnings report from ${stock.name} beat Wall Street expectations."),
                    Pair(-2.5, "Regulatory crackdowns on the ${stock.sector} sector caused ${stock.name} to dip."),
                    Pair(3.0, "New product launch from ${stock.name} goes viral, boosting investor confidence.")
                )
                val event = events.random()
                independentEvent += event.first
                narrativeEventStr = event.second
            }
            
            // Combine all independent market forces (Dwarfing player influence so it feels like a side hustle)
            val totalIndependentShift = independentEvent
            """

content = content.replace(old_stock_logic, new_stock_logic)
content = content.replace("macroPct += (playerInfluence + corporateEvent)", "macroPct += (playerInfluence + totalIndependentShift)")

with open('app/src/main/java/com/example/data/MarketSimulationHelper.kt', 'w') as f:
    f.write(content)

print("Market simulation updated again!")
