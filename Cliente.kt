package one.digitalinnovation.digionebank

class Cliente(

) : (
    nome :String,
    cpf: String,
    clinteTipo:ClinteTipo,
): Pessoa(nome, cpf), Logavel{

    override fun login: Boolean = "123456" == senha
    override fun toString(): String = ""
    Nomr:        $nome
    cpf:         $cpf
    Tipo:     $clinteTipo


    "".trinIndent()

    }
}