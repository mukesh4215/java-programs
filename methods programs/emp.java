class emp
{
	static String empid="AB097";
	int empsal;
	char empgrade;
	public static void main(String[] args) 
	{
		System.out.println("emp id="+empid);
		emp x1=new emp();
		x1.empsal=100000;
		System.out.println("emp sal="+x1.empsal);
		emp x2=new emp();
		x2.empgrade='a';
		System.out.println("emp grade="+x2.empgrade);
	}
}
