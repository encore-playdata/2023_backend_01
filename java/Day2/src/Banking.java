
public class Banking {

	public static void main(String[] args) {
		int money = 50300;
		int coffee = 2200;
//		System.out.println(money / coffee);
//		System.out.println(money % coffee);
		// 1900 22
		// ���� �ε� 
		// �Ž������� õ�� ���� 500 � 100�� � 
//		int �Ž����� = money % coffee;
//		int[] ȭ�� = {1000, 500, 100};
//		for(int i = 0; i < ȭ��.length; i++) {// 2
//			//i =0 1 2
//			if(i == 0) {
//				System.out.println(�Ž����� / ȭ��[i]);
//			}else {
//				System.out.println(
//						(�Ž����� 
//							- ((�Ž����� / ȭ��[i-1]) * ȭ��[i-1])) 
//						/ ȭ��[i]);// 3
//			}
//		}
//		System.out.println(�Ž����� / ȭ��[0]);
//		System.out.println(
//				(
//					�Ž����� 
//					- ( (�Ž����� / ȭ��[0]) * ȭ��[0])
//				) 
//				/ ȭ��[1]);
//		System.out.println(
//				(
//					�Ž����� 
//					- ((�Ž����� / ȭ��[1]) * ȭ��[1])
//				) 
//				/ ȭ��[2]);
		int �Ž����� = money % coffee; //1900
		int[] ȭ�� = {1000, 500, 100};
		for(int i = 0; i < ȭ��.length; i++) {
//			if(ȭ��[i] == 1000 ) continue;
			System.out.println(ȭ��[i]
					+" "+
					�Ž����� / ȭ��[i]);
			�Ž����� = �Ž����� % ȭ��[i];
			if(ȭ��[i] == 1000) break;
		}
//		50000 -> 10000 -> 5000 -> 1000 ->...-> 10
		
		
	}

}
