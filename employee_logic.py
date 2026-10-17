import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_employee_code = """            currentWorkLifeBalance = (currentWorkLifeBalance - (totalStressLoad * 1.5f)).coerceIn(0f, 100f)"""

new_employee_code = """            // --- EMPLOYEE LOYALTY & DEMANDS ---
            var updatedEmployees = state.hiredEmployees.map { emp ->
                var updatedLoyalty = emp.loyalty
                // Loyalty decays naturally depending on the employee's greed vs their salary/artist wealth
                val greedDecay = (emp.greed / 100f) * 1.5f
                updatedLoyalty = (updatedLoyalty - greedDecay).coerceAtLeast(0f)
                
                // If loyalty drops below 25, there's a chance they resign
                if (updatedLoyalty < 25f && kotlin.random.Random.nextFloat() < 0.15f) {
                    reportBuilder.append("🚪 STAFF RESIGNATION: Your ${emp.role} (${emp.name}) resigned abruptly! Their loyalty dropped too low due to a lack of raises/bonuses or high greed.\\n")
                    null // Will filter out nulls
                } else if (updatedLoyalty < 40f && kotlin.random.Random.nextFloat() < 0.10f) {
                    // They demand a raise, we simulate it by sending a mail
                    val demandMailId = "raise_demand_${kotlin.random.Random.nextInt(1000, 9999)}"
                    updatedMail.add(
                        MailMessage(
                            id = demandMailId,
                            sender = "${emp.name} (${emp.role})",
                            subject = "Important: Compensation Review",
                            body = "Dear ${state.artistName},\\n\\nI've been working hard in my role as ${emp.role}, but market rates are higher than my current salary of $${String.format("%,.0f", emp.weeklySalary)}. If you don't grant me a raise or a bonus via the Team tab soon, I'll have to explore other opportunities.\\n\\nRegards,\\n${emp.name}",
                            type = "NORMAL",
                            expiresWeek = state.currentWeek + 4,
                            expiresYear = state.currentYear
                        )
                    )
                    emp.copy(loyalty = updatedLoyalty)
                } else {
                    emp.copy(loyalty = updatedLoyalty)
                }
            }.filterNotNull()

            currentWorkLifeBalance = (currentWorkLifeBalance - (totalStressLoad * 1.5f)).coerceIn(0f, 100f)"""

if old_employee_code in content:
    content = content.replace(old_employee_code, new_employee_code)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Employee logic added!")
else:
    print("Old employee block not found!")
