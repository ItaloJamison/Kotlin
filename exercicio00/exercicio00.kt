package br.digital.com.aulaKotlin.exercicio00

fun main(){
    println("Exercicio 1: "+ exercise1(2,4,7))
    println("Exercicio 2: "+ exercise2("Teste","Teste"))
    println("Exercicio 3: "+ exercise3(2))
    println("Exercicio 4: ")
    exercise4()
    println("\nExercicio 5: "+ exercise5(1,4,1,5))
    println("Exercicio 6: ")
    exercise6()
}

// Exercicio 1
fun exercise1(numeroA:Int, numeroB:Int, numeroC:Int): Int{
   /* var aux:Int

    aux = if(numeroA>=numeroB && numeroA>=numeroC){
        numeroA
    } else if(numeroB>=numeroA && numeroB>=numeroC) {
        numeroB
    } else{
        numeroC
    }

    return aux
    *
    */
    return maxOf(numeroA,numeroB,numeroC)
}
// Exercicio 2
fun exercise2(textoA:String,textoB:String):Boolean{
    return textoA!=textoB
}
// Exercicio 3
fun exercise3(numero:Int):Boolean{
    return (numero%2 == 0)
}
// Exercicio 4
fun exercise4(){
    for(num in 1..100 step 2)
        print("$num ")
}
// Exercicio 5
fun exercise5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return ((numA > numC && numA > numD) || (numB > numC && numB > numD))
}
// Exercicio 6
fun exercise6(){
    for(num in 1..100)
        print("$num ")
}