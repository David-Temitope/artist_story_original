import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    code = f.read()

# Add a Lock Screen UI right at the start of SmartphoneComponent UI or inside
# We'll put it right after the status bar. Or we can just wrap the whole screen.

target = """@Composable
fun SmartphoneComponent(
    state: GameStateEntity,
    viewModel: GameViewModel,
    onClose: () -> Unit
) {
    var isPoweredOn by remember { mutableStateOf(false) }"""

replacement = """@Composable
fun SmartphoneComponent(
    state: GameStateEntity,
    viewModel: GameViewModel,
    onClose: () -> Unit
) {
    var isPoweredOn by remember { mutableStateOf(false) }
    
    // Add Lock Screen overlay
    if (state.isPhoneLocked && isPoweredOn) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Lock, contentDescription = "Locked", tint = Color.White, modifier = Modifier.size(48.dp))
                Spacer(modifier = Modifier.height(16.dp))
                Text("Phone is Locked", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = { viewModel.togglePhoneLock() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E1E28))
                ) {
                    Text("Unlock", color = Color.White)
                }
            }
        }
        return
    }"""

if target in code:
    code = code.replace(target, replacement)
else:
    print("Could not find target for lock screen")

# Add a lock button in the status bar (maybe replace battery or add beside it)
target_statusbar = """                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.SignalCellular4Bar, contentDescription = "Signal", tint = Color.White, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.Default.BatteryFull, contentDescription = "Battery", tint = Color.White, modifier = Modifier.size(14.dp))
                    }"""

replacement_statusbar = """                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.Lock, 
                            contentDescription = "Lock Phone", 
                            tint = Color.White, 
                            modifier = Modifier.size(16.dp).clickable { viewModel.togglePhoneLock() }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(Icons.Default.SignalCellular4Bar, contentDescription = "Signal", tint = Color.White, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.Default.BatteryFull, contentDescription = "Battery", tint = Color.White, modifier = Modifier.size(14.dp))
                    }"""

if target_statusbar in code:
    code = code.replace(target_statusbar, replacement_statusbar)
else:
    print("Could not find target for status bar")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(code)

print("Patched SmartphoneComponent for lock screen.")
