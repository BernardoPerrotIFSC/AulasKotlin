import java.util.*

fun main(args: Array<String>){
    var listaCompras = arrayOf("Arroz", "Feijão","Batata","Uva","Banana","Carne","Leite","Ovos","Frango")
    //var listaNumeros = arrayOf(10, 20, 30, 40, 50)
    // println(Arrays.toString(listaCompras))
    // println(Arrays.toString(listaNumeros))
    // println(listaCompras.size)
    // println(listaCompras[8])
    var indice = 0
    while(indice<=listaCompras.size-1){
        println(listaCompras[indice])
        ++indice
    }
    for (indice in 0 .. listaCompras.size-1){
        println(listaCompras[indice])

    }
}