package com.example.camvi.administradores.views.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.camvi.administradores.views.widgets.AdministradoresMenuScreen
import com.example.camvi.administradores.views.widgets.AppBar
import com.example.camvi.administradores.views.widgets.DrawerBody
import com.example.camvi.administradores.views.widgets.DrawerHeader
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(topBar = {
        AppBar(onNavigationIconClick = {
            scope.launch {
                scaffoldState.drawerState.open()
            }
        })
    },
        // Rounded and blurry drawer
        scaffoldState = scaffoldState,

        drawerContent = {
            DrawerHeader()
            DrawerBody(items = listOf(
                AdministradoresMenuScreen.Home,
                AdministradoresMenuScreen.Sesiones,
                AdministradoresMenuScreen.Camarografos,
                AdministradoresMenuScreen.Calificaciones,
                AdministradoresMenuScreen.Confirmaciones,
                AdministradoresMenuScreen.GaleriaDeFotos,

                ), onItemClick = {
                when (it.id) {
                    "home" -> println("Clicked on home")
                    "settings" -> println("Clicked on settings")
                    "help" -> println("Clicked on help")
                }
            })
        }) {

        Box(modifier = Modifier.padding(it)) {
            Text(text = "Hello World!")
            BlankFragment()
        }
    }
}