package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.example.camvi.controller.global.Fragment_Login
import com.example.camvi.ui.screens.administradores.AdministradoresNavigationScreen
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