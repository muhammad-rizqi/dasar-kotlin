package boolean

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    /* boolean operator logika
    * && AND
    * || OR
    * ! NOT
     */

    print("Office is open : $isOpen")
    /*
        Output : Office is open : false
     */
}
