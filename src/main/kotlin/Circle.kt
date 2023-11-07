class Circle(
    private val radius: Float
): Shape("Circle"){
    private val pi = 3.14F
    init {
        println("A $name is created with the radius of $radius")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
        println()
    }

    override fun area() =  pi * radius * radius
    // this fun area override the fun in super class area

    override fun perimeter() = 2 * pi * radius
    // this fun perimeter override the fun in super class perimeter

}