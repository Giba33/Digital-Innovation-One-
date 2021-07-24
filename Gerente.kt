package one.digitalinnovation.digionebank


class Gerent(

nome: String,
cpf: String,
salario: Double,
val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {

    override fun calculoAux1Lio(): Double = salario * 0.4

    override fun Login(): Boolean = "senha123"== senha
}
