class MkpRunner{
	
	public static void main(String[] args){
		
		Mask mask = new Mask();
		Mask mask1 = new Mask(40);
		Mask mask2 = new Mask('L');
		Mask mask3 = new Mask("Polypropylene");
		Mask mask4 = new Mask(50,'M',"Polypropylene");
		Mask mask5 = new Mask(30,'S');
		
		System.out.println("=======================");
		
		Kerosene kerosene = new Kerosene();
		Kerosene kerosene1 = new Kerosene(60,2,true);
		Kerosene kerosene2 = new Kerosene(false);
		Kerosene kerosene3 = new Kerosene(30);

		System.out.println("=======================");
		
		Aeroplane aeroplane = new Aeroplane();
		Aeroplane aeroplane1 = new Aeroplane("Qatar Airways",2,650250.255,"Bengaluru","USA");
		Aeroplane aeroplane2 = new Aeroplane("Etihad Airways","Bengaluru","Abu Dhabi");
		Aeroplane aeroplane3 = new Aeroplane("Air India",5800,"Bengaluru","Mumbai");

		System.out.println("=======================");
		
		
	}
}