class MatchBox
{
	String brand;
	int noOfsticks;
	boolean empty;
	TypeSize size;
	
	MatchBox(String brand,int noOfsticks,TypeSize size )
	{
		System.out.println("invoking constructor.....string,int..");
	     this.brand=brand;
		 this.noOfsticks=noOfsticks;
		 this.size=size;
	}
}