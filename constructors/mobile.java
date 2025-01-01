class mobile 
{
	String name;
	int cost;
	char type;
	mobile(String a,int b,char c)
	{
		name=a;
		cost=b;
		type=c;
	}
	public static void main(String[] args) 
	{
		mobile m1=new mobile("redmi",30000,'A');
		System.out.println("mob name-->"+m1.name);
		System.out.println("mob cost-->"+m1.cost);
		System.out.println("mob type-->"+m1.type);
	}
}
