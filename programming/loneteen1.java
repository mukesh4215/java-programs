class loneteen1 
{
	public static boolean lone(int a,int b)
	{
		if((a>=13 && a<=19) && b>=20)
		{
			return true;
		}
		else if((b>=13 && b<=19) && a>=20)
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
		System.out.println(lone(13,99));
		System.out.println(lone(21,19));
		System.out.println(lone(13,13));
	}
}
