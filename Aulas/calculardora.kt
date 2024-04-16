import kotlin.math.pow
fun main(){

    println(calcular(2.0, 3.0, somar))
    println(calcular(2.0, 3.0, ::multiplicar))

}

/*função normal */
fun somar(a:Double, b:Double):Double{
    return a+b
}
/*a função que retorna somente um valor pode ser encurtada */
fun subtrair(a:Double, b:Double):Double = a-b
/*a função que tem parametros do mesmo tipo e retorna o mesmo tipo
pode assumir automaticamente o tipo do resultado*/
fun multiplicar(a:Double, b:Double) = a*b
/*versao mais encurtada */
fun dividir(a:Double, b:Double) a/b

/*funções lambda */
/*val somar = {a:Double, b:Double -> a+b}
val subtrair = {a:Double, b:Double -> a-b}
val multiplicar = {a:Double, b:Double -> a*b}
val dividir = {a:Double, b:Double -> a/b} */
val potencia = {a:Double, b:Double -> a.pow(b)}

/*----------parametro1-parametro2-função recebida-tipo do retorno da função--tipo do retorno final*/
/*fun calcular(a:Double, b:Double, f:(Double, Double) ->Double):                Double{
    return f(a, b)
}*/
/*versao encurtada */
fun calcular(a:Double, b:Double, f:(Double, Double) ->Double) = f(a, b)
