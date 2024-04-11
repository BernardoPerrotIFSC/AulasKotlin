class Curso(val nome:String, ch:Int, val modalidade:String){

    val turno = "noturno"
    val cargaHoraria = 0

    init{
        if(ch>0){
            val cargaHoraria = ch
        }else{
            println("carga horaria invalida")
        }
    }

    constructor(nome:String):this(nome, 2500, "ead"){
    }
    constructor():this("nome padrao", 1, "ead")
}

fun main(){
    val c1 = Curso("CTSI", 3000, "presencial")
    val c2 = Curso("outro curso")
    val c3 = Curso()

    println("curso ${c1.nome} carga horaria ${c1.cargaHoraria} modalidade ${c1.modalidade}")
    println("curso ${c2.nome} carga horaria ${c2.cargaHoraria} modalidade ${c2.modalidade}")
    println("curso ${c3.nome} carga horaria ${c3.cargaHoraria} modalidade ${c3.modalidade}")
}