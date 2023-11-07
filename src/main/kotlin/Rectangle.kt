import kotlin.random.Random

class Rectangle(
    private val length: Double, breath: Double
): Shape("Rectangle") {

    companion object{
        fun randomSide(): Rectangle{
            val length = Random.nextDouble()
            val breath = Random.nextDouble()
            return Rectangle(length, breath)
        }
    }
    init {
        println("A $name is created")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")

    }

    override fun area() = length * breath

    override fun perimeter() = 2 * length + 2 * breath
}