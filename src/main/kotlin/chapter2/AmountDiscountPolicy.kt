package chapter2

class AmountDiscountPolicy(
    private val discountAmount: Money,
) : DefaultDiscountPolicy() {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}