

fun main() {
    val name: String = "Ragul"
    val name2 = "Ragul"
    println(name.length) // find the size or length of string
    println(name.indexOf('g')) // find the index of given char
    println(name.compareTo(name2)) // compare tw o string
    println("In Upper Case : ${name.uppercase()}")
    println("In Lower Case : ${name.lowercase()}")
    println("Reversed Upper Case : ${name.uppercase().reversed()}")
    println("Reversed Lower Case : ${name.lowercase().reversed()}")
}