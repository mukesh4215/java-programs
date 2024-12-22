class posneg 
{
	public static boolean poss(int a,int b,boolean negative)
	{
		if((a>=0 && b<0)|| negative==true)
		{
			return true;
		}
		else if((a<=0 && b>0)|| negative==true)
		{
			return true;
		}
		else if((a<=0 && b<=0) && negative==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	 }
	  public static void main(String[] args) 
	{
		System.out.println(poss(1,-1,false));
		System.out.println(poss(-1,1,false));
		System.out.println(poss(-1,-1,true));
	}
}
