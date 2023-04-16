package com.example.camvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.camvi.administradores.views.screens.MainScreen
import com.example.camvi.ui.theme.CamviTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CamviTheme {
                MainScreen()
            }
        }
    }
}
