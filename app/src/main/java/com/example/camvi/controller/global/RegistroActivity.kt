package com.example.camvi.controller.global

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.camvi.R
import com.example.camvi.model.globales.CamviProcedures
import kotlinx.coroutines.launch

lateinit var nombre: EditText
lateinit var contacto: EditText
lateinit var dui: EditText
lateinit var correo: EditText
lateinit var contrasena: EditText
lateinit var btnRegistrar: Button

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        nombre = findViewById(R.id.txtName)
        contacto = findViewById(R.id.txtContact)
        dui = findViewById(R.id.txtDUI)
        correo = findViewById(R.id.txtEmailCreate)
        contrasena = findViewById(R.id.txtPasswordCreate)
        btnRegistrar = findViewById(R.id.btnCreateUser)


        btnRegistrar.setOnClickListener {
            val nombre = nombre.text.toString()
            val contacto = contacto.text.toString()
            val dui = dui.text.toString()
            val correo = correo.text.toString()
            val contrasena = contrasena.text.toString()

            if (nombre.isEmpty() || contacto.isEmpty() || dui.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(
                    this,
                    "Por favor, rellene todos los campos",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {

                val result = CamviProcedures.spRegistrarCliente(
                    nombre,
                    correo,
                    contrasena,
                    contacto,
                    dui
                )

                if (result == 1) {
                    val intent: Intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(
                        this@RegistroActivity,
                        "Error al registrar usuario",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}