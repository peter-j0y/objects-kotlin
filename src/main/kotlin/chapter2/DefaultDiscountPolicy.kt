package chapter2

abstract class DefaultDiscountPolicy(
    vararg conditions: DiscountCondition
): DiscountPolicy {
    private val conditions: MutableList<DiscountCondition> = mutableListOf()

    init {
        this.conditions.addAll(conditions)
    }

    override fun calculateDiscountAmount(screening: Screening): Money {
        conditions.forEach {
            if(it.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun getDiscountAmount(screening: Screening): Money
}