package com.example.camvi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.Navigation
import com.example.camvi.controller.administradores.AdministradoresMainScreen
import com.example.camvi.controller.global.LoginActivity
import com.example.camvi.controller.global.RegistroActivity
import com.example.camvi.ui.widgets.global.CamviScreen

lateinit var loginButton: Button
lateinit var registerButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.btnIniciarSesion)
        registerButton = findViewById(R.id.btnRegistrarse)

        loginButton.setOnClickListener {
            val intent: Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            val intent: Intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}