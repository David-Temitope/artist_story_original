import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_mark_read = """    fun markMailAsRead(mailId: String) {
        updateState { state ->
            val updatedMailbox = state.mailbox.map {
                if (it.id == mailId) it.copy(isRead = true)
                else it
            }
            state.copy(mailbox = updatedMailbox)
        }
    }"""

new_mark_read = """    fun markMailAsRead(mailId: String) {
        updateState { state ->
            val updatedMailbox = state.mailbox.map {
                if (it.id == mailId) it.copy(isRead = true)
                else it
            }
            state.copy(mailbox = updatedMailbox)
        }
    }

    fun markAllMailAsRead() {
        updateState { state ->
            val updatedMailbox = state.mailbox.map {
                it.copy(isRead = true)
            }
            state.copy(mailbox = updatedMailbox)
        }
    }"""
content = content.replace(old_mark_read, new_mark_read)

# ALSO fix employee spam!
old_emp_logic = """            // If loyalty drops below 25, there's a chance they resign
            if (updatedLoyalty < 25f && kotlin.random.Random.nextFloat() < 0.15f) {
                reportBuilder.append("🚪 STAFF RESIGNATION: Your ${emp.role} (${emp.name}) resigned abruptly! Their loyalty dropped too low due to a lack of raises/bonuses or high greed.\\n")
                null // Will filter out nulls
            } else if (updatedLoyalty < 40f && kotlin.random.Random.nextFloat() < 0.10f) {
                // They demand a raise, we simulate it by sending a mail
                val demandMailId = "raise_demand_${kotlin.random.Random.nextInt(1000, 9999)}"
                mutMail.add(
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
            }"""

new_emp_logic = """            // If loyalty drops below 25, there's a chance they resign
            if (updatedLoyalty < 25f && kotlin.random.Random.nextFloat() < 0.15f) {
                reportBuilder.append("🚪 STAFF RESIGNATION: Your ${emp.role} (${emp.name}) resigned abruptly! Their loyalty dropped too low due to a lack of raises/bonuses or high greed.\\n")
                null // Will filter out nulls
            } else if (updatedLoyalty < 40f && kotlin.random.Random.nextFloat() < 0.03f) {
                // Check if they already sent a demand recently
                val hasPendingDemand = mutMail.any { it.sender.contains(emp.name) && !it.isRead }
                if (!hasPendingDemand) {
                    val demandMailId = "raise_demand_${kotlin.random.Random.nextInt(1000, 9999)}"
                    mutMail.add(
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
                }
                emp.copy(loyalty = updatedLoyalty)
            } else {
                emp.copy(loyalty = updatedLoyalty)
            }"""

content = content.replace(old_emp_logic, new_emp_logic)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)

# Update SmartphoneComponent.kt
with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    smart_content = f.read()

old_chips = """                AssistChip(
                    onClick = { },
                    label = { Text("Social", fontSize = 11.sp) },
                    colors = AssistChipDefaults.assistChipColors(
                        containerColor = Color.Transparent,
                        labelColor = Color.Gray
                    ),
                    border = BorderStroke(1.dp, Color(0xFF2C2C2C))
                )
            }"""

new_chips = """                AssistChip(
                    onClick = { },
                    label = { Text("Social", fontSize = 11.sp) },
                    colors = AssistChipDefaults.assistChipColors(
                        containerColor = Color.Transparent,
                        labelColor = Color.Gray
                    ),
                    border = BorderStroke(1.dp, Color(0xFF2C2C2C))
                )
                AssistChip(
                    onClick = { viewModel.markAllMailAsRead() },
                    label = { Text("Mark All Read", fontSize = 11.sp) },
                    colors = AssistChipDefaults.assistChipColors(
                        containerColor = Color.Transparent,
                        labelColor = Color(0xFF64B5F6)
                    ),
                    border = BorderStroke(1.dp, Color(0xFF2C2C2C))
                )
            }"""

smart_content = smart_content.replace(old_chips, new_chips)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(smart_content)

print("Mail logic updated!")
