
public class Study3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = arr.clone();
		int[] arr3 = {1,2,3};
		if(arr==arr2) {
			System.out.println("true");
			
		}
		if(arr==arr3) {
			System.out.println("true2");
		}
		arr2[0] = 10;
		System.out.println(arr2[0]);
		System.out.println(arr[0]);
	}
}
