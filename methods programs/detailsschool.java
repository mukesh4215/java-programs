class detailsschool
{
	static String schoolname="school name=java school";
	int schoolstrength;
	char schoolgrade;
	public static void main(String[]args)
	{
		System.out.println(schoolname);
		detailsschool x1=new detailsschool();
		x1.schoolstrength=3000;
		System.out.println("school strength="+x1.schoolstrength);
		detailsschool x2=new detailsschool();
		x2.schoolgrade='A';
		System.out.println("school grade="+x2.schoolgrade);
	}
}