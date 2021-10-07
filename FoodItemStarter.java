class FoodItemStarter
{
	public static void main(String args[])
	{
		FoodItem item=new FoodItem("dosa",45,"uphar darshini",4,5.0f);
		Foodtype type=Foodtype.SOUTHINDIAN;
		System.out.println(type);
		FoodOrderType type1=FoodOrderType.ONLINE;
		System.out.println(type1);
		item.displayDetails();
		item.printTotalPrice();
		item.printTotalFoodItemsprice();
		item.printHotelName();
		item.printNameandPrice();
		
		FoodItem item1=new FoodItem("noodles",50,"cubiodal",3,4.4f);
		Foodtype typ=Foodtype.CHINESE;
		System.out.println(type);
		FoodOrderType type2=FoodOrderType.TAKEAWAY;
		System.out.println(type1);
		item1.displayDetails();
		item1.printTotalPrice();
		item1.printTotalFoodItemsprice();
		item1.printHotelName();
		item1.printNameandPrice();
	}
}