package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rafael"
    var cpf: String = "999.999.999.00"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    val rafael = Pessoa()

    println(rafael.nome)
    println(rafael.cpf)

    println(rafael.Endereco().rua)
}