class ForestStarter
{
    public static void main(String args[])
	{
		boolean reserved=true;
		Forest obj=new Forest("banglore","bannerghatta",reserved);
		System.out.println(obj.location);
		System.out.println(obj.name);
		System.out.println(obj.reserved);
		System.out.println(obj.state);

	 obj.state=new State(7,"bommai");
		System.out.println(obj.state);
		System.out.println(obj.state.noOfdist);
		System.out.println(obj.state.cmName);
		obj.state.name="xyz";
		System.out.println(obj.state.name);
		
		
		obj.state.capitalcity=new CapitalCity(87888990);
		System.out.println(obj.state.capitalcity);
		System.out.println(obj.state.capitalcity.population);
		obj.state.capitalcity.name="blore";
		obj.state.capitalcity.famousfor="IT";
		System.out.println(obj.state.capitalcity.name);
		System.out.println(obj.state.capitalcity.famousfor);
		
		
		
	}
}
		
		
		
		