class bike1 
{
	String name;
	int cost;
	String colour;
	bike1(String name,int cost,String colour)
	{
		this.name=name;
		this.cost=cost;
		this.colour=colour;
	}
	public static void main(String[] args) 
	{
		bike1 b1= new bike1("diiio",200000,"black");
		System.out.println("bike brand-->"+b1.name);
		System.out.println("bike cost-->"+b1.cost);
		System.out.println("bike colour-->"+b1.colour);
	}
}
