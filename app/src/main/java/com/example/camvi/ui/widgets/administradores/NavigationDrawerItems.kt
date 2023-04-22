package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions
import com.example.camvi.ui.widgets.global.DrawerScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerItems(navController: NavHostController, drawerState: DrawerState) {
    val currentBackStackEntryAsState by navController.currentBackStackEntryAsState()

    val destination = currentBackStackEntryAsState?.destination

    val screens = listOf(
        DrawerScreen.Inicio,
        DrawerScreen.Camarografos,
        DrawerScreen.Sesiones,
        DrawerScreen.Confirmaciones,
        DrawerScreen.Calificaciones,
        DrawerScreen.GaleriaDeFotos,
        DrawerScreen.CerrarSesion
    )

    screens.forEach { screen ->
        AddItem(
            screen = screen,
            currentDestination = destination,
            navController = navController,
            drawerState = drawerState
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItem(
    screen: DrawerScreen,
    currentDestination: NavDestination?,
    navController: NavController,
    drawerState: DrawerState
) {
    val scope = rememberCoroutineScope()

    NavigationDrawerItem(
        icon = { Icon(screen.icon, screen.title) },

        label = { Text(text = screen.title) },
        selected = currentDestination?.route == "SettingPage",
        onClick = {
            navController.navigate(screen.route, navOptions {
                this.launchSingleTop = true
                this.restoreState = true
            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )
    Spacer(modifier = Modifier.height(10.dp))

}