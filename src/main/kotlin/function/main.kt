package function

/* Cara membuat function :
fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
}
 */
fun main() {
    print(setUser("Rizqi", 21))     // memanggil function dengan kembalian
    printUser("Rizqi")                  // memanggil function dengan type : Unit
}

fun setUser(name: String, age: Int): String { // mengembalikan nilai String,
    // memanggil variabel dalam string dengan tanda $
    return "Your name is $name, and you $age years old"
}

// jika tidak ada nilai yg dikembalikan maka type nya adalah :Unit
fun printUser(name: String): Unit {         // :Unit dapat dihilangkan
    print("Your name is $name")
}