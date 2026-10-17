with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'r') as f:
    text = f.read()

import re

old_block = """                    Column {
                        Text(phone.name, color = Color.White, fontWeight = FontWeight.Bold)
                        Text(if(isActive) "ACTIVE" else if (isOwned) "OWNED" else "$${phone.price}", color = if(isActive) Color(0xFF6200EA) else Color.Gray)
                        Text(phone.perkDesc, color = Color.LightGray, fontSize = 12.sp)
                    }
                }
            }
        }
    }
}"""

new_block = """                    Column(modifier = Modifier.weight(1f)) {
                        Text(phone.name, color = Color.White, fontWeight = FontWeight.Bold)
                        Text(if(isActive) "ACTIVE" else if (isOwned) "OWNED" else "$${phone.price}", color = if(isActive) Color(0xFF6200EA) else Color.Gray)
                        Text(phone.perkDesc, color = Color.LightGray, fontSize = 12.sp)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {
                        if (!isOwned) {
                            viewModel.buyPhone(phone.id, phone.price)
                        } else if (!isActive) {
                            viewModel.equipPhone(phone.id)
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isActive) Color.DarkGray else if (isOwned) Color(0xFF6200EA) else Color(0xFF4CAF50)
                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                    enabled = !isActive
                ) {
                    Text(
                        text = if (isActive) "Currently Equipped" else if (isOwned) "Equip Device" else "Purchase Device",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}"""

text = text.replace(old_block, new_block)

with open('app/src/main/java/com/example/ui/RecoveredScreens.kt', 'w') as f:
    f.write(text)
