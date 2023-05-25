
public class Test {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				}; 
		
		// 987654321
		for (int i=arr.length; i>0; i--) {
			// arr.length = 3  3, 2, 1
			for (int j=arr[i-1].length; j>0; j--) {
				// j = 3  3, 2, 1
				System.out.print(arr[i-1][j-1]);
				// arr[i-1] = 2 arr[j-1] = 2
				// arr[i-1] = 1 arr[j-1] = 1
				// arr[i-1] = 0 arr[j-1] = 0
			}
		}
		// 147258369
//		for(int i=0; i<arr.length; i++) { 
//			// arr.length =3 0,1,2
//			for(int j=0; j<arr.length; j++) {
//				// arr.length = 3 0,1,2
//				System.out.println(arr[j][i]);
//			}
//		}
	}

}
