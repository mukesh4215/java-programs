class detailsbike 
{
	static String bikebrand="TVS";
	int bikecost;
	String bikecolor;
	public static void main(String[] args) 
	{
		System.out.println("bike brand="+bikebrand);
		detailsbike x1=new detailsbike();
		x1.bikecost=150000;
		System.out.println("bike cost"+x1.bikecost);
		detailsbike x2=new detailsbike();
		x2.bikecolor="black";
		System.out.println("bike color="+x2.bikecolor);
	}
}
