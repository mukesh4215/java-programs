class condition4
{
public static void main(String[]args)
{
System.out.println("main starts");
int a=300;
int b=6;
int c=455;
int d=54;
if(a>b && a>c && a>d)
{
System.out.println("a is greater");
}
else if(b>c && b>d)
{
System.out.println("b is greater");
}
else if(c>d)
{
System.out.println("c is greater");
}
else
{
System.out.println("d is greater");
}
System.out.println("main ends");
}
}