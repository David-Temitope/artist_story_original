with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    lines = f.readlines()

# Remove my appended code from EOF
lines_to_keep = []
in_my_append = False
for line in lines:
    if "fun buyPhone(modelName: String, cost: Double)" in line:
        in_my_append = True
    if not in_my_append:
        lines_to_keep.append(line)

# The last line should be `}`
# Let's insert our function right before the last `}`.
lines_to_keep.insert(-1, """
    fun buyPhone(modelName: String, cost: Double) {
        updateState { state ->
            if (state.cash < cost) {
                showToast("Insufficient cash to buy $modelName.")
                return@updateState state
            }
            
            val newJournal = state.spiritualJournal.filterNot { it == "active_phone_theft" }.toMutableList()
            newJournal.add("owned_phone:$modelName")
            
            showToast("Purchased $modelName! You now have access to your smartphone.")
            state.copy(
                cash = state.cash - cost,
                spiritualJournal = newJournal
            )
        }
    }
""")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write("".join(lines_to_keep))
