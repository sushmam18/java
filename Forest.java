class Forest
{
	String name;
	String location;
	boolean reserved;
State state;

Forest(String location)
{
	this.location=location;
}
Forest(String location,String name,boolean reserved)
{
	this(location);
	this.name=name;
	this.reserved=reserved;
}
}