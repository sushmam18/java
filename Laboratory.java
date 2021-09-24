class Laboratory
{
	String name;
	String location;
	String []operatorsname;
	int noOfrooms;
	LabType type;
	
	Laboratory(String name,String location,int noOfrooms,LabType type,String[] operatorsname)
	{
		System.out.println("invoking constructor..string,string,int");
		this.name=name;
		this.location=location;
		this.noOfrooms=noOfrooms;
		this.type=type;
		this.operatorsname=operatorsname;
	}
}