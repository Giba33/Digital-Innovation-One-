package one.digitalinnovation.digionebank
import one.digitalinnovation.digionebank.TesteCliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){

    val Jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123,123,456,77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456",
    )
}

println(Jose)

 TesteAutentificacao().autentica(Jose)

 }