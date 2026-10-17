import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

text = text.replace('AppConfig("ventures", "VENTURES", Icons.Default.BusinessCenter, Color(0xFF6200EA), 0),', 'AppConfig("ventures", "VENTURES", Icons.Default.BusinessCenter, Color(0xFF6200EA), 0),\n                AppConfig("politics", "Politics", Icons.Default.HowToVote, Color(0xFF007AFF), if (state.isElectionSeason && state.endorsedCandidateId.isNullOrEmpty() && (state.currentWeek == 14 || state.currentWeek == 38)) 1 else 0),')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

