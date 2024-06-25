package com.movistarhome.accessibilityworkshop.ui.liveRegions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.LiveRegionMode
import androidx.compose.ui.semantics.SemanticsProperties.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.liveRegion
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.toggleableState
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.movistarhome.accessibilityworkshop.R
import com.movistarhome.accessibilityworkshop.navigation.NavigationItem

@Composable
fun LiveRegionsScreen(navController: NavController) {
    var value by remember { mutableIntStateOf( 1000 ) }

    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(Modifier
            .height(40.dp)
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)
            .background(MaterialTheme.colorScheme.onSecondary)) {
            Text(
                "Puntuación: $value",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.semantics {
                    liveRegion = LiveRegionMode.Assertive
                }
            )
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.secondary,
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { value += 1000 }) {
            Text(
                stringResource(R.string.increment_button),
                style = MaterialTheme.typography.headlineSmall
            )
        }
        Button(
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.secondary,
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { value -= 1000 }) {
            Text(
                stringResource(R.string.reduce_button),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
