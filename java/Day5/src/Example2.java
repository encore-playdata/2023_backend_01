import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Map<String, List<Person>> map = new HashMap<>();
//		���� null -> [�ھ�] -> [�ھ�, �达]
//		�λ� [�̾�] 
//		���� [����] 
//		���� [����] 
//		�ȵ� []
//		List<Person> persons = new ArrayList<Person>();
//		persons.add(new Person("�ھ�",20));
//		// [�ھ�]
//		map.put("����", persons);
		List<Person> persons1 = map.get("����");
		// [�ھ�]
		persons1.add(new Person("�达",20));
		// [�ھ�, �达]
		System.out.println(map);
		
		
//		List<Person> getList = map.getOrDefault("����", new ArrayList<Person>());
////		{} [] [�ھ�]
//		getList.add(new Person("�达",20));
//		// [�ھ� , �达]
//		map.put("����", getList);
//		{����:[�ھ�]} {���� : [�ھ� , �达]}
//		System.out.println(map);
		
		
	}
	
	
	
}
class Person { 
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}