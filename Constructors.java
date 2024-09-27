class Fish{
	String name;
	String colour;
	
	Fish(String nameLocal, String colourLocal){
		name=nameLocal;
		colour=colourLocal;
		System.out.println(" Name:"+name);
		System.out.println(" Colour :"+colour);
		System.out.println("-----------------------------");
	}
}

class Lamp{
	String lampColour;
	String size;
	
	Lamp(String lampColourLocal, String lampSizeLocal){
		lampColour=lampColourLocal;
		size=lampSizeLocal;
	    System.out.println(" Colour:"+lampColour);
		System.out.println(" Size:"+size);
		System.out.println("-----------------------------");
	}
}

class PrintingMachine{
	String type;
	double cost;
	
	PrintingMachine(String typeLocal, double costLocal){
		type=typeLocal;
		cost=costLocal;
		System.out.println(" type:"+type);
		System.out.println(" cost:"+cost);
		System.out.println("-----------------------------");
	}
}

class Lens{
	String lensColour;
	double lensCost;
	
	Lens(String lensColourLocal,double lensCostLocal){
		lensColour=lensColourLocal;
		lensCost=lensCostLocal;
		System.out.println(" Colour:"+lensColour);
		System.out.println(" Cost:"+lensCost);
		System.out.println("-----------------------------");		
	}
}

class Coil{
	String brand;
	double coilCost;
	
	Coil(String brandLocal,double coilCostLocal){
		brand=brandLocal;
		coilCost=coilCostLocal;
		System.out.println(" Brand:"+brand);
		System.out.println(" Cost:"+coilCost);
		System.out.println("-----------------------------");
	}
	
}

//-------------------------------------------------------------------


class Cap{
	String capBrand;
	String capColour;
	double capCost;
	
	Cap(String capBrandLocal, String capColourLocal, double capCostLocal){
		capBrand=capBrandLocal;
		capColour=capColourLocal;
		capCost=capCostLocal;
		System.out.println(" Brand:"+capBrand);
		System.out.println(" Colour:"+capColour);
		System.out.println(" Cost:"+capCost);
		System.out.println("-----------------------------");
	}
	
}

class Gold{
	int carat;
	double price;
	double weight;
	
	Gold(int caratLocal, double priceLocal, double weightLocal){
		carat=caratLocal;
		price=priceLocal;
		weight=weightLocal;
		System.out.println(" Carat:"+carat);
		System.out.println(" Price per gram:"+price);
		System.out.println(" Weight of gold in grams:"+weight);
		System.out.println("-----------------------------");
	}
}

class Board{
	String boardColour;
	String boardType;
	String boardSize;
	
	Board(String boardColourLocal, String boardTypeLocal, String boardSizeLocal){
		boardColour=boardColourLocal;
		boardType=boardTypeLocal;
		boardSize=boardSizeLocal;
		System.out.println(" Colour:"+boardColour);
		System.out.println(" Type:"+boardType);
		System.out.println(" Size:"+boardSize);
		System.out.println("-----------------------------");
	}
}

class Led{
	String ledColour;
	String ledSize;
	String status;
	
	Led(String ledColourLocal, String ledSizeLocal, String statusLocal){
		ledColour=ledColourLocal;
		ledSize=ledSizeLocal;
		status=statusLocal;
		System.out.println(" Colour:"+ledColour);
		System.out.println(" Size:"+ledSize);
		System.out.println(" Status:"+status);
		System.out.println("-----------------------------");
	}
	
}

class SimCard{
	String simBrand;
	String validity;
	double simPrice;
	
	SimCard(String simBrandLocal, String validityLocal, double simPriceLocal){
		simBrand=simBrandLocal;
		validity=validityLocal;
		simPrice=simPriceLocal;
		System.out.println(" Brand:"+simBrand);
		System.out.println(" Validity in months:"+validity);
		System.out.println(" Price:"+simPrice);
		System.out.println("-----------------------------");

	}
}


