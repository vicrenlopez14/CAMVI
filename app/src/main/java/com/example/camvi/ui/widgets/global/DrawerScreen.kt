package com.example.camvi.ui.widgets.global

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.PriorityHigh
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.guru.fontawesomecomposelib.FaIcons
import com.guru.fontawesomecomposelib.FaIcons.FontAwesome

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

    // Screens for Inicio, Camarógrafos, Sesiones, Confirmaciones, Calificaciones, Galería de fotos and Cerrar Sesión
    object Inicio : DrawerScreen("Inicio", "Inicio", Icons.Filled.Home)
    object Camarografos : DrawerScreen("Camarografos", "Camarografos", Icons.Filled.PhotoCamera)
    object Sesiones : DrawerScreen("Sesiones", "Sesiones", Icons.Filled.Camera)
    object Confirmaciones : DrawerScreen("Confirmaciones", "Confirmaciones", Icons.Filled.Star)
    object Calificaciones :
        DrawerScreen("Calificaciones", "Calificaciones", Icons.Filled.PriorityHigh)

    object GaleriaDeFotos :
        DrawerScreen("GaleriaDeFotos", "GaleriaDeFotos", Icons.Filled.BrowseGallery)

    object CerrarSesion : DrawerScreen("CerrarSesion", "CerrarSesion", Icons.Filled.Logout)
}