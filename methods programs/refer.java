class a
{
	double circle(int r)
	{
		double res=3.142*r*r;
		return res;
	}
}
class b
{
	double sector(int r,int t)
	{
		double res=3.142*r*r*t;
		return res;
	}
}
class c
{
	double triangle(int b,int h)
	{
		double res=0.5*b*h;
		return res;
	}
}
class d
{
	int rectangle(int l,int w)
	{
		int res=l*w;
		return res;
	}
}
class e
{
	double square(int a)
	{
		int res=a*a;
		return res;
	}
}
class f
{
	double trape(int a,int b,int h)
	{
		double res=0.5*a+b*h;
		return res;
	}
}
class g
{
	double ellip(int a,int h)
	{
		double res=3.142*a*h;
		return res;
	}
}
class h
{
	int parallel(int w,int h)
	{
		int res=w*h;
		return res;
	}
}
class refer 
{
	public static void main(String[] args) 
	{
		a x1=new a();
		double x=x1.circle(6);
		System.out.println("area of circle-->"+x);
		b x2=new b();
		double y=x2.sector(9,5);
		System.out.println("area of sector-->"+y);
		c x3=new c();
		double m=x3.triangle(7,3);
		System.out.println("area of triangle-->"+m);
		d x4=new d();
		int u=x4.rectangle(8,3);
		System.out.println("area of rectangle-->"+u); 
		e x5=new e();
		double k=x5.square(44);
		System.out.println("area of square-->"+k);
		f x6=new f();
		double s=x6.trape(6,3,5);
		System.out.println("area of trapezoid-->"+s);
		g x7=new g();
		double h=x7.ellip(4,9);
		System.out.println("area of ellipse-->"+h);
		h x8=new h();
		double ku=x8.parallel(66,32);
		System.out.println("area of parallelogram-->"+ku);
	}
}
