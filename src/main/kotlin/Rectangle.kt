
class Rectangle(
    private val a: Float,
    private val b: Float
): Shape("Rectangle") {

    init {
        println("A $name is created by the Length of $a and Breath of $b")
    }

    override fun area() = a * b
    // this fun area override the fun in super class area

    override fun perimeter() = 2 * a + 2 * b
    // this fun perimeter override the fun in super class perimeter

    fun isSquare() = a == b


}