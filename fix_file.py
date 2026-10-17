with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

# Replace the mangled first line
bad_line = "package com.example\\n\\nimport androidx.compose.ui.input.pointer.pointerInputimport androidx.compose.foundation.gestures.detectVerticalDragGesturesimport kotlinx.coroutines.launchimport kotlinx.coroutines.delayimport androidx.compose.animation.*import androidx.compose.animation.core.*import androidx.compose.foundation.*import androidx.compose.foundation.layout.*import androidx.compose.foundation.lazy.*import androidx.compose.foundation.lazy.grid.LazyVerticalGridimport androidx.compose.foundation.lazy.grid.GridCellsimport androidx.compose.foundation.lazy.grid.itemsimport androidx.compose.foundation.shape.*import androidx.compose.material.icons.Iconsimport androidx.compose.material.icons.automirrored.filled.*import androidx.compose.material.icons.filled.*import androidx.compose.material3.*import androidx.compose.runtime.*import androidx.compose.ui.*"

good_lines = """package com.example

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
import androidx.compose.ui.*"""

content = content.replace(bad_line, good_lines)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)

print("Fixed")
