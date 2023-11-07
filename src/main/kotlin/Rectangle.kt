
class Rectangle(
    private val a: Float,
    private val b: Float
): Shape("Rectangle") {

    constructor(a: Float) : this(a,a)

    constructor(a: Int, b: Int) : this(a.toFloat(),b.toFloat())

    init {
        println("A $name is created by the Length of $a and Breath of $b")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
    }

    override fun area() = a * b
    // this fun area override the fun in super class area

    override fun perimeter() = 2 * a + 2 * b
    // this fun perimeter override the fun in super class perimeter

    fun isSquare() = a == b


}