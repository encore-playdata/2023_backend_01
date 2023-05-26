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
		String key = sc.nextLine();
		if(isValid(key)) map.remove(key);
		input();
	}
	public static void update() {
		// 키를 보여주고
		// 키를 입력하고 value 업데이트
		
		input();
	}
	public static void find() {
		// 키를 보여주고
		// 키를 입력하고 value 찾기
		System.out.println("키 입력");
	    String key = sc.nextLine();
	    if(isValid(key)) 
	    	System.out.println("key : " + key + ", value : " + map.get(key));
		input();
	}
	
	public static boolean isValid(String key) {
		if(map.containsKey(key)) 
	    	return true;
	    System.out.println("없는 단어");
	    return false;
	}
	
	public static boolean isValid(String key, boolean isInsert) {
		if(!map.containsKey(key)) return true;
	    System.out.println("있는 단어");
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
