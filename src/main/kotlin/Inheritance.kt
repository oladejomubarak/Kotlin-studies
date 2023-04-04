fun main(){
val plane = Plane("hgdgsjh", "blue",3, 1)
    val lorry = Lorry("hgds", "red", 4, 12)

    plane.move()
    lorry.stop()
}
open class Vehicle(val name: String, val color:String){
    open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }

}

class Plane(name: String, color: String, var engine: Int, var door: Int): Vehicle(name, color){
    override fun move() {
        flying()
        super.move()
    }
    fun flying(){
        println("The plane is flying")
    }
}
class Lorry(name: String, color: String, var engine: Int, var door: Int): Vehicle(name, color){

}