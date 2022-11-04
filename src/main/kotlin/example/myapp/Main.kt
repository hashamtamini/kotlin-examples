package example.myapp

fun buildAquarium(){
    val firstMonth=Aquarium(height =39)
firstMonth.printSize()
    val secondMonthChanges = Aquarium(width=25)
secondMonthChanges.printSize()
    val thirdMonthChanges = Aquarium(height = 80,width = 38,lenth =199)
    thirdMonthChanges.printSize()
}
fun main (){
    buildAquarium()
}