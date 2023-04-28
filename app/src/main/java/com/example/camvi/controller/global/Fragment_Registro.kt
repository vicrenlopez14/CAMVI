package com.example.camvi.controller.global

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.camvi.R
import com.example.camvi.model.globales.CamviProcedures
import kotlinx.coroutines.launch
import org.ktorm.dsl.insert
import java.sql.Types

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_Registro.newInstance] factory method to
 * create an instance of this fragment.
 */

lateinit var nombre: EditText
lateinit var contacto: EditText
lateinit var dui: EditText
lateinit var correo: EditText
lateinit var contrasena: EditText
lateinit var btnRegistrar: Button

class Fragment_Registro : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        nombre = view?.findViewById(R.id.txtNombre)!!
        contacto = view?.findViewById(R.id.txtContacto)!!
        dui = view?.findViewById(R.id.txtDUI)!!
        correo = view?.findViewById(R.id.txtEmailCreate)!!
        contrasena = view?.findViewById(R.id.txtPasswordCreate)!!
        btnRegistrar = view?.findViewById(R.id.btnRegistrarse)!!


        btnRegistrar.setOnClickListener {
            val nombre = nombre.text.toString()
            val contacto = contacto.text.toString()
            val dui = dui.text.toString()
            val correo = correo.text.toString()
            val contrasena = contrasena.text.toString()

            if (nombre.isEmpty() || contacto.isEmpty() || dui.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    "Por favor, rellene todos los campos",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                lifecycleScope.launch {
                    val result = CamviProcedures.spRegistrarCliente(
                        nombre,
                        correo,
                        contrasena,
                        contacto,
                        dui
                    )

                    if (result == 1) {
                        Toast.makeText(
                            requireContext(),
                            "Registro exitoso",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else {
                        Toast.makeText(
                            requireContext(),
                            "Registro fallido",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                }


            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__registro, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_Registro.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_Registro().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}