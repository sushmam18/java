class NailCutterRunner
{
	public static void main(String[] args)
	{
		NailCutter obj=new NailCutter();
		obj.price=50.0f;
		obj.color="silver";
		obj.size="small";
		obj.sharp=true;
		
		NailCutter obj1=new NailCutter();
		obj1.price=25.0f;
		obj1.color="black";
		obj1.size="big";
		obj1.sharp=true;
		
		NailCutter obj2=new NailCutter();
		obj2.price=30.0f;
		obj2.color="gold";
		obj2.size="medium";
		obj2.sharp=false;
		
		obj.cuting();
		obj1.cleaning();
		obj2.cuting();
		
		
		

	}
}