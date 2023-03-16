fun main (){
    //println(getMax(10, 5))
    sendMessage(message = "Hello there", name =  "Mubarak")
}
fun getMax(a:Int, b:Int):Int{
    val max = if (b < a) a else b
    return max
}

fun sendMessage(name :String = "", message:String = "Hello!"){
    println("Name is ${name} and message is ${message}")
}