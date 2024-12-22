class ptro 
{
	public static boolean parrot(boolean talking,int hour)
	{
		if(talking==true && (hour<7 || hour>20))
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(parrot(true,6));
		System.out.println(parrot(true,1));
		System.out.println(parrot(false,6));
	}
}
