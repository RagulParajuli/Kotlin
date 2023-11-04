fun main() {
    // prime number
    println("Enter a number :")
    val input = readLine()?.toInt()
    if (input != null){
        if (input.isPrime()){
            println("$input is a prime number")
        } else {
            println("$input is not a prime number")
        }
    }

    // product of the list
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("The product of $list is ${list.product()}")
}

fun Int.isPrime(): Boolean{
    for (i in 2 until this-1){
        if (this % i != 0){
            return true
        }
    }
    return false
}

fun List<Int>.product(): Int{
    var mul = 1
    for (i in this){
        mul *= i
    }
    return mul
}