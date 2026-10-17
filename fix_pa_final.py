import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

pa_logic = """
            // Personal Assistant Proactive Logic
            val pa = state.hiredEmployees.find { it.role == "Personal Assistant" }
            if (pa != null) {
                val emailsToSummarize = updatedMail.filter { !it.isAccepted && !it.isRead && it.type == "NORMAL" }
                if (emailsToSummarize.size >= 3) {
                    updatedMail.removeAll(emailsToSummarize)
                    val summaryText = emailsToSummarize.joinToString(separator = "\\n- ") { "${it.subject} (from ${it.sender})" }
                    val summaryEmail = MailMessage(
                        id = "pa_summary_${System.currentTimeMillis()}",
                        sender = pa.name + " (Personal Assistant)",
                        subject = "Weekly Email Summary",
                        body = "Boss, here is a summary of the emails you received while you were busy:\\n\\n- $summaryText\\n\\nI've archived the originals for you to keep your inbox clean.",
                        type = "NORMAL",
                        expiresWeek = nextWeek + 4,
                        expiresYear = nextYear
                    )
                    updatedMail.add(0, summaryEmail)
                }
            }

            _weeklyReport.value = reportBuilder.toString()
"""

text = text.replace("_weeklyReport.value = reportBuilder.toString()", pa_logic)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

