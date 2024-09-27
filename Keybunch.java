class Keybunch{
	String material;
	Key key;
	
	Keybunch(String material, Key key){
		this.material=material;
		this.key=key;
	}
	
	public void display(){
		this.key.details();
		System.out.println("Keybunch Material:"+material);
	}
}