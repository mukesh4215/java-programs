class passref 
{
	int a=10;
	static void disp(passref s2)
	{
		System.out.println(s2.a);
	}
	public static void main(String[] args) 
	{
		passref s1=new passref();
		System.out.println(s1.a);
		disp(s1);
	}
}
