package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): Double = salario * .5

    override fun login(): Boolean = "minhasenha" == senha
}