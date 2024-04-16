open class Professor(val nome:String){
    var ch = 0
    open fun getSalario():Int{
        return this.ch*100
    }
}
class Coordenador(nome:String):Professor(nome){
    override fun getSalario():Int=this.ch*300+100
}
fun main(){
    val professor = Professor("Bernardo")
    val coordenador = Coordenador("Igor")
    professor.ch=16
    coordenador.ch = 16    
    println("professor ${professor.nome} recebe R$ ${professor.getSalario()}")
    println("professor ${coordenador.nome} recebe R$ ${coordenador.getSalario()}")
}