class CapitalCity
{
	String name;
	int population;
	
	CapitalCity(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
	public void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("population:"+this.population);
	}
}