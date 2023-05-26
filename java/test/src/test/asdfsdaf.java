package test;

public class asdfsdaf {

public static void main(String[] args) {

int[] original = { 1, 2, 3 };

int[] copy = original.clone();

int[] arr = original;

copy[0] = 6;

System.out.println(original[0]);

System.out.println(copy[0]);

// 1차원 배열은 clone을 써도 각각 복사되는거에 아무 문제가 없다

​

// 주소값 확인

System.out.println(original);

System.out.println(arr);  // 단순히 기존 배열의 주소값을 참조하는 arr변수는 original 변수와 주소값이 같은 것을 확인할 수 있다

System.out.println(copy); // colne을 통해 복제한 copy 변수는 주소값이 original과 다르게 나오는걸 확인 할 수 있다.

System.out.println("--------------------------------------");

int[][] original1 = {

{1,2,3},

{4,5,6},

{7,8,9}

};

int[][] copy1 = original1.clone();

int[][] arr1 = original1;

copy1[0][0] = 6;

System.out.println(original1[0][0]);

System.out.println(copy1[0][0]);

​

// 주소값 확인

System.out.println(original1);

System.out.println(arr1);  // 단순히 기존 배열의 주소값을 참조하는 arr변수는 original 변수와 주소값이 같은 것을 확인할 수 있다

System.out.println(copy1); // colne을 통해 복제한 copy 변수는 주소값이 original과 다르게 나오는걸 확인 할 수 있다.

System.out.println("--------------------------------------");

// 2차원 배열은 clone을 써서 복사를 했더니 copy1의 값이 original1의 값과 연동되듯이 같다

int[][] original2 = {

{1,2,3},

{4,5,6},

{7,8,9}

};

int[][] copy2 = new int[original2.length][]; // 이차원 배열을 담을 박스를 null 값으로 먼저 만들어준다.

int[][] arr2 = original2;

for (int i = 0; i < original2.length; i++) { // for문을 통해 clone

copy2[i] = original2[i].clone();

}

copy2[0][0] = 6;

System.out.println(original2[0][0]);

System.out.println(copy2[0][0]);

​

// 주소값 확인

System.out.println(original2);

System.out.println(arr2);  // 단순히 기존 배열의 주소값을 참조하는 arr변수는 original 변수와 주소값이 같은 것을 확인할 수 있다

System.out.println(copy2); // colne을 통해 복제한 copy 변수는 주소값이 original과 다르게 나오는걸 확인 할 수 있다.

}

}
