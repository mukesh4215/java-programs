class mobile1
{
	String name;
	int cost;
	char type;
	mobile1(String name,int cost,char type)
	{
		this.name=name;
		this.cost=cost;
		this.type=type;
	}
	public static void main(String[] args) 
	{
		mobile m1=new mobile("redmi",300,'A');
		System.out.println("mob name-->"+m1.name);
		System.out.println("mob cost-->"+m1.cost);
		System.out.println("mob type-->"+m1.type);
	}
}

