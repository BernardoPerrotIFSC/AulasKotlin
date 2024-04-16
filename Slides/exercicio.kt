fun main(){
    fun somar(a:Double, b:Double): Double{
        return (a+b)
    }
    fun subtrair(a:Double, b:Double): Double{
        return (a-b)
    }
    fun dividir(a:Double, b:Double): Double{
        return (a/b)
    }
    fun multiplicar(a:Double, b:Double): Double{
        return (a*b)
    }
    fun potencia(a:Double, b:Double):Double{
        return Math.pow(a,b)
    }
    fun calculadora(a:Double, b:Double, funcao: (Double, Double) -> Double): Double{
        return funcao(a,b)
    }
    println(calculadora(2.0, 3.0, ::potencia))
}