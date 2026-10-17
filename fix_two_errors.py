with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r', encoding='utf-8') as f:
    text = f.read()

# Fix hireSecurityCompany
text = text.replace(
    'state.copy(security = state.security.copy(hiredSecurityCompany = "None", weeklySecurityFee = 0.0))',
    'state.copy(security = state.security.copy(hiredSecurityCompany = "None"))'
)
text = text.replace(
    'state.copy(security = state.security.copy(hiredSecurityCompany = companyName, weeklySecurityFee = fee))',
    'state.copy(security = state.security.copy(hiredSecurityCompany = companyName))'
)

# Fix submitDemoToApexRecords to take String? or Any?
old_demo = """    fun submitDemoToApexRecords(song: Song? = null) {
        updateState { state ->
            val title = song?.title ?: "Latest Demo"
            showToast("Demo '$title' submitted to A&R executives at Apex Records.")
            state
        }
    }"""

new_demo = """    fun submitDemoToApexRecords(songTitle: String? = null) {
        updateState { state ->
            val title = songTitle ?: "Latest Demo"
            showToast("Demo '$title' submitted to A&R executives at Apex Records.")
            state
        }
    }"""

text = text.replace(old_demo, new_demo)

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w', encoding='utf-8') as f:
    f.write(text)

print("GameViewModel security and apex demo fixed!")
