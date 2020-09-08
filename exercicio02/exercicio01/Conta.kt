package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio01

class Conta(
        var numeroDaConta:Int,
        var saldo:Double,
        val cliente: Cliente
){
    init {
        println("A conta de ${cliente.nome} ${cliente.sobrenome} foi criada com sucesso com um saldo de [R\$ $saldo]")
    }
    fun sacar(quantidade:Double){
        if(quantidade>saldo){
            println("${cliente.nome} ${cliente.sobrenome} [Saldo insuficiente]")
        }
        else{
            saldo -= quantidade
            println("${cliente.nome} ${cliente.sobrenome} [Saque realizado: R\$ $quantidade --- Saldo R\$ $saldo]" )
        }
    }
    fun depositar(quantidade: Double){
        saldo += quantidade
        println("${cliente.nome} ${cliente.sobrenome} [Deposito realizado: R\$ $quantidade --- Saldo R\$ $saldo]")
    }
}