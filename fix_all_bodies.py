with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    code = f.read()

bad_body = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},\nOur executive A&R committee reviewed the master recording of \'$songTitle\'. We are thoroughly impressed with the acoustic polish and commercial potential.\nApex Records formally extends an exclusive Recording Agreement offer.\nReview the contract below."""'
bad_body_2 = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},Our executive A&R committee reviewed the master recording of \'$songTitle\'. We are thoroughly impressed with the acoustic polish and commercial potential.Apex Records formally extends an exclusive Recording Agreement offer.Review the contract below."""'

correct_wgt_1 = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},\n\nYour audition tape has been reviewed and accepted! We invite you to perform at the televised live auditions in Week $targetAuditionW, Year $targetYear.\n\nMake sure your vocal skills are peaked. Only the best survive the judges."""'
correct_wgt_2 = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},\n\nWe received your registration package, but unfortunately, it arrived past our 2-week processing cutoff for Season $targetSeason.\n\nHowever, your non-refundable registration fee has been securely held and rolled over! You are guaranteed an audition slot in Season $nextSeason. Good luck!"""'
correct_apex_rej = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},\n\nOur executive A&R committee reviewed the master recording of \'$songTitle\'. While there are promising acoustic elements, it lacks the commercial maturity required for an Apex Records release.\n\nKeep honing your craft and submit future projects."""'

import re
code = re.sub(r'subject = "⭐ AUDITION SELECTED: Who Is Got Talent Season \$targetSeason",\s*body = """Dear \$\{state\.artistName\.ifEmpty \{ "Artist" \}\},.*?"""',
              f'subject = "⭐ AUDITION SELECTED: Who Is Got Talent Season $targetSeason",\n{correct_wgt_1}', code, flags=re.DOTALL)

code = re.sub(r'subject = "📋 REGISTRATION ROLLED OVER: Who Is Got Talent",\s*body = """Dear \$\{state\.artistName\.ifEmpty \{ "Artist" \}\},.*?"""',
              f'subject = "📋 REGISTRATION ROLLED OVER: Who Is Got Talent",\n{correct_wgt_2}', code, flags=re.DOTALL)

code = re.sub(r'subject = "Demo Feedback: \'\$songTitle\'",\s*body = """Dear \$\{state\.artistName\.ifEmpty \{ "Artist" \}\},.*?"""',
              f'subject = "Demo Feedback: \'$songTitle\'",\n{correct_apex_rej}', code, flags=re.DOTALL)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(code)
