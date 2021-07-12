package conta

class ContaPessoaisica(
       val numero: Int,
        var agencia: String

){
    val numeroConta = numero
    protected val agencia = agencia

init{
    println("num: $numero - agencia: $agencia")
}
}

fun main(){
    val conta1 = ContaPessoaFisica(numero:123, agencia:"001")

    var conta2 = ContaPessoaFisica(numero:321, agencia:"002")
}
