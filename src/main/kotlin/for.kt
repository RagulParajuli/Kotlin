
fun main() {
    // number from to 1 by step 2
   for(i in 10 downTo 1 step 2) {
       print("$i \t")
   }
    println()
    // printing whole alphabet using for loop
    for(j in 'a'..'z'){
        print("$j \t")
    }
    println()
    // Maximum number in array
    val arr1 = arrayOf(2,3,5,7,3,9,10,1)
    var max = arr1[0]
    for (i in arr1){
        if(i > max){
            max = i
        }
    }
    println("The maximum number in array is $max")
    // Sum of given array
    var sum = 0
    for (i in arr1){
        sum += i
    }
    println("The sum of an array is $sum")
    // Average of userInput number
    println("Enter 5 numbers : ")
//    var num1: Int? = null
    var avg: Int = 0
    for (k in 1..5) {
         var num1 = readLine()?.toInt()
    if (num1 != null) {
           avg = avg + k
        }
    }
        val av = avg?.div(5)
        println("Average is : $av")
}

