import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

# 1. Undo the bad declaration in the Breach consequence block
text = text.replace("""                // Breach consequence
                var newSavingsBalance = state.savingsBalance
                when (threatType) {""",
"""                // Breach consequence
                when (threatType) {""")

# 2. Add it at the top of the function
top_of_func = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = StringBuilder()"""
top_of_func_new = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = StringBuilder()
            var newSavingsBalance = state.savingsBalance"""
text = text.replace(top_of_func, top_of_func_new)

# 3. Change the interest area back to use `newSavingsBalance` since it's already a var, 
# just without declaring it there. My previous script did:
# `newSavingsBalance = newSavingsBalance // already declared above`
# which is fine syntactically if it's declared at the top of the function.

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)
