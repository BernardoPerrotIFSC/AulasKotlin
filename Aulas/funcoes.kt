/*FUNÇÃO LAMBDA */
val dirtlevel = 20
val waterfilter = {level: Int -> level/20}
println(waterfilter(dirtlevel))
/*=10 */

/*FUNÇÕES DE ALTA ORDEM */
fun encodeMsg(msg: String, encode: (String)->String): String{
    return encode(msg)
}

val enc1(input:String):String = input.toUppercase()