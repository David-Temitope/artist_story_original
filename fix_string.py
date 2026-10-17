import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

# Replace actual newlines inside the body=" ... " strings with \n
# But wait, it's easier to just find the broken strings and fix them.

import re

# find all `body = "something` that spans multiple lines and fix it.
# Actually I'll just restore the election logic but with \\n.

replacement = """            if (currentWeekVal == 15) {
                // If player endorsed Sterling, his chance is 75%, otherwise 25% (if endorsed challenger) or 50%
                val sterlingChance = when (state.endorsedCandidateId) {
                    "gov_sterling", "npc_gov_sterling" -> 0.75
                    "gov_challenger", "npc_gov_challenger" -> 0.25
                    else -> 0.50
                }
                val sterlingWins = Math.random() < sterlingChance
                if (sterlingWins) {
                    if (state.endorsedCandidateId == "gov_sterling" || state.endorsedCandidateId == "npc_gov_sterling") {
                        newPoliticalTaxModifier = -0.06f // Tax drops to 6%
                        currentPopularity = (currentPopularity + 10f).coerceAtMost(100f)
                        currentIndustryRespect = (currentIndustryRespect + 15f).coerceAtMost(100f)
                        val electionEmail = MailMessage(
                            id = "gov_election_win_support_" + java.util.UUID.randomUUID().toString().take(6),
                            sender = "Governor Sterling",
                            subject = "🎉 VICTORY! Slashed Tax Rate Enacted!",
                            body = "My dear friend ${state.artistName},\\n\\nWE WON! Your endorsement was the turning point of this election. As promised, I have slashed your weekly income tax rate to 6%! You also gain +10% Popularity and +15% Industry Respect! Thank you again!\\n\\nBest,\\nGovernor Sterling",
                            type = "NORMAL",
                            expiresWeek = 18,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🗳 Governor Sterling won the election! Because you endorsed him, your tax rate is halved to 6%! Popularity (+10%) and Respect (+15%) boosted.\\n")
                    } else if (state.endorsedCandidateId == "gov_challenger" || state.endorsedCandidateId == "npc_gov_challenger") {
                        newPoliticalTaxModifier = 0.06f // Demands high tax rate: 18%
                        val electionEmail = MailMessage(
                            id = "gov_election_win_unsupport_" + java.util.UUID.randomUUID().toString().take(6),
                            sender = "Governor Sterling Office",
                            subject = "🏛 Regulatory Notice: Luxury Arts Tax Enacted",
                            body = "Dear ${state.artistName},\\n\\nGovernor Sterling has successfully secured re-election. Since you campaigned against him, we are enacting a high luxury compliance tax of 18% on your earnings. This is effective immediately.\\n\\nState Compliance Bureau",
                            type = "NORMAL",
                            expiresWeek = 18,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🗳 Governor Sterling won the election. Because you endorsed his opponent, his administration has raised your weekly tax rate to 18%.\\n")
                    } else {
                        newPoliticalTaxModifier = 0.0f
                        reportBuilder.append("🗳 Governor Sterling won the election. Tax rates remain normal.\\n")
                    }
                } else {
                    if (state.endorsedCandidateId == "gov_challenger" || state.endorsedCandidateId == "npc_gov_challenger") {
                        newPoliticalTaxModifier = -0.04f
                        currentPopularity = (currentPopularity + 20f).coerceAtMost(100f)
                        val electionEmail = MailMessage(
                            id = "gov_election_win_challenger",
                            sender = "Mayor Reyes",
                            subject = "Arts Funding Activated!",
                            body = "We did it! Thanks to your endorsement, I am the new Governor! Expect massive arts funding and a 4% tax cut for creatives!",
                            type = "NORMAL",
                            expiresWeek = 18,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🗳 Mayor Reyes won the election! Because you endorsed him, you gained 20% popularity and a tax cut.\\n")
                    } else {
                        newPoliticalTaxModifier = 0.0f
                        reportBuilder.append("🗳 Mayor Reyes won the election. Tax rates remain normal.\\n")
                    }
                }
            }

            if (currentWeekVal == 40) {
                val vanceChance = when (state.endorsedCandidateId) {
                    "sen_vance", "npc_sen_vance" -> 0.8
                    "sen_dawson", "npc_sen_dawson" -> 0.2
                    else -> 0.5
                }
                val vanceWins = Math.random() < vanceChance
                if (vanceWins) {
                    if (state.endorsedCandidateId == "sen_vance" || state.endorsedCandidateId == "npc_sen_vance") {
                        newPoliticalTaxModifier = -0.07f // Tax drops to 5%
                        currentPopularity = (currentPopularity + 15f).coerceAtMost(100f)
                        val electionEmail = MailMessage(
                            id = "pres_election_win_support_" + java.util.UUID.randomUUID().toString().take(6),
                            sender = "President Vance",
                            subject = "🇺🇸 VICTORY! Arts Support Platform Slashed Taxes to 5%!",
                            body = "My friend ${state.artistName},\\n\\nWe did it! I am officially the President-elect. To reward your loyalty, I have reduced your tax rate to 5%! You also receive a national popularity boost (+15%). Together, we thrive!\\n\\nPresident Vance",
                            type = "NORMAL",
                            expiresWeek = 44,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🇺🇸 President Vance won! Tax rate slashed to 5% and +15% Popularity!\\n")
                    } else if (state.endorsedCandidateId == "sen_dawson" || state.endorsedCandidateId == "npc_sen_dawson") {
                        newPoliticalTaxModifier = 0.08f
                        val electionEmail = MailMessage(
                            id = "pres_election_win_unsupport_" + java.util.UUID.randomUUID().toString().take(6),
                            sender = "IRS Regulatory Office",
                            subject = "🇺🇸 Audit: Entertainment Surcharge",
                            body = "President Vance has enacted the wealth distribution act. Due to your lack of support, you are now subject to a 20% tax bracket.\\n\\nIRS",
                            type = "NORMAL",
                            expiresWeek = 44,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🇺🇸 President Vance won. Your tax rate increased to 20%.\\n")
                    } else {
                        newPoliticalTaxModifier = 0.0f
                        reportBuilder.append("🇺🇸 President Vance won. Tax rates normal.\\n")
                    }
                } else {
                    if (state.endorsedCandidateId == "sen_dawson" || state.endorsedCandidateId == "npc_sen_dawson") {
                        newPoliticalTaxModifier = -0.05f
                        val electionEmail = MailMessage(
                            id = "pres_election_win_dawson",
                            sender = "President Dawson",
                            subject = "Corporate Subsidies",
                            body = "Thanks to your corporate endorsement, we've secured the win. Here is a massive tax cut and business permit for you.",
                            type = "NORMAL",
                            expiresWeek = 44,
                            expiresYear = state.currentYear
                        )
                        updatedMail.add(electionEmail)
                        reportBuilder.append("🇺🇸 President Dawson won! Tax rate slashed due to your endorsement.\\n")
                    } else {
                        newPoliticalTaxModifier = 0.0f
                        reportBuilder.append("🇺🇸 President Dawson won. Tax rates normal.\\n")
                    }
                }
            }"""

# Use regex to find and replace the broken block
text = re.sub(r'            if \(currentWeekVal == 15\) \{.*?                \}\n            \}', replacement, text, flags=re.DOTALL)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

