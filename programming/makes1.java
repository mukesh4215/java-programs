class makes1
{
	public static boolean makes(int a,int b)
	{
		if(a==10 || b==10 ||(a+b)==10)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(makes(9,10));
		System.out.println(makes(9,9));
		System.out.println(makes(1,9));
	}
}
