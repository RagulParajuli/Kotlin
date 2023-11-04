
fun main() {
    val list = listOf(4,5,3,6,1)
    println("The list look like the following : $list")
    println("Enter the number to be searched : ")
    val num = readLine()?.toInt()
    if (num != null)
        println("The index of $num is ${search(num, list)}")
}

fun search(num: Int,list: List<Int>): Int {
      for (i in 0 until list.size-1) {
          if (list[i] == num) {
              return i
          }
      }
    return -1
}