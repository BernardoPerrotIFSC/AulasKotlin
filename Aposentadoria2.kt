fun main() {
    val sexo = "m"
    val idade = 65
    val tempo = 30
    val aposentar = when(sexo){
        "m" -> idade>=65 && tempo >=30
        "f" -> idade>=60 && tempo >=25
        else -> false
    }
    if(aposentar){
        println("Já pode!")
    }else{
        println("Não pode!")
    }
}
