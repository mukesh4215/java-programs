class diff212
{
	public int diff(int n)
	{
		if(n<=21)
		{
			return 21-n;
		}
		else{
			return n-21;
		}
	}
	public static void main(String[] args) 
	{
		diff212 x4=new diff212();
		System.out.println(x4.diff(19));
		System.out.println(x4.diff(21));
		System.out.println(x4.diff(25));
	}
}
