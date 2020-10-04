package dataType

fun main () {

    // format: var identifier: Type = initialization
    // var nama: TypeData = nilaiAwal


    /* var variabel bisa berubah nilainya
    *  val variabel yang tidak boleh berubah nilainya
    * */

    /* TYPE DATA STRING
    * *********************************** */

    val firstWord: String = "Pondok "
    var lastWord: String = "IT"       // Type data string
    val firstChar: Char = lastWord[0] // Mengakses Type data Character dari string
    lastWord = "Programmer"           // merubah variabel
    println(firstWord + lastWord)     // print dengan menyatukan string

    val longWord = """Dengan membaca 
        "Bismillah" kita mulai 
        membaca Al-Qur'an """.trimIndent()

    println(longWord)
    // cara menampilkan string panjang 2 baris lebih dengan """ kutip 3x


    /* TYPE DATA INT
    * *********************************** */
    val valueA: Int = 10              // Type data integer
    val valueB: Int = 30
    println(valueA + valueB)          // operasi matematika dasar
                                      // output: 30

    /* TYPE DATA CHARACTER
    * *********************************** */
    var vocal = 'A'                     //satu character
    println("Vocal " + vocal++)         // dapat dilakukan operasi increment / decrement
    println("Vocal " + vocal--)

    /* TYPE DATA ARRAY
    * *********************************** */
    val array = arrayOf(1, 3, 5, 7)     // array
    print(array[2])                     // Output : 5
    /*
    * intArrayOf() : IntArray
    * booleanArrayOf() : BooleanArray
    * charArrayOf() : CharArray
    * longArrayOf() : LongArray
    * shortArrayOf() : ShortArray
    * byteArrayOf() : ByteArray
    * */

    val intArray = Array(4) { i -> i * i } // [0, 1, 4, 9] dari fungsi Array

}