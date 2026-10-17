fun uploadSong(songId: String, platformId: String) {
    updateState { state ->
        val updatedSongs = state.songs.map { song ->
            if (song.id == songId) {
                val newMap = song.isUploadedMap.toMutableMap()
                if (!newMap.containsKey(platformId)) {
                    newMap[platformId] = 0L
                }
                song.copy(isUploadedMap = newMap)
            } else song
        }
        showToast("Song uploaded successfully!")
        state.copy(songs = updatedSongs)
    }
}

fun promoteSongCastSocial(songId: String) {
    val cost = 250.0
    updateState { state ->
        if (state.cash >= cost) {
            showToast("Promoted on CastSocial!")
            state.copy(cash = state.cash - cost, fans = state.fans + 1500)
        } else {
            showToast("Not enough cash!")
            state
        }
    }
}

fun promoteSongMeTubeTeaser(songId: String) {
    val cost = 500.0
    updateState { state ->
        if (state.cash >= cost) {
            showToast("MeTube Teaser launched!")
            state.copy(cash = state.cash - cost, fans = state.fans + 3500)
        } else {
            showToast("Not enough cash!")
            state
        }
    }
}

fun promoteSongAdCampaign(songId: String) {
    val cost = 1000.0
    updateState { state ->
        if (state.cash >= cost) {
            showToast("Ad Campaign launched!")
            state.copy(cash = state.cash - cost, fans = state.fans + 8000)
        } else {
            showToast("Not enough cash!")
            state
        }
    }
}

fun promoteSongRadioInterview(songId: String) {
    val cost = 1500.0
    updateState { state ->
        if (state.cash >= cost) {
            showToast("Radio Interview completed!")
            state.copy(cash = state.cash - cost, fans = state.fans + 15000)
        } else {
            showToast("Not enough cash!")
            state
        }
    }
}

fun promoteTour(tourId: String, amount: Double) {
    updateState { state ->
        if (state.cash >= amount) {
            val updatedTours = state.activeTours.map { tour ->
                if (tour.id == tourId) tour.copy(promotionBudget = tour.promotionBudget + amount) else tour
            }
            showToast("Tour promoted!")
            state.copy(cash = state.cash - amount, activeTours = updatedTours)
        } else {
            showToast("Not enough cash!")
            state
        }
    }
}
}
