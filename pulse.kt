        }
    }
}
@Composable
fun PulseWireNewsScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var selectedTab by remember { mutableStateOf("For You") }
    val tabs = listOf("For You", "Business", "Ecosystem", "Global")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D0D12))
            .padding(12.dp)
    ) {
        // News App Header Banner
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E28)),
            border = BorderStroke(1.dp, Color(0xFFE57373).copy(alpha = 0.4f)),
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(Color(0xFFE57373))
                        .align(Alignment.CenterVertically),
                    contentAlignment = Alignment.Center
                ) {
                    Text("P", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Black)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text("PULSEWIRE NEWS", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.5.sp)
                    Text("Your Independent Portal into the Music & Asset Ecosystem", color = Color.LightGray, fontSize = 9.sp)
                }
            }
        }

        // Live Ticker ticker scroll effect
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF15141D)),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color.Red)
                        .padding(horizontal = 5.dp, vertical = 2.dp)
                ) {
                    Text("LIVE", color = Color.White, fontSize = 8.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(8.dp))
                val tickerText = "MARKETS: ${state.economyCycle} cycle active | WEEKLY FUEL: $${String.format("%.2f", state.fuelPrice)}/L | INFLATION: ${String.format("%.1f", state.inflationRate * 100)}% | ELECTION: ${if (state.isElectionSeason) "ACTIVE" else "INACTIVE"}"
                Text(
                    text = tickerText,
                    color = Color.LightGray,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Medium
                )
            }
        }

        // Segment Tabs
        ScrollableTabRow(
            selectedTabIndex = tabs.indexOf(selectedTab),
            containerColor = Color.Transparent,
            contentColor = Color(0xFFE57373),
            edgePadding = 0.dp,
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp)
        ) {
            tabs.forEach { tabName ->
                Tab(
                    selected = selectedTab == tabName,
                    onClick = { selectedTab = tabName },
                    text = { Text(tabName, fontSize = 11.sp, fontWeight = FontWeight.Bold) }
                )
            }
        }
}

        // Dynamically generated articles feed based on selected tab
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f).fillMaxWidth()
        ) {
            val liveArticles = state.newsArticles.filter { 
                when (selectedTab) {
                    "Business" -> it.category.equals("Business", ignoreCase = true)
                    "Ecosystem" -> it.category.equals("Ecosystem", ignoreCase = true)
                    "Global" -> it.category.equals("Global", ignoreCase = true)
                    else -> it.category.equals("Music", ignoreCase = true) || it.category.equals("For You", ignoreCase = true)
                }
            }
            
            val articles = if (liveArticles.isNotEmpty()) {
                liveArticles.map {
                    val categoryTag = it.category.uppercase()
                    NewsArticleItem(
                        tag = categoryTag,
                        headline = it.headline,
                        subtitle = it.subtitle + "\n\n" + it.body,
                        time = "Week ${it.week}, Year ${it.year}",
                        author = it.author,
                        imageUrl = getNewsImageUrl(categoryTag)
                    )
                }
            } else {
                when (selectedTab) {
                    "Business" -> listOf(
                        NewsArticleItem(
                            tag = "BUSINESS / TAXES",
                            headline = if (state.taxDebt > 0.0) "IRS Delinquency Crackdown: Outstanding Artists Targeted!" else "Tax Champions: Financial Compliance Praised!",
                            subtitle = if (state.taxDebt > 0.0) "Tax liabilities of $${String.format("%,.2f", state.taxDebt)} detected. IRS hints at immediate 25% salary garnishments to recover debts." else "Keeping spotless tax ledgers has fully insulated compliant soundwrights from auditing waves sweeping major labels.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Financial Desk",
                            imageUrl = getNewsImageUrl("TAX")
                        ),
                        NewsArticleItem(
                            tag = "ECONOMY",
                            headline = "Economic Cyclical Forecast: ${state.economyCycle} Dynamics",
                            subtitle = "Leading venture analysts confirm inflation is hovering around ${String.format("%.1f", state.inflationRate * 100)}%, restricting touring models.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Alex Brody",
                            imageUrl = getNewsImageUrl("ECONOMY")
                        )
                    )
                    "Ecosystem" -> listOf(
                        NewsArticleItem(
                            tag = "STEWARDSHIP",
                            headline = if (state.titheDebt > 5000.0) "The Spiritual Cost of Neglect: High Spiritual Delinquency Warned!" else if (state.spiritualTotalTithesPaid > 5000.0) "Sacred Stewardship: Generous Artist Elevates Sanctuary!" else "Mindfulness Check: The Balance of Spiritual Health & Daily Chores",
                            subtitle = if (state.titheDebt > 5000.0) "Local clergy warns that holding $${String.format("%,.2f", state.titheDebt)} in unpaid spiritual obligations attracts severe professional friction, stress, and sets back creativity." else if (state.spiritualTotalTithesPaid > 5000.0) "Total spiritual contributions of $${String.format("%,.2f", state.spiritualTotalTithesPaid)} have unlocked protective blessings and raised public reputation." else "Modern songwriters highlight the correlation of daily meditation, spiritual care, and charitable acts with overall career longevity.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Soul & Spirit",
                            imageUrl = getNewsImageUrl("STEWARDSHIP")
                        ),
                        NewsArticleItem(
                            tag = "STAFF DEBATE",
                            headline = "PR Experts Endorse Dedicated Social Media Managers!",
                            subtitle = "Hiring a specialized Social Media Manager is now considered the most cost-effective mechanism to sustain trendscores and organic fan drift.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Olivia Pope",
                            imageUrl = getNewsImageUrl("STAFF")
                        )
                    )
                    "Global" -> listOf(
                        NewsArticleItem(
                            tag = "WORLD NEWS",
                            headline = "Fuel Prices and Travel Surcharges Mount Upward!",
                            subtitle = "With regional fuel prices standing at $${String.format("%.2f", state.fuelPrice)}/L, touring logistical managers are scrambling to optimize travel routes.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Logistics Daily",
                            imageUrl = getNewsImageUrl("WORLD")
                        ),
                        NewsArticleItem(
                            tag = "POLITICS",
                            headline = if (state.isElectionSeason) "Nation Braces for Tense Fictional Election Cycle!" else "Political Landscapes Stabilize Amid Consensus",
                            subtitle = if (state.isElectionSeason) "Electoral periods are causing volatile swings in consumer confidence indexes and ad bidding competition." else "Local policies shift focus toward environmental upkeep and professional development grants.",
                            time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                            author = "Pulse Polling",
                            imageUrl = getNewsImageUrl("POLITICS")
                        )
                    )
                    else -> {
                        // For You Tab (Mix of all relevant stories)
                        val list = mutableListOf<NewsArticleItem>()
                        list.add(
                            NewsArticleItem(
                                tag = "TRENDING NOW",
                                headline = "Artist ${state.artistName} Gains Modern Digital Traction",
                                subtitle = if (state.followers > 100000L) "With over ${state.followers} loyal followers online, the artist is carving out a major competitive advantage." else "Amateur acoustic sets and localized streaming rotations are laying down steady foundations for a potential breakthrough.",
                                time = "Week ${state.currentWeek}, Year ${state.currentYear}",
                                author = "Viral Radar",
                                imageUrl = getNewsImageUrl("TREND")
                            )
                        )
                        if (state.taxDebt > 10000.0) {
                            list.add(
                                NewsArticleItem(
                                    tag = "URGENT ALERTS",
                                    headline = "IRS Prepares Audit Files on Delinquent Entertainers",
                                    subtitle = "Unsettled tax obligations exceeding $10,000 are triggering warning protocols. Professional business managers urge rapid settlement.",
                                    time = "Week ${state.currentWeek}",
                                    author = "Tax Gazette",
                                    imageUrl = getNewsImageUrl("TAX")
                                )
                            )
                        }
                        if (state.titheDebt > 5000.0) {
                            list.add(
                                NewsArticleItem(
                                    tag = "FAITH & MIND",
                                    headline = "The Weight of Spiritual Friction on Artist Inspiration",
                                    subtitle = "Spiritual counselors warn of baseline stress elevation and happiness deficits for creators who neglect their spiritual communities.",
                                    time = "Week ${state.currentWeek}",
                                    author = "Stewardship News",
                                    imageUrl = getNewsImageUrl("STEWARDSHIP")
                                )
                            )
                        }
                        list
                    }
                }
            }

            items(articles) { article ->
                NewsArticleCard(item = article)
            }
        }
    }
}


// =================== AD COMPANY PROMOTION APP SCREEN ===================
@Composable
fun AdCompanyPromotionScreen(state: GameStateEntity, viewModel: GameViewModel) {
