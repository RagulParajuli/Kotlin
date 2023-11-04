
class Rectangle(
    val a: Double,
    val b: Double
): Shape("Rectangle") {

    init {
        println("A $name is created by the Length of $a and Breath of $b")
    }

    fun area() = a * b

    fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}