package test;

public class Star {

	public static void main(String[] args) {
		
//		  for (int i = 1; i < 6; i++) {
//	            for (int j = 0; j < 6 - i; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println("");
//	        }
		  
		  
		  
		  
//	    String star = "";
//		for(int i=1; i<6; i++ ) {
//			star += "*"; 
//			System.out.println(star);
//		}
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				}; 
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j]);
		
	}
}
