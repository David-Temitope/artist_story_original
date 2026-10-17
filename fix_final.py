with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# Fix the first line
text = text.replace('import com.example.ui.*npackage com.example', 'package com.example\nimport com.example.ui.*\n')

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'r') as f:
    text = f.read()

text = text.replace('state.mail', 'state.mailbox')
text = text.replace('fun TechStoreScreen(state: GameStateEntity, viewModel: GameViewModel)', 'fun TechStoreScreen(state: GameStateEntity, viewModel: GameViewModel, onPhoneBought: (String, Double) -> Unit = {_,_->})')
text = text.replace('fun TechStoreScreen(state: GameStateEntity, viewModel: GameViewModel, onPhoneBought: (String, Double) -> Unit)', 'fun TechStoreScreen(state: GameStateEntity, viewModel: GameViewModel, onPhoneBought: (String, Double) -> Unit = {_,_->})')

with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'w') as f:
    f.write(text)
