import abstracts.*
import kotlin.random.Random


fun main() {
    val cars = ArrayList<Car>()
    repeat(4){addCar(cars)}
    for(car in cars)
        car.show()
}

fun addCar(cars: ArrayList<Car>){
    when(Random.nextInt(0, 2)){
        0 -> cars.add(Audi())
        1 -> cars.add(Bentli())
    }
}