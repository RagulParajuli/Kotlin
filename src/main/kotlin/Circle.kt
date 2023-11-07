import kotlin.random.Random


class Circle(
    private val radius: Double
): Shape("Circle"){

   companion object{
       fun randomCircle(): Circle{
           val radius = Random.nextDouble(1.0, 10.0)
           return Circle(radius)
       }
   }


    init {
        println("A $name is created with the radius of $radius")
        println("Area of a $name is ${area()}")
        println("Perimeter of a $name is ${perimeter()}")
        println()
        ImportantNumbers.test()
        println()
    }

    override fun area() =  ImportantNumbers.PI * radius * radius
    // this fun area override the fun in super class area

    override fun perimeter() = 2 * ImportantNumbers.PI * radius
    // this fun perimeter override the fun in super class perimeter

}