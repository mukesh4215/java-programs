class Loneteen 
{
	static boolean loneteen(int a,int b)
	{
		if((a>=13 && a<=19)!=(b>=13 && b<=19))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(loneteen(13,99));
		System.out.println(loneteen(21,19));
		System.out.println(loneteen(13,13));

	}
}
