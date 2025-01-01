class ibm
{
	void job()
	{
		System.out.println("job in naukri");
	}
}
class naukri
{
	static void apply(ibm i2)
	{
		i2.job();
	}
}
class student
{
	public static void main(String[] args) 
	{
		ibm i1=new ibm();
		naukri.apply(i1);
	}
}
