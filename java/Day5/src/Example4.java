import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		// 정렬
		String excel = "수\t이름\t나이\n" + 
				"1\t박\t20\n" + 
				"2\t김\t30\n" + 
				"3\t이\t40\n" + 
				"4\t권\t비공개";
//		\n 쪼갠다 하나의 배열에 5요소 가 담겨있다
		String[] arr = excel.split("\n");
// 		각 줄에 \t 쪼갠다
		List<String[]> list = new ArrayList();
		for (int i = 1; i < arr.length; i++) {
			list.add(arr[i].split("\t"));
		}
//		데이터를 담을 클래스를 만든다 
		
//		이제 넣고 출력만 하면 된다.
		List<Person0> answer = new ArrayList<Person0>();
		for(int i = 0; i < list.size(); i++) {
			String[] get = list.get(i);
			Person0 person0 = new Person0(
					Integer.parseInt(get[0])
					, get[1]
					, get[2]
					);
			answer.add(person0);
		}
//		출력하니 주소 값 나와서 toString 처리를 해준다.
		System.out.println(answer);
		
		
		
		
		// 객체화
//		[{number:1,name:박, age:20},
//		{number:2,name:김, age:30},
//		{number:3,name:이, age:40},
//		{number:4,name:권, age:null}]
		
		String excel2 = "수\t상호명\t좌표\t지역\n" + 
				"1\t피자\t37.01,127.01\t대구\n" + 
				"2\t치킨\t37.03,127.02\t대전\n" + 
				"3\t햄버거\t37.13,127.02\t서울\n" + 
				"4\t감자탕\t36.13,127.02\t부산";
		// 객체화
		// \n 쪼갠다 하나의 배열에 5요소 가 담겨있다
		
		
	}
}
//String excel = "수\t이름\t나이\n" + 
//		"1\t박\t20\n" + 
//		"2\t김\t30\n" + 
//		"3\t이\t40\n" + 
//		"4\t권\t비공개";
class Person0{
	private int num;
	private String name;
	private Integer age;
	public Person0(int num, String name, String age) {
		if(!age.equals("비공개")) this.age = Integer.parseInt(age);
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "{num=" + num + ", name=" + name + ", age=" + age + "}\n";
	}
	
}


