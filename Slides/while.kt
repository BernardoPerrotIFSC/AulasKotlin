fun main(){
    var bicycles = 0
    while(bicycles<50){
        bicycles++
    }
    println("$bicycles bicycles in the bicycle rack")

    do{
        bicycles--
    }while (bicycles>50)
    println("$bicycles bicycles in the bicycle rack")

    repeat(2){
        println("Hello")
    }
}
