package com.prueba.Gestion_Usuario.modelo

import java.time.LocalDate

data class Loan(
    val idLoan: Long,
    val bookId: Long,
    val userId: Long,
    val loanDate: LocalDate
)