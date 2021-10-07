class MovieTicketRunner
{
	public static void main(String args[])
	{
		MovieTicket Ticket =new MovieTicket();
		Ticket.moviename="kotigobba3";
		Ticket.theater="cinepolis";
		Ticket.price=150f;
		Ticket.noOfseats=4;
		Ticket.type="balcony";
		Ticket.displayDetails();
		Ticket.printTotalprice();
	}
}