package safeCallsANDElvis

fun main() {
    val text: String? = null
    val textLength = text?.length ?: 7
    // untuk memeriksa nilai null, kemudian jika ada mka textLength = 7

    /* SAMA SEPERTI KODE BERIKUT
        val textLength = if (text != null) text.length else 7

     */

    /* MEMAKSA NILAI NULL

      val text: String? = null
      val textLength = text!!.length // ready to go ???
     */


}