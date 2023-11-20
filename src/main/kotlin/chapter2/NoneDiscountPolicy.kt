package chapter2

class NoneDiscountPolicy() : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}