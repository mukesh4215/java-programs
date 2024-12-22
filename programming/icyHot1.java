class icyHot1
{
	public static boolean icyy(int temp1,int temp2)
	{
		if(temp1<0 && temp2>100)
		{
			return true;
		}
		else if(temp1>100 && temp2<0)
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
		System.out.println(icyy(120,-1));
		System.out.println(icyy(-1,120));
		System.out.println(icyy(2,120));
	}
}
