class Whiskyrunner
{
	public static void main(String args[])
	{
		Whisky ref=new Whisky();
		System.out.println(ref.brand+"\n"+ref.quantityinml+"/n"+ref.price+"/n"+ref.type);
		
		String brand="Blenders pride";
		float price=2500f;
		String type="scotch";
		int quantity=750;
		Whisky ref1=new Whisky(brand,quantity,price,type);
		System.out.println(ref1.brand+"/n"+ref1.quantityinml+"/n"+ref1.price+"/n"+ref1.type);
	
	Whisky ref2=new Whisky("xyz",3500f);
System.out.println(ref2.brand+"/n"+ref2.price);	
	}
}
