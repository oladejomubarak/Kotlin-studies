fun main(){
    val p1 = Player("A", "B", 34)
    p1.position = "Center Forward"
    println(p1.position)
}
class Player(var firstName: String, var lastName: String, var age:Int){
    lateinit var position:String

//    lateinit means I will initialize it later
}