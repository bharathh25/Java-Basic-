class PersonRunner{
public static void main(String[] args){
if(args.length==4){
 String name=args[0];
 String email=args[1];
 String age=args[2];
 String password=args[3];
 
 
	Person.info(name,email,age,password);
 }
 else{
	 System.out.println("Enter 4 args");
 }
 }
 }