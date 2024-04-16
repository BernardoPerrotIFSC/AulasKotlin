open class Professor(val nome:String){
    var ch = 0
    open fun getSalario()=this.ch*100
}
class Coordenador( nome:String):Professor(nome){
    override fun getSalario():Int=this.ch*300+1000
}

fun main(){
    val p1 = Professor("Euclides")
    val c2 = Coordenador("Igor")
    p1.ch=16
    c2.ch=16
    println("professor ${c2.nome} recebe R$ ${c2.getSalario()}")
    println("professor ${p1.nome} recebe R$ ${p1.getSalario()}")
}