fun main(){
    var text: String ? = null

   // text = "Not null"

    val text2: String = text ?: "It is null"
    println(text2)
}