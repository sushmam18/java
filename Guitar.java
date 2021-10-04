class Guitar
{
	float cost=100.0f;
	int noOfStrings;
    static String brand;
	
	Guitar(float cost,int noOfStrings)
	{
		this.cost=cost;
		this.noOfStrings=noOfStrings;
		System.out.println(this.cost);
		System.out.println(this.noOfStrings);
	}
}