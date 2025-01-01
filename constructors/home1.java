class home1 
{
	String name;
	int cost;
	String color;
	home1(String name,int cost,String color)
	{
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	public static void main(String[] args) 
	{
		home1 h1=new home1("NIIILAYA",300000,"white");
		System.out.println("home name-->"+h1.name);
		System.out.println("home cost-->"+h1.cost);
		System.out.println("home color-->"+h1.color);
	}
}
