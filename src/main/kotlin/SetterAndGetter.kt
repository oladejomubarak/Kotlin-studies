fun main(){

}
class Human(firstName: String, var lastName: String = "LastName", var age:Int=0){
    var firstName = firstName

    set(value) {
        field = value
    }
    get() {
        return "FirstName : $field"
    }
}