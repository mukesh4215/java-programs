class detailsmobilee
{
	static String mobile_brand="red-mi";
	int mobilecost;
	String mobilecolor;
	public static void main(String[]args)
	{
		System.out.println(mobile_brand);
		detailsmobilee x1=new detailsmobilee();
		x1.mobilecost=20000;
		System.out.println("mobile cost="+x1.mobilecost);
		detailsmobilee x2=new detailsmobilee();
		x2.mobilecolor="blue";
		System.out.println("mobile color="+x2.mobilecolor);
	}
}
