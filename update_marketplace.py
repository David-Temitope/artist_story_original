import re

with open("app/src/main/java/com/example/MainActivity.kt", "r", encoding="utf-8") as f:
    text = f.read()

# Replace MarketplacePage implementation
old_marketplace_start = "@Composable\nfun MarketplacePage(state: GameStateEntity, viewModel: GameViewModel) {"
idx = text.find(old_marketplace_start)
if idx != -1:
    # Find next top-level function or end of file
    next_func_idx = text.find("\n@Composable\nfun ", idx + len(old_marketplace_start))
    if next_func_idx == -1:
        next_func_idx = text.find("\nfun ", idx + len(old_marketplace_start))
    
    new_marketplace = r'''@Composable
fun MarketplacePage(state: GameStateEntity, viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Migration Announcement Card
        Card(
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(1.dp, Color(0xFF00E676).copy(alpha = 0.5f)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF131F17))
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .background(Color(0xFF00E676), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.Language, contentDescription = null, tint = Color.Black, modifier = Modifier.size(20.dp))
                    }
                    Column {
                        Text("COMMERCE MOVED TO WEBHUB", color = Color(0xFF00E676), fontSize = 13.sp, fontWeight = FontWeight.Black)
                        Text("WebHub Smartphone Browser", color = Color.Gray, fontSize = 10.sp)
                    }
                }

                Text(
                    text = "All asset acquisition and ecommerce have migrated into the official WebHub internet browser on your smartphone. Browse dedicated sites with real-time auctions, custom listings, and master audio catalogs.",
                    color = Color(0xFFD1D5DB),
                    fontSize = 12.sp,
                    lineHeight = 16.sp
                )
            }
        }

        // Destination 1: Alphadom.online (Instruments & Luxury)
        Card(
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color(0xFFD4AF37).copy(alpha = 0.4f)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1C15)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .background(Color(0xFFD4AF37), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Default.ShoppingBag, contentDescription = null, tint = Color.Black, modifier = Modifier.size(16.dp))
                        }
                        Column {
                            Text("Alphadom Audio & Luxury", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            Text("alphadom.online", color = Color(0xFFD4AF37), fontSize = 10.sp)
                        }
                    }
                    Surface(color = Color(0xFFD4AF37).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                        Text("${state.ownedInstruments.size} OWNED", color = Color(0xFFD4AF37), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                    }
                }

                Text(
                    text = "Shop professional polyphonic synthesizers (Moog, Prophet, Jupiter), vintage guitars, Neve preamps, Sony tube microphones, and prestige luxury timepieces.",
                    color = Color(0xFF94A3B8),
                    fontSize = 11.sp
                )

                Button(
                    onClick = {
                        viewModel.openPhoneApp("webhub")
                        viewModel.showToast("Opening Alphadom on WebHub...")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD4AF37)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(36.dp)
                ) {
                    Text("OPEN ALPHADOM STORE", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Black)
                }
            }
        }

        // Destination 2: Sold.com (Real Estate & Vehicles)
        Card(
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color(0xFF38BDF8).copy(alpha = 0.4f)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF141D26)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .background(Color(0xFF38BDF8), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(Icons.Default.Home, contentDescription = null, tint = Color.Black, modifier = Modifier.size(16.dp))
                        }
                        Column {
                            Text("Sold.com Real Estate & Assets", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                            Text("sold.com", color = Color(0xFF38BDF8), fontSize = 10.sp)
                        }
                    }
                    Surface(color = Color(0xFF38BDF8).copy(alpha = 0.2f), shape = RoundedCornerShape(4.dp)) {
                        Text("${state.ownedHouses.size + state.ownedCars.size} ASSETS", color = Color(0xFF38BDF8), fontSize = 9.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                    }
                }

                Text(
                    text = "Acquire luxury skyline penthouses, coastal recording villas, and exotic supercars (Ferrari SF90, Rolls-Royce Phantom) with weekly energy and prestige bonuses.",
                    color = Color(0xFF94A3B8),
                    fontSize = 11.sp
                )

                Button(
                    onClick = {
                        viewModel.openPhoneApp("webhub")
                        viewModel.showToast("Opening Sold.com on WebHub...")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF38BDF8)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth().height(36.dp)
                ) {
                    Text("OPEN SOLD.COM AUCTIONS", color = Color.Black, fontSize = 11.sp, fontWeight = FontWeight.Black)
                }
            }
        }
    }
}
'''
    if next_func_idx != -1:
        text = text[:idx] + new_marketplace + "\n" + text[next_func_idx:]
    else:
        text = text[:idx] + new_marketplace

    with open("app/src/main/java/com/example/MainActivity.kt", "w", encoding="utf-8") as f:
        f.write(text)
    print("Updated MarketplacePage in MainActivity.kt successfully!")
else:
    print("MarketplacePage not found in MainActivity.kt")

