import re

print("Starting codebase update script...")

# 1. UPDATE GameViewModel.kt
with open("app/src/main/java/com/example/data/GameViewModel.kt", "r", encoding="utf-8", errors="surrogateescape") as f:
    vm_content = f.read()

# Replace initialPermissions
old_perm = """            val initialPermissions = when (role) {
                "Accountant" -> mapOf("auto_stocks" to false, "auto_rebalance" to false, "auto_tax" to false, "auto_savings" to false)
                "Crypto Analyst" -> mapOf("auto_crypto" to false)
                "Business Manager" -> mapOf("auto_contracts" to false)
                "PR Manager" -> mapOf("auto_social" to false)
                "Social Media Manager" -> mapOf("auto_post" to false, "auto_respond" to false)
                else -> emptyMap()
            }"""
new_perm = """            val initialPermissions = emptyMap<String, Boolean>()"""

if old_perm in vm_content:
    vm_content = vm_content.replace(old_perm, new_perm, 1)
    print("✓ Updated initialPermissions in GameViewModel")
else:
    print("! Could not find initialPermissions")

# Update acceptMail FEATURE handling
old_feature_accept = """            } else if (mail.type == "FEATURE") {
                updatedCash += mail.cashOffer
                updatedInfluence = (state.influence + 8f).coerceAtMost(100f)
                showToast("Accepted feature collaboration! Earned $${String.format("%.2f", mail.cashOffer)}!")"""

new_feature_accept = """            } else if (mail.type == "FEATURE") {
                updatedCash += mail.cashOffer
                updatedInfluence = (state.influence + 8f).coerceAtMost(100f)
                val peer = state.npcs.find { it.name == mail.sender || it.id == mail.labelId }
                if (peer != null) {
                    updatedNPCs = updatedNPCs.map { n ->
                        if (n.id == peer.id) n.copy(relationshipWithPlayer = (n.relationshipWithPlayer + 15f).coerceAtMost(100f))
                        else n
                    }
                    showToast("Accepted feature collaboration with ${peer.name}! Earned $${String.format(\"%.2f\", mail.cashOffer)} and boosted relationship!")
                } else {
                    showToast("Accepted feature collaboration! Earned $${String.format(\"%.2f\", mail.cashOffer)}!")
                }"""

if old_feature_accept in vm_content:
    vm_content = vm_content.replace(old_feature_accept, new_feature_accept, 1)
    print("✓ Updated acceptMail FEATURE handling")
else:
    print("! Could not find acceptMail FEATURE")

# Update deleteMail and add helper methods
old_del = """    fun deleteMail(mailId: String) {
        updateState { state ->
            state.copy(mailbox = state.mailbox.filter { it.id != mailId })
        }
    }"""

new_del_and_methods = """    fun markMailAsRead(mailId: String) {
        updateState { state ->
            val updatedMailbox = state.mailbox.map {
                if (it.id == mailId) it.copy(isRead = true)
                else it
            }
            state.copy(mailbox = updatedMailbox)
        }
    }

    fun deleteMail(mailId: String) {
        updateState { state ->
            val targetMail = state.mailbox.find { it.id == mailId }
            var updatedNpcs = state.npcs
            if (targetMail != null && targetMail.type == "FEATURE" && !targetMail.isAccepted) {
                val peer = state.npcs.find { it.name == targetMail.sender || it.id == targetMail.labelId }
                if (peer != null) {
                    updatedNpcs = state.npcs.map { n ->
                        if (n.id == peer.id) n.copy(relationshipWithPlayer = (n.relationshipWithPlayer - 5f).coerceAtLeast(0f))
                        else n
                    }
                }
            }
            state.copy(
                mailbox = state.mailbox.filter { it.id != mailId },
                npcs = updatedNpcs
            )
        }
    }

    fun toggleFollowNpcArtist(npcId: String) {
        updateState { state ->
            val npc = state.npcs.find { it.id == npcId } ?: return@updateState state
            val willFollow = !npc.isFollowedByPlayer
            val updatedNpcs = state.npcs.map {
                if (it.id == npcId) {
                    val relDelta = if (willFollow) 6f else -3f
                    it.copy(
                        isFollowedByPlayer = willFollow,
                        relationshipWithPlayer = (it.relationshipWithPlayer + relDelta).coerceIn(0f, 100f)
                    )
                } else it
            }
            val toastMsg = if (willFollow) "Followed ${npc.name}! Relationship +6%." else "Unfollowed ${npc.name}."
            showToast(toastMsg)

            val newCastPosts = if (willFollow) {
                val samplePost = CastPost(
                    id = java.util.UUID.randomUUID().toString().take(6),
                    authorName = npc.name,
                    authorHandle = "@${npc.name.lowercase().replace(" ", "")}",
                    content = "${npc.bestSongTitle} session was crazy this week! Big love to all the supporters 🎧🔥",
                    likes = (npc.fans * 0.05f).toLong().coerceAtLeast(120L),
                    reposts = (npc.fans * 0.015f).toLong().coerceAtLeast(25L),
                    commentsCount = (npc.fans * 0.01f).toLong().coerceAtLeast(18L),
                    week = state.currentWeek,
                    year = state.currentYear,
                    isByPlayer = false
                )
                listOf(samplePost) + state.castPosts
            } else state.castPosts

            state.copy(npcs = updatedNpcs, castPosts = newCastPosts)
        }
    }

    fun incrementCastTimeSpent(seconds: Int = 1) {
        updateState { state ->
            state.copy(castTimeSpentThisWeek = state.castTimeSpentThisWeek + seconds)
        }
    }

    fun setCastNicheFocus(niche: String) {
        updateState { state ->
            state.copy(castNicheFocus = niche)
        }
    }"""

