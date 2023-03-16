fun main (){
    //println(getMax(10, 5))
    sendMessage(message = "Hello there", name =  "Oladejo")
    sendMessage(message = "How far")
    sendMessage()
}
fun getMax(a:Int, b:Int):Int{
    val max = if (b < a) a else b
    return max
}

fun sendMessage(name :String = "Mubarak", message:String = setText()){
    println("Name is ${name} and message is ${message}")
}
fun setText() = "some text"