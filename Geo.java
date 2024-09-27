class Geo{
 public static String countryName(int countryCode){
  System.out.println("starting countryName in Geo");
  System.out.println("CountryCode: "+ countryCode);
  
  if(countryCode == 91)
  {
   return "India";
  }
  if(countryCode == 61)
  {
   return "Australia";
  }
  if(countryCode == 64)
  {
   return "New Zealand";
  }
  if(countryCode == 27)
  {
   return "South Africa";
  }
  if(countryCode == 66)
  {
   return "England";

  }
  
  return "No_Country_Found";
 }
 public static double product(String item){
  System.out.println("starting product in item");
  System.out.println("Product: "+ item);
  
  if(item == "MRF")
  {
   return 2000.025;
  }
  if(item == "CEAT")
  {
   return 3000.035;
  }
  if(item == "SS")
  {
   return 4000.045;
  }
  if(item == "SG_English_willow")
  {
   return 5000.055;
  }
  if(item == "DSC")
  {
   return 6000.0345;
  }
  return 10000.00;
 }
 public static String ProducerName(String Movie){
  System.out.println("Starting films in Geo");
  System.out.println("The Producer Name is: "+Movie);
  
  if(Movie == "KGF")
  {
   return "Prashanth Neel";
  }
  if(Movie == "Bahubali")
  {
   return "S S Rajamouli";
  }
  if(Movie == "Ui")
  {
   return "Upendra";
  }
  if(Movie == "Kalki 2898AD")
  {
   return "Nagashwin";
  }
  if(Movie == "Titanic")
  {
   return "James Cameron";
  }
  return "Director Unknown";
 }
}
