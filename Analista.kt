package onedigitalinnovation.digioneBank
class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome,cpf,salario) {
    override fun calculoAux1Lio() = salario * 0.1
}