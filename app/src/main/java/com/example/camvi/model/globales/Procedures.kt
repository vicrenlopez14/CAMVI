package com.example.camvi.model.globales


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Types

class CamviProcedures {
    companion object {
        suspend fun spRegistrarCliente(
            nombre: String,
            correo: String,
            pass: String,
            contacto: String,
            dui: String
        ): Int = withContext(Dispatchers.IO) {
            var result = 0
            val callableStatement =
                DatabaseConnection.prepareCall("{? = call spRegistrarCliente(?, ?, ?, ?, ?)}")
            callableStatement.registerOutParameter(1, Types.INTEGER)
            callableStatement.setString(2, nombre)
            callableStatement.setString(3, correo)
            callableStatement.setString(4, pass)
            callableStatement.setString(5, contacto)
            callableStatement.setString(6, dui)
            callableStatement.execute()
            result = callableStatement.getInt(1)
            callableStatement.close()
            return@withContext result
        }

    }


}