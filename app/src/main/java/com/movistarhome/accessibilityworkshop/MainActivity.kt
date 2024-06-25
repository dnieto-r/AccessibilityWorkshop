package com.movistarhome.accessibilityworkshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.movistarhome.accessibilityworkshop.navigation.NavigationItem
import com.movistarhome.accessibilityworkshop.ui.announceAccessibility.AnnounceForAccesibilityScreen
import com.movistarhome.accessibilityworkshop.ui.contentDescriptions.ContentDescriptionsScreen
import com.movistarhome.accessibilityworkshop.ui.detectTalkback.DetectTalkbackScreen
import com.movistarhome.accessibilityworkshop.ui.liveRegions.LiveRegionsScreen
import com.movistarhome.accessibilityworkshop.ui.onboarding.OnboardingScreen
import com.movistarhome.accessibilityworkshop.ui.roles.RolesScreen
import com.movistarhome.accessibilityworkshop.ui.theme.AccessibilityWorkshopTheme
import com.movistarhome.accessibilityworkshop.ui.traversalGroup.TraversalGroupScreen
import com.movistarhome.accessibilityworkshop.ui.workshopSelector.WorkshopSelectorScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AccessibilityWorkshopTheme {
                Scaffold (modifier = Modifier.fillMaxSize())
                { padding ->
                    NavGraph(padding)
                }
            }
        }
    }
}

@Composable
fun NavGraph(padding: PaddingValues) {
    val navController = rememberNavController()

    NavHost(
        modifier = Modifier.padding(padding),
        navController = navController,
        startDestination = NavigationItem.ONBOARDING.route
    ) {
        composable(NavigationItem.ONBOARDING.route) { OnboardingScreen(navController) }
        composable(NavigationItem.WORKSHOP_SELECTOR.route) { WorkshopSelectorScreen(navController) }
        composable(NavigationItem.TRAVERSAL_GROUP.route) { TraversalGroupScreen() }
        composable(NavigationItem.ANNOUNCE_FOR_ACCESSIBILITY.route) { AnnounceForAccesibilityScreen() }
        composable(NavigationItem.CONTENT_DESCRIPTIONS.route) { ContentDescriptionsScreen(navController) }
        composable(NavigationItem.LIVE_REGIONS.route) { LiveRegionsScreen(navController) }
        composable(NavigationItem.ROLES.route) { RolesScreen() }
        composable(NavigationItem.DETECT_TALKBACK.route) { DetectTalkbackScreen() }
    }
}
