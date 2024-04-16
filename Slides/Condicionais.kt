fun main(){
    // val numbersOfStudents = 50
    // if(numbersOfStudents in 1..50){
    //     println(numbersOfStudents)
    // }
    val results = 9
    when (results){
        0 ->println("No results")
        1 -> println("Only one")
        in 2..39 -> println("Got results")
        else -> println("Thats a lot of results")
    }
}