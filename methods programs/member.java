class member
{
	static String Name1="Yudistina";
	static String Name2="Arjuna";
	static String Name3="Bheema";
	static String Name4="Nakula";
	static String Name5="Sahadeva";
	static String Name6="Dhuryodhana";
	static String Name7="Shakuni";
	static String Name8="Karna";
	static String Name9="Krishna";
	static void meme()
	{
		String[] names ={Name1,Name2,Name3,Name4,Name5,Name6,Name7,Name8,Name9};
		for(int i=0;i<names.length;i++)
		{
			System.out.println((i+1)+" "+ names[i]);
		}
	}
	public static void main(String[] args) 
	{
		meme();
	}
}
