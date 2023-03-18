fun main(){
    var sum : Int = 0
    var counter = 0
    for (i in 1 .. 20){
        if (i % 2 == 0){
            sum += i
            println(i)
            counter++
        }
    }
    println(sum)
    println(counter)

}