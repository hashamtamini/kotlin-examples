package example.myapp

import java.lang.Math.PI
class TowerTank(override var height: Int,var diameter: Int): Aquarium(height = height , width = diameter, length = diameter){
    override var volume: Int
        get() = (width/2 *length/2 * height/1000* PI).toInt()
        set(value) {
            height= ((value*1000/ PI)/(width/2 * length/2)).toInt()
        }
    override var water = volume* 0.8
    override val shape = "cylinder"

}

open class Aquarium(var length: Int =100, var width: Int = 20, open var height: Int = 31) {
/*
init {
    println("aquarium initializing")
    //1liter = 1000cm^3
    println("volume: ${width*length*height/1000}liters")
}*/
fun printSize() {
        println(initializing)
        println(shape)
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        // 1 liter = 1000 cm^3
        println("volume: $volume liters water :$water liters (${water / volume * 100.0}% full)")
    }
    constructor(numberOfFishes: Int) :this(){
        val tank = numberOfFishes * 2000 * 1.1
         height = (tank/(length * width)).toInt()
    }
    open var volume: Int
         get() = width * height * length/ 1000
         set(value) {
             height = (value * 1000)/(width*length)
         }
    open val shape = "rectangle"
    open val water : Double
        get() = volume *0.9
    open var initializing = "initializing aquarium"
}
