fun uploadSong(songId: String, platformId: String) {
    _state.update { state ->
        val updatedSongs = state.songs.map { song ->
            if (song.id == songId) {
                val newMap = song.isUploadedMap.toMutableMap()
                if (!newMap.containsKey(platformId)) {
                    newMap[platformId] = 0L
                }
                song.copy(isUploadedMap = newMap)
            } else song
        }
        state.copy(songs = updatedSongs)
    }
}

fun promoteSongCastSocial(songId: String) {
    val cost = 250.0
    _state.update { state ->
        if (state.cash >= cost) {
            val updatedSongs = state.songs.map { song ->
                if (song.id == songId) song.copy(marketingBudget = song.marketingBudget + cost) else song
            }
            state.copy(cash = state.cash - cost, songs = updatedSongs)
        } else state
    }
}

fun promoteSongMeTubeTeaser(songId: String) {
    val cost = 500.0
    _state.update { state ->
        if (state.cash >= cost) {
            val updatedSongs = state.songs.map { song ->
                if (song.id == songId) song.copy(marketingBudget = song.marketingBudget + cost) else song
            }
            state.copy(cash = state.cash - cost, songs = updatedSongs)
        } else state
    }
}

fun promoteSongAdCampaign(songId: String) {
    val cost = 1000.0
    _state.update { state ->
        if (state.cash >= cost) {
            val updatedSongs = state.songs.map { song ->
                if (song.id == songId) song.copy(marketingBudget = song.marketingBudget + cost) else song
            }
            state.copy(cash = state.cash - cost, songs = updatedSongs)
        } else state
    }
}

fun promoteSongRadioInterview(songId: String) {
    val cost = 1500.0
    _state.update { state ->
        if (state.cash >= cost) {
            val updatedSongs = state.songs.map { song ->
                if (song.id == songId) song.copy(marketingBudget = song.marketingBudget + cost) else song
            }
            state.copy(cash = state.cash - cost, songs = updatedSongs)
        } else state
    }
}

fun promoteTour(tourId: String, amount: Double) {
    _state.update { state ->
        if (state.cash >= amount) {
            val updatedTours = state.activeTours.map { tour ->
                if (tour.id == tourId) tour.copy(marketingBudget = tour.marketingBudget + amount) else tour
            }
            state.copy(cash = state.cash - amount, activeTours = updatedTours)
        } else state
    }
}
