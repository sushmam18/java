class Keyboardrunner
{
	public static void main(String[] args)
	{
		String rtype="numeric";
		int pc=1500;
		String brand="hp";
		Keyboard key=new Keyboard(rtype,pc,brand);
		System.out.println(key.type+"/n"+key.price+"/n"+key.brand);
	}
}