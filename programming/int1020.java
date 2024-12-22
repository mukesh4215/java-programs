class int1020 
{
	public static boolean inttt(int a,int b)
	{
		if((a>=10 && a<=20) && b>=20)
		{
			return true;
		}
		else if((b>=10 && b<=20) && a>=20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(inttt(12,99));
		System.out.println(inttt(21,12));
		System.out.println(inttt(8,99));
	}
}
