import kotlin.math.sqrt

class Triangle(
    private val x: Float,
    private val y: Float,
    private val z: Float

): Shape("Triangle") {
    init {
        println("A $name is created with x = $x, y = $y, z = $z")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
    }

    override fun area() = sqrt((perimeter()/2) * (perimeter()/2 - x) * (perimeter()/2 - y) * (perimeter()/2 - z))
    // this fun area override the fun in super class area

    override fun perimeter() = x + y + z
    // this fun perimeter override the fun in super class perimeter

}