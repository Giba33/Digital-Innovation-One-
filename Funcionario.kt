package digitalinnovation.digionebank
 abstract class Funcionario(
     nome: String,
     cpf: String,
     val salario: Double,
 ): Pessoa(nome: cpf) {
     protected abstract fun calculoAux1Lio(): Double

     override  fun toString(): String = ""
     Nome: $nome
     cpf:$cpf
     Salario: $salario
     Aux1Lio: $(calculoAux1Lio())}
"".trinIndent()
     }
 }