fun main(args: Array<String>) {
    val minIntegerValue: Int = Int.MIN_VALUE
    val maxIntegerValue: Int = Int.MAX_VALUE
    println("min is: $minIntegerValue")
    println("max is: $maxIntegerValue")

    var num4 = 6
    val num5 = 3

    println("num1 and num2 = ${num4 + num5}")

    var result = num4 + num5
    println(result)

    result = result + 2
    println(result)

    result = result * num5
    println(result)

    result = result % num4
    println(result)


}