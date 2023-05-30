import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		// ����
		String excel = "��\t�̸�\t����\n" + 
				"1\t��\t20\n" + 
				"2\t��\t30\n" + 
				"3\t��\t40\n" + 
				"4\t��\t�����";
//		\n �ɰ��� �ϳ��� �迭�� 5��� �� ����ִ�
		String[] arr = excel.split("\n");
// 		�� �ٿ� \t �ɰ���
		List<String[]> list = new ArrayList();
		for (int i = 1; i < arr.length; i++) {
			list.add(arr[i].split("\t"));
		}
//		�����͸� ���� Ŭ������ ����� 
		
//		���� �ְ� ��¸� �ϸ� �ȴ�.
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
//		����ϴ� �ּ� �� ���ͼ� toString ó���� ���ش�.
		System.out.println(answer);
		
		
		
		
		// ��üȭ
//		[{number:1,name:��, age:20},
//		{number:2,name:��, age:30},
//		{number:3,name:��, age:40},
//		{number:4,name:��, age:null}]
		
		String excel2 = "��\t��ȣ��\t��ǥ\t����\n" + 
				"1\t����\t37.01,127.01\t�뱸\n" + 
				"2\tġŲ\t37.03,127.02\t����\n" + 
				"3\t�ܹ���\t37.13,127.02\t����\n" + 
				"4\t������\t36.13,127.02\t�λ�";
		// ��üȭ
		// \n �ɰ��� �ϳ��� �迭�� 5��� �� ����ִ�
		
		
	}
}
//String excel = "��\t�̸�\t����\n" + 
//		"1\t��\t20\n" + 
//		"2\t��\t30\n" + 
//		"3\t��\t40\n" + 
//		"4\t��\t�����";
class Person0{
	private int num;
	private String name;
	private Integer age;
	public Person0(int num, String name, String age) {
		if(!age.equals("�����")) this.age = Integer.parseInt(age);
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "{num=" + num + ", name=" + name + ", age=" + age + "}\n";
	}
	
}


