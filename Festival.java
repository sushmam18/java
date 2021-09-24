class Festival
{
   String name;
   String month;
   String type;
   String food;
   String religion;
   
   Festival()
	{
		System.out.println("invoking default constructor");
	}
	Festival(String name,String month,String type,String food,String religion)
	{
		System.out.println("invoking parameterised constructor");
	this.name=name;
	this.month=month;
	this.type=type;
	this.food=food;
	this.religion=religion;
}
}
