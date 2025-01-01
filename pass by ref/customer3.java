class Amazon
{
	void prd()
	{
		System.out.println("mobilee");
	}
}
class ekart
{
	static void delivery(Amazon a2)
	{
		a2.prd();
	}
}
class customer3 
{
	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		ekart.delivery(a1);
	}
}
