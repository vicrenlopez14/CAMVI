package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.wear.tiles.material.Text
import com.example.camvi.ui.screens.administradores.AdministradoresNavigationScreen
import com.example.camvi.ui.theme.CamviTheme
import com.example.camvi.ui.theme.CustomCamviTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomCamviTheme {
                Surface {
                    AdministradoresNavigationScreen()
                }
            }
        }
    }
}