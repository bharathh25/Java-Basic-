class Charger{


	public static void main(String[] args){
		
		System.out.println("Starting Instance3 in main");
		System.out.println("-----------------------------");
		
		Charger charger = new Charger();
		System.out.println("Brand Name :"+charger.brand);
		
		String colourOfCharger = charger.colour;
		colourOfCharger = "White";
		System.out.println("Colour Of Charger :"+colourOfCharger);
		
		int lengthOfWire = charger.length;
		lengthOfWire = 7;
		System.out.println("Length Of Wire :"+lengthOfWire);
		
		System.out.println("-----------------------------");
		
		Claw claw = new Claw();
		System.out.println("Name Of Creature :"+claw.creature);
		
		String colourOfClaw = claw.colour;
		colourOfClaw = "White";
		System.out.println("Colour Of Claw :"+colourOfClaw);
		
		int claws = claw.noOfClaws;
		claws = 5;
		System.out.println("Number of claws :"+claws);
		
		System.out.println("-----------------------------");
		
		Crow crow = new Crow();
		System.out.println("Type :"+crow.type);
		
		String colourOfCrow = crow.colour;
		colourOfCrow = "Black";
		System.out.println("Colour Of Crow :"+colourOfCrow);
		
		int old = crow.age;
		old = 12;
		System.out.println("Number of claws :"+old);
		
		System.out.println("-----------------------------");
		
		Clock clock = new Clock();
		System.out.println("Time :"+clock.time);
		
		String shapeOfClock = clock.shape;
		shapeOfClock = "Circular";
		System.out.println("Shape Of Clock :"+shapeOfClock);
		
		double cost = clock.price;
		cost = 6106.00;
		System.out.println("Price :"+cost);
		
		System.out.println("-----------------------------");
		
		Lolipop lolipop = new Lolipop();
		System.out.println("Brand :"+lolipop.brand);
		
		String flav = lolipop.flavour;
		flav = "Strawberry";
		System.out.println("Lolipop Flavour :"+flav);
		
		double lolipopCost = lolipop.price;
		lolipopCost = 5.00;
		System.out.println("Price :"+lolipopCost);
		
		System.out.println("-----------------------------");
		
		Jean jean = new Jean();
		System.out.println("Brand :"+jean.brand);
		
		String jeanColour = jean.colour;
		jeanColour = "Navy Blue";
		System.out.println("Lolipop Flavour :"+jeanColour);
		
		double jeanCost = jean.price;
		jeanCost = 1555.00;
		System.out.println("Price :"+jeanCost);
		
		System.out.println("-----------------------------");
		
		Keyboard keyboard = new Keyboard();
		System.out.println("Brand :"+keyboard.brand);
		
		String keyBoardType = keyboard.type;
		keyBoardType = "Digital";
		System.out.println("Keyboard Type :"+keyBoardType);
		
		double keyboardCost = keyboard.price;
		keyboardCost = 22585.00;
		System.out.println("Price :"+keyboardCost);
		
		System.out.println("-----------------------------");
		
		Mountain mountain = new Mountain();
		System.out.println("Mountain Name :"+mountain.name);
		
		double heightOfMountain = mountain.height;
		heightOfMountain = 21778;
		System.out.println("Height Of Mountain (in feet) :"+heightOfMountain);
		
		String level = mountain.difficulty;
		level = "Very Hard";
		System.out.println("Difficulty Level :"+level);
		
		System.out.println("-----------------------------");
		
		Stadium stadium = new Stadium();
		System.out.println("Stadium Name :"+stadium.name);
		
		double capacityOfStadium = stadium.capacity;
		capacityOfStadium = 32000.00;
		System.out.println("Capacity Of Stadium :"+capacityOfStadium);
		
		String locationOfStadium = stadium.location;
		locationOfStadium = "Bengaluru";
		System.out.println("Location Of Stadium :"+locationOfStadium);
		
		System.out.println("-----------------------------");
		
		Spray spray = new Spray();
		System.out.println("Spray Name :"+spray.name);
		
		String sprayBrand = spray.brand;
		sprayBrand = "HIT";
		System.out.println("Spray Brand :"+sprayBrand);
		
		double sprayCost = spray.price;
		sprayCost = 156.87;
		System.out.println("Price :"+sprayCost);
		
		System.out.println("-----------------------------");
		System.out.println("Stopping Instance3 in main");
		
	}






	
	String brand = "SAMSUNG";
	String colour;
	int length;
	
	Charger(){
		System.out.println("Running Charger in main");
	}
}


class Claw{
	String creature = "CAT";
	String colour;
	int noOfClaws;
	
	Claw(){
		System.out.println("Running Claw in main");
	}
}


class Crow{
	String type = "Raven";
	String colour;
	int age;
	
	Crow(){
		System.out.println("Running Crow in main");
	}
}


class Clock{
	String time = "10.45 PM" ;
	String shape;
	double price;
	
	Clock(){
		System.out.println("Running Clock in main");
	}
}


class Lolipop{
	String brand = "Alphenlibe";
	String flavour;
	double price;
	
	Lolipop(){
		System.out.println("Running Lolipop in main");
	}
}


class Jean{
	String brand = "LEVI";
	String colour;
	double price;
	
	Jean(){
		System.out.println("Running Jean in main");
	}
}


class Keyboard{
	String brand = "CASIO";
	String type;
	double price;
	
	Keyboard(){
		System.out.println("Running Keyboard in main");
	}
}


class Mountain{
	String name = "Kailash Parvat";
	double height;
	String difficulty;
	
	Mountain(){
		System.out.println("Running Mountain in main");
	}
}


class Stadium{
	String name = "M.Chinnaswamy Stadium";
	double capacity;
	String location;
	
	Stadium(){
		System.out.println("Running Stadium in main");
	}
}


class Spray{
	String name = "Pocket Spray";
	String brand;
	double price;
	
	Spray(){
		System.out.println("Running Spray in main");
	}
	
	
	
}

