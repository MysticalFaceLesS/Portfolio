package Dz12;

public class Basket {
	public int size;
	
	public Basket(int s) {
		this.size = s;
		
		System.out.println("Init size");
	}
	
	public Basket() {
		
		System.out.println("Dont init size");
	}
	
	public String toString() {

		return "{size = " + this.size + "}";
	}
}
