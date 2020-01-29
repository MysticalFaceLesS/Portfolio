package Dz13;

public class Buss extends Transport {
	
	public Integer getSpeed() {
		return (int) (120 * Math.random() + 80);
	}
}
