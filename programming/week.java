class week 
{
	static String days(int c)
	{
		String res=null;
		switch(c)
		{
			case 1:res="Sunday";
			break;
			case 2:res="Monday";
			break;
			case 3:res="Tuesday";
			break;
			case 4:res="Wednesday";
			break;
			case 5:res="Thursday";
			break;
			case 6:res="Friday";
			break;
			case 7:res="Saturday";
			break;
			default:res="invalid day";
		}
			return(res);
}
	public static void main(String[] args) 
	{
		String day=week.days(7);
		System.out.println(day);
	}
}

