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
	int square(int a)
	{
		int res=a*a;
		return res;
	}
}
class c
{
	double triangle(int b,int h)
	{
		double c=0.5;
		double res=c*b*h;
		return res;
	}
}
class d
{
	int rectangle(int w,int h)
	{
		int res=w*h;
		return res;
	}
}
class e
{
	int parallel(int h,int b)
	{
		int res=h*b;
		return res;
	}
}
class f
{
	double trapez(int a,int b,int h)
	{
		
		double c=0.5;
		double res=c*a+b*h;
		return res;
	}
}
class g
{
	double ellipse(int a,int b)
	{
		double res=3.142*a*b;
		return res;
	}
}
class h
{
	double sector(int r,int t)
	{
		double res=3.142*r*r*t;
		return res;
	}
}
class floral
{
	public static void main(String[] args) 
	{
		double m=new a().circle(3);
		System.out.println(m);
		int u=new b().square(76);
		System.out.println(u);
		double k=new c().triangle(33,23);
		System.out.println(k);
		int e=new d().rectangle(21,45);
		System.out.println(e);
		int s=new e().parallel(4,6);
		System.out.println(s);
		double h=new f().trapez(3,4,7);
		System.out.println(h);
		double se=new g().ellipse(9,6);
		System.out.println(se);
		double ku=new h().sector(45,6);
		System.out.println(ku);
	}
}