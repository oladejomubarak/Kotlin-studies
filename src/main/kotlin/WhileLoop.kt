fun main (){
    var number = 0
    outer@ while (number < 5){
        number++
        println(number)

        var i = 0

        while (i < 5)
            if (i == 0) break@outer
            i++

        println("***$i")

    }
}