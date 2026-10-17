import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_ask_out = """            val random = java.util.Random()
            val accepted = random.nextFloat() < 0.6f
            val responseMsg = if (accepted) "Hey! I'd love to go out with you. Let's get to know each other better. :)" else "Hey, thanks for reaching out, but I don't think we're a match right now. Best of luck!"

            val initialScore = if (accepted) 10 else 0"""

new_ask_out = """            // Advanced Crush App AI Logic
            var accepted = false
            var responseMsg = "Hey, thanks for reaching out, but I don't think we're a match right now."
            
            // Rejections based on specific member tags and player stats
            if (member.tags.contains("Finance") || member.tags.contains("Wealth") || member.tag == "WEALTH") {
                if (state.cash < 500000.0) {
                    responseMsg = "I only date in a certain tax bracket. No offense, but you're not there yet."
                } else {
                    accepted = true
                }
            } else if (member.tags.contains("Fame") || member.tags.contains("High Profile") || member.tag == "FAME") {
                if (state.popularity < 75f) {
                    responseMsg = "You're cute, but my PR team says you don't have enough followers for this to make sense."
                } else {
                    accepted = true
                }
            } else if (member.tags.contains("Creative") || member.tags.contains("Studio") || member.tag == "ART") {
                if (state.writingSkill < 60f || state.voiceSkill < 60f) {
                    responseMsg = "I need a partner who truly understands the depth of real art. I don't feel that from you."
                } else {
                    accepted = true
                }
            } else if (member.tags.contains("Style") || member.tag == "STYLE") {
                if (state.publicImage < 70f) {
                    responseMsg = "Your public image is a bit messy for my brand right now. Let's pass."
                } else {
                    accepted = true
                }
            } else if (state.negativeSentiment > 35f) {
                responseMsg = "I've seen what they're saying about you online... I can't be associated with that kind of drama."
            } else {
                accepted = java.util.Random().nextFloat() < 0.7f // 70% default chance if they don't have strict requirements or if met
                if (accepted) responseMsg = "Hey! I'd love to go out with you. Let's get to know each other better. :)"
            }
            
            val initialScore = if (accepted) 10 else 0"""

content = content.replace(old_ask_out, new_ask_out)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(content)

print("Crush app logic updated!")
