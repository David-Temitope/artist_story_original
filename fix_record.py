import re

with open('app/src/main/java/com/example/data/GameViewModel.kt', 'r') as f:
    content = f.read()

old_cost = """            val copyrightCost = if (registerCopyright) (studioRecordingSubtotal * 0.15).coerceAtLeast(150.0) else 0.0
            val totalCost = studioRecordingSubtotal + copyrightCost

            if (state.cash < totalCost) {
                showToast("Insufficient cash to pay producer, studio setup, and legal options! Total required: $${String.format("%,.0f", totalCost)}")
                return@updateState state
            }"""

new_cost = """            val copyrightCost = if (registerCopyright) (studioRecordingSubtotal * 0.15).coerceAtLeast(150.0) else 0.0
            val totalCost = studioRecordingSubtotal + copyrightCost

            if (state.cash < totalCost) {
                showToast("Insufficient cash to pay producer, studio setup, and legal options! Total required: $${String.format("%,.0f", totalCost)}")
                return@updateState state
            }
            
            // Dynamic check for album delivery constraints
            val reqSingles = state.signedLabelReqSingles
            val delSingles = state.signedLabelDeliveredSingles
            if (state.signedLabelId != null && delSingles >= reqSingles) {
                // If they delivered singles but still owe an album, recording another single doesn't count toward deliverables, but is allowed.
            }"""

if old_cost in content:
    content = content.replace(old_cost, new_cost)
    with open('app/src/main/java/com/example/data/GameViewModel.kt', 'w') as f:
        f.write(content)
    print("Cost block updated!")
else:
    print("Old cost block not found!")
