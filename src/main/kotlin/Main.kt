fun main() {
    fun updatedirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    /*val waterfilter: (Int) -> Int = { a -> a / 2 }
    println(updatedirty(24, waterfilter))

    fun increasedirty(start: Int) = start + 1  //it's used to increase the value of increasedirty function
    println(updatedirty(15, ::increasedirty))
    var dirtyLevel = 19
    dirtyLevel = updatedirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23 }
    println(dirtyLevel)

    val school: String = "where can we find a good hospital in kabul"
    println(school)
    val b2: Byte = 1
    val i4: Int = b2.toInt()
    println(i4)
    val numberoffishes = 3
    val numberofdogs = 4
    println("i have $numberoffishes fishes $numberofdogs dogs")

    val school = arrayOf("pen","book","table","student")
    for ((index,element)in school.withIndex()){
        if (index in 0..1)
            println("item at $index is $element\n")
}
for (i in 1..5)print(i)
                       for (i in 20 downTo 15) print( "$i" + " ")*/
//for (i in 1..20 step 2) print(" $i"+" ")
//for (i in 'd'..'f') print(i)
/*var hairsonAshrafGhanishead= 3
    while (hairsonAshrafGhanishead<100) {
        hairsonAshrafGhanishead++
    }
    println("ashraf ghani is bald he has $hairsonAshrafGhanishead hairs on Ashraf ghani's head\n")
    do {
        hairsonAshrafGhanishead--
    }while (hairsonAshrafGhanishead>100)
    println("ashraf ghani is moy dar he has $hairsonAshrafGhanishead hairs \n")
    repeat(2){
        println("he is murderer")*/
    var shop = 3
    while (shop>1)
        print(shop--)
    val dsjfk =3
}
