package main;


import unit.Marine;
import unit.Zealout;

// ��ü �������� ���Ƿ� ���� �����ϴ� ���� ���Ѵ�
// Ŭ���� ���ø� 
// ������
// ��� 
// ĸ��ȭ
public class Main {
// ���� ������
// public -> protected -> default -> private
// public : ��𼭵� ������ �� �� �ִ�.
// protected : ���� ��Ű�� ������ ���� �Ǵ� ����� ������ ����
//	default : ���� ��Ű�� ������ ����
//	private : �ڱ� �ڽ� �ȿ����� ���� 
	public static void main(String[] args) {
//		Unit marine = new Unit("marine", 50, 10);
//		System.out.println(marine.attack());
//		Unit ���۸� = new Unit("���۸�", 30, 5);
//		System.out.println(marine.getDamage(���۸�));
//		System.out.println(marine.getHp());
		Marine marine = new Marine();
		Zealout zealout = new Zealout();
		for(int i=0; i < 5; i++) {
			zealout.getDamage(marine);
			System.out.println(zealout.getHp());
		}
		
		System.out.println(marine.getId() + " " + zealout.getId());
	}
}