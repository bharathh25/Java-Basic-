class Clip{
	String colour;
	String type;
	
	Clip(String colour,String type){
		this.colour=colour;
		this.type=type;
	}
	
	public void details(){
		System.out.println("Clip Colour:"+this.colour);
		System.out.println("Clip Type:"+this.type);
	}
}