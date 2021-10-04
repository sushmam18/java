class PizzaRunner
{
	public static void main(String ketchup[])
	{
		String name="pannerPizza";
		float rate=199.0f;
		Pizza pizz=new Pizza(name,rate);
		System.out.println(pizz.name);
		System.out.println(pizz.cost);
		System.out.println(pizz.size);
		System.out.println(pizz.ingredients);
		
		String [] inc={"cheese","bread","sauce","panner"};
		
		Pizza pizza1=new Pizza("corn",200.0f,"small",inc);
		String ing=pizza1.ingredients[0];
		System.out.println(ing);
		System.out.println(pizza1.name);
		System.out.println(pizza1.cost);
		System.out.println(pizza1.size);
		System.out.println(pizza1.ingredients);
	}
}