package enum

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")

    print("Position GREEN is ${color.ordinal}")
}

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}