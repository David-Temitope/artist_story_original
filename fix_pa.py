import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

# Add PA summarize logic at the end of progressToNextWeek
pa_logic = """
            // Personal Assistant Proactive Logic
            val pa = state.hiredEmployees.find { it.role == "Personal Assistant" }
            if (pa != null) {
                val emailsToSummarize = updatedMail.filter { !it.isAccepted }
                if (emailsToSummarize.size >= 3) {
                    updatedMail.removeAll(emailsToSummarize)
                    val summaryText = emailsToSummarize.joinToString(separator = "\\n- ") { "${it.subject} (from ${it.sender})" }
                    val summaryEmail = Email(
                        id = "pa_summary_${System.currentTimeMillis()}",
                        sender = pa.name + " (Personal Assistant)",
                        subject = "Weekly Email Summary",
                        body = "Boss, here is a summary of the emails you received while you were busy:\\n\\n- $summaryText\\n\\nI've archived the originals for you.",
                        date = "Week ${state.currentWeek}, Year ${state.currentYear}",
                        type = "Standard"
                    )
                    updatedMail.add(0, summaryEmail)
                }
            }
"""

text = text.replace("            // End of week summary notification", pa_logic + "\n            // End of week summary notification")

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

