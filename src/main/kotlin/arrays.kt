
fun main() {
   val arr: Array<Int> = arrayOf(2,3,4,5,6,7)
    // or
    val arr1 = arrayOf(1,3,5,7,9)
   println(arr[0])
    println(arr.get(1))
    println(arr.size)
    arr.forEach { print("$it\t") }
    println() // next line after forEach loop
    //  in an array
    for (i in arr1)
        print("$i \t")
    // or
    for (j in 1..5){
        println(j)
    }
    println() // next line after for loop
    // to check if an element exists or not
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}