import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		��ü : person {name, age}
//		dict ���� banana : �ٳ���
		Map<String, String> map = new HashMap();
		System.out.println(map.put("banana", "�ٳ���"));
		System.out.println(map.get("banana"));
		System.out.println(map.put("banana", "��� �ٳ���"));
		System.out.println(map.get("banana"));
		map.put("kim", "20 ����� ����غ��(��)");
//		map.put("age", "20");
		// Ű �˼� �ֳ�
		for(String key : map.keySet()) System.out.println(key);
		// 
		String person = map.get("kim");
		String[] sp = person.split(" ");
		for(String str: sp) System.out.println(str);
		
		
	}

}
