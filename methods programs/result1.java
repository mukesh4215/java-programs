class a
{
	static double circle(int r)
	{
		final double pi=3.142;
		double res1=pi*r*r;
		return res1;
	}
}
class b
{
	static double triangle(int b,int h)
	{
		double s=0.5;
		double res2=s*b*h;
		return res2;
	}
}
class c
{
	static int square(int a)
	{
		int res3=a*a;
		return res3;
	}
}
class d
{
	static int rectangle(int w,int h)
	{
		int res4=w*h;
		return res4;
	}
}
class e
{
	static int parall(int b,int h)
	{
		int res5=b*h;
		return res5;
	}
}
class f
{
	static double trape(int a,int b,int h)
	{
		double c=0.5;
		double res6=c*a+b*h;
		return res6;
	}
}
class g
{
	static double ellipse(int a,int b)
	{
		final double pi=3.142;
		double res7=pi*a*b;
		return res7;
	}
}
class h
{
	static double sector(int r,int t)
	{
		final double pi=3.142;
		double res8=pi*r*t;
		return res8;
	}
}
class result1 
{
	public static void main(String[] args) 
	{
		double i=a.circle(45);
		System.out.println("area of circle-->"+i);
		double j=b.triangle(3,8);
		System.out.println("area of triangle-->"+j);
		int k=c.square(2);
		System.out.println("area of square-->"+k);
		int l=d.rectangle(5,2);
		System.out.println("area of rectangle-->"+l);
		int m=e.parall(67,3);
		System.out.println("area of parallelogram-->"+m);
		double n=f.trape(2,11,2);
		System.out.println("area of trapezoid-->"+n);
		double o=g.ellipse(4,65);
		System.out.println("area of ellipse-->"+o);
		double p=h.sector(4,43);
		System.out.println("area of sector-->"+p);
	}
}
