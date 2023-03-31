fun main(){
    for(distance in DIRECTION.values()){
        println(distance)
    }
    println(DIRECTION.NORTH.distance)
    println(DIRECTION.SOUTH.name)
    println(DIRECTION.WEST.direction)

    println(DIRECTION.WEST.printData())

    val direction = DIRECTION.valueOf("north".uppercase())

    when(direction){
        DIRECTION.WEST -> println("the direction is west")
        DIRECTION.NORTH -> println("the direction is north")
        DIRECTION.EAST -> println("the direction is east")
        DIRECTION.SOUTH -> println("the direction is south")
    }

}
enum class DIRECTION(var direction: String, var distance: Int){
    NORTH("north", 30),
    SOUTH("south", 50),
    WEST("west", 70),
    EAST("east", 80);

    fun printData(){
        println("direction: $direction, distance: $distance")
    }
}