class logic1 
{
	static void add() 
	{
		int a=5;
		int b=20;
		System.out.println(a+b);
		a=60+a;
		System.out.println(a+b);
		return;
	}
}
class logic2 
{
	static void div() 
	{
		int a=3;
		int b=6;
		System.out.println(b%+a);
		a=2%b;
		System.out.println(a-b);
		b=2-a;
		System.out.println(b+a);
		return;
	}
}
class logiccc{
	public static void main(String[]args)
	{
	 logic1.add();
	 logic2.div();
	}
}