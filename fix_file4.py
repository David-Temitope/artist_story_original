import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    text = f.read()

# I will just find the first "package com.example" and replace everything until "@Composable"
match = re.search(r'package com.example.*?@Composable', text, re.DOTALL)
if match:
    bad_part = match.group(0)
    good_part = """package com.example

import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import androidx.compose.ui.layout.ContentScale
import com.example.data.GameStateEntity
import com.example.data.GameViewModel
import com.example.data.NPCEntity
import com.example.data.ChatMessage
import com.example.data.ChatConversation
import com.example.ui.theme.*
import com.example.ui.social.SeeChatScreen
import com.example.ui.social.CastSocialScreen
import com.example.ui.music.SongifyScreen
import com.example.ui.music.MegaphoneScreen
import com.example.ui.music.JamsScreen
import com.example.ui.music.SharpScreen
import com.example.ui.music.TunesScreen
import com.example.ui.browser.WebHubAppScreen
import java.util.UUID

@Composable"""
    text = text.replace(bad_part, good_part)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(text)

