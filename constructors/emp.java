class emp 
{
	String name;
	int sal;
	char grade;
	emp(String a,int b,char c)
	{
		name=a;
		sal=b;
		grade=c;
	}
	public static void main(String[] args) 
	{
		emp e1=new emp("AW25R",30000,'A');
		System.out.println("emp id-->"+e1.name);
		System.out.println("emp sal-->"+e1.sal);
		System.out.println("emp grade-->"+e1.grade);
	}
}