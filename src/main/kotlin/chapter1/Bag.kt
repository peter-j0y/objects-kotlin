package chapter1

class Bag(private var amount: Long, private val invitation: Invitation?, var ticket: Ticket?) {
    private fun hasInvitation(): Boolean = invitation != null
    fun hasTicket(): Boolean = ticket != null
    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }
    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun hold(ticket: Ticket): Long {
        return if (hasInvitation()) {
            this.ticket = ticket
            0L
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            ticket.fee
        }
    }
}