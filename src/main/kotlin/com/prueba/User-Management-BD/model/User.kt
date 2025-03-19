package com.prueba.Gestion_Usuario.modelo

import com.prueba.`User-Management-BD`.types.UserStatus
import java.sql.Date

data class User(
    val idUser : Long,
    val firstName : String,
    val lastName : String,
    val mail : String,
    val password : String,
    val status : UserStatus,
    val date: Date
)