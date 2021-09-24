class MatchBoxrunner
{
	public static void main(String args[])
	{
		String brand="cycle";
		int noOfsticks=50;
		TypeSize size=TypeSize.TWOINCH;
		boolean empty=false;
		MatchBox Box=new MatchBox(brand,noOfsticks,size);
		System.out.println(Box.brand);
		System.out.println(Box.noOfsticks);
		System.out.println(Box.empty);
		System.out.println(Box.size);
		
	}
}