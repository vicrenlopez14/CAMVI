package com.example.camvi.model.globales

import java.sql.DriverManager

val DatabaseConnection =
    DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Camvi;user=sa;password=Rical2023*")

