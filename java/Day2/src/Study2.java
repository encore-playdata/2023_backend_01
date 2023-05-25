
public class Study2 {

	public static void main(String[] args) {

		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		// 탐색할때 
//		만약 홀수면 1을 더하고
		// 마지막에 홀수 인 값의 합을 출력하고
		// 리스트를 보여줘라
		int sum = 0;
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j] % 2 == 1) {
					sum += arr[i][j]; 
					arr[i][j]++;
				}
			}
		}
		System.out.println(sum);
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		// 1+3+5+7+9 = 
		// 25
		// 224
		// 466
		// 8810
		
		
		
		
		
		
		
		
//		arr[0][0] arr[1][1] arr[2][2]
//		arr[0][1] arr[1][2]
//		arr[0][2]
		// i 0, 1, 2
//		for(int i=0; i< arr.length; i++) {
//			for(int j=0; j < arr[i].length - i; j++) {
//				System.out.print(arr[j][j + i]);
//			}
//		}
		
		
		
		
		
		
		
		
//		int i = 0;
//		while (i < arr.length) {
//			int j = 0;
//			while (j < arr[i].length) {
//				System.out.print(arr[j][i]);
//				j +=1;		
//			}
//			i += 1;
//		}
		

//		while
//		for(int i = 0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(
//						arr[arr.length-i-1][arr.length-j-1]
//						);
//			}
//		}
//		System.out.println();
//		for(int i = arr.length-1; i>=0; i--) {
//			for(int j=arr[i].length-1; j>=0; j--) {
//				System.out.print(arr[i][j]);
//			}
//		}
//		int i = arr.length-1;
//		while(i>=0) {
//			int j=arr[i].length-1;
//			while(j>=0) {
//				System.out.print(arr[i][j]);
//				j--;
//			}
//			i--;
//		}
		// for
//		for (int i =0; i< 10; i++) {
//			System.out.println(i);
//		}
//		// while(조건){ 실행} 
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		boolean isBreak = true;
//		int i=0;
//		while(isBreak) {
//			System.out.println("while");
//			i++;
//			if(i > 5) isBreak = false;
//		}
		
		
//		i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i< 10);

	}

}
