import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    content = f.read()

pattern = r"    fun compileAndReleaseAlbum\(title: String, isEP: Boolean, songIds: List<String>, marketingTier: String\).*?(?=\n    fun releaseProject\()|(?=\n    fun createDraftTour\()"
# Let's just find the start and end of compileAndReleaseAlbum.
start_idx = content.find("    fun compileAndReleaseAlbum(title: String, isEP: Boolean, songIds: List<String>, marketingTier: String) {")
if start_idx != -1:
    end_idx = content.find("    // --- Hyper-Realistic Tour Booker App ---", start_idx)
    
    if end_idx != -1:
        # replace everything in between
        new_block = """    fun compileAndReleaseAlbum(title: String, isEP: Boolean, songIds: List<String>, marketingTier: String) {
        val marketingCost = when (marketingTier) {
            "Budget" -> 1500.0
            "Standard" -> 5000.0
            "Cinematic" -> 15000.0
            "Global Campaign" -> 40000.0
            else -> 0.0
        }

        updateState { state ->
            if (state.energy < 40) {
                showToast("Not enough energy (40 required) to compile and launch an album!")
                return@updateState state
            }
            if (state.cash < marketingCost) {
                showToast("Insufficient cash for the selected marketing tier!")
                return@updateState state
            }

            val requiredSongCount = if (isEP) 3..5 else 8..14
            if (songIds.size !in requiredSongCount) {
                val typeStr = if (isEP) "EP" else "Album"
                showToast("An ${typeStr} requires ${requiredSongCount.first} to ${requiredSongCount.last} songs! You selected ${songIds.size}.")
                return@updateState state
            }

            val selectedSongs = state.songs.filter { it.id in songIds }
            if (selectedSongs.size != songIds.size) {
                showToast("Error finding selected songs!")
                return@updateState state
            }
            
            var totalPriorStreams = 0L
            selectedSongs.forEach { song ->
                if (song.isUploadedMap.isNotEmpty()) {
                    totalPriorStreams += song.isUploadedMap.values.sum()
                }
            }
            
            val streamBonusHype = (totalPriorStreams / 100_000f).coerceIn(0f, 30f)
            val initialAvgRating = selectedSongs.map { it.rating }.average().toFloat()

            val genreGroups = selectedSongs.groupBy { it.genreId }
            val primaryGenreCount = genreGroups.values.maxOfOrNull { it.size } ?: 0
            val isCohesive = primaryGenreCount.toFloat() / selectedSongs.size >= 0.75f
            val cohesionBonus = if (isCohesive) 0.4f else -0.3f
            val highQualityBonus = selectedSongs.count { it.soundEngineerQuality == "Expert" || it.soundEngineerQuality == "Legendary" } * 0.05f
            val finalRating = (initialAvgRating + cohesionBonus + highQualityBonus).coerceIn(1.0f, 5.0f)
            val acclaimBase = finalRating * 20f
            val acclaimNoise = kotlin.random.Random.nextInt(-6, 6)
            val finalAcclaim = (acclaimBase + acclaimNoise).coerceIn(10f, 100f)

            val reviewList = mutableListOf<String>()
            val artistName = state.artistName
            if (finalRating >= 4.2f) {
                reviewList.add("★ A masterpiece! @$artistName has woven a rich, coherent tapestry of sound with unmatched flow.")
                reviewList.add("★ The synergy on '${title}' is absolute. A standout release that will define this year.")
            } else if (finalRating >= 3.0f) {
                reviewList.add("★ A solid effort. While some tracks feel like filler, standout singles anchor the tracklist nicely.")
                reviewList.add("★ Enjoyable and structurally sound, showing clear artistic maturity from @$artistName.")
            } else {
                reviewList.add("★ A disjointed compilation. The track progression feels chaotic, and several tracks lack sonic polish.")
                reviewList.add("★ Highly erratic. We expected more cohesive storytelling, but the execution falls flat.")
            }

            val tierHype = when (marketingTier) {
                "Budget" -> 25f
                "Standard" -> 60f
                "Cinematic" -> 150f
                "Global Campaign" -> 350f
                else -> 10f
            }
            val finalHype = tierHype + (state.popularity * 0.5f) + streamBonusHype
            val albumIsGood = initialAvgRating > 3.5f

            val newAlbum = Album(
                id = java.util.UUID.randomUUID().toString().take(6),
                title = title,
                isEP = isEP,
                songIds = songIds,
                weekCreated = state.currentWeek,
                yearCreated = state.currentYear,
                rating = finalRating,
                criticalAcclaim = finalAcclaim,
                isReleased = true,
                hype = finalHype,
                price = if (isEP) 4.99 else 9.99,
                marketingTier = marketingTier,
                reviews = reviewList
            )

            val albumUpdatedSongs = state.songs.map { song ->
                if (song.id in songIds) {
                    var newIsUploadedMap = if (song.isUploadedMap.isEmpty()) mapOf("tunes" to 100L) else song.isUploadedMap
                    if (albumIsGood && song.isUploadedMap.isNotEmpty()) {
                        newIsUploadedMap = newIsUploadedMap.mapValues { (_, streams) -> (streams * 1.15).toLong() }
                    }
                    song.copy(
                        isReleased = true,
                        weeksUntilRelease = 0,
                        isUploadedMap = newIsUploadedMap,
                        totalStreams = newIsUploadedMap.values.sum()
                    )
                } else song
            }

            val typeStr = if (isEP) "EP" else "Album"
            val eventStr = "Year ${state.currentYear}, Week ${state.currentWeek}: Released ${typeStr} '${title}' (${String.format("%.1f", finalRating)}⭐) to critical acclaim!"
            var labelBonus = 0.0
            if (state.signedLabelId != null) {
                labelBonus = if (isEP) 8000.0 else 25000.0
            }

            showToast("Successfully compiled and launched ${typeStr} '${title}'!")

            state.copy(
                energy = state.energy - 40,
                cash = state.cash - marketingCost + (labelBonus * (1f - state.signedLabelCut)),
                songs = albumUpdatedSongs,
                albums = state.albums + newAlbum,
                signedLabelDeliveredAlbumsLP = if (state.signedLabelId != null && !isEP) state.signedLabelDeliveredAlbumsLP + 1 else state.signedLabelDeliveredAlbumsLP,
                signedLabelDeliveredAlbumsEP = if (state.signedLabelId != null && isEP) state.signedLabelDeliveredAlbumsEP + 1 else state.signedLabelDeliveredAlbumsEP,
                timelineEvents = state.timelineEvents + eventStr,
                criticalAcclaim = (state.criticalAcclaim + (finalRating * 1.5f)).coerceAtMost(100f)
            )
        }
    }
"""
        content = content[:start_idx] + new_block + content[end_idx:]
        with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
            f.write(content)
        print("Replaced completely.")
    else:
        print("End not found")
else:
    print("Start not found")
