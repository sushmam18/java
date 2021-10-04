class Pizza
{
	String name;
	float cost;
	String size;
	String[] ingredients;
	
	Pizza(String name,float cost)
	{
		System.out.println("created using float,string");
		this.name=name;
		this.cost=cost;
	}
	Pizza(String size,String[] ingrdients)
	{
		System.out.println("created using String,string[]");
		this.size=size;
		this.ingredients=ingredients;
	}
	Pizza(String name,float cost,String size,String[] ingredients)
	{
		this(name,cost);
		System.out.println("created using name,cost");
		this.size=size;
		this.ingredients=ingredients;
	}
}

	
	