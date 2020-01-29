package Dz12;

public class Cube {
	public String color;
	
	public Cube(String c) {
		this.color = c;
		
		System.out.println("Init color");
	}
	
	public Cube() {
		
		System.out.println("Color not found");
	}
	
	public String toString() {

		return "{color = " + this.color + "}";
	}

}
