fun main(){
    println(Databases)
    println(Databases)
    println(Databases)
    println(Databases)

}
class Database private constructor(){
    companion object{
    private var instance : Database? = null
        fun getInstance():Database?{
            if (instance == null){
                instance= Database()
            }
            return instance
        }

    }
}
object Databases{
    init {
        println("DB created")
    }
}