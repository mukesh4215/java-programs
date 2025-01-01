class tv1 
{
	String name;
	int cost;
	char type;
	tv1(String name,int cost,char type)
	{
		this.name=name;
		this.cost=cost;
		this.type=type;
	}
	public static void main(String[] args) 
	{
		tv1 t1=new tv1("abc",25000,'A');
		System.out.println("tv brand-->"+t1.name);
		System.out.println("tv cost-->"+t1.cost);
		System.out.println("tv grade-->"+t1.type);
	}
}

