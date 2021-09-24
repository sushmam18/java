class Whisky
{
	String brand;
	int quantityinml;
	float price;
	String type;
	
	Whisky()
	{
		System.out.println("invoking default constructor");
	}
	Whisky(String brand,int quantityinml,float price,String type)
	{
		System.out.println("invoking parameterised constructor");
	this.type=type;
	this.brand=brand;
	this.quantityinml=quantityinml;
	this.price=price;
}

Whisky(String brand ,float price)
{
	System.out.println("invoking string and float const");
	this.brand=brand;
	this.price=price;
}
}