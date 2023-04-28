package com.example.camvi.ui.widgets.global

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.camvi.controller.global.Fragment_Login
import com.example.camvi.databinding.FragmentLoginBinding
import com.example.camvi.ui.screens.administradores.*
import com.example.camvi.utils.FragmentScreen

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

        composable(DrawerScreen.CerrarSesion.route) {
            FragmentScreen { context, parent ->
                FragmentLoginBinding.inflate(LayoutInflater.from(context), parent, true).root
            }
        }

    }
}