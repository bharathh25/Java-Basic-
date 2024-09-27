class Student1{
public static void main(String[] args){
	
	String bike = "test";
	double price;
	double cgst;
	double sgst;
	
	if(bike=="GT650"){
		price=200000;
	    cgst = ((0.18)* price);
	    sgst = ((0.18)* price);
		double ref1 = price+cgst+sgst;
		System.out.println("Bike Model : GT650");
		System.out.println("Price :"+price);
		System.out.println("CGST 18% :"+cgst);
		System.out.println("SGST 18% :"+sgst);
		System.out.println("Total Price:"+ref1);
		
	}
	else if(bike=="NS250"){
		price=150000;
		cgst = ((0.18)* price);
	    sgst = ((0.18)* price);
		double ref2 = price+cgst+sgst;
		System.out.println("Bike Model : NS250");
		System.out.println("Price :"+price);
		System.out.println("CGST 18% :"+cgst);
		System.out.println("SGST 18% :"+sgst);
		System.out.println("Total Price:"+ref2);
		
	}
	else {
		System.out.println("NA");
	}
	
	
}	
}