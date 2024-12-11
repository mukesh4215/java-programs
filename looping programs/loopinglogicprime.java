class  loopinglogicprime
{
	public static void main(String[] args) 
	{
		int no=8;
		boolean f=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				f=false;
			}
		}
		if(f==true)
		{
			System.out.println(no+"-->prime number");
		}
		else
		{
			System.out.println(no+"-->not a prime number");
		}
	}
}
