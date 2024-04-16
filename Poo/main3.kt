class Professor(val nome:String, var ch:Int){
    fun getSalario(){
        return this.ch*100
    }
}
fun main(){
    val p = Professor("Euclides", 20)
    println(p.getSalario())
}