package car;

abstract public class Car {
	//1. �ܵ����� ������ �� ����
	//2. �߻�޼��带 �����ؾ��ϴ� �ǹ��� ����
	int maxSpeed;
	boolean power;
	Source ��������;
	
	public Car(int maxSpeed, boolean power, Source ��������) {
		this.maxSpeed = maxSpeed;
		this.power = power;
		this.�������� = ��������;
	}
	
	public void changePower() {
		power = !power;
	}
	
	public String go() {
		if(power) {
			return "������ ���ϴ�";
		} else {
			return "�õ��� �ɾ��ּ���";
		}
	}
	abstract public String sound();
}