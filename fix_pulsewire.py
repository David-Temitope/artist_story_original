import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    text = f.read()

replacement = """    private fun generateWeeklyNewsArticles(
        nextWeek: Int,
        nextYear: Int,
        highestTrendPercent: Float,
        trendSubgenreName: String,
        trendGenreName: String,
        economyCycle: String,
        inflationRate: Float,
        fuelPrice: Float,
        isElectionSeason: Boolean,
        sentimentInfo: MarketSentimentInfo
    ): MutableList<NewsArticle> {
        val uniqueStories = listOf(
            Triple("STUDIO BRAWL: WHO THREW THE FIRST PUNCH?", "Behind the scenes at Sector 4 recording facility: ego clashes and master tape disputes.", "Gossip"),
            Triple("TOP 10 GEAR TO BOOST PRODUCTION", "The renaissance of analog polyphonic synths in modern chart-topping records.", "Tech"),
            Triple("THE GHOSTWRITER EXPOSED", "A prominent A-list artist has been caught using secret ghostwriters for their latest album.", "Gossip"),
            Triple("FESTIVAL CHAOS", "Massive storm destroys the main stage at Desert Vibes festival, causing millions in damages.", "Industry"),
            Triple("STREAMING ROYALTIES PROTEST", "Independent artists form a union outside Apex Tower, demanding fair pay per stream.", "Industry"),
            Triple("AI GENERATED MUSIC ON THE RISE", "Is artificial intelligence threatening the livelihood of session musicians? We investigate.", "Tech"),
            Triple("LUXURY CARS & BROKEN HEARTS", "A rising star's public breakup involves a smashed exotic hypercar. Exclusive photos inside.", "Gossip"),
            Triple("VINTAGE MIC SOLD FOR $1M", "An anonymous buyer acquires the legendary U47 used in classic 60s hits.", "Tech")
        )
        val uniqueStory = uniqueStories.random()

        return mutableListOf(
            // 1. Music / Trend Article
            NewsArticle(
                id = "news_trend_${nextWeek}_${nextYear}",
                headline = "🔥 Viral Trend: $trendSubgenreName is Dominating Playlists!",
                subtitle = "PulseWire analytics show players who record in $trendSubgenreName ($trendGenreName) receive a massive 150% discovery boost on streaming channels.",
                body = "Mainstream tastemakers and streaming algorithms have aligned to push independent $trendSubgenreName releases into viral stardom! Industry executives confirm that public demand for $trendGenreName has surged to a record high of ${highestTrendPercent}% this week. Artists who produce and release $trendSubgenreName singles or albums during this peak period are guaranteed massive promotional multiplier boosts, potentially gaining thousands of organic streams. Hit the studio and record in the $trendGenreName genre today to ride this wave!",
                author = "Marcus Vance",
                outlet = "Billboard Daily",
                category = "Music",
                coverImageId = "https://source.unsplash.com/random/400x300?music,concert&sig=${System.currentTimeMillis()}_1",
                week = nextWeek,
                year = nextYear
            ),
            // 2. Business / Economic Article
            NewsArticle(
                id = "news_biz_${nextWeek}_${nextYear}",
                headline = "Market Pulse: Investor Sentiment Registers ${sentimentInfo.label} (${sentimentInfo.score}/100)",
                subtitle = "Macro cycle is $economyCycle with inflation at ${String.format("%.1f", inflationRate * 100)}% and fuel at $${String.format("%.2f", fuelPrice)}/L.",
                body = "Global equities and digital asset trading desks report that market sentiment is currently '${sentimentInfo.label}' with an index score of ${sentimentInfo.score}/100. ${sentimentInfo.summary} Chief financial strategists advise: '${sentimentInfo.actionableTip}' Meanwhile, disciplined investors continue anchoring portfolios with dependable weekly cash dividends from commercial real estate and established distribution firms.",
                author = "Sarah Sterling",
                outlet = "Financial Desk",
                category = "Business",
                coverImageId = "https://source.unsplash.com/random/400x300?business,finance&sig=${System.currentTimeMillis()}_2",
                week = nextWeek,
                year = nextYear
            ),
            // 3. Unique Weekly Story
            NewsArticle(
                id = "news_unique_${nextWeek}_${nextYear}",
                headline = uniqueStory.first,
                subtitle = uniqueStory.second,
                body = "This week in the entertainment world: ${uniqueStory.second}. This story has the whole industry talking, setting social media feeds on fire and shaking up the status quo.",
                author = "Pulsewire Staff",
                outlet = "Industry Insider",
                category = uniqueStory.third,
                coverImageId = "https://source.unsplash.com/random/400x300?${uniqueStory.third.lowercase()}&sig=${System.currentTimeMillis()}_3",
                week = nextWeek,
                year = nextYear
            )
        )
    }"""

text = re.sub(r'    private fun generateWeeklyNewsArticles.*?        \)\n    \}', replacement, text, flags=re.DOTALL)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(text)

