class Pessoa(nome:String, sobrenome:String){
    var nome = nome
    var sobrenome = sobrenome
    fun nomeCompleto():String{
        return "$nome $sobrenome"
    }
}


fun main(){
    //val p = Pessoa("Miguel", "Zarth")
    val p:Pessoa? = null
    println(p?.nomeCompleto())

}