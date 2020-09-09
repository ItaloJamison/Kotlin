package br.digital.com.aulaKotlin.exercicio02.exercicio04

fun main(){
    val tripe = Tripe(
            false,
            1,
            7,
            3
    )
    tripe.definirAltura(2)
    tripe.usar()
    tripe.guardar()
    tripe.prontoParaGuardar()
    tripe.prontoParaUsar()
}