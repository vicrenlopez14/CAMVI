package com.example.camvi.controller.global

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.lifecycleScope
import com.example.camvi.R
import com.example.camvi.controller.administradores.AdministradoresMainScreen
import com.example.camvi.model.globales.CamviFunctions
import kotlinx.coroutines.launch

lateinit var txtEmail: EditText
lateinit var txtPassword: EditText
lateinit var btnLogin: Button


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtEmail = findViewById(R.id.txtEmail)
        txtPassword = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnIniciarSesionIni)

        btnLogin.setOnClickListener {
            val email = txtEmail.text.toString()
            val password = txtPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                txtEmail.error = "Por favor ingrese su correo"
                txtPassword.error = "Por favor ingrese su contraseña"
            } else {

                val tipoUsuario = CamviFunctions.fnIniciarSesion(email, password)

                // Switch
                when (tipoUsuario) {
                    1 -> {
                        val intent = Intent(this, AdministradoresMainScreen::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        startActivity(intent)
                    }

                    2 -> {
                        val intent = Intent(this, AdministradoresMainScreen::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        startActivity(intent)
                    }

                    3 -> {
                        val intent = Intent(this, AdministradoresMainScreen::class.java)
                        intent.putExtra("email", email)
                        intent.putExtra("password", password)
                        intent.putExtra("tipoUsuario", tipoUsuario)
                        startActivity(intent)
                    }

                    else -> {
                        txtEmail.error = "Correo o contraseña incorrectos"
                        txtPassword.error = "Correo o contraseña incorrectos"
                    }
                }
            }
        }
    }
}