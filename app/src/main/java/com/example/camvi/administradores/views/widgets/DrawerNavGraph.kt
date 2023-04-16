package com.example.camvi.administradores.views.widgets

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.camvi.administradores.views.screens.DashboardScreen

@Composable
fun DrawerNavGraph(
    navController: NavHostController,
    startDestination: String = AdministradoresMenuScreen.Home.id
) {
    NavHost(navController = navController, startDestination) {
        navigation(
            startDestination = startDestination,
            route = AdministradoresMenuScreen.Home.id
        ) {
            navigation(
                startDestination = AdministradoresMenuScreen.Home.id,
                route = AdministradoresMenuScreen.Home.id
            ) {
                composable(AdministradoresMenuScreen.Home.id) {
                    DashboardScreen()
                }
                composable(AdministradoresMenuScreen.Camarografos.id) {
                    BlankFragment()
                }
            }
        }
    }

}