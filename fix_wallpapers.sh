#!/bin/bash

# 1. Update GameViewModel.kt to have a helper function
cat << 'INNER_EOF' > app/src/main/java/com/example/data/CapitalClubMembersHelper.kt
package com.example.data

fun getInitialCapitalClubMembers(): List<CapitalClubMember> {
    return listOf(
        CapitalClubMember(
            id = "cc_1", name = "Victoria Sterling", age = 26, gender = "Female", title = "Venture Capitalist",
            matchPct = "98%", tag = "WEALTH", imageUrl = "https://images.unsplash.com/photo-1524504388940-b1c1722653e1?q=80&w=1440&h=2560&fit=crop", quote = "I invest in futures, not pasts.",
            tags = listOf("Ambitious", "Networking", "Finance"), synergyText = "+15% Business Revenue"
        ),
        CapitalClubMember(
            id = "cc_2", name = "Julian Vance", age = 29, gender = "Male", title = "Tech Entrepreneur",
            matchPct = "94%", tag = "INNOVATION", imageUrl = "https://images.unsplash.com/photo-1506794778202-cad84cf45f1d?q=80&w=1440&h=2560&fit=crop", quote = "Disruption is my love language.",
            tags = listOf("Visionary", "Workaholic", "Crypto"), synergyText = "+10% App Monetization"
        ),
        CapitalClubMember(
            id = "cc_3", name = "Sienna Rossi", age = 24, gender = "Female", title = "Supermodel",
            matchPct = "89%", tag = "FAME", imageUrl = "https://images.unsplash.com/photo-1534528741775-53994a69daeb?q=80&w=1440&h=2560&fit=crop", quote = "The runway is just a stepping stone.",
            tags = listOf("Fashion", "High Profile", "Glamour"), synergyText = "+25% Public Image"
        ),
        CapitalClubMember(
            id = "cc_4", name = "Marcus Thorne", age = 31, gender = "Male", title = "Film Director",
            matchPct = "87%", tag = "ART", imageUrl = "https://images.unsplash.com/photo-1519085360753-af0119f7cbe7?q=80&w=1440&h=2560&fit=crop", quote = "I see the world in cinematic cuts.",
            tags = listOf("Creative", "Moody", "Hollywood"), synergyText = "+20% Music Video Quality"
        ),
        CapitalClubMember(
            id = "cc_5", name = "Chloe Bloom", age = 23, gender = "Female", title = "Pop Sensation",
            matchPct = "92%", tag = "MUSIC", imageUrl = "https://images.unsplash.com/photo-1517841905240-472988babdf9?q=80&w=1440&h=2560&fit=crop", quote = "Melodies are the rhythm of my heart.",
            tags = listOf("Vocalist", "Energetic", "Touring"), synergyText = "+10% Music Streams"
        ),
        CapitalClubMember(
            id = "cc_6", name = "Aria Nova", age = 27, gender = "Female", title = "Digital Artist",
            matchPct = "91%", tag = "CREATIVE", imageUrl = "https://images.unsplash.com/photo-1529626455594-4ff0802cfb7e?q=80&w=1440&h=2560&fit=crop", quote = "Pixels and passion.",
            tags = listOf("Design", "Web3", "Introvert"), synergyText = "+10% Creative Energy"
        ),
        CapitalClubMember(
            id = "cc_7", name = "Evelyn Hayes", age = 28, gender = "Female", title = "Fashion Designer",
            matchPct = "95%", tag = "STYLE", imageUrl = "https://images.unsplash.com/photo-1494790108377-be9c29b29330?q=80&w=1440&h=2560&fit=crop", quote = "Style is a way to say who you are without having to speak.",
            tags = listOf("Chic", "Ambitious", "Creative"), synergyText = "+15% Merch Revenue"
        ),
        CapitalClubMember(
            id = "cc_8", name = "Mia Flow", age = 25, gender = "Female", title = "Producer",
            matchPct = "88%", tag = "BEATS", imageUrl = "https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?q=80&w=1440&h=2560&fit=crop", quote = "I speak through the bassline.",
            tags = listOf("Studio", "Night Owl", "Loyal"), synergyText = "+20% Production Quality"
        ),
        CapitalClubMember(
            id = "cc_9", name = "Isabella Vance", age = 25, gender = "Female", title = "Socialite",
            matchPct = "90%", tag = "FAME", imageUrl = "https://images.unsplash.com/photo-1524250502761-1ac6f2e30d43?q=80&w=1440&h=2560&fit=crop", quote = "Always in the spotlight.",
            tags = listOf("Extrovert", "Glamour", "Connected"), synergyText = "+15% Fan Growth"
        )
    )
}
INNER_EOF

