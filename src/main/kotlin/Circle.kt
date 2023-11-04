class Circle(
    val radius: Float
): Shape("Circle"){
    private val pi = 3.14F
    init {
        println("A $name is created with the radius of $radius")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
        println()
    }

    fun area() =  pi * radius * radius

    fun perimeter() = 2 * pi * radius
}