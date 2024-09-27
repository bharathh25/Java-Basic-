class Knife{
	double weight;
	double height;
	
	Knife(double weight,double height){
		this.weight=weight;
		this.height=height;
	}
	
	public void details(){
		System.out.println("Knife Weight:"+this.weight);
		System.out.println("Knife Height:"+this.height);
	}
}