class prime 
{
	public static void main(String[] args) 
	{
		int no=3;
		boolean fat=true;
		for(int i=2;i<=Math.sqrt(no);i++)
		{
			if(no%i==0)
			{
				fat=false;
				break;
			}
		}
		if(fat==true)
		{
			System.out.println(no+"= is a prime number");
		}
		else
		{
			System.out.println(no+"= is not a prime number");
		}
	}
}