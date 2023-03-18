fun main(){
    val numbers: Array<Int> = arrayOf(13,5,6,7,80,87,45,32,12,5, 6)

    println(getMinimum(numbers))
    println(getMaximum(numbers))


}
fun getMinimum(arr : Array<Int>): Int {
    var minimum = arr[0]

    for (i in arr){
        if (i < minimum) {
            minimum = i
        }
    }
    return minimum
}

fun getMaximum(arr : Array<Int>): Int {
    var maximum = arr[0]

    for (i in arr){
        if (i > maximum) {
            maximum = i
        }
    }
    return maximum
}