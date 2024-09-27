class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Bengaluru",364345);
	
	public State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}
	 public void print()
	 {
		 System.out.println("name:"+this.name);
		 System.out.println("language:"+this.language);
		 capitalCity.display();
	 }
}