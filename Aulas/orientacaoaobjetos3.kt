class Curso(n:String){

    var nome=nome
    set(value){
        field=value
    }
    get(){
        return "o nome do curso é: $field"
    }

    var ch = 0
    set(value){
        if(value<0){
            println("ch invalida")
        }else{
            field=value
        }
    }
}

fun main(){
    val c = Curso("CSTSI")
    c.ch = 600
    println("${c.nome} carga horaria ${c.ch}")

}