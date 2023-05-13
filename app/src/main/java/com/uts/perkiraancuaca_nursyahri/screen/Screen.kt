package com.uts.perkiraancuaca_nursyahri.screen

sealed class Screen(val route: String){
    object Home: Screen("Home")
    object DailyForecast: Screen("DailyForecast")
}