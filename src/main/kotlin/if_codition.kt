
fun main() {
    val str = "racecar"
    print("Enter your year: ")
    val userInput = readLine()?.toInt()
    val rev = str.reversed()
    // Palindrome
    if(str == rev){
        println("It is palindrome")
    }
    else{
        println("It is not palindrome")
    }
    // Leap Year
    if (userInput != null){
        if (userInput%4 == 0 && userInput%400 == 0 && userInput%100 != 0)
            println("$userInput is leap year")
        else
            println("$userInput is not leap year")
    }
    
}