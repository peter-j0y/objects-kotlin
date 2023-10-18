package chapter1

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        // 만약 관객이 초대장을 가지고 있다면
        ticketOffice.sellTicketTo(audience)
    }
}