

fun main() {
    print("Enter your age : ")
    val userInput = readLine()?.toInt() /* here user input can be string as well as null where
    '?' represent the posibility of null value, and finally we are converting the input string into integer*/
    println("Your age is : $userInput")
    if (userInput != null) // it checks
    {
        if (userInput >= 1 && userInput <= 18)
        println("You are still child")
        else if (userInput >= 18 && userInput <= 65)
        println("You are an adult")
        else
        println("You are in old age")
    }
    else
        println("It is null value")
    /* Here single line  statement in if/else condoition (curly bracket) {.} is not necessary
    * but (curly bracket) {.} is compulsary for multiline statement */
}