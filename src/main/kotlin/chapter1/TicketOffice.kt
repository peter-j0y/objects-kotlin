package chapter1

class TicketOffice(private var amount:Long, vararg tickets: Ticket) {
    private val tickets: MutableList<Ticket> = mutableListOf()

    init {
        this.tickets.addAll(tickets)
    }

    private fun getTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun sellTicketTo(audience: Audience) {
        plusAmount(audience.buy(getTicket()))
    }
}