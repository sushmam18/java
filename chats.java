class chats
{
	public static void main(String args[])
	{
		menu(30,"panipuri");
		menu(50,"gobi");
		menu(45,"noodles");
		
	}
		
		static void menu(int amt,String food)
		{
			int rate=amt;
			String cname=food;
			System.out.println("rate of chat"+rate);
			System.out.println("chat available is"+cname);
		}
		
	}