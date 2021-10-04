class SamosaRunner
{
	public static void main(String[] chakli)
	{
		float cost=2.0f;
		boolean taste=true;
		Samosa samosa=new Samosa(cost,taste);
		System.out.println(samosa.cost);
		System.out.println(samosa.taste);
		System.out.println(samosa.size);
		System.out.println(samosa.ingredients);
		
		String[] inc={"potato","onion","chilli","salt","oil","flour"};
		
		Samosa samosa1=new Samosa(15.0f,false,SamosaSize.SMALL,inc);
		String ing=samosa1.ingredients[1];
		System.out.println(ing);
		
		System.out.println(samosa1.cost);
		System.out.println(samosa1.taste);
		System.out.println(samosa1.size);
		System.out.println(samosa1.ingredients);
	}
}
		