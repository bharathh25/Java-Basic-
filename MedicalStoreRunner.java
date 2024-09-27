class 	MedicalStoreRunner{
 public static void main(String[] args){
  
  double price = MedicalStore.cost("Adderall_tablet");
  System.out.println("Cost of medicine: "+ price);
  
  price = MedicalStore.cost("Evron_tablet");
  System.out.println("Cost of medicine: "+ price);
  
  price = MedicalStore.cost("VicksAction500");
  System.out.println("Cost of medicine: "+ price);
  
  System.out.println("====================================================================");
  
  String ref = MedicalStore.sympton("Cough");
  System.out.println("medicine_required: "+ ref);
  
  ref = MedicalStore.sympton("dizzyness");
  System.out.println("medicine_required: "+ ref);
  
  ref = MedicalStore.sympton("Vomitting");
  System.out.println("medicine_required: "+ ref);
  
  System.out.println("====================================================================");
  
  boolean schedule = MedicalStore.avail("Dr Swathi");
  System.out.println("The Doctor is Availabale :"+ schedule);
  
  schedule = MedicalStore.avail("Dr Ashwini");
  System.out.println("The Doctor is Availabale :"+ schedule);
  
  schedule = MedicalStore.avail("Dr Manjunath");
  System.out.println("The Doctor is Availabale :"+ schedule);
  
  schedule = MedicalStore.avail("Dr Ambedkar");
  System.out.println("The Doctor is Availabale :"+ schedule);
 }
}
