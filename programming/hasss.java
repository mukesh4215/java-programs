class hasss 
{
	public static boolean teenn(int a,int b,int c)
	{
		if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
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
		System.out.println(teenn(13,20,10));
		System.out.println(teenn(20,19,10));
		System.out.println(teenn(20,10,13));
		System.out.println(teenn(1,20,12));
	}
}
