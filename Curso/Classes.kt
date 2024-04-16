fun main(){
    val carro = Carro()
    carro.cor = "azul "
    println(carro.cor)
    carro.abrirPorta()

}
class Carro{
    var cor: String = " "
    fun abrirPorta(){
        println("Abrir porta do carro")
    }
}