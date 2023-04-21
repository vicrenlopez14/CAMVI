package com.example.camvi.ui.widgets.administradores

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.camvi.ui.widgets.global.DrawerNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdministradoresMainScreen() {
    val navController = rememberNavController()

    Scaffold() {
        Box(modifier = Modifier.padding(it)) {
            DrawerNavGraph(navController = navController)
        }
    }

}