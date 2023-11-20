package chapter2

class PercentDiscountPolicy(
    private val percent: Double
): DefaultDiscountPolicy() {

    override fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}