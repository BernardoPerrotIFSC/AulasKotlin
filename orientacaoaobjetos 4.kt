open class Professor(val nome:String){
    var ch = 0
    open fun getSalario()=this.ch*100
}
class Coordenador( nome:String):Professor(nome){
    override fun getSalario():Int=this.ch*300+1000
}

fun main(){
    cal p1 = Professor("Euclides")
    p1.ch=16
    println("professor ${p1.nome} recebe R$ ${p1.getSalario()}")
}