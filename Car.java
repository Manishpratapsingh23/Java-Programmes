package vehicle;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;

	private int type;

	public Car(int carType, int VehicleType) {
		super(VehicleType);
		this.type = carType;
	}

	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
		System.out.println("Car is Type: " + this.type);
	}
}
