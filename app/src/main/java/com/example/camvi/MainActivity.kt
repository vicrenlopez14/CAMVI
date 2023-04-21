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
import androidx.compose.ui.Modifier
import com.example.camvi.ui.theme.CamviTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CamviTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Text("Si funciona")
                        Button(onClick = { /*TODO*/ }) {
                            Text("Hola")
                        }
                        Button(onClick = {}) {
                            Text("Hola Adri")
                        }
                    }

                }
            }
        }
    }
}