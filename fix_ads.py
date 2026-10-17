import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    vm_content = f.read()

pattern = r"    fun toggleAdCampaign\(campaignId: String\) \{.*?state\.copy\(activeAdCampaigns = updated\)\n        \}\n    \}"

new_ad_methods = """    fun haltAdCampaign(campaignId: String) {
        updateState { state ->
            showToast("Campaign stopped.")
            state.copy(activeAdCampaigns = state.activeAdCampaigns.filter { it.id != campaignId })
        }
    }

    fun launchAdCampaign(agencyId: String, targetSongId: String) {
        updateState { state ->
            val cost = when (agencyId) {
                "beatwave" -> 8000.0
                "starvision" -> 22000.0
                "urban" -> 6500.0
                "soundspot" -> 4200.0
                else -> 0.0
            }
            if (state.adCompanyBudget < cost) {
                showToast("Insufficient ad budget! Need $$${String.format("%,.0f", cost)}")
                return@updateState state
            }
            val targetSong = state.releasedSongs.find { it.id == targetSongId }
            val songName = targetSong?.title ?: "Unknown Song"
            showToast("Launched $agencyId for $songName!")
            val newCamp = AdCampaign(
                id = java.util.UUID.randomUUID().toString(),
                agencyId = agencyId,
                agencyName = when (agencyId) {
                    "beatwave" -> "BeatWave Media"
                    "starvision" -> "StarVision TV"
                    "urban" -> "UrbanBillboards"
                    "soundspot" -> "SoundSpot Radio"
                    else -> "Generic"
                },
                targetType = "SONG",
                targetId = targetSongId,
                weeklyBudget = cost,
                durationWeeks = 4,
                weeksRemaining = 4,
                objective = "STREAMS",
                estimatedReachPerWeek = 5000L
            )
            state.copy(activeAdCampaigns = state.activeAdCampaigns + newCamp, adCompanyBudget = state.adCompanyBudget - cost)
        }
    }"""

if re.search(pattern, vm_content, re.DOTALL):
    vm_content = re.sub(pattern, new_ad_methods, vm_content, flags=re.DOTALL)
    with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
        f.write(vm_content)
    print("GameViewModel updated via regex.")
else:
    print("Pattern not found!")

