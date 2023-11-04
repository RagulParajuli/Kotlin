// INHERITANCE
// 'open' keyword is used so that the other classes can inherent anything from this class
open class Shape(
    var name: String  // All other classes will inherent 'name' from this class
    /*protected means it is accessible only to its own class and other subclasses
    *where 'name' is inherited. But main class cannot fun name when it is protected.*/
) {
    init {
        println("I a the super class")
    }

    fun changeName(newName : String){
        name = newName
       // We can change the name of other classes by using this function even if there is no changeName fun in those classes
    }
}