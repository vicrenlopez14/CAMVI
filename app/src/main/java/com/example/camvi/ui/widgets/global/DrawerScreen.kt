package com.example.camvi.ui.widgets.global

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Bienvenida : DrawerScreen("Bienvenida", "Bienvenida", Icons.Filled.Home)
    object InicioDeSesion : DrawerScreen("InicioDeSesion", "InicioDeSesion", Icons.Filled.Home)
    object Registro : DrawerScreen("Registro", "Registro", Icons.Filled.Home)
    object OlvidasteTuContrasena :
        DrawerScreen("OlvidasteTuContrasena", "OlvidasteTuContrasena", Icons.Filled.Home)

    object VerificaElCodigo :
        DrawerScreen("VerificaElCodigo", "VerificaElCodigo", Icons.Filled.Home)

    object CreaNuevaContrasena :
        DrawerScreen("CreaNuevaContrasena", "CreaNuevaContrasena", Icons.Filled.Home)

}