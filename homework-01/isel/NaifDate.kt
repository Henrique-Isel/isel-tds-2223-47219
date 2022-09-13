package pt.isel

class NaifDate(day: Int, month: Int, year: Int) {
    var Day = day
    var Month = month
    var Year = year
    val daysOfMonth = intArrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    var nextMonth = month

    fun nextMonth(): Int {
       if(nextMonth == 12) {
           nextMonth = 1
       Year++
       } else nextMonth++
    return nextMonth
    }

    fun addDays(days: Int): NaifDate {
    nextMonth = Month
    var count = days
    var afterDays = Day
        while (count != 0){
            afterDays++
            if( afterDays >= daysOfMonth[nextMonth-1]) {
                nextMonth = nextMonth()
                afterDays = 0
            }
        count--
        }
      return NaifDate(afterDays,nextMonth,Year)
    }
    }


