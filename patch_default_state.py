import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    code = f.read()

target = """                npcs = proceduralNPCs + customNPCs.map { it.withPsychology(random) },"""

replacement = """                npcs = proceduralNPCs + customNPCs.map { it.withPsychology(random) },
                capitalClubMembers = listOf(
                    CapitalClubMember("cc1", "Julian Reed", 29, "Male", "Horizon VC Partner", "92%", "Partner", "https://images.unsplash.com/photo-1560250097-0b93528c311a?q=80&w=600&auto=format&fit=crop", "Investing in the future. Weekends are for sailing.", listOf("VC", "Sailing", "Tech"), "High upside synergy."),
                    CapitalClubMember("cc2", "Chloe Davenport", 28, "Female", "Quant Strategist", "97%", "Quant", "https://images.unsplash.com/photo-1580489944761-15a19d654956?q=80&w=600&auto=format&fit=crop", "Algorithms by day, contemporary art by night.", listOf("Math", "Art", "Wine"), "Strong analytical synergy."),
                    CapitalClubMember("cc3", "Marcus Vance", 31, "Male", "AI Researcher", "89%", "Founder", "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?q=80&w=600&auto=format&fit=crop", "Building thinking machines. Always learning.", listOf("AI", "Reading", "Chess"), "Innovative synergy."),
                    CapitalClubMember("cc4", "Sophia Lin", 27, "Female", "Climate Fintech Founder", "94%", "Angel", "https://images.unsplash.com/photo-1573496359142-b8d87734a5a2?q=80&w=600&auto=format&fit=crop", "Building sustainable climate fintech. Weekends scouting contemporary art and natural wine bars.", listOf("Angel Syndicate", "Seed Investor", "Art Collector", "Triathlon"), "+12% Capital Velocity on Shared Ventures")
                ),"""

if target in code:
    code = code.replace(target, replacement)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(code)
print("Patched GameViewModel.kt")
