package vehicle;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(20);
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();

		Car c = new Car(10000, 20000);
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
		c.print();
	}
}
