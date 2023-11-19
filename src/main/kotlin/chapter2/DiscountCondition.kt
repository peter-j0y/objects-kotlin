package chapter2

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening) : Boolean
}