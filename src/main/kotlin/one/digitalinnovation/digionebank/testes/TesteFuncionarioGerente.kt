package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val heloisa = Gerente(
        nome = "Heloisa Fernandez",
        cpf = "34356577866",
        salario = 7300.00,
        senha = "minhasenha"
    )

    ImprimeRelatorioFuncionario.imprime(heloisa)

    TesteAutenticacao().autentica(heloisa)
}

//fun imprimeRelatorio(funcionario: Funcionario): String = println(funcionario.toString())