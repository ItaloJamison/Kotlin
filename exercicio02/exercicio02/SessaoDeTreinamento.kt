package br.digital.com.aulaKotlin.exercicio02.exercicio02

class SessaoDeTreinamento(
        var experiencia:Double
){
    init {
        println("Sessao de treinamento criada [Exp: +$experiencia]")
    }
    fun treinarA(
             jogadorDeFutebol: JogadorDeFutebol
    ){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.experiencia += experiencia
        println("${jogadorDeFutebol.nome} [Exp Inicial: ${jogadorDeFutebol.experiencia-experiencia} --- Exp Atual:${jogadorDeFutebol.experiencia}]")
    }
}