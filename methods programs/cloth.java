class cloth
{
	static int clothcost=1000;
	String clothcolor;
	char clothsize;
	public static void main(String[] args) 
	{
		System.out.println("cloth cost="+clothcost);
		cloth x1=new cloth();
		x1.clothcolor="grey";
		System.out.println("cloth color="+x1.clothcolor);
		cloth x2=new cloth();
		x2.clothsize='L';
		System.out.println("cloth size="+x2.clothsize);
	}
}

