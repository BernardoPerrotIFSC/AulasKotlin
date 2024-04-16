class Disciplina(val nome: String, var cargaHoraria: Int) {
    init {
        if (cargaHoraria <= 0 || cargaHoraria > 200) {
            throw IllegalArgumentException("Carga horária inválida")
        }
    }
}

fun main() {
    val disciplina = Disciplina("Matemática", 201)
    println("Disciplina: ${disciplina.nome}, Carga Horária: ${disciplina.cargaHoraria}")
}
