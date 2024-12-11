class a
{
	static void circle(int r)
	{
	final double pi=3.142;
	double res=pi*r*r;
	System.out.println("area of circle-->"+res);
	}
}
class b
{
	static void trian(int b,int h)
	{
	double c=0.5;
	double res=c*b*h;
	System.out.println("area of traiangle-->"+res);
	}
}
class c
{
	static void square(int a)
	{
	int res=a*a;
	System.out.println("area of square-->"+res);
	}
}
class d
{
	static void rectangle(int w,int h)
	{
	int res=w*h;
	System.out.println("area of rectangle-->"+res);
	}
}
class e
{
	static void parall(int b,double h)
	{
	double res=b*h;
	System.out.println("area of parallelogram-->"+res);
	}
}
class f
{
	static void trape(int a,int b,int h)
	{
	double s=0.5;
	double res=s*a+b*h;
	System.out.println("area of trapezoid-->"+res);
	}
}
class g
{
	static void ellipse(int a,int b)
	{
	final double pi=3.142;
	double res=pi*a*b;
	System.out.println("area of ellipse-->"+res);
	}
}
class h
{
	static void sector(int r,int t)
	{
	final double pi=3.142;
	double res=pi*r*r*t;
	System.out.println("area of sector-->"+res);
	}
}
class result 
{
	public static void main(String[] args) 
	{
		a.circle(75);
		b.trian(7,34);
		c.square(43);
		d.rectangle(4,21);
		e.parall(56,33.21);
		f.trape(11,45,2);
		g.ellipse(23,6);
		h.sector(4,23);
	}
}
