class BookRunner
{
	public static void main(String args[])
	{
		Book book=new Book();
		Book.open();
		book.read();
		Book.close();
		book.write();
	}
}