/** Latihan 2 Map
Buatlah variabel bertipe Map dengan kriteria:
Daftar nama bulan dalam setahun,
- Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
- key "Jan", value January
- key "Feb", value February
- dst...
Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
- Jan -> January
- Feb -> February
- Dst...

Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
- "It's {$monthNow} now, I was born in {$birthMonth}"
 */
// Buat di bawah sini

fun main() {
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "Jun"
    val birthMonth = "Mar"

    val currentMonthName = monthMap[monthNow]
    val birthMonthName = monthMap[birthMonth]

    println("Sekarang adalah bulan $currentMonthName, aku lahir bulan $birthMonthName")
}