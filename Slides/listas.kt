import java.util.Arrays

fun main(){
    val pets = arrayOf("dog","cat","canary")
    println(java.util.Arrays.toString(pets))
    val numeros = intArrayOf(1,2,3)
    val numeros2 = intArrayOf(4,5,6)
    val combined = numeros + numeros2
    println(Arrays.toString(combined))

}