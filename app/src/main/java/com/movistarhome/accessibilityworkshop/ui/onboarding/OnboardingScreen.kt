package com.movistarhome.accessibilityworkshop.ui.onboarding

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
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.invisibleToUser
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.movistarhome.accessibilityworkshop.R
import com.movistarhome.accessibilityworkshop.navigation.NavigationItem

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun OnboardingScreen(navController: NavController) {
    Column(
        Modifier
            .padding(vertical = 30.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .semantics {}
        ) {
            Text(
                text = stringResource(R.string.home_title),
                style = MaterialTheme.typography.displaySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 15.dp)
            )
            Text(
                text = stringResource(R.string.home_subtitle),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )
        }
        Icon(
            modifier = Modifier
                .height(120.dp)
                .semantics {
                },
            imageVector = ImageVector.vectorResource(R.drawable.logo_telefonica),
            contentDescription = "Logo de telefónica"
        )
        Button(
            modifier = Modifier.semantics (mergeDescendants = true) { },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = MaterialTheme.colorScheme.background,
                containerColor = MaterialTheme.colorScheme.tertiary,
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            ),
            onClick = { navController.navigate(NavigationItem.WORKSHOP_SELECTOR.route) }) {
            Text(stringResource(R.string.start_button), style = MaterialTheme.typography.headlineSmall)
        }
    }
}
