package br.digital.com.aulaKotlin.exercicio02.exercicio03

class Prova(
        val dificuldade:Int,
        val energiaNecessaria: Double
){
    init {
        println("Prova produzida [Dificuldade: $dificuldade, Energia Necessaria: $energiaNecessaria]")
    }
    fun podeRealizar(
            atleta: Atleta
    ):Boolean{
        println("[Dificuldade: $dificuldade, Energia Necessaria: $energiaNecessaria] :: [Nivel: ${atleta.nivel}, Energia: ${atleta.energia}]")
        return atleta.nivel >=  dificuldade && atleta.energia >= energiaNecessaria
    }
}