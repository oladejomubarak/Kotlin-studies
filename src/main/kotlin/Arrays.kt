fun main(){
    val alphanumerics = arrayOf("mub", "lap", "had", 1, 3, "lad", 7)
    var counter = 0
    for (i in alphanumerics){
        if( i is Int){
            counter++
            println(i)
        }

    }
    println("size is $counter")

    for (j in alphanumerics){
        if (j is String) println(j)
    }
}