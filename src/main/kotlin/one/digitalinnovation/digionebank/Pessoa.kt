package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rafael"
    var cpf: String = "999.999.999.00"
}

fun main() {
    val rafael = Pessoa()

    println(rafael.nome)
    println(rafael.cpf)
}