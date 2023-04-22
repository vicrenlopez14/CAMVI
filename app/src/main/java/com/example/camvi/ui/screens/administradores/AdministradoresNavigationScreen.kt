package com.example.camvi.ui.screens.administradores

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.camvi.ui.widgets.administradores.DrawerContent
import com.example.camvi.ui.widgets.global.DrawerNavGraph
import com.example.camvi.ui.widgets.global.DrawerScreen
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdministradoresNavigationScreen() {
    val navController = rememberNavController()

    Scaffold(bottomBar = { BottomBar(navController = navController) }) {
        Box(modifier = Modifier.padding(it)) {
            DrawerNavGraph(navController = navController)
        }
    }
}

@Composable
fun BottomBar(navController: NavController) {
    val screens = listOf(
        DrawerScreen.Inicio,
        DrawerScreen.Camarografos,
        DrawerScreen.Sesiones,
        DrawerScreen.Confirmaciones,
        DrawerScreen.Calificaciones,
        DrawerScreen.GaleriaDeFotos,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: DrawerScreen,
    currentDestination: NavDestination?,
    navController: NavController
) {
    BottomNavigationItem(
        onClick = { /*TODO*/ },
        label = { Text(screen.title) },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        alwaysShowLabel = true,
        icon = { screen.icon })

}