package chapter2

class AmountDiscountPolicy(
    private val discountAmount: Money,
) : DiscountPolicy() {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}