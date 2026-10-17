import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    code = f.read()

target = """                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(imageVector = Icons.Default.SignalCellular4Bar, contentDescription = "Signal", tint = Color.White, modifier = Modifier.size(11.dp))"""

replacement = """                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            if (!state.isPhoneLocked) {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = "Lock Phone",
                                    tint = Color.White,
                                    modifier = Modifier.size(14.dp).clickable { viewModel.setPhoneLocked(true) }.padding(end = 4.dp)
                                )
                            }
                            Icon(imageVector = Icons.Default.SignalCellular4Bar, contentDescription = "Signal", tint = Color.White, modifier = Modifier.size(11.dp))"""

if target in code:
    code = code.replace(target, replacement)
    with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
        f.write(code)
    print("Patched lock button.")
else:
    print("Could not find status bar.")
