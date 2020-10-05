package ifExpression

fun main() {
    val openHours = 7
    val now = 7
    val office: String

    /* IF STANDAR
    *******************
    * * if (now > 7) {
    *    office = "Kantor dibuka"
    * } else if (now == openHours){
    *    office = "Tunggu sebentar "
    * } else {
    *    office ="Kantor ditutup"
    * }
    * */

    // memasukkan return dari if kedalam variabel
    office = if (now > 7) {
        "Kantor dibuka"
    } else if (now == openHours){
        "Tunggu sebentar "
    } else {
        "Kantor ditutup"
    }

    print(office)
}