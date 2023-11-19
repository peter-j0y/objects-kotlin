package chapter2

class PercentDiscountPolicy(
    private val percent: Double
): DiscountPolicy() {

    override fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}