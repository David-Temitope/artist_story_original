import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# I need to add CameraX imports if they don't exist.
imports_to_add = """
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState
import androidx.compose.ui.platform.LocalContext
"""

if "import androidx.camera.core.*" not in content:
    content = content.replace("import androidx.compose.ui.platform.testTag", "import androidx.compose.ui.platform.testTag\n" + imports_to_add)

# Now, replace the old camera screen. I will use regex or find/replace carefully.

old_camera_start = "// =================== 13. CAMERA & PHOTO GALLERY SCREEN ==================="
old_camera_end = "// =================== 14. SETTINGS APP SCREEN ==================="

if old_camera_start in content and old_camera_end in content:
    before = content.split(old_camera_start)[0]
    after = content.split(old_camera_end)[1]
    
    new_camera = """// =================== 13. CAMERA & PHOTO GALLERY SCREEN ===================
@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun CameraAppScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val cameraPermissionState = rememberPermissionState(android.Manifest.permission.CAMERA)

    if (cameraPermissionState.status.isGranted) {
        RealCameraAppUI(state, viewModel)
    } else {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Default.CameraAlt, contentDescription = null, tint = Color.White, modifier = Modifier.size(64.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text("Camera Access Required", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Please grant camera permission to use the viewfinder.", color = Color.Gray, fontSize = 14.sp, textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { cameraPermissionState.launchPermissionRequest() },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD600))
            ) {
                Text("Allow Camera", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun RealCameraAppUI(state: GameStateEntity, viewModel: GameViewModel) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    var lensFacing by remember { mutableStateOf(CameraSelector.LENS_FACING_BACK) }
    var currentMode by remember { mutableStateOf("PHOTO") }
    var flashMode by remember { mutableStateOf("AUTO") }
    val modes = listOf("CINEMATIC", "VIDEO", "PHOTO", "PORTRAIT", "PANO")
    var showFlash by remember { mutableStateOf(false) }
    var zoomRatio by remember { mutableStateOf("1x") }

    LaunchedEffect(showFlash) {
        if (showFlash) {
            kotlinx.coroutines.delay(100)
            showFlash = false
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        // Viewfinder
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 160.dp) // Leave space for controls
                .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
        ) {
            AndroidView(
                factory = { ctx ->
                    val previewView = PreviewView(ctx).apply {
                        scaleType = PreviewView.ScaleType.FILL_CENTER
                    }
                    val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
                    
                    cameraProviderFuture.addListener({
                        val cameraProvider = cameraProviderFuture.get()
                        val preview = Preview.Builder().build().also {
                            it.setSurfaceProvider(previewView.surfaceProvider)
                        }
                        val cameraSelector = CameraSelector.Builder().requireLensFacing(lensFacing).build()
                        
                        try {
                            cameraProvider.unbindAll()
                            cameraProvider.bindToLifecycle(
                                lifecycleOwner,
                                cameraSelector,
                                preview
                            )
                        } catch(e: Exception) {
                            e.printStackTrace()
                        }
                    }, ContextCompat.getMainExecutor(ctx))
                    
                    previewView
                },
                update = { previewView ->
                    val cameraProviderFuture = ProcessCameraProvider.getInstance(context)
                    cameraProviderFuture.addListener({
                        val cameraProvider = cameraProviderFuture.get()
                        val preview = Preview.Builder().build().also {
                            it.setSurfaceProvider(previewView.surfaceProvider)
                        }
                        val cameraSelector = CameraSelector.Builder().requireLensFacing(lensFacing).build()
                        try {
                            cameraProvider.unbindAll()
                            cameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, preview)
                        } catch(e: Exception) {
                            e.printStackTrace()
                        }
                    }, ContextCompat.getMainExecutor(context))
                },
                modifier = Modifier.fillMaxSize()
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
            
            // Zoom controls overlay
            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 16.dp)
                    .background(Color.Black.copy(alpha = 0.5f), RoundedCornerShape(24.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                listOf(".5", "1x", "2x", "3x").forEach { z ->
                    Text(
                        text = z,
                        color = if (zoomRatio == z) Color(0xFFFFD700) else Color.White,
                        fontSize = if (zoomRatio == z) 14.sp else 12.sp,
                        fontWeight = if (zoomRatio == z) FontWeight.Bold else FontWeight.Normal,
                        modifier = Modifier.clickable { zoomRatio = z }
                    )
                }
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
                val icon = when(flashMode) {
                    "ON" -> Icons.Default.FlashOn
                    "OFF" -> Icons.Default.FlashOff
                    else -> Icons.Default.FlashAuto
                }
                val color = if (flashMode == "ON") Color(0xFFFFD700) else Color.White
                Icon(imageVector = icon, contentDescription = "Flash", tint = color, modifier = Modifier.size(24.dp))
            }
            
            Icon(Icons.Default.KeyboardArrowDown, contentDescription = "More", tint = Color.White, modifier = Modifier.size(24.dp))
            
            Icon(Icons.Default.FlipCameraAndroid, contentDescription = "Flip Camera", tint = Color.White, modifier = Modifier.size(24.dp).clickable {
                lensFacing = if (lensFacing == CameraSelector.LENS_FACING_BACK) {
                    CameraSelector.LENS_FACING_FRONT
                } else {
                    CameraSelector.LENS_FACING_BACK
                }
            })
        }

        // Bottom Controls Area
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(160.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            // Mode Selector
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                contentPadding = PaddingValues(horizontal = 40.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(modes) { mode ->
                    Text(
                        text = mode,
                        color = if (mode == currentMode) Color(0xFFFFD700) else Color.White,
                        fontSize = 12.sp,
                        fontWeight = if (mode == currentMode) FontWeight.Bold else FontWeight.Medium,
                        modifier = Modifier.clickable { currentMode = mode }
                    )
                }
            }
            
            // Action Row
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Gallery Thumbnail
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.White.copy(alpha = 0.5f), CircleShape)
                        .background(Color.DarkGray)
                ) {
                    coil.compose.AsyncImage(
                        model = "https://images.unsplash.com/photo-1540039155732-d692994d67af?q=80&w=200&h=200&fit=crop",
                        contentDescription = "Gallery",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                
                // Shutter Button
                Box(
                    modifier = Modifier
                        .size(72.dp)
                        .clip(CircleShape)
                        .border(3.dp, Color.White, CircleShape)
                        .padding(4.dp)
                        .clickable {
                            showFlash = true
                            if (currentMode == "CINEMATIC" || currentMode == "VIDEO") {
                                // simulate recording
                            } else {
                                // simulate snapping photo
                                viewModel.increaseFans(250)
                                viewModel.spendEnergy(5)
                            }
                        }
                ) {
                    Box(modifier = Modifier.fillMaxSize().clip(CircleShape).background(if (currentMode == "VIDEO" || currentMode == "CINEMATIC") Color.Red else Color.White))
                }
                
                // Switch Camera / Effects
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF222222)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Cached, 
                        contentDescription = "Switch Camera", 
                        tint = Color.White, 
                        modifier = Modifier.size(24.dp).clickable {
                            lensFacing = if (lensFacing == CameraSelector.LENS_FACING_BACK) {
                                CameraSelector.LENS_FACING_FRONT
                            } else {
                                CameraSelector.LENS_FACING_BACK
                            }
                        }
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
\n""" + old_camera_end + "\n" + after
    
    with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
        f.write(before + new_camera)
        print("Replaced!")
else:
    print("Could not find start and end tokens.")

