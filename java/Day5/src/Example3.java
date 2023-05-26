import java.util.*;

public class Example3 {
	static Scanner sc;
	static Map<String, List<Person>> map = new HashMap<>();
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		controller();
	}
	static void controller() {
		System.out.println("1. insert 2. find 3. findAll 4. Exit");
		String nextLine = sc.nextLine();
		
		int mode = Integer.parseInt(nextLine);
		selectMode(mode);
	}
	static void insert() {
		String region = sc.nextLine();
		String name = sc.nextLine();
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);
		List<Person> orDefault = map.getOrDefault(region, new ArrayList<>());
		orDefault.add(new Person(name,age));
		map.put(region, orDefault);
		controller();
	}
	
	static void find() {
		
	}
	static void findAll() {
		System.out.println(map);
		controller();
	}
	
	
	private static void selectMode(int mode) {
		if(mode == 1) insert();
		else if(mode == 2) find();
		else if(mode == 3) findAll();
		else if(mode == 4) return;
		else controller();
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