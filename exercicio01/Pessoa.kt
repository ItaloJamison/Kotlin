package br.digital.com.aulaKotlinSemObjetos.exercicio01

class Pessoa(
        var nome:String,
        var sobrenome:String,
        var idade:Int
){
    init{
        println("Classe iniciada $nome $sobrenome e idade $idade")
    }
    fun jantar(){
        println("A pessoa $nome $sobrenome acabou de jantar")
    }
    fun passearComDog(cachorro: Cachorro){
        println("$nome está passeando com ${cachorro.nome}")
    }
}