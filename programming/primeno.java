class primeno 
{
	static boolean pri(int no)
	{
	boolean flag=true;
	for(int i=2;i<=Math.sqrt(no);i++)
	{
	if(no%i==0)
		{
			flag=false;
			break;
		}
	}
	return flag;
	}
	public static void main(String[] args) 
	{
		boolean x=primeno.pri(12);
			if(x){
		System.out.println("is prime num");
		}
		else
			{
				System.out.println("is not a prime num");
			}
	}
}