with open("app/src/main/java/com/example/data/GameViewModel.kt", "r", encoding="utf-8") as f:
    vm_text = f.read()

# Fix voiceSkill / writingSkill, artistName, and postActionFeedback calls in GameViewModel.kt
vm_text = vm_text.replace("val vocalSkill = state.vocalSkill", "val vocalSkill = state.voiceSkill")
vm_text = vm_text.replace("val lyricsSkill = state.lyricsSkill", "val lyricsSkill = state.writingSkill")
vm_text = vm_text.replace("state.playerName", "state.artistName")

# Fix postActionFeedback calls
vm_text = vm_text.replace("""                postActionFeedback(
                    ActionFeedback(
                        id = java.util.UUID.randomUUID().toString(),
                        title = "Apex Records Demo Accepted",
                        subtitle = "Check your Email inbox to review and sign the contract offer.",
                        deltas = listOf(
                            StatFeedbackItem("A&R Rating", "${String.format("%.1f", songRating)} / 5.0", true, "skill"),
                            StatFeedbackItem("Contract Offer", "$${String.format("%,.0f", advanceOffer)} Advance", true, "money")
                        )
                    )
                )""", """                postActionFeedback(
                    title = "Apex Records Demo Accepted",
                    subtitle = "Check your Email inbox to review and sign the contract offer.",
                    deltas = listOf(
                        StatFeedbackItem("A&R Rating", "${String.format("%.1f", songRating)} / 5.0", true, "skill"),
                        StatFeedbackItem("Contract Offer", "$${String.format("%,.0f", advanceOffer)} Advance", true, "money")
                    )
                )""")

vm_text = vm_text.replace("""            postActionFeedback(
                ActionFeedback(
                    id = java.util.UUID.randomUUID().toString(),
                    title = "Ballot Cast: Omega Elections",
                    subtitle = "Voted for $candidateName ($candidateParty)",
                    deltas = listOf(
                        StatFeedbackItem("Civic Reliability", "+3%", true, "general"),
                        StatFeedbackItem("Public Image", "+3%", true, "image")
                    )
                )
            )""", """            postActionFeedback(
                title = "Ballot Cast: Omega Elections",
                subtitle = "Voted for $candidateName ($candidateParty)",
                deltas = listOf(
                    StatFeedbackItem("Civic Reliability", "+3%", true, "general"),
                    StatFeedbackItem("Public Image", "+3%", true, "image")
                )
            )""")

vm_text = vm_text.replace("""                postActionFeedback(
                    ActionFeedback(
                        id = java.util.UUID.randomUUID().toString(),
                        title = "Black Hat: $itemName",
                        subtitle = "Encrypted routing successful. No State Crime Command flags.",
                        deltas = listOf(
                            StatFeedbackItem("Asset Delivered", itemName, true, "general"),
                            StatFeedbackItem("Escrow Paid", "-$${String.format("%,.0f", cost)}", false, "money")
                        )
                    )
                )""", """                postActionFeedback(
                    title = "Black Hat: $itemName",
                    subtitle = "Encrypted routing successful. No State Crime Command flags.",
                    deltas = listOf(
                        StatFeedbackItem("Asset Delivered", itemName, true, "general"),
                        StatFeedbackItem("Escrow Paid", "-$${String.format("%,.0f", cost)}", false, "money")
                    )
                )""")

vm_text = vm_text.replace("""                postActionFeedback(
                    ActionFeedback(
                        id = java.util.UUID.randomUUID().toString(),
                        title = "🚨 BUSTED BY STATE CRIME COMMAND",
                        subtitle = "Tracked on bh.online! Listed on SCC Most Wanted database.",
                        deltas = listOf(
                            StatFeedbackItem("Business Trust", "-50%", false, "image"),
                            StatFeedbackItem("Integrity", "-50%", false, "image"),
                            StatFeedbackItem("Discipline", "-50%", false, "stress"),
                            StatFeedbackItem("Fans & Followers", "-35%", false, "fans"),
                            StatFeedbackItem("SCC Fine Required", "$45,000", false, "money")
                        )
                    )
                )""", """                postActionFeedback(
                    title = "🚨 BUSTED BY STATE CRIME COMMAND",
                    subtitle = "Tracked on bh.online! Listed on SCC Most Wanted database.",
                    deltas = listOf(
                        StatFeedbackItem("Business Trust", "-50%", false, "image"),
                        StatFeedbackItem("Integrity", "-50%", false, "image"),
                        StatFeedbackItem("Discipline", "-50%", false, "stress"),
                        StatFeedbackItem("Fans & Followers", "-35%", false, "fans"),
                        StatFeedbackItem("SCC Fine Required", "$45,000", false, "money")
                    )
                )""")

vm_text = vm_text.replace("""            postActionFeedback(
                ActionFeedback(
                    id = java.util.UUID.randomUUID().toString(),
                    title = "SCC Record Expunged",
                    subtitle = "Government settlement fine paid. Commercial restrictions lifted.",
                    deltas = listOf(
                        StatFeedbackItem("Civic Clearance", "EXPUNGED", true, "general"),
                        StatFeedbackItem("Fine Paid", "-$${String.format("%,.0f", state.sccFineAmount)}", false, "money"),
                        StatFeedbackItem("Integrity Restored", "+15%", true, "image")
                    )
                )
            )""", """            postActionFeedback(
                title = "SCC Record Expunged",
                subtitle = "Government settlement fine paid. Commercial restrictions lifted.",
                deltas = listOf(
                    StatFeedbackItem("Civic Clearance", "EXPUNGED", true, "general"),
                    StatFeedbackItem("Fine Paid", "-$${String.format("%,.0f", state.sccFineAmount)}", false, "money"),
                    StatFeedbackItem("Integrity Restored", "+15%", true, "image")
                )
            )""")

vm_text = vm_text.replace("""                postActionFeedback(
                    ActionFeedback(
                        id = java.util.UUID.randomUUID().toString(),
                        title = "The Grand Awards: VIP Credentialed",
                        subtitle = "Access granted to the Annual Gala & Laureate Ceremony.",
                        deltas = listOf(
                            StatFeedbackItem("VIP Access", "APPROVED", true, "general"),
                            StatFeedbackItem("Industry Respect", "+5%", true, "skill"),
                            StatFeedbackItem("Public Image", "+5%", true, "image")
                        )
                    )
                )""", """                postActionFeedback(
                    title = "The Grand Awards: VIP Credentialed",
                    subtitle = "Access granted to the Annual Gala & Laureate Ceremony.",
                    deltas = listOf(
                        StatFeedbackItem("VIP Access", "APPROVED", true, "general"),
                        StatFeedbackItem("Industry Respect", "+5%", true, "skill"),
                        StatFeedbackItem("Public Image", "+5%", true, "image")
                    )
                )""")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w", encoding="utf-8") as f:
    f.write(vm_text)

# Fix SmartphoneComponent.kt
with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8") as f:
    sc_text = f.read()

sc_text = sc_text.replace("state.playerName", "state.artistName")
sc_text = sc_text.replace("state.vocalSkill", "state.voiceSkill")
sc_text = sc_text.replace("state.lyricsSkill", "state.writingSkill")
sc_text = sc_text.replace("song.genre", "song.genreId")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8") as f:
    f.write(sc_text)

print("Fields updated in GameViewModel and SmartphoneComponent!")