if old_del in vm_content:
    vm_content = vm_content.replace(old_del, new_del_and_methods, 1)
    print("✓ Replaced deleteMail & added Cast / Read methods in GameViewModel")
else:
    print("! Could not find deleteMail in GameViewModel")

# Update FEATURE generation to pick from actual state.npcs
old_feature_gen = """            val isFeatureReady = state.fans >= 20_000L && state.popularity >= 25f && releasedSongs.size >= 2 && totalStreams >= 15_000L
            if (isFeatureReady && Random.nextFloat() > 0.72f) {
                val feeOffer = Random.nextDouble(4000.0, 18000.0)
                val peerName = listOf("Nova Kane", "Jordan Vance", "Elena Vance", "Dante Cross", "Aria Fox", "Marcus Sterling").random()
                updatedMail.add(
                    MailMessage(
                        id = UUID.randomUUID().toString(),
                        sender = peerName,
                        subject = "Collaboration Feature Inquiry: $peerName",
                        body = "Hello ${state.artistName},\\n\\nI've been listening to your recent releases and respect your sound. I'm finishing a single for my next project and would like to feature you as a guest artist. We have budgeted a $${String.format(\"%.2f\", feeOffer)} collaboration fee. Let me know if you're interested.",
                        type = "FEATURE",
                        cashOffer = feeOffer,
                        expiresWeek = state.currentWeek + 3,
                        expiresYear = state.currentYear
                    )
                )
                reportBuilder.append("✉️ New Mail: Collaboration inquiry received from $peerName in your Mailbox.\\n")
            }"""

new_feature_gen = """            val isFeatureReady = state.fans >= 20_000L && state.popularity >= 25f && releasedSongs.size >= 2 && totalStreams >= 15_000L
            if (isFeatureReady && Random.nextFloat() > 0.72f) {
                val feeOffer = Random.nextDouble(4000.0, 18000.0)
                val peerArtist = state.npcs.filter { !it.isRetired && it.popularity >= 20f }.randomOrNull() ?: state.npcs.randomOrNull()
                val peerName = peerArtist?.name ?: "Jordan Cole"
                val peerId = peerArtist?.id
                updatedMail.add(
                    MailMessage(
                        id = UUID.randomUUID().toString(),
                        sender = peerName,
                        subject = "Collaboration Feature Inquiry: $peerName",
                        body = "Hello ${state.artistName},\\n\\nI've been listening to your recent releases and respect your sound. I'm finishing a single for my next project and would like to feature you as a guest artist. We have budgeted a $${String.format(\"%.2f\", feeOffer)} collaboration fee. Let me know if you're interested.",
                        type = "FEATURE",
                        cashOffer = feeOffer,
                        expiresWeek = state.currentWeek + 3,
                        expiresYear = state.currentYear,
                        labelId = peerId
                    )
                )
                reportBuilder.append("✉️ New Mail: Collaboration inquiry received from $peerName in your Mailbox.\\n")
            }"""

if old_feature_gen in vm_content:
    vm_content = vm_content.replace(old_feature_gen, new_feature_gen, 1)
    print("✓ Updated FEATURE mail generation in GameViewModel")
else:
    print("! Could not find FEATURE mail generation")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w", encoding="utf-8", errors="surrogateescape") as f:
    f.write(vm_content)

print("GameViewModel update done.")
