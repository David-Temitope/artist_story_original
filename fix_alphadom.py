import re

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'r') as f:
    content = f.read()

old_alphadom = """            val filteredProducts = if (selectedCategory == "All") storeProducts else storeProducts.filter { it.category == selectedCategory }

            filteredProducts.forEach { item ->
                val isOwned = if (item.isLuxury) {
                    state.timelineEvents.any { it.contains(item.name) }
                } else {
                    state.ownedInstruments.any { it.name == item.name || it.id == item.id }
                }

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1B1B20)),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, Color(0xFF2A2A33)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = item.name, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                            Text(text = "$${String.format("%,.0f", item.price)}", color = Color(0xFFD4AF37), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                        }

                        Text(text = item.benefit, color = Color(0xFF94A3B8), fontSize = 11.sp)

                        Spacer(modifier = Modifier.height(2.dp))

                        if (isOwned) {
                            Text(
                                text = "OWNED",
                                color = Color.Gray,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black
                            )
                        } else {
                            Text(
                                text = "PURCHASE",
                                color = Color(0xFF00E676),
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                modifier = Modifier.clickable { viewModel.buyInstrument(item) }
                            )
                        }
                    }
                }
            }"""

new_alphadom = """            val filteredProducts = if (selectedCategory == "All") storeProducts else storeProducts.filter { it.category == selectedCategory }
            
            // Dynamic Seed for sales and stock
            val seed = state.currentWeek + state.currentYear * 52

            filteredProducts.forEachIndexed { index, item ->
                val isOwned = if (item.isLuxury) {
                    state.timelineEvents.any { it.contains(item.name) }
                } else {
                    state.ownedInstruments.any { it.name == item.name || it.id == item.id }
                }
                
                // Dynamic logic
                val isFlashSale = (seed + index) % 15 == 0
                val isOutOfStock = (seed + index + 3) % 25 == 0
                
                val finalPrice = if (isFlashSale) item.price * 0.7 else item.price

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1B1B20)),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, Color(0xFF2A2A33)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                Text(text = item.name, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                if (isFlashSale && !isOwned && !isOutOfStock) {
                                    Surface(color = Color.Red, shape = RoundedCornerShape(4.dp)) {
                                        Text("-30% SALE", color = Color.White, fontSize = 8.sp, fontWeight = FontWeight.Black, modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp))
                                    }
                                }
                            }
                            Column(horizontalAlignment = Alignment.End) {
                                if (isFlashSale && !isOwned && !isOutOfStock) {
                                    Text(text = "$${String.format("%,.0f", item.price)}", color = Color.Gray, fontSize = 10.sp, textDecoration = androidx.compose.ui.text.style.TextDecoration.LineThrough)
                                }
                                Text(text = "$${String.format("%,.0f", finalPrice)}", color = Color(0xFFD4AF37), fontSize = 13.sp, fontWeight = FontWeight.Bold)
                            }
                        }

                        Text(text = item.benefit, color = Color(0xFF94A3B8), fontSize = 11.sp)

                        Spacer(modifier = Modifier.height(2.dp))

                        if (isOwned) {
                            Text(
                                text = "OWNED",
                                color = Color.Gray,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black
                            )
                        } else if (isOutOfStock) {
                            Text(
                                text = "OUT OF STOCK",
                                color = Color.Red,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black
                            )
                        } else {
                            Text(
                                text = "PURCHASE",
                                color = Color(0xFF00E676),
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Black,
                                modifier = Modifier.clickable { 
                                    // Make sure to pass the discounted price if it's on sale
                                    val purchasedItem = if (isFlashSale) item.copy(price = finalPrice) else item
                                    viewModel.buyInstrument(purchasedItem) 
                                }
                            )
                        }
                    }
                }
            }"""

content = content.replace(old_alphadom, new_alphadom)

with open('app/src/main/java/com/example/ui/browser/WebHubAppScreen.kt', 'w') as f:
    f.write(content)

print("Alphadom store updated!")
