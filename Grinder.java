class Grinder
{
	int capacity=100;
	String company="grinder company";
	Motor moter=new Moter();
	
	Grinder(int capacity,String company)
	{
		this.capacity=capacity;
		this.company=company;
		System.out.println("invoked int and string");
	}
}