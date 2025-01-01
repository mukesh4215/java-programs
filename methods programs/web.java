class web 
{
	static String firstname="abc";
	static String lastname="xyz";
	static String phoneno="999999";
	static String email="abc@gmail.com";
	static String username="abcdef";
	static String password="catdog";
	static void login(String uname,String pwd)
	{
		if((uname.equals(username)) && (pwd.equals(password)) || (uname.equals(email)) && (pwd.equals(password)) || (uname.equals(phoneno)) && (pwd.equals(password)))		
			{
				System.out.println("Login Sucessfull");
				HomePage();
			}
			else
			{
				System.out.println("Invalid username 0r Password");
			}
		}
	public static void HomePage() 
	{
		System.out.println("Welcome to home page");
	}
	public static void main(String[] args)
	{
		login("abcdf","catdog");
	}
}
