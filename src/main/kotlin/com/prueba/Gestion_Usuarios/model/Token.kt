package com.prueba.Gestion_Usuarios.model

import java.sql.Timestamp

data class Token(
    val idUser: Long,
    val token: String,
    val expirationTime: Timestamp
)
