class saudi
{
	void petrol()
	{
		System.out.println("petrolll");	
	}
}
class indianoil
{
	static void imports(saudi s2)
	{
		s2.petrol();
	}
}
class customer4
{
	public static void main(String[] args) 
	{
		saudi s1=new saudi();
		indianoil.imports(s1);
	}
}