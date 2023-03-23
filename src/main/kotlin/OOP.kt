fun main(){
    val car1 = Car()
    val car2 = Motor("Corolla", "2017")
    car1.name = "Toyota"
    car1.model = "2018"
    car1.color = "Blue"
    car1.numberOfDoors = 4

    println("The name of the car is ${car1.name}")
    println("The model of the car is ${car1.model}")
    println("The color of the car is ${car1.color}")
    println("The number of the car door is ${car1.numberOfDoors}")
    car1.move()
    car1.stop()

    println(car2.name)
}
 class Car(){
     var name = ""
     var model = ""
     var color = ""
     var numberOfDoors = 0

     fun move(){
         println("The car is moving")
     }

     fun stop(){
         println("The car has stopped")
     }

 }
class Motor(var name: String, var model: String){

}