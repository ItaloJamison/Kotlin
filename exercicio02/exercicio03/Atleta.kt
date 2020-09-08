package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio03

class Atleta(
        var nome:String,
        var nivel:Int,
        var energia:Double,
) {
    init {
        println("Atleta Adicionado: $nome, Nivel: $nivel, Energia: $energia")
    }
}