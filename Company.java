class Company
{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("janavi",2,"software developer",500000);
	
	Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("location:"+this.location);
	    softwareEnginner.print();
	}
}