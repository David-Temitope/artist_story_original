import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

# The regex needs to match `capitalClubMembers = getInitialCapitalClubMembers() // ...` up to the closing `)` of the `listOf(`
# Wait, the closing `)` is after `)`.
# Since I already changed `capitalClubMembers = listOf(` to `capitalClubMembers = getInitialCapitalClubMembers() //`, I can just match that.

pattern = re.compile(r'capitalClubMembers = getInitialCapitalClubMembers\(\) //.*?synergyText = "\+20% Music Video Quality"\n\s*\)\n\s*\)', re.DOTALL)
new_content = pattern.sub('capitalClubMembers = getInitialCapitalClubMembers()', content)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
    f.write(new_content)
