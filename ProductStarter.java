class ProductStarter
{
	public static void main(String args[])
	{
		Product obj=new Product("haair dryer","EC",1800,2,"phillips");
		obj.displayDetails();
		obj.printTotalCost();
		
		Product obj1=new Product("trimmer","EC",200,4,"nova");
		obj1.printTotalCost();
		
		
		
		Product.printTotalProductPrice();
	}
}