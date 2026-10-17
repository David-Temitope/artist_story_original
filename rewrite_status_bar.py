import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

status_bar_target = """                    // Phone OS Status Bar
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 6.dp)
                            .zIndex(10f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {"""

# Find the end of the Status Bar block which is `// State for quick launching`
status_bar_block_regex = r'// Phone OS Status Bar.*?// State for quick launching apps from lockscreen notifications'

new_status_bar = """// Phone OS Status Bar
                    Box(modifier = Modifier.fillMaxWidth().zIndex(10f)) {
                        // TECCNO Teardrop Notch
                        if (state.activePhone == "TECCNO") {
                            androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxWidth().height(28.dp)) {
                                val w = size.width
                                val notchWidth = 80.dp.toPx()
                                val notchHeight = 28.dp.toPx()
                                val path = androidx.compose.ui.graphics.Path().apply {
                                    moveTo(w / 2f - notchWidth / 2f, 0f)
                                    quadraticBezierTo(w / 2f - notchWidth / 4f, 0f, w / 2f - notchWidth / 6f, notchHeight * 0.6f)
                                    quadraticBezierTo(w / 2f, notchHeight, w / 2f + notchWidth / 6f, notchHeight * 0.6f)
                                    quadraticBezierTo(w / 2f + notchWidth / 4f, 0f, w / 2f + notchWidth / 2f, 0f)
                                    close()
                                }
                                drawPath(path, Color(0xFF111111))
                                drawCircle(Color(0xFF222222), radius = 6.dp.toPx(), center = androidx.compose.ui.geometry.Offset(w / 2f, notchHeight * 0.5f))
                            }
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = if (state.activePhone == "TECCNO") 8.dp else 12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val timeString = remember {
                                val sdf = java.text.SimpleDateFormat("HH:mm", java.util.Locale.US)
                                sdf.format(java.util.Date())
                            }
                            
                            // LEFT SIDE
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                if (state.activePhone == "No-Thing") {
                                    Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color.Red))
                                }
                                Text(
                                    text = if (state.activePhone == "TECCNO" || state.activePhone == "Xiaomax") timeString else "$timeString UTC",
                                    color = Color.White,
                                    style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
                                    fontSize = 11.sp
                                )
                                if (state.activePhone == "TECCNO") {
                                    Box(modifier = Modifier.background(Color(0xFFE91E63), RoundedCornerShape(4.dp)).padding(horizontal = 4.dp, vertical = 2.dp)) {
                                        Text("TURBO ON", color = Color.White, fontSize = 7.sp, fontWeight = FontWeight.Bold)
                                    }
                                }
                                if (state.activePhone == "Xiaomax") {
                                    Text("↓ 1.2 MB/s", color = Color(0xFF00E676), fontSize = 9.sp, fontWeight = FontWeight.Bold)
                                }
                            }

                            // CENTER ISLAND / NOTCH
                            when (state.activePhone) {
                                "hiPhone" -> {
                                    Box(
                                        modifier = Modifier.height(28.dp).clip(RoundedCornerShape(14.dp)).background(Color.Black).padding(horizontal = 10.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF00E676)))
                                            Text("Ecosystem 5G", color = Color.White.copy(alpha = 0.9f), fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                            Icon(imageVector = Icons.Default.CellTower, contentDescription = null, tint = Color.Gray, modifier = Modifier.size(12.dp))
                                        }
                                    }
                                }
                                "Samsong", "Xiaomax" -> {
                                    Box(modifier = Modifier.size(14.dp).clip(CircleShape).background(Color.Black).border(1.dp, Color.DarkGray, CircleShape))
                                }
                                "No-Thing" -> {
                                    Box(
                                        modifier = Modifier.height(24.dp).clip(RoundedCornerShape(12.dp)).background(Color.Black.copy(alpha=0.5f)).border(1.dp, Color.DarkGray, RoundedCornerShape(12.dp)).padding(horizontal = 12.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF00E676)))
                                            Text("GLYPH // OS", color = Color.White.copy(alpha = 0.8f), fontSize = 9.sp, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }
                                "Pixxelate" -> {
                                    Box(
                                        modifier = Modifier.height(28.dp).clip(RoundedCornerShape(14.dp)).background(Color(0xFF1E1E1E)).padding(horizontal = 12.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF00E676)))
                                            Text("Ecosystem 5G", color = Color.White.copy(alpha = 0.9f), fontSize = 10.sp, fontWeight = FontWeight.Medium)
                                            Box(modifier = Modifier.size(10.dp).clip(CircleShape).border(1.dp, Color.Gray, CircleShape))
                                        }
                                    }
                                }
                                else -> { Spacer(modifier = Modifier.width(40.dp)) }
                            }

                            // RIGHT SIDE
                            val batteryLevel = state.energy.coerceIn(0, 100)
                            val batteryColor = when {
                                batteryLevel > 50 -> Color(0xFF4CAF50)
                                batteryLevel > 20 -> Color(0xFFFF9800)
                                else -> Color(0xFFF44336)
                            }
                            Row(
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
                                if (state.activePhone == "TECCNO") {
                                    Icon(imageVector = Icons.Default.Bolt, contentDescription = null, tint = Color(0xFF00E676), modifier = Modifier.size(12.dp))
                                }
                                Text(if (state.activePhone == "hiPhone" || state.activePhone == "No-Thing") "5G" else "5G+", color = Color.White, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                                Icon(imageVector = Icons.Default.SignalCellular4Bar, contentDescription = "Signal", tint = Color.White, modifier = Modifier.size(11.dp))
                                if (state.activePhone != "hiPhone") {
                                    Icon(imageVector = Icons.Default.Wifi, contentDescription = "Wi-Fi", tint = Color.White, modifier = Modifier.size(11.dp))
                                }
                                if (state.activePhone == "Samsong") {
                                    Icon(imageVector = Icons.Default.VolumeUp, contentDescription = "Volume", tint = Color.White, modifier = Modifier.size(11.dp))
                                }
                                if (state.activePhone == "Xiaomax") {
                                    Box(modifier = Modifier.background(Color(0xFFFF9800), RoundedCornerShape(2.dp)).padding(horizontal = 2.dp)) {
                                        Text("120W", color = Color.Black, fontSize = 7.sp, fontWeight = FontWeight.Bold)
                                    }
                                }
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(text = "$batteryLevel%", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                Icon(imageVector = Icons.Default.BatteryChargingFull, contentDescription = "Battery", tint = batteryColor, modifier = Modifier.size(12.dp))
                            }
                        }
                    }

                    // State for quick launching apps from lockscreen notifications"""

text = re.sub(status_bar_block_regex, new_status_bar, text, flags=re.DOTALL)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

