class detailstv
{
	static String tvbrand="TV brand=SONY";
	int tvcost;
	String tvtype;
	public static void main(String[]args)
	{
		System.out.println(tvbrand);
		detailstv x1=new detailstv();
		x1.tvcost=30000;
		System.out.println("Tv cost="+x1.tvcost);
		detailstv x2=new detailstv();
		x2.tvtype="LED";
		System.out.println("Tv type="+x2.tvtype);
	}
}
