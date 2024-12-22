class summ 
{
	public int sumdouble(int a,int b)
	{
		if(a!=b)
		{
			return (a+b);
		}
		else
		{
			return (a+b)*2;
		}
	}
	public static void main(String[] args) 
	{
		summ x3=new summ();
		System.out.println(x3.sumdouble(2,1));
		System.out.println(x3.sumdouble(1,2));
		System.out.println(x3.sumdouble(2,2));
	}
}
