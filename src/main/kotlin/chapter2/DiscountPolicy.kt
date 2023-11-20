package chapter2

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}