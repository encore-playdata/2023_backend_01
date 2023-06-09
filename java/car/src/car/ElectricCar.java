package car;

public class ElectricCar extends Car implements Charge{
	
	int battery;
	
	public ElectricCar(int battery) {
		super(200, false);
		this.battery = battery;
	}
	
	@Override
	public String toString() {
		return "ElectricCar [battery=" + battery + ", maxSpeed=" + maxSpeed + ", power=" + power + "]";
	}

	@Override
	public String sound() {
		return "快快快快旷";
	}

	@Override
	public int 面傈(int source) {

		battery += source;
		return 0;
	}

}
