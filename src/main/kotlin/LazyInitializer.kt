fun main(){
val man1 = Man("Ola", "bOl", 3)
    val man2: Man by lazy {
        Man("nn", "gg", 3)
    }

    println(man2.firstName)
}

class Man(var firstName:String, var lastName:String, var age:Int){
    init{
        println("User: $firstName was created")
    }
}