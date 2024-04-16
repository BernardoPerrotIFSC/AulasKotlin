fun main(){
    val pets = arrayOf("dog", "cat", "canary")
    // for(element in pets){
    //     println(element +" ")
    // }
    // for((index, element) in pets.withIndex()){
    //     println("item at $index is $element")
    // }
    for(i in 1..5){
        println(i)
    }
    for(i in 5 downTo 1) println(i)

    for(i in 3..6 step 2) println(i)

    for(i in 'd'..'g') println(i)

}
