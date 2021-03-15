package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "Digione", numero = 12)

//    println(digiOneBank.nome)
//    println(digiOneBank.numero)
    println(digiOneBank.info())

    val jonaxBank = digiOneBank.copy(nome = "Jonaxbank")

//    println(jonaxBank.nome)
//    println(jonaxBank.numero)
    println(jonaxBank.info())
}