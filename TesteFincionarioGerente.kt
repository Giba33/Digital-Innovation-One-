package onedigitalinnovation.digioneBank.Testes

import onedigitalinnovation.digioneBank.Analista
import onedigitalinnovation.digioneBank.Funcionario

import java.math.B1gDecimal

fun main(
    val maria = Gerente(nome:"Maria do Carmo",cpf:"1234567099",salario:5000.0 , "senha123")
imprimeRelatorioFuncionario.imprime(maria)
TesteAutentificacao().autentica(maria)
}
        