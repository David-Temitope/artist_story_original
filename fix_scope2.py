import re

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    text = f.read()

top_of_func = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = java.lang.StringBuilder()"""
top_of_func_new = """    fun progressToNextWeek() {
        updateState { state ->
            val reportBuilder = java.lang.StringBuilder()
            var newSavingsBalance = state.savingsBalance"""
text = text.replace(top_of_func, top_of_func_new)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(text)
