class laptop1 
{
	String name;
	int cost;
	String brand;
	laptop1(String name,int cost,String brand)
	{
		this.name=name;
		this.cost=cost;
		this.brand=brand;
	}
	public static void main(String[] args) 
	{
		laptop l1=new laptop("dell",30000,"XPS");
		System.out.println("laptop name-->"+l1.name);
		System.out.println("laptop cost-->"+l1.cost);
		System.out.println("laptop brand-->"+l1.brand);
	}
}