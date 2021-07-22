package one.digitalinnovation.digioneBank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome,cpf, salario = salario){
    override fun calculoAux1Lio(): Double = salario * 0.4
}