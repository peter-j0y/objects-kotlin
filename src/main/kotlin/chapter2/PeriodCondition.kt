package chapter2

import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(private val dayOfWeek: DayOfWeek, private val startTime: LocalTime, private val endTime: LocalTime) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().dayOfWeek.equals(dayOfWeek)
                && startTime.isBefore(screening.getStartTime().toLocalTime())
                && endTime.isAfter(screening.getStartTime().toLocalTime())
    }
}