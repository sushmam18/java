class Festivalrunner
{
	public static void main(String args[])
	{
		Festival obj=new Festival();
		System.out.println(obj.name+"\n"+obj.month+"/n"+obj.type+"/n"+obj.food+"/n"+obj.religion);
		
		String name="diwali";
		String month="november";
		String type="traditonal";
		String food="obbattu";
		String religion="hindu";
		Festival obj1=new Festival(name,month,type,food,religion);
		System.out.println(obj1.name+"/n"+obj1.month+"/n"+obj1.type+"/n"+obj1.food+"/n"+obj1.religion);
	
	Festival obj2=new Festival("dasara","october");
System.out.println(obj2.name+"/n"+obj2.month);	
	}
}
