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
		return "��������";
	}

	@Override
	public int ����(int source) {
		this.gasolin += gasolin;
		return gasolin;
	}

}
