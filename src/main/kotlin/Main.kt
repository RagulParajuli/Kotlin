fun main() {
    /* val array = arrayOf(1,2,3,4,5) // cannot add an element in array
    val list = listOf(1,2,3,4,5) // changes cannot be done
    val ls = mutableListOf(1,2,3,4,5) // changes can be done also can add element in list
    ls.add(6) // add element in the mutable list
    println(ls)
    ls.remove(6) // remove element of the mutable list
    println(ls)
    // ls.removeAt(4) // remove element by index of the mutable list
    */
    // user defined list
    val list1 = mutableListOf<Int>()
    for(i in 1..5){
        val x = readLine()?.toInt()
        if (x != null)
            list1.add(x)
    }
    println(list1)
}