class cabDriver
{
	void ride()
	{
		System.out.println("booked in ola");
	}
}
class ola
{
	static void book(cabDriver c2)
	{
		c2.ride();
	}
}
class customer1 
{
	public static void main(String[] args) 
	{
		cabDriver c1=new cabDriver();
		ola.book(c1);
	}
}
