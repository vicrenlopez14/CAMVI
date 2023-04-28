package com.example.camvi.model.globales

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.sql.Types

class CamviFunctions {
    companion object {
        suspend fun fnIniciarSesion(correo: String, pass: String): Int? =
            withContext(Dispatchers.IO) {
                var tipoUsuario: Int? = null
                val callableStatement =
                    DatabaseConnection.prepareCall("{? = call fnIniciarSesion(?, ?)}")
                callableStatement.registerOutParameter(1, Types.INTEGER)
                callableStatement.setString(2, correo)
                callableStatement.setString(3, pass)
                callableStatement.execute()
                val result = callableStatement.getObject(1)
                if (result != null) {
                    tipoUsuario = result as Int
                }
                callableStatement.close()
                DatabaseConnection.close()
                return@withContext tipoUsuario
            }
    }
}