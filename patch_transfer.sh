sed -i 's/"Liquid Cash" -> {/"Liquid Cash", "CASH" -> {/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Savings Account", "High-Yield Savings" -> {/"Savings Account", "High-Yield Savings", "SAVINGS" -> {/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Payroll Reserve" -> {/"Payroll Reserve", "PAYROLL" -> {/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Business Reserve" -> {/"Business Reserve", "BUSINESS" -> {/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Emergency Fund" -> {/"Emergency Fund", "EMERGENCY" -> {/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Liquid Cash" -> newCash += amount/"Liquid Cash", "CASH" -> newCash += amount/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Savings Account", "High-Yield Savings" -> newSavings += amount/"Savings Account", "High-Yield Savings", "SAVINGS" -> newSavings += amount/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Payroll Reserve" -> newPayroll += amount/"Payroll Reserve", "PAYROLL" -> newPayroll += amount/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Business Reserve" -> newBusiness += amount/"Business Reserve", "BUSINESS" -> newBusiness += amount/g' app/src/main/java/com/example/data/GameViewModel.kt
sed -i 's/"Emergency Fund" -> newEmergency += amount/"Emergency Fund", "EMERGENCY" -> newEmergency += amount/g' app/src/main/java/com/example/data/GameViewModel.kt
