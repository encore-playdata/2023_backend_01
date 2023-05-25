package data;

abstract public class Unit extends Player{
	private static int count = 0;
	private int id;
	private String name;
	private int hp;
	private int attackPoint;
//	"�ǹ�" , "��Ҵ�" , "�׾���"
	private UStatus status;
	
	public Unit(String name, int hp, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
		this.hp = hp;
		count++;
		id = count;
	}
	public Unit(String name, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
	}
	public String attack() {
		return name+ "�� " + attackPoint + "���� ����ϴ�";
	}
	public String getDamage(Unit unit) {
		hp = hp - unit.getAttackPoint();
		return name+ "�� "+ unit.getName()+ "���� "
				+ unit.getAttackPoint() + "���� �޾Ҵ�";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	
}
