
fun main() {
    while (true) {
    println("Enter your country :")
    val country = readLine()?.lowercase()
        when (country) {
            "india" -> println("Namaste")
            "nepal" -> println("Namaskar")
            "usa" -> println("Hello")
            "german" -> println("Hallo")
            "russia" -> println("Pivyet")
            "japan" -> println("Konnichiwa")
            else -> println("I don't know")
        }
        println("Do you want to continue (y/n):")
        val choice = readLine()
        if (choice == "n")
            break
    }
}