import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# Add imports
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

content = content.replace("import androidx.compose.ui.platform.testTag", "import androidx.compose.ui.platform.testTag" + imports_to_add)

# Replace old CameraAppScreen
old_camera = """fun CameraAppScreen(state: GameStateEntity, viewModel: GameViewModel) {
    var chosenLens by remember { mutableStateOf("Cinematic 35mm") }
    val lensOptions = listOf("Cinematic 35mm", "Retro Polaroid", "Anamorphic Wide")

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF0C0B0E)).padding(12.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Camera & Promo Capturing", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        
        Card(
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            border = BorderStroke(1.dp, Color.Gray),
            modifier = Modifier.fillMaxWidth().height(160.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(imageVector = Icons.Default.PhotoCamera, contentDescription = "Lens View", tint = NeonTeal, modifier = Modifier.size(48.dp))
                    Text("Promo Live Viewfinder", color = Color.White, fontSize = 11.sp)
                    Text("Lens Active: $chosenLens", color = Color.Gray, fontSize = 9.sp)
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            lensOptions.forEach { lens ->
                Button(
                    onClick = { chosenLens = lens },
                    colors = ButtonDefaults.buttonColors(containerColor = if (chosenLens == lens) NeonTeal else Color(0xFF1E1C29)),
                    modifier = Modifier.weight(1f).height(32.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(lens, fontSize = 9.sp, fontWeight = FontWeight.Bold, color = if (chosenLens == lens) Color.Black else Color.White)
                }
            }
        }

        Button(
            onClick = {
                viewModel.increaseFans(500)
                viewModel.spendEnergy(10)
                viewModel.spendCash(150.0)
            },
            colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
            modifier = Modifier.fillMaxWidth().height(48.dp)
        ) {
            Text("Shoot Social Promo (-10 Energy, -$150)", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
        }
    }
}"""

new_camera = """@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun CameraAppScreen(state: GameStateEntity, viewModel: GameViewModel) {
    val cameraPermissionState = rememberPermissionState(android.Manifest.permission.CAMERA)

    if (cameraPermissionState.status.isGranted) {
        RealCameraView(viewModel = viewModel)
    } else {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(Icons.Default.CameraAlt, contentDescription = null, tint = Color.White, modifier = Modifier.size(64.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text("Camera access is required", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Grant permission to enable the viewfinder.", color = Color.Gray, fontSize = 14.sp)
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
fun RealCameraView(viewModel: GameViewModel) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    var lensFacing by remember { mutableStateOf(CameraSelector.LENS_FACING_BACK) }
    var showFlash by remember { mutableStateOf(false) }
    
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
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
        
        // Flash overlay effect
        if (showFlash) {
            Box(modifier = Modifier.fillMaxSize().background(Color.White))
            LaunchedEffect(Unit) {
                kotlinx.coroutines.delay(100)
                showFlash = false
            }
        }
        
        // Camera UI Overlay
        Box(modifier = Modifier.fillMaxSize().padding(bottom = 24.dp, top = 48.dp, start = 24.dp, end = 24.dp)) {
            // Top Bar
            Row(modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter), horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(Icons.Default.FlashOff, contentDescription = "Flash", tint = Color.White, modifier = Modifier.size(28.dp).clickable { })
                Icon(Icons.Default.Settings, contentDescription = "Settings", tint = Color.White, modifier = Modifier.size(28.dp).clickable { })
            }
            
            // Bottom Bar
            Row(
                modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Gallery preview circle
                Box(modifier = Modifier.size(48.dp).clip(CircleShape).background(Color(0xFF222222)), contentAlignment = Alignment.Center) {
                    Icon(Icons.Default.PhotoLibrary, contentDescription = "Gallery", tint = Color.White.copy(alpha = 0.5f), modifier = Modifier.size(24.dp))
                }
                
                // Shutter Button
                Box(modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(4.dp, Color.LightGray, CircleShape)
                    .clickable { 
                        showFlash = true
                        viewModel.increaseFans(500)
                        viewModel.spendEnergy(10)
                        viewModel.spendCash(150.0)
                    }
                )
                
                // Switch Camera
                IconButton(onClick = {
                    lensFacing = if (lensFacing == CameraSelector.LENS_FACING_BACK) {
                        CameraSelector.LENS_FACING_FRONT
                    } else {
                        CameraSelector.LENS_FACING_BACK
                    }
                }) {
                    Icon(Icons.Default.FlipCameraAndroid, contentDescription = "Switch Camera", tint = Color.White, modifier = Modifier.size(36.dp))
                }
            }
            
            Text(
                "Shoot Social Promo (-10 Energy, -$150)", 
                color = Color.White, 
                fontSize = 11.sp, 
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 110.dp)
            )
        }
    }
}"""

if old_camera in content:
    content = content.replace(old_camera, new_camera)
else:
    print("Old camera screen not found!")

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)

