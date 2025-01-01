class varierBakery
{
	void bun()
	{
		System.out.println("puffffsss");	
	}
}
class bigbasket
{
	static void book(varierBakery v2)
	{
		v2.bun();
	}
}
class customer2
{
	public static void main(String[] args) 
	{
		varierBakery v1=new varierBakery();
		bigbasket.book(v1);
	}
}
