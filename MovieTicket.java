class MovieTicket
{
	String moviename;
	String theater;
	float price;
	int noOfseats;
	String type;
	
	void displayDetails()
	{
		System.out.println(this.moviename);
		System.out.println(this.theater);
		System.out.println(this.price);
		System.out.println(this.noOfseats);
		System.out.println(this.type);
	}
	void printTotalprice()
	{
		float total=this.noOfseats*this.price;
		System.out.println(total);
	}
}