import re

# 1. MainActivity.kt
with open("app/src/main/java/com/example/MainActivity.kt", "r", encoding="utf-8", errors="ignore") as f:
    main_content = f.read()

bad_skills = "(state.vocalSkill + state.songwritingSkill + state.instrumentSkill + state.productionSkill + state.marketingSkill + state.stagePresenceSkill).coerceIn(0f, 600f)"
good_skills = "(state.voiceSkill + state.writingSkill + state.businessSkill).coerceIn(0f, 300f)"

main_content = main_content.replace(bad_skills, good_skills)
main_content = main_content.replace("val skillRatio = totalSkills / 600f", "val skillRatio = totalSkills / 300f")
main_content = main_content.replace("Icons.AutoMirrored.Filled.ArrowForward", "Icons.Default.ArrowForward")

with open("app/src/main/java/com/example/MainActivity.kt", "w", encoding="utf-8") as f:
    f.write(main_content)
print("✓ Updated MainActivity.kt")

# 2. SmartphoneComponent.kt
with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r", encoding="utf-8", errors="ignore") as f:
    phone_content = f.read()

phone_content = phone_content.replace("while (kotlinx.coroutines.isActive)", "while (true)")
phone_content = phone_content.replace("${npc.genre} • ${String.format(\"%,d\", npc.fans)} fans", "${npc.genrePreference} • ${String.format(\"%,d\", npc.fans)} fans")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w", encoding="utf-8") as f:
    f.write(phone_content)
print("✓ Updated SmartphoneComponent.kt")

