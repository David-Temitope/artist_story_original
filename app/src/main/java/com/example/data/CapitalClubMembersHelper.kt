package com.example.data

fun getInitialCapitalClubMembers(): List<CapitalClubMember> {
    return listOf(
        CapitalClubMember(
            id = "cc_1", name = "Camila Valenti", age = 26, gender = "Female", title = "Venture Capitalist",
            matchPct = "98%", tag = "WEALTH", imageUrl = "https://images.unsplash.com/photo-1524504388940-b1c1722653e1?q=80&w=1440&h=2560&fit=crop", quote = "I invest in futures, not pasts.",
            tags = listOf("Ambitious", "Networking", "Finance"), synergyText = "+15% Business Revenue"
        ),
        CapitalClubMember(
            id = "cc_2", name = "Nathaniel Pierce", age = 29, gender = "Male", title = "Tech Founder",
            matchPct = "94%", tag = "INNOVATION", imageUrl = "https://images.unsplash.com/photo-1506794778202-cad84cf45f1d?q=80&w=1440&h=2560&fit=crop", quote = "Innovation is my passion.",
            tags = listOf("Visionary", "Workaholic", "Crypto"), synergyText = "+10% Tech Growth"
        ),
        CapitalClubMember(
            id = "cc_3", name = "Sienna Rossi", age = 24, gender = "Female", title = "Supermodel",
            matchPct = "89%", tag = "FAME", imageUrl = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?q=80&w=1440&h=2560&fit=crop", quote = "The runway is just a stepping stone.",
            tags = listOf("Fashion", "High Profile", "Glamour"), synergyText = "+25% Public Image"
        ),
        CapitalClubMember(
            id = "cc_4", name = "Marcus Thorne", age = 31, gender = "Male", title = "Architectural Designer",
            matchPct = "87%", tag = "ART", imageUrl = "https://images.unsplash.com/photo-1519085360753-af0119f7cbe7?q=80&w=1440&h=2560&fit=crop", quote = "I see elegance in structural lines.",
            tags = listOf("Creative", "Moody", "Design"), synergyText = "+20% Luxury Appeal"
        ),
        CapitalClubMember(
            id = "cc_5", name = "Harper Montgomery", age = 25, gender = "Female", title = "Art Gallerist & Curator",
            matchPct = "92%", tag = "ART", imageUrl = "https://images.unsplash.com/photo-1517841905240-472988babdf9?q=80&w=1440&h=2560&fit=crop", quote = "True beauty speaks directly to the soul.",
            tags = listOf("Cultured", "Passionate", "Curator"), synergyText = "+15% Social Prestige"
        ),
        CapitalClubMember(
            id = "cc_6", name = "Seraphina Dubois", age = 27, gender = "Female", title = "Creative Director",
            matchPct = "91%", tag = "CREATIVE", imageUrl = "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?q=80&w=1440&h=2560&fit=crop", quote = "Aesthetics and authenticity inspire me.",
            tags = listOf("Design", "Visuals", "Introvert"), synergyText = "+10% Creative Energy"
        ),
        CapitalClubMember(
            id = "cc_7", name = "Evelyn Hayes", age = 28, gender = "Female", title = "Couture Fashion Designer",
            matchPct = "95%", tag = "STYLE", imageUrl = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?q=80&w=1440&h=2560&fit=crop", quote = "Style is a way to say who you are without words.",
            tags = listOf("Chic", "Ambitious", "Creative"), synergyText = "+15% Merch Revenue"
        ),
        CapitalClubMember(
            id = "cc_8", name = "Lucas Sterling", age = 27, gender = "Male", title = "Sports Medicine Specialist",
            matchPct = "88%", tag = "WELLNESS", imageUrl = "https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?q=80&w=1440&h=2560&fit=crop", quote = "Dedication and wellness create longevity.",
            tags = listOf("Athletic", "Dedicated", "Loyal"), synergyText = "+15% Health & Energy"
        ),
        CapitalClubMember(
            id = "cc_9", name = "Isabella Laurent", age = 25, gender = "Female", title = "Philanthropist & Curator",
            matchPct = "90%", tag = "FAME", imageUrl = "https://images.unsplash.com/photo-1524250502761-1ac6f2e30d43?q=80&w=1440&h=2560&fit=crop", quote = "Giving back makes every achievement meaningful.",
            tags = listOf("Extrovert", "Warm", "Connected"), synergyText = "+15% Brand Respect"
        )
    )
}
