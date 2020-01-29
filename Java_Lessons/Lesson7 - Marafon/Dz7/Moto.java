package Dz13;

public class Moto extends Transport {
	
	public Integer getSpeed() {
		return (int) (200 * Math.random() + 10);
	}
}
