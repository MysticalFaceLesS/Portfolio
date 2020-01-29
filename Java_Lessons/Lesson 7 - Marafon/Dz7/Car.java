package Dz13;

public class Car extends Transport{
	
	public Integer getSpeed() {
		return (int) (150 * Math.random() + 50);
	}
}
