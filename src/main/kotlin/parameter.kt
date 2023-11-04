fun main() {
    println("Enter your number :")
    var num = readLine()?.toInt()
    if (num != null)
        sum(num)
}

fun sum(num: Int){
    var sum = 0
    for (i in 1..num){
        sum += i
    }
    println("The sum of the values from 1 to $num is $sum")
}