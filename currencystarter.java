class CurrencyStarter
{
	public static void main(String args[])
	{
		Currency obj=new Currency();
		obj.name="indian";
		obj.value=50;
		obj.displayDetails();
		
		obj.country=new Country1();
		obj.country.name="india";
		obj.country.code=91;
		obj.country.displayDetails();
		
		Application app=new Application();
		app.name="telegram";
		app.version=16.1f;
		app.displayDetails();
		
		app.company=new Company();
		app.company.name="software";
		app.company.ceo="xyz";
		app.company.cfo="abc";
		app.company.displayDetails();
	}
}
			
		
		
