import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
//      0 * 45 + 1 <= Math.random() * 45 + 1 < 1 * 45 + 1
//      1 <= number < 46
//      6 개 중복 x
//      Math.random() * 45 + 1 double -> int
//      0. set 정의해야 함
//      1. set 의 사이즈가 6 이 될때까지
//      2. number 를 만들자
//      2-1. Math.random() * 45 + 1 double -> int
//      3. 그 다음 출력하자
//      15 분?
//      5개 만들기
        System.out.println(LocalDateTime.now());
//        while (true) {
        Set<Integer> set = new HashSet<>();
//            int[] arr = new int[6];
//            for (int i = 0; i < 6; i++) {
//                int a = (int) (Math.random() * 45) + 1;
//                set.add(a); // 1 2 3 3 4 5
//                arr[i] = a;
//            }
//        System.out.println(set.size());
        while (set.size() != 6) {
            set.add((int) (Math.random() * 45) + 1);
        }
//            if (set.size() == 1) {
        for (int i : set) {
            System.out.println(i);
        }
//                break;
//            }
//        }
        System.out.println(LocalDateTime.now());
//        System.out.println((int) (Math.random() * 45) + 1);
    }
}
