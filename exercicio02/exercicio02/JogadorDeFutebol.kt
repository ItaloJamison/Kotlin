package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio02

class JogadorDeFutebol(
        var nome:String,
        var energia:Double,
        var alegria:Double,
        var gols:Int,
        var experiencia:Double
) {
    init {
        println("Jogador Iniciado: [Nome: $nome, Energia:$energia, Alegria: $alegria, Gols: $gols, Experiencia: $experiencia]")
    }
    fun fazerGol(){
        energia -= 5.0
        alegria += 10.0
        gols++
        println("[$nome] GOOOL ")
    }
    fun correr(){
        energia -= 10.0
        println("[$nome] Cansou")
    }
}