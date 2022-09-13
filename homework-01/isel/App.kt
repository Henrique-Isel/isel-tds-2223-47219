package pt.isel

fun main() {
    println(NaifDate(28, 10, 2022).nextMonth()) // 11


    println(NaifDate(28, 11, 2022).nextMonth()) // 12
    println(NaifDate(28, 12, 2022).nextMonth()) // 1

    val d1 = NaifDate(28, 9, 2022)
    println(d1.addDays(73).Day)  // 10-12-2022
    println(d1.addDays(117).Day) // 23-01-2023

    val d3 = NaifDate(28, 12, 2022)
    println(d3.addDays(43).Day) // 9-2-2023
}
