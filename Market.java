class Market{
	static double apple=100;
	static double banana=60;
	static double orange=70;
	static double watermelon=50;
	static double mango=150;
	static double quantity;
	public static double  bill(String item,double quantity){

	double totalPrice=0;
	
		if(item=="Apple"){
			totalPrice=quantity*apple;
			System.out.println("Total Price Of the Apple:"+totalPrice);
			return totalPrice; 
		}
		else if(item=="Banana"){
			totalPrice=quantity*banana;
			System.out.println("Total Price Of the Banana:"+totalPrice);
			return totalPrice;
		}
		else if(item=="Orange"){
			totalPrice=quantity*orange;
			System.out.println("Total Price Of the Orange:"+totalPrice);
			return totalPrice;
		}
		else if(item=="Watermelon"){
			totalPrice=quantity*watermelon;
			System.out.println("Total Price Of the Watermelon:"+totalPrice);
			return totalPrice;
		}
		else if(item=="Mango"){
			totalPrice=quantity*mango;
			System.out.println("Total Price Of the Mango:"+totalPrice);
			return totalPrice;
		}
		else{
			System.out.println("NA");
			return totalPrice;
		}
	}
}