package com.movistarhome.accessibilityworkshop.ui.announceAccessibility

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.movistarhome.accessibilityworkshop.R

@Composable
fun AnnounceForAccesibilityScreen() {
    val view = LocalView.current

    LaunchedEffect(key1 = Unit) {
        view.announceForAccessibility(
            "Bienvenido a la pantalla de Announce for Accessibility"
        )
    }

    DisposableEffect(key1 = Unit) {
        onDispose {
            view.announceForAccessibility("¡Hasta pronto!")
        }
    }

    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { view.announceForAccessibility("Has pulsado el botón de anunciar") },
            modifier = Modifier.semantics (mergeDescendants = true) {},
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            )) {
            Text(stringResource(R.string.announce_button), style = MaterialTheme.typography.headlineSmall)
        }
    }
}
