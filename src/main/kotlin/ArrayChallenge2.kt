fun main (){
    val nums : Array<Int> = arrayOf(3,4,23,3,78,657,8,90,75,45,67)
    println(findMaxOrMinNum(nums, false))

}
fun findMaxOrMinNum(numbers: Array<Int>, searchForMax: Boolean):Int{
    var minOrMax = numbers[0]
    //var max = min
    if (searchForMax){
        for (i in numbers) if (i >  minOrMax) minOrMax = i
        return minOrMax
    } else {
        for (i in numbers) if (i < minOrMax) minOrMax = i
        return minOrMax
    }
}