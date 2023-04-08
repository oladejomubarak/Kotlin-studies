fun main(){
    val lad1 = Lady("m","n", 2)
    val lad2 = Lady("m","n", 2)

    println(lad1.equals(lad2))
    println(lad1.firstName.equals(lad2.firstName))
    println(lad1)
    println(lad2)
}
data class Lady(var firstName: String, var lastName: String, var age: Int)



