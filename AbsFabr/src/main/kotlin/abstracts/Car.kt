package abstracts

abstract class Car {
    private val name:String = "Car"
    open fun show(){
        println("$name")
    }
}