class car 
{
	String name;
	int cost;
	char type;
	car(String a,int b,char c)
	{
		name=a;
		cost=b;
		type=c;
	}
	public static void main(String[] args) 
	{
		car c1=new car("swift",500000,'P');
		System.out.println("car brand-->"+c1.name);
		System.out.println("car cost-->"+c1.cost);
		System.out.println("car type-->"+c1.type);
	}
}

