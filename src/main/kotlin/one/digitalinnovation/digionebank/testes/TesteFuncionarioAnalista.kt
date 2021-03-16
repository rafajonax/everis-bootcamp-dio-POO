package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val petruchio = Analista(nome = "Julião Petruchio", cpf = "11111111111", salario = 5000.00)

    ImprimeRelatorioFuncionario.imprime(petruchio)
}

