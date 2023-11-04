

fun main() {
    // Number from userInput to 0
    print("Enter your number : ")
    var num = readLine()?.toInt()
    if (num != null) {
        println("Lets count from $num to 0")
        while (num >= 0) {
            println(num)
            num--
        }
    }
    // power of number using while
    print("Enter your Base number : ")
    val num1 = readln()?.toInt()
    print("Enter your Power number : ")
    val num2 = readLine()?.toInt()
    var result = 1
    var i = 0
    if (num1 != null && num2 != null){
        while (i < num2){
           result *= i
            i++
        }
        println("$num1 to the power of $num2 is $result")
    }

}