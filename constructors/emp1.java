class emp1 
{
	String name;
	int sal;
	char grade;
	emp1(String name,int sal,char grade)
	{
		this.name=name;
		this.sal=sal;
		this.grade=grade;
	}
	public static void main(String[] args) 
	{
		emp1 e1=new emp1("AW25R",30000,'A');
		System.out.println("emp id-->"+e1.name);
		System.out.println("emp sal-->"+e1.sal);
		System.out.println("emp grade-->"+e1.grade);
	}

}