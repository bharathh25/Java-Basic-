class Speaker{
	String brand = "BOAT";
	char size;
	double cost;
	String output;
	
	public Speaker(char size){
		this.size = size;
	}
	
	public void setCost(double cost){
		this.cost = cost;
	}
	
	public void speakerOutput(String output){
		this.output = output;
	}
	
	public void SpeakerDisplay(){
		System.out.println("Speaker Brand :"+brand);
		System.out.println("Speaker Size :"+this.size);
		System.out.println("Speaker Cost :"+this.cost);
		System.out.println("Speaker Output Quality :"+this.output);
	}
}
class Rocket{
	String country = "INDIA";
	double speed;
	double fuelCapacity;
	int noOfThrusters;
	
	public Rocket(double speed){
		this.speed = speed;
	}
	
	public void setFuelCapacity(double fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	
	public void thrusters(int noOfThrusters){
		this.noOfThrusters = noOfThrusters;
	}
	
	public void RocketDisplay(){
		System.out.println("Country :"+country);
		System.out.println("Speed:"+this.speed);
		System.out.println("Fuel Capacity :"+this.fuelCapacity);
		System.out.println("Number Of Thrusters :"+this.noOfThrusters);
	}
}

class Chocolate{
	String brand = "Cadbury";
	double price;
	String flavour;
	char size;
	
	public Chocolate(double price){
		this.price = price;
	}
	
	public void setFlavour(String flavour){
		this.flavour = flavour;
	}
	
	public void ChocolateSize(char size){
		this.size = size;
	}
	
	public void ChocolateDisplay(){
		System.out.println("Chocolate Brand :"+brand);
		System.out.println("Chocolate Price :"+this.price);
		System.out.println("Chocolate Flavour :"+this.flavour);
		System.out.println("Chocolate Size :"+this.size);
	}
}


class Projector{
	String company;
	String type = "Digital";
	String color;
	double weight;
	
	public Projector(String company){
		this.company = company;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void ProjectorWeight(double weight){
		this.weight = weight;
	}
	
	public void ProjectorDisplay(){
		System.out.println("Projector Company :"+this.company);
		System.out.println("Projector Type :"+type);
		System.out.println("Projector Color :"+this.color);
		System.out.println("Projector Weight :"+this.weight);
	}
}


class Paper{
	double thickness;
	String size = "A4";
	String quality;
	String color;
	
	public Paper(double thickness){
		this.thickness = thickness;
	}
	
	public void setQuality(String quality){
		this.quality = quality;
	}
	
	public void ProjectorColor(String color){
		this.color = color;
	}
	
	public void PaperDisplay(){
		System.out.println("Paper Thickness :"+this.thickness);
		System.out.println("Paper Size :"+size);
		System.out.println("Paper Quality :"+this.quality);
		System.out.println("Paper Color :"+this.color);
	}
}



/*Speaker : brand,size,cost,output
Rocket: country,speed,fuelCapacity,noOfThrusters
Chocolate: brand,price,flavour,size
Projector: company,type,color,weight
Paper : thickness,size,quality,color*/

