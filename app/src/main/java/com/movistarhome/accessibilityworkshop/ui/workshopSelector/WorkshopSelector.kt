package com.movistarhome.accessibilityworkshop.ui.workshopSelector

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
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.movistarhome.accessibilityworkshop.R
import com.movistarhome.accessibilityworkshop.navigation.NavigationItem

@Composable
fun WorkshopSelectorScreen(navController: NavController) {
    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.CONTENT_DESCRIPTIONS.route) }) {
            Text(stringResource(R.string.content_descriptions_screen), style = MaterialTheme.typography.headlineSmall)
        }
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.LIVE_REGIONS.route) }) {
            Text(stringResource(R.string.live_regions_screen), style = MaterialTheme.typography.headlineSmall)
        }
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.TRAVERSAL_GROUP.route) }) {
            Text(stringResource(R.string.traversal_group_screen), style = MaterialTheme.typography.headlineSmall)
        }
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.ANNOUNCE_FOR_ACCESSIBILITY.route) }) {
            Text(stringResource(R.string.announce_screen), style = MaterialTheme.typography.headlineSmall)
        }
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.ROLES.route) }) {
            Text(stringResource(R.string.roles_screen), style = MaterialTheme.typography.headlineSmall)
        }
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.DETECT_TALKBACK.route) }) {
            Text(stringResource(R.string.detect_talkback_screen), style = MaterialTheme.typography.headlineSmall)
        }
    }
}
