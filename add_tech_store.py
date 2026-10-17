import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    code = f.read()

tech_store_code = """
@Composable
fun TechStoreScreen(
    state: GameStateEntity,
    viewModel: GameViewModel,
    onPhoneBought: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF11141A))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Warning,
            contentDescription = null,
            tint = Color.Red,
            modifier = Modifier.size(48.dp).padding(top = 24.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "DEVICE REPORTED STOLEN",
            color = Color.Red,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "You cannot access your digital life. Purchase a replacement smartphone to regain access.",
            color = Color.LightGray,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Text(
            text = "Tech Store Devices",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(12.dp))
        
        // Option 1: hiPhone
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E232E)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth().clickable {
                viewModel.buyPhone("hiPhone", 1700.0)
            }
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.PhoneIphone, contentDescription = null, tint = Color.White, modifier = Modifier.size(40.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text("hiPhone 15 Pro", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text("Premium OS • High Security", color = Color.Gray, fontSize = 12.sp)
                }
                Text("$1,700", color = Color(0xFF38BDF8), fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // Option 2: TECNOO
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF1E232E)),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth().clickable {
                viewModel.buyPhone("TECNOO", 500.0)
            }
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.PhoneAndroid, contentDescription = null, tint = Color.White, modifier = Modifier.size(40.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text("TECNOO Spark", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Text("Basic OS • Standard Capabilities", color = Color.Gray, fontSize = 12.sp)
                }
                Text("$500", color = Color(0xFF38BDF8), fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }
    }
}
"""

if "fun TechStoreScreen" not in code:
    code += tech_store_code
    with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
        f.write(code)
    print("Added TechStoreScreen!")
else:
    print("TechStoreScreen already exists")
