class orr35 
{
	public static boolean or35(int n)
	{
		if(n>0 && (n%3==0 || n%5==0))
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
		System.out.println(or35(3));
		System.out.println(or35(10));
		System.out.println(or35(0));
	}
}
