class KeybunchRunner{
	public static void main(String[] args){
		
		Key key=new Key(29.56,"Anime");
		Keybunch keybunch=new Keybunch("Cotton", key);
		keybunch.display();
		
		System.out.println("---------------------");
		
		Key key1=new Key(35.52,"Marvel");
		Keybunch keybunch1=new Keybunch("Plastic", key1);
		keybunch1.display();
		
		System.out.println("---------------------");
		
		Key key2=new Key(42.21,"Iron-Man");
		Keybunch keybunch2=new Keybunch("Metal", key2);
		keybunch2.display();
		
		System.out.println("---------------------");
	}
}