class Human(var name:String){
    fun sayHi(){
        println("My name is $name!")
    }
}

class Dog(    
    var name: String? = null,
    var owner: Human? = null){

    fun sayHi(){
        println("Hello my name is $name and my owner is ${owner?.name}")
    }
}

fun main(){
    val bernardo = Human("Bernardo")
    val igor = Human("Igor")
    val dog = Dog("linux", bernardo)
    println(dog.name)
    dog.sayHi()
    dog.owner = igor
    dog.sayHi()
    bernardo.sayHi()
}


 