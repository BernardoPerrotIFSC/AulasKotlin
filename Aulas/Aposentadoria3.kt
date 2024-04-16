class Pessoa(val sexo:String, val idade:Int, val tempo:Int){
    fun verificarAposentadoria():Boolean{
        return when(this.sexo){
            "m" -> this.idade>=65 && this.tempo >=30
            "f" -> this.idade>=60 && this.tempo >=25
            else -> false
    	}
    }
}
fun main(){
    val jucelino = Pessoa("m", 60, 40)
    val joaquina = Pessoa("f", 65, 27)
    if(joaquina.verificarAposentadoria()){
        println("Já pode!")
    }else{
        println("Não pode!")
    }
}
