class home 
{
	String name;
	int cost;
	String color;
	home(String a,int b,String c)
	{
		name=a;
		cost=b;
		color=c;
	}
	public static void main(String[] args) 
	{
		home h1=new home("NILAYA",300000,"white");
		System.out.println("home name-->"+h1.name);
		System.out.println("home cost-->"+h1.cost);
		System.out.println("home color-->"+h1.color);
	}
}