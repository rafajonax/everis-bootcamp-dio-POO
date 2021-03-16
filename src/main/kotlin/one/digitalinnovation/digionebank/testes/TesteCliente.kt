package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val cinthia = Cliente(
        nome = "Cinthia Gonzalez",
        cpf = "78798986799",
        clienteTipo = ClienteTipo.PF,
        senha = "senhacliente"
    )

    println(cinthia.toString())

    TesteAutenticacao().autentica(cinthia)

}