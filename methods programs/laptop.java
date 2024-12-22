class laptop 
{
	static String laptopname="Dell";
	int laptopcost;
	String laptopbrand;
	public static void main(String[] args) 
	{
		System.out.println("laptop name="+laptopname);
		laptop x1=new laptop();
		x1.laptopcost=100000;
		System.out.println("laptop cost="+x1.laptopcost);
		laptop x2=new laptop();
		x2.laptopbrand="xps";
		System.out.println("laptop brand="+x2.laptopbrand);
	}
}
