package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val petruchio = Funcionario(nome = "Julião Petruchio", cpf = "11111111111", salario = BigDecimal.valueOf(5000.00))

    println(petruchio.nome)
    println(petruchio.cpf)
    println(petruchio.salario)
}