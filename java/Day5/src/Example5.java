import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		String excel2 = "수\t상호명\t좌표\t지역\n" + 
				"1\t피자\t37.01,127.01\t대구\n" + 
				"2\t치킨\t37.03,127.02\t대전\n" + 
				"3\t햄버거\t37.13,127.02\t서울\n" + 
				"4\t감자탕\t36.13,127.02\t부산";
		
//		\n 쪼갠다 하나의 배열에 5요소 가 담겨있다
		String[] arr = excel2.split("\n");
// 		각 줄에 \t 쪼갠다
		List<String[]> list = new ArrayList();
		for (int i = 1; i < arr.length; i++) {
			list.add(arr[i].split("\t"));
		}
//		이제 넣고 출력만 하면 된다.
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
// 수\t상호명\t좌표\t지역\n
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