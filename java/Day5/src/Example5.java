import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		String excel2 = "��\t��ȣ��\t��ǥ\t����\n" + 
				"1\t����\t37.01,127.01\t�뱸\n" + 
				"2\tġŲ\t37.03,127.02\t����\n" + 
				"3\t�ܹ���\t37.13,127.02\t����\n" + 
				"4\t������\t36.13,127.02\t�λ�";
		
//		\n �ɰ��� �ϳ��� �迭�� 5��� �� ����ִ�
		String[] arr = excel2.split("\n");
// 		�� �ٿ� \t �ɰ���
		List<String[]> list = new ArrayList();
		for (int i = 1; i < arr.length; i++) {
			list.add(arr[i].split("\t"));
		}
//		���� �ְ� ��¸� �ϸ� �ȴ�.
		List<Food> answer = new ArrayList<Food>();
		for(int i = 0; i < list.size(); i++) {
			answer.add(new Food(
					Integer.parseInt(list.get(i)[0])
					, list.get(i)[1]
					, list.get(i)[2]
					, list.get(i)[3])
					);
		}
		
		
		System.out.println(answer);

	}

}
// ��\t��ȣ��\t��ǥ\t����\n
class Food{
	private int num;
	private String name;
	private float[] coordinate;
	private String region;
	public Food(int num, String name, String coordinate, String region) {
		this.num = num;
		this.name = name;
		float[] tmp = new float[2];
		tmp[0] = Float.parseFloat(coordinate.split(",")[0]);
		tmp[1] = Float.parseFloat(coordinate.split(",")[1]);
		this.coordinate = tmp;
		this.region = region;
	}
	@Override
	public String toString() {
		return "Food [num=" + num + ", name=" + name + ", coordinate=" 
	+ Arrays.toString(coordinate) + ", region=" + region + "]\n";
	}
}