package br.digital.com.aulaKotlinSemObjetos.exercicio01

fun main(){
    val cachorro = Cachorro("Tiber","Husky")
    val pessoa = Pessoa("Italo","Jamison",19)
    pessoa.jantar()
    pessoa.passearComDog(cachorro)

}

