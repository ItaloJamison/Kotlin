package br.digital.com.aulaKotlinSemObjetos.exercicio02.exercicio04

class Tripe(
        var dobrado: Boolean,
        var alturaMinima: Int,
        var alturaMaxima: Int,
        var alturaAtual: Int
) {
    fun definirAltura(novaAltura:Int){
        if( novaAltura<= alturaMaxima && novaAltura >= alturaMinima){
            alturaAtual = novaAltura
            println("[Nova altura: $alturaAtual]")
        }
        else{
            println("Impossivel atribuir a nova altura")
        }
    }
    fun dobrar(){
        if (!dobrado){
            dobrado = true
            println("Tripe dobrado")
        }
        else{
            println("Tripe já dobrado")
        }
    }
    fun desdobrar(){
        if(dobrado){
            dobrado = false
            println("Tripe desdobrado")
        }
        else{
            println("Tripe já desdobrado")
        }
    }
    fun guardar(){
        dobrar()
        definirAltura(alturaMinima)
    }
    fun prontoParaGuardar(){
        if(dobrado && alturaAtual == alturaMinima)
        {
            println("Pronto para guardar")
        }
        else{
            println("Nao esta pronto para guardar")
        }
    }
    fun usar(){
        desdobrar()
        definirAltura(((alturaMaxima+1)/2))
    }
    fun prontoParaUsar(){
        if (!dobrado && alturaAtual>(alturaMaxima/2)){
            println("Pronto para usar")
        }
        else {
            println("Nao esta pronto para usar")
        }
    }
}