class home 
{
	static String homename="ABC";
	int homecost;
	String homecolor;
	public static void main(String[] args) 
	{
		System.out.println("home name="+homename);
		home x1=new home();
		x1.homecost=100000;
		System.out.println("home cost="+x1.homecost);
		home x2=new home();
		x2.homecolor="white";
		System.out.println("home color="+x2.homecolor);
	}
}