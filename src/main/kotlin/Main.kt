
fun main() {
    val rect = Rectangle(5.0f)
    val Circle = Circle(3.0f)
    val Triangle = Triangle(7.0f, 7.0f, 7.0f)

    val maxAreaRectAndCircle = maxArea(rect, Circle)
    val maxAreaRectAndCircleAndTriangle = maxArea(rect, Circle, Triangle)

    println("The max area of the rectangle and circle is $maxAreaRectAndCircle")
    println("The max area of the rectangle, circle and triangle is $maxAreaRectAndCircleAndTriangle")
}

fun maxArea(Shape1: Shape, Shape2: Shape) : Float{
    val areaShape1 = Shape1.area()
    val areaShape2 = Shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(Shape1: Shape, Shape2: Shape, Shape3: Shape) : Float{
    val maxAreaShape1Shape2 = maxArea(Shape1, Shape2)
    val areaShape3 = Shape3.area()
    return if(areaShape3 > maxAreaShape1Shape2) areaShape3 else maxAreaShape1Shape2
//        or
//    return maxArea(maxArea(Shape1, Shape2), Shape3)

}