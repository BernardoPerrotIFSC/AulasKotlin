open class Professor(val nome:String){
    var ch = 0
    open fun getSalario():Int{
        return this.ch*100
    }
}
class Coordenador(nome:String):Professor(nome){
    override fun getSalario():Int{
        return this.ch*100+1000
    }
}
fun main(){
    val p = Professor("Euclides")
    p.ch = 20
    println(p.getSalario())
}