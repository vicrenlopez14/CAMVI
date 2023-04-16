package com.example.camvi.administradores.views.widgets

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.camvi.R

@Composable
fun AppBar(
    onNavigationIconClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.onSurface,


        navigationIcon = {
            IconButton(onClick = {
                onNavigationIconClick()
            }) {
                Icon(
                    imageVector = Icons.Filled.Menu, contentDescription = "Toggle drawer"
                )
            }
        },
    )
}