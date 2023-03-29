fun main(){
val result = Calculator.sum(3,7)
    println(result)
}
class Calculator(){
    companion object{
        fun sum(a:Int, b:Int):Int{
            return a + b

        }
    }
}