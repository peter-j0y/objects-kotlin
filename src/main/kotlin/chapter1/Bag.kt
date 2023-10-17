package chapter1

class Bag(private var amount: Long, private val invitation: Invitation?, var ticket: Ticket?) {
    fun hasInvitation(): Boolean = invitation != null
    fun hasTicket(): Boolean = ticket != null
    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}