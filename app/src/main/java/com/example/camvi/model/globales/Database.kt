package com.example.camvi.model.globales

import org.ktorm.database.Database

object Database {
    val database = Database.connect(
        "jdbc:sqlserver://localhost:1433;databaseName=CamviDatabase",
        driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver",
        user = "sa",
        password = "Rical2023*"
    )
}