class univ 
{
	String name;
	int cost;
	String course;
	univ(String a,int b,String c)
	{
		name=a;
		cost=b;
		course=c;
	}
	public static void main(String[] args) 
	{
		univ u1= new univ("abc",1000,"DS");
		System.out.println("univ name-->"+u1.name);
		System.out.println("course cost-->"+u1.cost);
		System.out.println("univ course-->"+u1.course);
	}
}
