class detailsuniv 
{
	static String univname="pyspiders";
	int examcost;
	String coursename;
	public static void main(String[] args) 
	{
		System.out.println("uni name="+univname);
		detailsuniv x1=new detailsuniv();
		x1.examcost=3000;
		System.out.println("exam cost="+x1.examcost);
		detailsuniv x2=new detailsuniv();
		x2.coursename="mern";
		System.out.println("coursename="+x2.coursename);
		x2.coursename="devops";
		System.out.println("coursename="+x2.coursename);

	}
}
