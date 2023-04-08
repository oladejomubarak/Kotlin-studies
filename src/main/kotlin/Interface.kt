fun main(){

}
interface Engine{
    fun start()
}

class Toyota(var name: String, var model: String): Engine{
    override fun start() {
      println("Toyota don start o")
    }

}

class Benz(var name: String, var model: String): Engine{
    override fun start() {
        println("Benz don start o")
    }

}