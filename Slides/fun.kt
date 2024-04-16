fun main(){
    fun printHello(name: String?){
        println("Hi there")
    }
    printHello(null)

    fun drive(speed: String = "fast"){
        println("driving $speed")
    }
    drive("Slow")
    
    fun tempToday(day:String?, temp:Int?){
        println("Today is $day and its $temp degrees")
    }
    tempToday("Monday", 23)
}