package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val senha: String,
    val clienteTipo: ClienteTipo
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "senhacliente" == senha

    override fun toString(): String = """
        Nome:   $nome
        CPF:    $cpf
        Tipo:   ${clienteTipo.descricao}
    """.trimIndent()
}