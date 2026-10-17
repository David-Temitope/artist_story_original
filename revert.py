with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

replacement = """                        }
                    }

                    // Floating Edge Panels overlay (Top layer, outside of AnimatedContent but inside phone screen)
                    if (state.activePhone == "Samsong") {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(end = 2.dp)
                                .align(Alignment.CenterEnd),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(4.dp)
                                    .height(60.dp)
                                    .clip(RoundedCornerShape(topStart = 4.dp, bottomStart = 4.dp))
                                    .background(Color.White.copy(alpha = 0.4f))
                            )
                        }
                    } else if (state.activePhone == "TECCNO") {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterEnd),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp))
                                    .background(Color(0xFFE91E63).copy(alpha=0.9f))
                                    .padding(vertical = 12.dp, horizontal = 4.dp)
                            ) {
                                Text("BOOST", color = Color.White, fontSize = 7.sp, fontWeight = FontWeight.Bold, modifier = Modifier.rotate(-90f))
                            }
                        }
                    }
                }
            }
        }
    }
}"""

target = """                        }
                    }
                }
            }
        }
    }
}"""

text = text.replace(replacement, target)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)

