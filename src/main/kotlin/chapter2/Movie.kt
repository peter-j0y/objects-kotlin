package chapter2

import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    private var discountPolicy: DiscountPolicy
) {
    fun getFee(): Money {
        return fee
    }

    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }

    fun changeDiscountPolicy(discountPolicy: DiscountPolicy) {
        this.discountPolicy = discountPolicy
    }
}