class detailscar
{
	static String carmodelname="swift";
	int carcost;
	char fueltype;
	public static void main(String[]args)
	{
		System.out.println(carmodelname);
		detailscar x1=new detailscar();
		x1.carcost=300000;
		System.out.println("car cost="+x1.carcost);
		detailscar x2=new detailscar();
		x2.fueltype='P';
		System.out.println("fuel type="+x2.fueltype);
	}
}