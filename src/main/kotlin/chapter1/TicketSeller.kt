package chapter1

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        // 만약 관객이 초대장을 가지고 있다면
        if (audience.bag.hasInvitation()) {
            val ticket = ticketOffice.getTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket = ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}