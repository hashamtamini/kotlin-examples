fun main() {
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)}

        val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
        println(updateDirty(dirty=30, waterFilter))

        fun increaseDirty( start: Int ) = start + 1

        println(updateDirty(dirty=15, ::increaseDirty))
        var dirtyLevel = 19
        dirtyLevel = updateDirty(dirtyLevel) { dirtylevel -> dirtylevel + 23}
        println(dirtyLevel)
 }
fun shop() {
    var shop = 3
    while (shop > 1)
        print(shop--)

    val decorations = listOf("skdfk", "sdfk", "dsfjdsf")

    val lazymap2 = decorations.asSequence().filter { it[0] == 's' }.map {
        println("access : $it")
        it
    }
    println("----")
    println("filtered: ${lazymap2.toList()}")
}
fun hairsonashrafghnai() {
    var hairsonAshrafGhanishead = 3
    while (hairsonAshrafGhanishead < 100) {
        hairsonAshrafGhanishead++
    }
    println("ashraf ghani is bald he has $hairsonAshrafGhanishead hairs on Ashraf ghani's head\n")
    do {
        hairsonAshrafGhanishead--
    } while (hairsonAshrafGhanishead > 100)
    println("ashraf ghani is moy dar he has $hairsonAshrafGhanishead hairs \n")
    repeat(2) {
        println("he is murderer")
    }
}
fun shcool() {
    val school = arrayOf("pen", "book", "table", "student")
    for ((index, element) in school.withIndex()) {
        if (index in 0..1)
            println("item at $index is $element\n")
    }
    for (i in 1..5) print(i)
    for (i in 20 downTo 15) print("$i ")
    for (i in 1..20 step 2) print("$i ")
    for (i in 'd'..'f') print(i)
}
