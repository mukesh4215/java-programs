class seasons
{
	static String month(int days)
	{
		String res=null;
		switch(days)
		{
			case 12:
			case 1:
			case 2:
			{
				res="Winter";
			}break;
			case 3:
			case 4:
			case 5:
			{
				res="Summer";
			}break;
			case 6:
			case 7:
			case 8:
			{
				res="Rainy";
			}break;
			case 9:
			case 10:
			case 11:
			{
				res="Autumn";
			}break;

		}
		return res;
	}
	public static void main(String[] args) 
	{
		String season=seasons.month(12);
		System.out.println(season);
	}
}
