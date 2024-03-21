package com.jdiproductionz.wayfare

sealed class Screen(val route: String) {
    object LoginScreen : Screen("loginScreen")
    object MainScreen : Screen("mainScreen")
}
