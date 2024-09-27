class Market1{
	public static double fruits(String name,int quantity)
	{
		if(name=="Apple"){
		  int price=200;
		  double total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Orange"){
		  int price=60;
		  double total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Pinapple"){
		  int price=40;
		  double total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Mango"){
		  int price=250;
		  double total=quantity*price;
		 return total;
		} 
		
		if(name=="Watermelon"){
		  int price=50;
		  double total=quantity*price;
		 return total;
		} 
		else return 0;
		
		
	}
	
}