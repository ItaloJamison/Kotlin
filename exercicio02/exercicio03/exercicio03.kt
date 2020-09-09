package br.digital.com.aulaKotlin.exercicio02.exercicio03

fun main(){
    val atleta01 = Atleta(
            "Henrique",
            10,
            40.0
    )
    val atleta02 = Atleta(
            "Marina",
            20,
            35.0
    )
    val prova01 = Prova(
            20,
            15.0
    )
    val prova02 = Prova(
            5,
            15.0
    )
    val prova03 = Prova(
            50,
            15.0
    )
    val prova04 = Prova(
            8,
            15.5
    )
    val prova05 = Prova(
            5,
            45.0
    )
    val prova06 = Prova(
            11,
            25.0
    )

    println("${prova01.podeRealizar(atleta01)}")
    println("${prova02.podeRealizar(atleta02)}")
    println("${prova03.podeRealizar(atleta01)}")
    println("${prova04.podeRealizar(atleta02)}")
    println("${prova05.podeRealizar(atleta01)}")
    println("${prova06.podeRealizar(atleta02)}")
}
