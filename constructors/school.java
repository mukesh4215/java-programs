class school 
{
	String name;
	int strength;
	char grade;
	school(String a,int b,char c)
	{
		name=a;
		strength=b;
		grade=c;
	}
	public static void main(String[] args) 
	{
		school s1=new school("abc",2000,'A');
		System.out.println("school name-->"+s1.name);
		System.out.println("school strength-->"+s1.strength);
		System.out.println("school grade-->"+s1.grade);
	}
}


