
public class testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
// --------------------문제
		//총합과 평균을 출력하시오
// --------------------입력구간
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = (double)sum / (double)count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		int sum2 = 0;
		double avg2 = 0.0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum2 += arr[i][j];
			}
		}
		avg2 = (double) sum2 / (arr[0].length + arr[1].length + arr[2].length);
		System.out.println("sum2 : " + sum2);
		System.out.println("avg2 : " + avg2);
		
		System.out.println("-----------------------------");
		int sum3 = 0;
		double avg3 = 0.0;
		int count2 = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; j++)
				sum3 += arr[i][j];
			count2 += arr[i].length;
		}
		avg3 = (double) sum3 / count2;
		System.out.println("sum3: " + sum3);
		System.out.println("avg3: " + avg3);
	}

}
