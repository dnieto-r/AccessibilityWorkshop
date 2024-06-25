package com.movistarhome.accessibilityworkshop.navigation

enum class Screen (name: String) {
    ONBOARDING("onboarding"),
    TRAVERSAL_GROUP("traversal_group"),
    WORKSHOP_SELECTOR("workshop_selector"),
    CONTENT_DESCRIPTIONS("content_descriptions"),
    LIVE_REGIONS("live_regions"),
    ANNOUNCE_FOR_ACCESSIBILITY("announce_for_accesibility"),
    ROLES("roles"),
    DETECT_TALKBACK("detect_talkback"),
}

sealed class NavigationItem(val route: String) {
    data object ONBOARDING : NavigationItem(Screen.ONBOARDING.name)
    data object WORKSHOP_SELECTOR : NavigationItem(Screen.WORKSHOP_SELECTOR.name)
    data object TRAVERSAL_GROUP : NavigationItem(Screen.TRAVERSAL_GROUP.name)
    data object CONTENT_DESCRIPTIONS : NavigationItem(Screen.CONTENT_DESCRIPTIONS.name)
    data object LIVE_REGIONS : NavigationItem(Screen.LIVE_REGIONS.name)
    data object ANNOUNCE_FOR_ACCESSIBILITY : NavigationItem(Screen.ANNOUNCE_FOR_ACCESSIBILITY.name)
    data object ROLES : NavigationItem(Screen.ROLES.name)
    data object DETECT_TALKBACK : NavigationItem(Screen.DETECT_TALKBACK.name)
}