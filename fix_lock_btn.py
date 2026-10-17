import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

old_btn = """            // Unlock Bar Button
            Button(
                onClick = { viewModel.setPhoneLocked(false) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White.copy(alpha = 0.2f),
                    contentColor = Color.White
                ),
                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.35f)),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .testTag("unlock_button")
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.LockOpen,
                        contentDescription = "Unlock",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "SWIPE OR TAP TO UNLOCK",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.2.sp
                        )
                    )
                }
            }"""

new_btn = """            // Unlock Bar Text Indicator
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 16.dp).clickable { viewModel.setPhoneLocked(false) }
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowUp,
                    contentDescription = "Swipe Up",
                    tint = Color.White.copy(alpha = 0.8f),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "SWIPE UP TO UNLOCK",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.2.sp
                    ),
                    color = Color.White.copy(alpha = 0.8f)
                )
            }"""

content = content.replace(old_btn, new_btn)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)

print("Lock button updated!")
