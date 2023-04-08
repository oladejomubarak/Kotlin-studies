fun main(){
    val lad1 = Lad("m","n", 2)
    val lad2 = Lad("m","n", 2)

    println(lad1.equals(lad2))
    println(lad1.firstName.equals(lad2.firstName))
    println(lad1)
    println(lad2)
}
class Lad(var firstName: String, var lastName: String, var age: Int){
    override fun equals(other: Any?): Boolean {
        if (this === other){
            return true
        }
        if (other is Lad){
            return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "USER(first name: '$firstName', last name: '$lastName', age: $age)"
    }
}
