package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio05

class Venda(
        val veiculoVendido:Veiculo,
        val cliente: Cliente,
        val valorDaVenda: Double
){
    init {
        println("Venda Registrada: [ Valor: $valorDaVenda - Veiculo: ${veiculoVendido.marca} ${veiculoVendido.modelo} ${veiculoVendido.anoDeFabricacao} kM${veiculoVendido.quilometragem}]" )
        println("--Cliente: ${cliente.nome} ${cliente.sobrenome} Contato: ${cliente.contato} --")
    }
}