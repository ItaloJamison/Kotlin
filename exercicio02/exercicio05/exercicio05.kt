package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio05

fun main(){
    val concessionariaAzimute = Concessionaria()
    val carro01 = Veiculo(
            "Audi",
            "A4",
            2015,
            "Azul",
            10006.00
    )
    val cliente01 = Cliente(
            "Renato",
            "Cardoso",
            81999982223
    )
    concessionariaAzimute.registrarVenda(carro01,cliente01,80000.00)
}