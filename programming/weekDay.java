class weekDay 
{
	public boolean sleepin(boolean weekday,boolean vacation)
	{
		if(weekday!=true || vacation==true)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		weekDay x1=new weekDay();
		System.out.println(x1.sleepin(false,false));
		System.out.println(x1.sleepin(true,false));
		System.out.println(x1.sleepin(false,true));
	}
}