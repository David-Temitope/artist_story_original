import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    text = f.read()

phone_frame_logic = """        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.75f))
                .clickable { onDismiss() },
            contentAlignment = Alignment.Center
        ) {
            val phoneOuterShape = when (state.activePhone) {
                "TECCNO" -> RoundedCornerShape(24.dp)
                "Xiaomax" -> RoundedCornerShape(32.dp)
                "No-Thing" -> RoundedCornerShape(16.dp)
                "Pixxelate" -> RoundedCornerShape(42.dp)
                "Samsong" -> RoundedCornerShape(20.dp)
                "hiPhone" -> RoundedCornerShape(42.dp)
                else -> RoundedCornerShape(38.dp)
            }
            
            val phoneBezelThickness = when (state.activePhone) {
                "TECCNO" -> 14.dp
                "Xiaomax" -> 8.dp
                "No-Thing" -> 6.dp
                "Pixxelate" -> 10.dp
                "Samsong" -> 4.dp
                "hiPhone" -> 6.dp
                else -> 6.dp
            }
            
            val phoneFrameColor = when (state.activePhone) {
                "TECCNO" -> Color(0xFF2B2B2B)
                "Xiaomax" -> Color(0xFF1E212A)
                "No-Thing" -> Color(0xFFEEEEEE)
                "Pixxelate" -> Color(0xFF1A1A1A)
                "Samsong" -> Color(0xFF555555)
                "hiPhone" -> Color(0xFF343B46)
                else -> Color(0xFF343B46)
            }
            
            val phoneBorderThickness = when (state.activePhone) {
                "No-Thing" -> 2.5.dp
                "Samsong" -> 1.dp
                else -> 1.5.dp
            }
            
            val phoneWidth = when (state.activePhone) {
                "TECCNO" -> 395.dp
                "Xiaomax" -> 405.dp
                "No-Thing" -> 415.dp
                "Pixxelate" -> 410.dp
                "Samsong" -> 420.dp
                "hiPhone" -> 410.dp
                else -> 410.dp
            }
            
            val phoneHeight = when (state.activePhone) {
                "TECCNO" -> 780.dp
                "Xiaomax" -> 800.dp
                "No-Thing" -> 810.dp
                "Pixxelate" -> 805.dp
                "Samsong" -> 830.dp
                "hiPhone" -> 820.dp
                else -> 820.dp
            }
            
            val phoneInnerClip = when (state.activePhone) {
                "TECCNO" -> RoundedCornerShape(12.dp)
                "Xiaomax" -> RoundedCornerShape(24.dp)
                "No-Thing" -> RoundedCornerShape(12.dp)
                "Pixxelate" -> RoundedCornerShape(34.dp)
                "Samsong" -> RoundedCornerShape(16.dp)
                "hiPhone" -> RoundedCornerShape(36.dp)
                else -> RoundedCornerShape(32.dp)
            }
            
            val phoneContainerColor = when (state.activePhone) {
                "TECCNO" -> Color(0xFF111111)
                "No-Thing" -> Color(0xFF222222)
                else -> Color(0xFF1A1D24)
            }

            // Simulated Premium Flagship Smartphone Frame
            Card(
                shape = phoneOuterShape,
                border = BorderStroke(phoneBorderThickness, phoneFrameColor),
                colors = CardDefaults.cardColors(containerColor = phoneContainerColor),
                modifier = Modifier
                    .width(phoneWidth)
                    .height(phoneHeight)
                    .clickable(enabled = false) {}
                    .padding(phoneBezelThickness) // Slimmer bezels
                    .testTag("smartphone_bezel_frame")
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(phoneInnerClip)
                ) {"""

text = re.sub(
    r'        Box\(\s*modifier = Modifier\s*\.fillMaxSize\(\)\s*\.background\(Color\.Black\.copy\(alpha = 0\.75f\)\)\s*\.clickable \{ onDismiss\(\) \},\s*contentAlignment = Alignment\.Center\s*\)\s*\{\s*// Simulated Premium Flagship Smartphone Frame\s*Card\(\s*shape = RoundedCornerShape\(38\.dp\),\s*border = BorderStroke\(1\.5\.dp, Color\(0xFF343B46\)\),\s*colors = CardDefaults\.cardColors\(containerColor = Color\(0xFF1A1D24\)\),\s*modifier = Modifier\s*\.width\(410\.dp\)\s*\.height\(820\.dp\)\s*\.clickable\(enabled = false\) \{\}\s*\.padding\(6\.dp\) // Slimmer bezels\s*\.testTag\("smartphone_bezel_frame"\)\s*\)\s*\{\s*Box\(\s*modifier = Modifier\s*\.fillMaxSize\(\)\s*\.clip\(RoundedCornerShape\(32\.dp\)\)\s*\)\s*\{',
    phone_frame_logic,
    text
)

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(text)
