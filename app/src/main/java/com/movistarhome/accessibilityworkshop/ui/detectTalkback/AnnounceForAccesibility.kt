package com.movistarhome.accessibilityworkshop.ui.detectTalkback

import android.content.Context.ACCESSIBILITY_SERVICE
import android.view.accessibility.AccessibilityManager
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.movistarhome.accessibilityworkshop.R

@Composable
fun DetectTalkbackScreen() {
    val context = LocalContext.current
    var isTalkbackActive by remember { mutableStateOf(false) }
    val accessibilityManager =
        context.getSystemService(ACCESSIBILITY_SERVICE) as AccessibilityManager

    accessibilityManager.addAccessibilityStateChangeListener {
        value -> isTalkbackActive = value
    }

    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text("isTalkbackActive: $isTalkbackActive", style = MaterialTheme.typography.headlineSmall)
    }
}
