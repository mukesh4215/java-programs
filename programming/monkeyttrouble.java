class monkeyttrouble 
{
	public boolean monkey(boolean asmile,boolean bsmile)
	{
		if(asmile==bsmile)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		monkeyttrouble x2=new monkeyttrouble();
		System.out.println(x2.monkey(true,true));
		System.out.println(x2.monkey(false,false));
		System.out.println(x2.monkey(true,false));
	}
}
