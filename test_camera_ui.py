import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

pattern = r'fun CameraAppScreen\(state: GameStateEntity, viewModel: GameViewModel\) \{[\s\S]*?\n\}\n'

new_camera_ui = """@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CameraAppScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var chosenLens by remember { mutableStateOf("1x") }
    var currentMode by remember { mutableStateOf("PHOTO") }
    var flashMode by remember { mutableStateOf("AUTO") }
    val modes = listOf("CINEMATIC", "VIDEO", "PHOTO", "PORTRAIT", "PANO")
    
    // Simulate live viewfinder using an image that slowly pans
    val infiniteTransition = rememberInfiniteTransition()
    val offsetX by infiniteTransition.animateFloat(
        initialValue = -50f,
        targetValue = 50f,
        animationSpec = infiniteRepeatable(
            animation = tween(15000, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )
    
    var showFlash by remember { mutableStateOf(false) }
    
    LaunchedEffect(showFlash) {
        if (showFlash) {
            kotlinx.coroutines.delay(100)
            showFlash = false
        }
    }

    // Viewfinder image URL based on current context (simplified)
    val viewfinderImg = remember(state.currentWeek) {
        val urls = listOf(
            "https://images.unsplash.com/photo-1598387181032-a3103a2db5b3?q=80&w=1080&h=1920&fit=crop", // Studio mic
            "https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?q=80&w=1080&h=1920&fit=crop", // Studio mixer
            "https://images.unsplash.com/photo-1501281668745-f7f57925c3b4?q=80&w=1080&h=1920&fit=crop", // Concert stage
            "https://images.unsplash.com/photo-1540039155732-d692994d67af?q=80&w=1080&h=1920&fit=crop"  // Concert crowd
        )
        urls.random()
    }

    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        // Viewfinder
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 160.dp) // Leave space for controls
                .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
        ) {
            coil.compose.AsyncImage(
                model = viewfinderImg,
                contentDescription = "Viewfinder",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer {
                        translationX = offsetX
                        scaleX = 1.1f
                        scaleY = 1.1f
                    }
            )
            
            // Grid Overlay
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
                HorizontalDivider(color = Color.White.copy(alpha = 0.2f), thickness = 0.5.dp)
                HorizontalDivider(color = Color.White.copy(alpha = 0.2f), thickness = 0.5.dp)
            }
            Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Box(modifier = Modifier.fillMaxHeight().width(0.5.dp).background(Color.White.copy(alpha = 0.2f)))
                Box(modifier = Modifier.fillMaxHeight().width(0.5.dp).background(Color.White.copy(alpha = 0.2f)))
            }
            
            // Focus indicator (center)
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .align(Alignment.Center)
                    .border(1.dp, Color(0xFFFFD700).copy(alpha = 0.5f), RoundedCornerShape(4.dp))
            ) {
                Icon(Icons.Default.WbSunny, contentDescription = null, tint = Color(0xFFFFD700).copy(alpha = 0.8f), modifier = Modifier.size(16.dp).align(Alignment.CenterEnd).offset(x = 24.dp))
            }
        }
        
        // Flash Screen Overlay
        if (showFlash) {
            Box(modifier = Modifier.fillMaxSize().background(Color.White))
        }

        // Top Controls
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { 
                flashMode = when(flashMode) {
                    "AUTO" -> "ON"
                    "ON" -> "OFF"
                    else -> "AUTO"
                }
            }) {
                val flashIcon = when(flashMode) {
                    "AUTO" -> Icons.Default.FlashAuto
                    "ON" -> Icons.Default.FlashOn
                    else -> Icons.Default.FlashOff
                }
                Icon(flashIcon, contentDescription = "Flash", tint = Color.White)
            }
            
            Icon(Icons.Default.KeyboardArrowDown, contentDescription = "More Settings", tint = Color.White)
            
            IconButton(onClick = { /* Toggle Live Photo */ }) {
                Icon(Icons.Default.FilterCenterFocus, contentDescription = "Live Photo", tint = Color.White)
            }
        }

        // Bottom Controls Area
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.Black.copy(alpha = 0.8f))
                .padding(bottom = 24.dp, top = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Lens selection (0.5x, 1x, 3x)
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.Black.copy(alpha = 0.5f))
                    .padding(4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf("0.5", "1x", "3").forEach { lens ->
                    val isSelected = chosenLens == lens
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(if (isSelected) Color.DarkGray else Color.Transparent)
                            .clickable { chosenLens = lens },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = lens,
                            color = if (isSelected) Color(0xFFFFD700) else Color.White,
                            fontSize = 13.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Modes
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(modes) { mode ->
                    val isSelected = mode == currentMode
                    Text(
                        text = mode,
                        color = if (isSelected) Color(0xFFFFD700) else Color.White,
                        fontSize = 12.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .clickable { currentMode = mode }
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Shutter Button Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Gallery Thumbnail (latest post)
                val latestPost = state.socialPosts.lastOrNull { it.imageUrl.isNotEmpty() }
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.White.copy(alpha = 0.3f), CircleShape)
                        .background(Color.DarkGray)
                ) {
                    if (latestPost != null) {
                        coil.compose.AsyncImage(
                            model = latestPost.imageUrl,
                            contentDescription = "Gallery",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                
                // Shutter
                Box(
                    modifier = Modifier
                        .size(72.dp)
                        .border(3.dp, Color.White, CircleShape)
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(if (currentMode == "VIDEO" || currentMode == "CINEMATIC") Color.Red else Color.White)
                        .clickable {
                            showFlash = true
                            val year = state.currentYear
                            val captions = listOf(
                                "Live in Concert Year $year: Epic $chosenLens photo capturing our roaring stadium crowd!",
                                "Behind the Scenes: Deep studio mixing session with high-end instruments capturing our signature frequency.",
                                "Studio Promo: Visually stunning aesthetic photoshoot with $chosenLens lens capturing raw emotion."
                            )
                            viewModel.takeConcertPhoto(captions.random())
                        }
                )
                
                // Switch Camera
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.DarkGray.copy(alpha = 0.5f))
                        .clickable { /* Simulate switch camera */ },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(Icons.Default.FlipCameraIos, contentDescription = "Switch Camera", tint = Color.White)
                }
            }
        }
    }
}
"""

content = re.sub(pattern, new_camera_ui, content)
with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
