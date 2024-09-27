class Countryy
{
	String name;
	String continent;
	State state=new State("Karnataka","kannada");
	
	public Country(String name,String continent)
	{
		this.name=name;
		this.continent=continent;
	}
	
	public void show()
	{
		System.out.println("name:"+this.name);
		System.out.println("continent:"+this.continent);
		state.print();
	}
	
}