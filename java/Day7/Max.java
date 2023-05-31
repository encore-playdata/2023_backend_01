import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
//        입력을 받는다.
        Scanner sc = new Scanner(System.in);
//      배열을 선언
        int[] numbers = new int[5];

//      임의의 숫자를 입력하시오
        System.out.println("숫자를 입력하시오 : ");

//        for문을 통해 입력받은 숫자들을 배열에 저장

        for (int i = 0; i <5; i++) {
            numbers[i] = sc.nextInt();
        }

//       최솟값과 최댓값을 저장할 배열들을 초기화
        int min = numbers[0];
        int max = numbers[0];

//       for문을 통해 비교를 하고 루프가 진행되는동안 min, max를 계속 수정

        for (int i = 1; i < 5; i++) {
            min = Math.min(numbers[i], min);
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

//        출력
        System.out.println("최솟값은 : " + min);
        System.out.println("최댓값은 : " + max);
        System.out.println("입력한 숫자들 : " + Arrays.toString(numbers));




    }
}
