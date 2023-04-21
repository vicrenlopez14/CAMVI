package com.example.camvi.ui.widgets.global

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.camvi.ui.screens.administradores.AdministradoresDashboardScreen

@Composable
fun DrawerNavGraph(navController: NavHostController) {
//    NavHost(
//        navController = navController,
//        startDestination = DrawerScreen.Bienvenida.route
//    ) {
//        composable(route = DrawerScreen.Bienvenida.route) {
//            BienvenidaScreen()
//        }
//        composable(DrawerScreen.InicioDeSesion.route) {
//            InicioDeSesionScreen()
//        }
//        composable(DrawerScreen.Registro.route) {
//            RegistroScreen()
//        }
//        composable(DrawerScreen.OlvidasteTuContrasena.route) {
//            OlvidasteTuContrasenaScreen()
//        }
//        composable(DrawerScreen.VerificaElCodigo.route) {
//            VerificaElCodigoScreen()
//        }
//        composable(DrawerScreen.CreaNuevaContrasena.route) {
//            CreaNuevaContrasenaScreen()
//        }
//    }
    NavHost(navController = navController, route = DrawerScreen.Bienvenida.route) {
        composable(route = DrawerScreen.Bienvenida.route) {
            AdministradoresDashboardScreen()
        }
    }
}