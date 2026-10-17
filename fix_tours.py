import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_tour_logic = """                        val labelTouringMult = if (state.ownLabel != null) 1.0 + (state.ownLabel.touringLevel * 0.05) else 1.0
                        val earnings = (finalAttendance * tour.payPerAttendee) * labelTouringMult
                        tourPayout += earnings

                        if (eventEffect == "LOCKDOWN") {
                            reportBuilder.append("🎤 Tour (${tour.title} - Week $currentWeekPlus/${tour.totalWeeks}): Suspended due to Pandemic Lockdown! 0 attendees.\\n")
                        } else {
                            reportBuilder.append("🎤 Tour (${tour.title} - Week $currentWeekPlus/${tour.totalWeeks}): $finalAttendance fans attended! Net tour pay: $${String.format("%,.2f", earnings)}.\\n")
                        }"""

new_tour_logic = """                        val grossTourRevenue = finalAttendance * tour.payPerAttendee
                        // Realistic Economics: Venue & Promoter Cuts (typically 25-40% of gross)
                        val venueAndPromoterCut = grossTourRevenue * (kotlin.random.Random.nextFloat() * 0.15 + 0.25)
                        
                        // Realistic Economics: Touring Expenses (Travel, Crew, Production, Hotels, Gear)
                        val fixedTourCosts = when (tour.level) {
                            "Simple" -> 1500.0
                            "Pro" -> 15000.0
                            "Premium" -> 150000.0
                            else -> 1000.0
                        }
                        val variableExpenses = finalAttendance * (tour.payPerAttendee * 0.35) // 35% of ticket price goes to running the show
                        val totalTourExpenses = venueAndPromoterCut + fixedTourCosts + variableExpenses

                        var netTourEarnings = grossTourRevenue - totalTourExpenses
                        if (netTourEarnings < 0) {
                            netTourEarnings = 0.0 // Often minimum guarantees protect artists from going entirely negative per show
                        }

                        val labelTouringMult = if (state.ownLabel != null) 1.0 + (state.ownLabel.touringLevel * 0.05) else 1.0
                        val finalEarnings = netTourEarnings * labelTouringMult
                        tourPayout += finalEarnings

                        if (eventEffect == "LOCKDOWN") {
                            reportBuilder.append("🎤 Tour (${tour.title} - Week $currentWeekPlus/${tour.totalWeeks}): Suspended due to Pandemic Lockdown! 0 attendees.\\n")
                        } else {
                            reportBuilder.append("🎤 Tour (${tour.title} - Week $currentWeekPlus/${tour.totalWeeks}): $finalAttendance fans attended.\\n")
                            if (finalAttendance > 0) {
                                reportBuilder.append("   Gross Box Office: $${String.format("%,.2f", grossTourRevenue)}\\n")
                                reportBuilder.append("   Venue/Promo Cuts: $${String.format("%,.2f", venueAndPromoterCut)} | Prod & Travel Expenses: $${String.format("%,.2f", fixedTourCosts + variableExpenses)}\\n")
                                reportBuilder.append("   Net Tour Profit: $${String.format("%,.2f", finalEarnings)}.\\n")
                            }
                        }"""

if old_tour_logic in content:
    content = content.replace(old_tour_logic, new_tour_logic)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Tour logic updated!")
else:
    print("Old tour logic block not found!")
