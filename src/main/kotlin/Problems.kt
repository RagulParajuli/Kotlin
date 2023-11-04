fun main() {
    // easy version
    val ls = mutableListOf<Int>()
    println("Enter 5 numbers :")
    for (i in 1..5) {
        val x = readLine()?.toInt()
        if (x != null) {
            ls.add(x)
        }
    }
    println(ls)
    ls.reverse()
    println("In reverse order :")
    for ( i in ls){
        println(i)
    }

    // Harder version
    val ls1 = mutableListOf<Int>()
    var a = 0
    var b = 1
    ls1.add(a)
    ls1.add(b)
    println("Enter a number n>1 : ")
    val num = readLine()?.toInt()
    if (num != null){
        for (i in 1..num-2) {
            val c = a + b
            a = b
            b = c
            ls1.add(c)
        }
    }
    println(ls1)

}