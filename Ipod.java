class Ipod
{
	String name;
	float price;
	String type;
	String color;
	IpodStorage storage;
	
	void listenMusic()
	{
		System.out.println("invoked music");
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
		System.out.println(color);
		System.out.println(storage);
		
	}
	 void PlayGames()
	{
		System.out.println("invoked games");
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
		System.out.println(color);
		System.out.println(storage);
		
	}
	void chatting()
	{
		System.out.println("invoked chatting");
	}
}