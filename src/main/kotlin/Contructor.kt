fun main(){
    val student1 = Student("Ade", "Ola", 43)
    val student2 = Student("Mubarak")
    val student3 = Student("Bol", "Dol")
    val student4 = Student(60)

    println(student2.lastName)

}
 class Student(var firstName: String, var lastName: String, var age: Int){
     constructor(firstName:String): this(firstName, "LastName", 0){
         println("2nd")
     }
     constructor(firstName: String, lastName: String): this(firstName, lastName, 0){
         println("3rd")
     }
     constructor(age: Int): this("", "", age){
         println("4th")
     }
 }