package br.digital.com.aulaKotlin.exercicio02.exercicio02

fun main(){
    val jogadorDeFutebol01 = JogadorDeFutebol(
            "Rafael",
            100.0,
            100.0,
            0,
            0.0
    )
    val jogadorDeFutebol02 = JogadorDeFutebol(
            "Murilo",
            100.0,
            60.0,
            2,
            2.0
    )
    val sessaoDeTreinamento01 = SessaoDeTreinamento(
            10.0
    )
    sessaoDeTreinamento01.treinarA(
            jogadorDeFutebol01
    )
    sessaoDeTreinamento01.treinarA(
            jogadorDeFutebol02
    )
}