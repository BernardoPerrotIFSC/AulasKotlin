class Teste(val a:Int, val b:String){

    fun testarMetodo():String{
        return "hello"
    }
    /*val testarMetodo = ():String -> "hello"*/

}

fun main(){

    val t = Teste(3, "oi")
    println(t.b)
    println(t.testarMetodo())


}