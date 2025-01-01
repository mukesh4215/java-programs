class car1 
{
	String name;
	int cost;
	char type;
	car1(String name,int cost,char type)
	{
		this.name=name;
		this.cost=cost;
		this.type=type;
	}
	public static void main(String[] args) 
	{
		car1 c1=new car1("swift",500000,'P');
		System.out.println("car brand-->"+c1.name);
		System.out.println("car cost-->"+c1.cost);
		System.out.println("car type-->"+c1.type);
	}
}

