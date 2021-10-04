class Book
{
	float price;
	String name;

	static void open()
	{
		System.out.println("invoked open");
	}
	void read()
	{
		System.out.println("invoked read");
	    open();
	}
	void write()
	{
		System.out.println("invoked write");
		 this.read();
	}
	static void close()
	{
		System.out.println("invoked close");
	    open();
	}
}
	