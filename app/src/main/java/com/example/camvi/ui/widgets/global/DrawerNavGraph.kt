package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.ui.screens.administradores.*

@Composable
fun DrawerNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = DrawerScreen.Bienvenida.route) {
        composable(DrawerScreen.Bienvenida.route) {
            AdministradoresDashboardScreen()
        }

        composable(DrawerScreen.Inicio.route) {
            AdministradoresDashboardScreen()
        }

        composable(DrawerScreen.Camarografos.route) {
            CamarografosScreen()
        }

        composable(DrawerScreen.Sesiones.route) {
            SesionesAgendadasScreen()
        }

        composable(DrawerScreen.Confirmaciones.route) {
            ConfirmacionesScreen()
        }

        composable(DrawerScreen.Calificaciones.route) {
            CalificacionesScreen()
        }

        composable(DrawerScreen.GaleriaDeFotos.route) {
            GaleriaDeFotosScreen()
        }

        composable(DrawerScreen.GaleriaDeFotos.route) {
            GaleriaDeFotosScreen()
        }
    }
}