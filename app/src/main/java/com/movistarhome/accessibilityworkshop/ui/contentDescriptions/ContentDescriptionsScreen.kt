package com.movistarhome.accessibilityworkshop.ui.contentDescriptions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.movistarhome.accessibilityworkshop.R
import com.movistarhome.accessibilityworkshop.navigation.NavigationItem

@Composable
fun ContentDescriptionsScreen(navController: NavController) {
    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            stringResource(R.string.hello_world),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.semantics {
                contentDescription = "Texto de prueba"
            })
        Icon(
            modifier = Modifier
                .height(120.dp)
                .semantics(mergeDescendants = true) { },
            imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Logo de Android"
        )
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) {
                onClick("hacer una acción de prueba") { false }
                contentDescription = "Botón de prueba"
            },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.secondary,
                containerColor = MaterialTheme.colorScheme.onSecondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.CONTENT_DESCRIPTIONS.route) }) {
            Text(
                stringResource(R.string.test_button),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
