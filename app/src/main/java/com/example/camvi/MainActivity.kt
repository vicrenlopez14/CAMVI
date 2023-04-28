package com.example.camvi

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.example.camvi.controller.global.Fragment_Login
import com.example.camvi.databinding.FragmentPrincipalBinding
import com.example.camvi.ui.screens.administradores.AdministradoresNavigationScreen
import com.example.camvi.ui.theme.CustomCamviTheme
import com.example.camvi.ui.widgets.global.GlobalNavGraph
import com.example.camvi.utils.FragmentScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomCamviTheme {
                Surface {
                    val navController = rememberNavController()

                    GlobalNavGraph(navController)
                }
            }
        }
    }
}