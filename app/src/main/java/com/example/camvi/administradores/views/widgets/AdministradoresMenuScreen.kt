package com.example.camvi.administradores.views.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AdministradoresMenuScreen(
    val id: String, val title: String, val contentDescription: String, val icon: ImageVector
) {
    object Home : AdministradoresMenuScreen(
        "home", "Home", "Home", Icons.Filled.Home
    )

    object Camarografos : AdministradoresMenuScreen(
        "camarografos", "Camarografos", "Camarografos", Icons.Filled.Person
    )

    object Sesiones : AdministradoresMenuScreen(
        "sesiones", "Sesiones", "Sesiones", Icons.Filled.List
    )

    object Confirmaciones : AdministradoresMenuScreen(
        "confirmaciones", "Confirmaciones", "Confirmaciones", Icons.Filled.Check
    )

    object Calificaciones : AdministradoresMenuScreen(
        "calificaciones", "Calificaciones", "Calificaciones", Icons.Filled.Star
    )

    object GaleriaDeFotos : AdministradoresMenuScreen(
        "galeriaDeFotos", "Galeria de Fotos", "Galeria de Fotos", Icons.Filled.Edit
    )
}