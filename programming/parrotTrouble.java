class parrotTrouble
{
	public boolean parrot(boolean talking,int hour)
	{
		return talking &&(hour<7||hour>20);
	}
	public static void main(String[]args)
	{
		parrotTrouble pt=new parrotTrouble();
		System.out.println(pt.parrotTrouble(true,6));
		System.out.println(pt.parrotTrouble(true,7));
		System.out.println(pt.parrotTrouble(false,6));
		System.out.println(pt.parrotTrouble(true,21));
	}
}
