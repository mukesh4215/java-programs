class bike 
{
	String name;
	int cost;
	String colour;
	bike(String a,int b,String c)
	{
		name=a;
		cost=b;
		colour=c;
	}
	public static void main(String[] args) 
	{
		bike b1= new bike("dio",200000,"black");
		System.out.println("bike brand-->"+b1.name);
		System.out.println("bike cost-->"+b1.cost);
		System.out.println("bike colour-->"+b1.colour);
	}
}



