class school1 
{
	String name;
	int strength;
	char grade;
	school1(String name,int strength,char grade)
	{
		this.name=name;
		this.strength=strength;
		this.grade=grade;
	}
	public static void main(String[] args) 
	{
		school1 s1=new school1("abc",3000,'A');
		System.out.println("school name-->"+s1.name);
		System.out.println("school strength-->"+s1.strength);
		System.out.println("school grade-->"+s1.grade);
	}
}