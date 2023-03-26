fun main() {
    var friend = User("Ola", "mub", 64)
    var enemy = User("Ajaz", "red", 34)

    println("firstName: ${friend.firstName}")
}
    class User(firstName: String, var lastName: String, var Age: Int ) {
        var firstName: String

        init {
            if (firstName.lowercase().startsWith("a")) {
                this.firstName = firstName
            } else {
                this.firstName = "User"
                println("The firstName should start with letter 'a' or 'A'")
            }
        }

//    val car1 = Car()
//    val car2 = Motor("Corolla", "2017")
//    car1.name = "Toyota"
//    car1.model = "2018"
//    car1.color = "Blue"
//    car1.numberOfDoors = 4
//
//    println("The name of the car is ${car1.name}")
//    println("The model of the car is ${car1.model}")
//    println("The color of the car is ${car1.color}")
//    println("The number of the car door is ${car1.numberOfDoors}")
//    car1.move()
//    car1.stop()
//
//    println(car2.name)
}

//class Motor(var name: String, var model: String){}

