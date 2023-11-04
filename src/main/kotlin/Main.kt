
fun main() {
    // From Rectangle Class
    println("\tRectangle")
    val myRect = Rectangle(4.0,4.0)
    println("Area of Rectangle is ${myRect.area()}")
    println("Perimeter of Rectangle is ${myRect.perimeter()}")
    println("Is Rectangle a Square? ${myRect.isSquare()}")
    println()

    // From Circle Class
    println("\tCircle1")
    val myCircle1 = Circle(3.0F)

    //myCircle1.changeName("Anything") // it changes the name of 'myCircle1' to 'Anything'
    println(myCircle1.name)
    println("\tCircle2")
    Circle(7.0f)

    //Triangle
    println("\tTriangle")
    Triangle(2.0f,4.0f,6.0f)
}