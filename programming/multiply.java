class multiply 
{
	static int mul(int n)
	{
		int mul=1;
		for(int i=n;i>0;i--)
		{
			mul=i*mul;
		}
			return mul;
	}
	public static void main(String[] args) 
	{
		int x=multiply.mul(5);
		System.out.println(x);
	}
}
