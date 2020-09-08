package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio01

fun main(){
    val claudio = Cliente(
            "Claudio",
            "Roberto"
    )
    val maria = Cliente(
            "Maria",
            "Cascalho"
    )
    val contaClaudio = Conta(
            0,
            1000.0,
            claudio
    )
    val contaMaria = Conta(
            1,
            1000.0,
            maria
    )

    contaClaudio.sacar(
            1001.00
    )
    contaMaria.sacar(
            199.00
    )
    contaClaudio.depositar(
            100.0
    )
    contaMaria.depositar(
            1000.0
    )
}