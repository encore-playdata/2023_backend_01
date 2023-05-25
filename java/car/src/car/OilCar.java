package car;

public class OilCar extends Car implements Charge{
	
	int gasolin;
	
	public OilCar(int gasolin) {
		super(100, false);
		this.gasolin = gasolin;
	}

	public void gasUp(int gasolin) {
		
	}

	@Override
	public String sound() {
		return "빠라빠라밤";
	}

	@Override
	public int 충전(int source) {
		this.gasolin += gasolin;
		return gasolin;
	}

}
