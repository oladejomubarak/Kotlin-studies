fun main (){
    println(getMax(10, 5))
}
fun getMax(a:Int, b:Int):Int{
    val max = if (b < a) a else b
    return max
}