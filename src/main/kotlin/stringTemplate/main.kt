package stringTemplate

fun main() {
    val name = "Kotlin"
    val age = 2
//    print("My name is " + name)
    print("My name is $name")
    print("I'm ${age + 1} years old ")
}