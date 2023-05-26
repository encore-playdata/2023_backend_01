import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// �Է��� �޾Ƽ� 
// apple ��� 
// banana �ٳ��� 
// ����
public class Test1 {
	static Map<String, String> map = new HashMap();
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		input();
	}
	
	public static void input() {
		System.out.println("1. insert 2. delete 3. update");
		System.out.println("4. find 5. exit");
		int i = Integer.parseInt(sc.nextLine());
		modeSelect(i);
	}
	
	public static void insert() {
		System.out.println("���ܾ� �Է�");
		String key = sc.nextLine();
		System.out.println("�ѱ��� �Է�");
		String value = sc.nextLine();
		if(isValid(key, true)) map.put(key, value);
		input();
	}
	
	public static void delete() {
		System.out.println("Ű �Է�");
		String key = sc.nextLine();
		if(isValid(key)) map.remove(key);
		input();
	}
	
	public static void update() {
		System.out.println("Ű �Է�");
	    String key = sc.nextLine();
	    System.out.println("�ٲ� ���� �Է�");
	    String value = sc.nextLine();
		if(isValid(key)) map.put(key, value);
		input();
	}
	public static void find() {
		System.out.println("Ű �Է�");
	    String key = sc.nextLine();
	    if(isValid(key)) 
	    	System.out.println("key : " + key + ", value : " + map.get(key));
		input();
	}
	
	public static boolean isValid(String key) {
		if(map.containsKey(key)) 
	    	return true;
	    System.out.println(key + "�ε� �ܾ�� �����ϴ�.");
	    return false;
	}
	
	public static boolean isValid(String key, boolean isInsert) {
		if(!map.containsKey(key)) return true;
	    System.out.println(key + "�� " + map.get(key) + "��� �ִ� �ܾ��Դϴ�.");
	    return false;
	}
	
	public static void modeSelect(int mode) {
		switch (mode) {
			case 1:
				insert(); break;
			case 2:
				delete(); break;
			case 3:
				update(); break;
			case 4:
				find(); break;
			case 5:
				break;
			default:
				input(); break;
		}
	}
		
}
