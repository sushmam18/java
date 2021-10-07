  class IpodRunner
{
	public static void main(String args[])
	{
		Ipod obj=new Ipod();
		obj.name="apple";
		obj.price=12000.0f;
		obj.type="nano";
		obj.color="blue";
		obj.storage=IpodStorage.GB;
		
		Ipod obj1=new Ipod();
		obj1.name="apple";
		obj1.price=15000.0f;
		obj1.type="classic";
		obj1.color="red";
		obj1.storage=IpodStorage.MB;
		
		
		Ipod obj2=new Ipod();
		obj2.name="apple";
		obj2.price=14000.0f;
		obj2.type="classic";
		obj2.color="red";
		obj2.storage=IpodStorage.MB;
		
		
		obj.listenMusic();
		obj1.PlayGames();
		obj2.listenMusic();
		
		
	}
}