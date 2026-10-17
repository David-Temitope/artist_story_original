with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    code = f.read()

bad_body = '                    body = """Dear ${state.artistName.ifEmpty { "Artist" }},\\n\\nOur executive A&R committee reviewed the master recording of \\\'$songTitle\\\'. We are thoroughly impressed with the acoustic polish and commercial potential.\\n\\nApex Records formally extends an exclusive Recording Agreement offer.\\nReview the contract below."""'

correct_wgt_body = '                    body = "Dear ${state.artistName.ifEmpty { \\"Artist\\" }},\\n\\nYour audition tape has been reviewed and accepted! We invite you to perform at the televised live auditions in Week $targetAuditionW, Year $targetYear.\\n\\nMake sure your vocal skills are peaked. Only the best survive the judges."'

# Since there are multiple occurrences of bad_body, we need to specifically replace the one in WGT.
# Let's split by "WGT Executive Production"
parts = code.split('"WGT Executive Production"')
if len(parts) > 1:
    parts[1] = parts[1].replace(bad_body, correct_wgt_body, 1)
    code = '"WGT Executive Production"'.join(parts)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(code)
