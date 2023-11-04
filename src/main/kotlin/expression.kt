import kotlin.math.*

fun main() {
    // Simple Expression
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    // Hars Expression
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool ||z > (x + y) && (!bool || y < z)
    println(hardExpression)
}