import re
with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    code = f.read()

pattern = re.compile(r'body = "Dear \$\{state\.artistName\.ifEmpty \{ "Artist" \}\},.*?"', re.DOTALL)
replacement = 'body = """Dear ${state.artistName.ifEmpty { "Artist" }},\n\nOur executive A&R committee reviewed the master recording of \'$songTitle\'. We are thoroughly impressed with the acoustic polish and commercial potential.\n\nApex Records formally extends an exclusive Recording Agreement offer.\nReview the contract below."""'

if pattern.search(code):
    code = pattern.sub(replacement, code)
    with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
        f.write(code)
    print("Replaced!")
else:
    print("Not found")
