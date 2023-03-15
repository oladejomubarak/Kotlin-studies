fun  main(){
    val num = -4
    val num1 = -3

    val text = if ( num > 0 || num1 > 0){
        println("Either or both is true")
        "text is true"
    }else {
        println("None is true")
        "text is false"
    }
    println(text)
}