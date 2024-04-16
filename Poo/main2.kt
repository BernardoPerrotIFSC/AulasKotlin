class Carro(var cor:String){
    fun anda(){
        println("vrum vrum")
    }
    fun buzina(){
        println("!!!!!!!!!")
    }
    fun freia(){
        println("Freiando")
    }
}


fun main(){
    var carro = Carro("branco")
    println(carro.cor)
}