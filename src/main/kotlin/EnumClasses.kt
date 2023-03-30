fun main(){
    for(distance in DIRECTION.values()){
        println(distance)
    }
    println(DIRECTION.NORTH.distance)
    println(DIRECTION.SOUTH.name)
    println(DIRECTION.WEST.direction)

}
enum class DIRECTION(var direction: String, var distance: Int){
    NORTH("north", 30),
    SOUTH("south", 50),
    WEST("west", 70),
    EAST("east", 80)
}