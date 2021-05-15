package br.com.exemplo.linkedin.cliente

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Cliente(
    val nome:String,
    val email:String,
    val dataNascimento: LocalDate
){
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null
    val createAt: LocalDateTime = LocalDateTime.now()
}



