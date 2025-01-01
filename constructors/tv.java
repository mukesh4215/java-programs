class tv 
{
	String name;
	int cost;
	char type;
	tv(String a,int b,char c)
	{
		name=a;
		cost=b;
		type=c;
	}
	public static void main(String[] args) 
	{
		tv t1=new tv("abc",25000,'A');
		System.out.println("tv brand-->"+t1.name);
		System.out.println("tv cost-->"+t1.cost);
		System.out.println("tv grade-->"+t1.type);
	}
}


