fun main(){

}
abstract class Dad(){
abstract fun move()
abstract fun stop()
}

class Mum(val hand:String, var leg: String, var head: String): Dad(){
    override fun move() {
    }

    override fun stop() {
    }

}
