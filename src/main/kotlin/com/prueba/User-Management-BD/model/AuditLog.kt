package com.prueba.`User-Management-BD`.model

data class AuditLog (
    val idLog: Long,
    val userId: Long,
    val action : String // Deberia crear un enum para los tipos de acciones?
)