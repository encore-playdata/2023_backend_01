package test;
// ���ǹ�
public class Study5 {
	
	public static void main(String[] args) {
		// ������ �׾�����
		// �� true ���� false
		boolean isDead = false;
		if(isDead) {
			System.out.println("������");
		}else {
			System.out.println("���δ�");
		}
		
		int i = 7;
		if(i > 7) {
			System.out.println("if");
		}else if(i == 7) {
			System.out.println("elseif");
		}else {
			System.out.println("else");
		}
		String hi = "hi";
		String hi2 = hi + "1";
		if(!hi2.equals("hi1")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		Integer a = 0;
		Integer b = 0;
		if(a + 1 != b + 1) 
			System.out.println("true");
		System.out.println(hi + "1" == "hi1");
		System.out.println(hi + "1");
		// 3�׿����� 
		int p = 5;
//		if(p % 2 ==0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
//		System.out.println(p % 2 == 0 ? "¦��" : "Ȧ��");
		switch (p % 2) {
			case 1:
				System.out.println("Ȧ��");
			case 0:
				System.out.println("¦��");
			default:
				System.out.println("default");
				break;
		}
	}
}
