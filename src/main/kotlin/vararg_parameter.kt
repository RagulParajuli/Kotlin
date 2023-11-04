fun main() {
    val array = intArrayOf(10, 20, 30)
    val max = getMax(1, 3, 4, 5, *array, 7, 2, 8, 9, 6)
    // vararg helps to insert other list or array in main list or array if only it is in Int type
    println("The maximum number is $max")

    // search and searchEngine
    searchFor("How to become good programmer")
    searchFor("Kotlin is good","Bing")

    //Alternating Sum
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")
}

fun alternatingSum(vararg num : Int): Int {
    var sum = 0
    var toggle = true
    for (i in num){
        if (toggle){
            sum += i
        } else{
            sum -=i
        }
        toggle = !toggle
    }
    return sum
}


fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for $search on $searchEngine")
}

fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}