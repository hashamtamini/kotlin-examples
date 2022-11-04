package example.myapp
class Aquarium(lenth: Int =100, private var width: Int = 20, private var height: Int = 40) {
    private var length: Int = lenth

    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
    }}
