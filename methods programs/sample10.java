class sample
{
	void circle()
	{
		final double pi=3.142;
		int r=3;
		double res=pi*r*r;
		System.out.println("area of circle-->"+res);
	}
}
class sample1
{
	void triangle()
	{
		double a=0.5;
		int b=22;
		int h=12;
		double res=a*b*h;
		System.out.println("area of triangle-->"+res);
	}
}
class sample2
{
	void square()
	{
		int a=55;
		int res=a*a;
		System.out.println("area of square-->"+res);
	}
}
class sample3
{
	void parallel()
	{
		int b=45;
		int h=12;
		int res=b*h;
		System.out.println("area of parallelogram-->"+res);
	}
}
class sample4
{
	void trapez()
	{
		double c=0.5;
		int a=12;
		int b=5;
		int h=9;
		double res=c*a+b*h;
		System.out.println("area of trapezoid-->"+res);
	}
}
class sample5
{
	void ellipse()
	{
		final double pi=3.142;
		int a=65;
		int b=2;
		double res=pi*a*b;
		System.out.println("area of ellipse-->"+res);
	}
}
class sample6
{
	void rectangle()
	{
		int w=51;
		int h=43;
		int res=w*h;
		System.out.println("area of rectangle-->"+res);
	}
}
class sample7
{
	void sector()
	{
		double c=0.5;
		int r=12;
		int t=11;
		double res=c*r*r*t;
		System.out.println("area of sector-->"+res);
	}
}
class sample10
{
	public static void main(String[]args)
	{
		new sample().circle();
		new sample1().triangle();
		new sample2().square();
		new sample3().parallel();
		new sample4().trapez();
		new sample5().ellipse();
		new sample6().rectangle();
		new sample7().sector();
	}
}


