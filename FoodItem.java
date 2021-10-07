class FoodItem
{
	String name;
	float price;
	String hotelName;
	int quantity;
	Foodtype type;
	float rating;
	FoodOrderType type1;
	static float totalFoodItemprice;
	
	
	
	FoodItem(String name,float price,String hotelName,int quantity,float rating)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.quantity=quantity;
		this.rating=rating;
	}
	FoodItem(String name,float price,String hotelName)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
	}
	void displayDetails()
	{
		System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelName);
	System.out.println(this.quantity);
	System.out.println(this.type);
	System.out.println(this.rating);
	System.out.println(this.type1);
	
	}
	void printTotalPrice()
	{
		float total=this.price*this.quantity;
		System.out.println("total price="+total);
		totalFoodItemprice=totalFoodItemprice+total;
	}
	static void printTotalFoodItemsprice()
	{
		
		System.out.println("total food item price="+ totalFoodItemprice);
	}
	void printHotelName()
	{
		System.out.println(this.hotelName);
	}
	void printNameandPrice()
	{
		System.out.println(this.name+this.price);
	}
}