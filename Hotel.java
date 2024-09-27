class Hotel
{
    String name;
	Owner owner=new Owner("Bharath",22,"Male");
	
	
	
	public Hotel (String name)
	{
		this.name=name;
	}
	public void show()
	{
		System.out.println("name:"+name);
		owner.print();
	}
}