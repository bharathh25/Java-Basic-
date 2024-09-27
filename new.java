package com.xworkz.practice;

public class Snake {
	public String name;
	public int length;
	public String type;
	
	public Snake(String name,int length,String type) {
		this.name=name;
		this.length=length;
		this.type=type;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Length:"+length);
		System.out.println("Type:"+type);
	}
}


package com.xworkz.practice;

public class SnakeRunner {
	
	public static void main(){
		Snake snake = new Snake("King Cobra", 29, "Venomous");
		snake.display();
	}
}
