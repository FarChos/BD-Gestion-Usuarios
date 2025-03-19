package com.prueba.`User-Management-BD`.model

import java.sql.Timestamp

data class Token(
    val idUser: Long,
    val token: String,
    val expirationTime: Timestamp
)
