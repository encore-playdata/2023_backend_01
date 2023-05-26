package unit;

import data.Unit;

public class Zealout extends Unit{
	private int shield = 10;
	public Zealout() {
		super("Zealout", 100, 12);
	}
	@Override
	public String getDamage(Unit unit) {
		if(shield <= 0) {
			return super.getDamage(unit);
		}else {
			shield -= unit.getAttackPoint();
			return getName()+ "�� "+ unit.getName()+ "���� "
					+ unit.getAttackPoint() + "���� �޾Ҵ�";
		}
		
	}
	
}