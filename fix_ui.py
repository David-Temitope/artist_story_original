import re

with open('app/src/main/java/com/example/ui/weshare/WeShareApp.kt', 'r') as f:
    weshare_content = f.read()
    
old_header_weshare = """            Column {
                Text("WeShare", color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Genesis", color = WeShareTextSecondary, fontSize = 11.sp)
            }"""
new_header_weshare = """            Column {
                Text("WeShare", color = WeShareTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Stocks", color = WeShareTextSecondary, fontSize = 11.sp)
            }"""
weshare_content = weshare_content.replace(old_header_weshare, new_header_weshare)

old_icon_weshare = """                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    // Just a dummy icon for now
                    Icon(Icons.Default.GraphicEq, contentDescription = null, tint = WeShareTextSecondary, modifier = Modifier.size(20.dp))
                }"""
new_icon_weshare = """                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    val stockLogo = when (stock.id) {
                        "stock_media" -> "📺"
                        "stock_apex" -> "🎵"
                        "stock_live" -> "🎟️"
                        "stock_tech" -> "📱"
                        "stock_acc" -> "🎸"
                        "stock_indie" -> "💿"
                        else -> "📈"
                    }
                    Text(stockLogo, fontSize = 20.sp)
                }"""
weshare_content = weshare_content.replace(old_icon_weshare, new_icon_weshare)

with open('app/src/main/java/com/example/ui/weshare/WeShareApp.kt', 'w') as f:
    f.write(weshare_content)


with open('app/src/main/java/com/example/ui/genesis/GenesisApp.kt', 'r') as f:
    genesis_content = f.read()
    
old_header_genesis = """            Column {
                Text("WeShare", color = GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Genesis", color = GenesisTextSecondary, fontSize = 11.sp)
            }"""
new_header_genesis = """            Column {
                Text("Genesis", color = GenesisTextPrimary, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Text("Crypto", color = GenesisTextSecondary, fontSize = 11.sp)
            }"""
genesis_content = genesis_content.replace(old_header_genesis, new_header_genesis)

old_icon_genesis = """                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Default.CurrencyBitcoin, contentDescription = null, tint = GenesisTextSecondary, modifier = Modifier.size(20.dp))
                }"""
new_icon_genesis = """                Box(
                    modifier = Modifier.size(44.dp).clip(CircleShape).background(Color(0xFF141A28)),
                    contentAlignment = Alignment.Center
                ) {
                    val cryptoLogo = when (crypto.id) {
                        "crypto_btc" -> "₿"
                        "crypto_eth" -> "Ξ"
                        "crypto_sol" -> "◎"
                        "crypto_meme" -> "🐕"
                        "crypto_music" -> "🎵"
                        "crypto_defi" -> "🏦"
                        else -> "🪙"
                    }
                    Text(cryptoLogo, fontSize = 20.sp)
                }"""
genesis_content = genesis_content.replace(old_icon_genesis, new_icon_genesis)

with open('app/src/main/java/com/example/ui/genesis/GenesisApp.kt', 'w') as f:
    f.write(genesis_content)

print("UI fixes applied")
