class Hasteen 
{
	static boolean hasteen(int a,int b,int c)
	{
		if((a>=13 && a<=19 )||(b>=13 && b<=19)||(c>=13 && c<=19))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(hasteen(13,20,10));
		System.out.println(hasteen(20,13,10));
		System.out.println(hasteen(20,10,13));
	}
}
