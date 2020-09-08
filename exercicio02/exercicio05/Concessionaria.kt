package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio05

class Concessionaria() {
    init {
        println("Concessionaria criada!")
    }
    fun registrarVenda(veiculo: Veiculo,cliente: Cliente,valor:Double){
        val venda = Venda(
                veiculo,
                cliente,
                valor)
    }
}