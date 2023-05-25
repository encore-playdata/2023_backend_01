import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		int[] arr = new int[3]; // array 012
		
		List<Integer> list = new ArrayList(); // 길이가 무한
//		list.add(1);
//		list.add(2);
//		list.add(1);
//		Integer[] tmp = (Integer[]) list.toArray();
		System.out.println(arr.length);
		System.out.println(list.remove("st"));
//		System.out.println(list.set(0, 3));
		System.out.println(list);
//		123456789 넣고 짝수의 합을 구하자 20
		List<Integer> list2 = new ArrayList<>();
	    int sum = 0;
	    for (int i=1; i<10; i++) {
	        list2.add(i);
	    }
	    for (int i=0; i<list2.size(); i++) {
	    	if (list2.get(i) % 2 == 0) {
	            sum += list2.get(i);
	        }
	    }
	    for(Integer i:list2) if(i %2 ==0) sum += i;
	    System.out.println("짝수의 합:" + " " + sum);
// 	name 과 age 를 가지고 있는 person을 만들고
// 	input 데이터 : 
//	    {name : park, age: 20}, {name:kim, age: 14},{name:lee, age: 24},
//	    한 해가 지나서 한살 먹어야함 한살 씩 먹이고 출력하라
//	   output : 
//	    [{name : park, age: 21}, {name:kim, age: 15},{name:lee, age: 25},]
		Person person1 = new Person("park", 20);
		Person person2 = new Person("kim", 14);
		Person person3 = new Person("lee", 24);
		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
//		for(int i =0; i< persons.size(); i++) {
//			Person tmp1 = persons.get(i);
//			Person p = new Person(tmp1.getName(), tmp1.getAge()+1);
//			persons.set(i, p);
//		}
//		for(Person person: persons) {
//			person.setAge(person.getAge()+1);
//		}
		for(Person person: persons) {
			person.grow();
		}
		String answer = "[";
		for(Person temp2: persons)
        {
            answer += "{name:"+temp2.getName()+","+"age:"+temp2.getAge()+"},";
        }
		System.out.println(answer+"]");	
		System.out.println(persons);
	}
}
//class ArrayList extends List
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void grow() {
		age++;
	}
	@Override
	public String toString() {
		return "{name=" + name + ", age=" + age + "}";
	}
	
}













