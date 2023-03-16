fun main (){
    //println(getMax(10, 5))
    sendMessage(message = "Hello there", name =  "Oladejo")
    sendMessage(message = "How far")
    sendMessage()

    println(print(1,2,3,34,45,6))
    println(sum(1,2,3,34,45,6))
}
fun getMax(a:Int, b:Int):Int{
    val max = if (b < a) a else b
    return max
}

fun sendMessage(name :String = "Mubarak", message:String = setText()){
    println("Name is ${name} and message is ${message}")
}
fun setText() = "some text"

fun sum(vararg numbers:Int):Int{
    var result = 0

    for (number in numbers){
        result += number
    }
    return result
}

fun print(vararg numbers: Int) = numbers.forEach { println(it) }