class MarketStarter
{
	public static void main(String args[])
	{
		Market market=new Market();
		market.noOfshops=10;
		market.name="kr market";
		market.city="blr";
		market.displayDetails();
		
		Market market1=new Market();
		market1.noOfshops=20;
		market1.name="russel";
		market1.displayDetails();
	}
}