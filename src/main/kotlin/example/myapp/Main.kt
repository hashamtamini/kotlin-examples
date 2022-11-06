package example.myapp
fun buildAquarium(){
    val aquarium6 = Aquarium(length = 25, width = 25 , height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
    val aquarium2 = Aquarium(numberOfFishes = 19)
    aquarium2.printSize()
}
fun main (){
    buildAquarium()
}