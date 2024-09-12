package vehicle;

public class Vehicle {
	protected String color;
	private int maxSpeed;
	protected int type;

	public Vehicle(int type) {
		this.type = type;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void print() {
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
		System.out.println("Type: " + this.type);

	}

}
