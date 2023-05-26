import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 입력을 받아서 
// apple 사과 
// banana 바나나 
// 저장
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
		System.out.println("영단어 입력");
		String key = sc.nextLine();
		System.out.println("한국어 입력");
		String value = sc.nextLine();
		if(isValid(key, true)) map.put(key, value);
		input();
	}
	
	public static void delete() {
		System.out.println("키 입력");
		String key = sc.nextLine();
		if(isValid(key)) map.remove(key);
		input();
	}
	
	public static void update() {
		System.out.println("키 입력");
	    String key = sc.nextLine();
	    System.out.println("바꿀 내용 입력");
	    String value = sc.nextLine();
		if(isValid(key)) map.put(key, value);
		input();
	}
	public static void find() {
		System.out.println("키 입력");
	    String key = sc.nextLine();
	    if(isValid(key)) 
	    	System.out.println("key : " + key + ", value : " + map.get(key));
		input();
	}
	
	public static boolean isValid(String key) {
		if(map.containsKey(key)) 
	    	return true;
	    System.out.println(key + "로된 단어는 없습니다.");
	    return false;
	}
	
	public static boolean isValid(String key, boolean isInsert) {
		if(!map.containsKey(key)) return true;
	    System.out.println(key + "는 " + map.get(key) + "라고 있는 단어입니다.");
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
