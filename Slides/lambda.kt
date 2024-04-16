fun main(){
    var dirtLevel = 20
    val waterFilter = {level: Int -> level / 2}
    println(waterFilter(dirtLevel))

    //HIGH ORDER FUNCTIONS
    fun encodeMsg(msg: String, encode: (String) -> String): String { 
        return encode(msg)
    }
    val enc1: (String) -> String = { input -> input.toUpperCase() }
    println(encodeMsg("abc", enc1))
    
}