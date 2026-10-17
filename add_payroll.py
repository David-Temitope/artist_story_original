import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_payroll = """            val totalMaintenance = carMaintenance + houseMaintenance
            
            // Subsystem Weekly Costs
            val securityCompanyWeeklyCost = if (isAegis) 15000.0 else if (isVanguard) 5000.0 else 0.0
            val scholarshipWeeklyCost = if (state.hasScholarships) 7500.0 else 0.0
            val mansionPropertyTax = if (state.ownedHouses.any { it.id == "house_mansion" }) 1500.0 else 0.0
            
            val totalWeeklyOutflow = baseCostOfLiving + totalMaintenance + mortgagePayment + securityCompanyWeeklyCost + scholarshipWeeklyCost + mansionPropertyTax
            
            updatedCash -= totalWeeklyOutflow
            reportBuilder.append("🏠 Weekly Expenses: Paid $${String.format("%,.2f", baseCostOfLiving)} basic living costs (reflecting Year ${state.currentYear} inflation).\\n")"""

new_payroll = """            val totalMaintenance = carMaintenance + houseMaintenance
            
            // Subsystem Weekly Costs
            val securityCompanyWeeklyCost = if (isAegis) 15000.0 else if (isVanguard) 5000.0 else 0.0
            val scholarshipWeeklyCost = if (state.hasScholarships) 7500.0 else 0.0
            val mansionPropertyTax = if (state.ownedHouses.any { it.id == "house_mansion" }) 1500.0 else 0.0
            
            // Employee Payroll Processing
            val totalPayroll = state.hiredEmployees.sumOf { it.weeklySalary }
            
            val totalWeeklyOutflow = baseCostOfLiving + totalMaintenance + mortgagePayment + securityCompanyWeeklyCost + scholarshipWeeklyCost + mansionPropertyTax + totalPayroll
            
            updatedCash -= totalWeeklyOutflow
            reportBuilder.append("🏠 Weekly Expenses: Paid $${String.format("%,.2f", baseCostOfLiving)} basic living costs (reflecting Year ${state.currentYear} inflation).\\n")
            if (totalPayroll > 0.0) {
                reportBuilder.append("💼 Payroll: Paid $${String.format("%,.2f", totalPayroll)} in weekly salaries to your ${state.hiredEmployees.size} staff members.\\n")
            }"""

if old_payroll in content:
    content = content.replace(old_payroll, new_payroll)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Payroll added!")
else:
    print("Old payroll logic block not found!")
