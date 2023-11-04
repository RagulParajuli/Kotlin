import kotlin.math.sqrt

class Triangle(
    val x: Float,
    val y: Float,
    val z: Float

): Shape("Triangle") {
    init {
        println("A $name is created with x = $x, y = $y, z = $z")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
    }

    fun area() = sqrt((perimeter()/2) * (perimeter()/2 - x) * (perimeter()/2 - y) * (perimeter()/2 - z))

    fun perimeter() = x + y + z
}