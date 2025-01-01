class univ1 
{
	String name;
	int cost;
	String course;
	univ1(String name,int cost,String course)
	{
		this.name=name;
		this.cost=cost;
		this.course=course;
	}
	public static void main(String[] args) 
	{
		univ1 u1= new univ1("abcde",1000,"DS");
		System.out.println("univ name-->"+u1.name);
		System.out.println("course cost-->"+u1.cost);
		System.out.println("univ course-->"+u1.course);
	}
}
