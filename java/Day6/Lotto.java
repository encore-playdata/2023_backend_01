public class Lotto {
    public static void main(String[] args) {
//      0 * 45 + 1 <= Math.random() * 45 + 1 < 1 * 45 + 1
//      1 <= number < 46
//      6 개 중복 x
//      Math.random() * 45 + 1 double -> int
//      1. set 의 사이즈가 6 이 될때까지
//      2. number 를 만들자
//      2-1. Math.random() * 45 + 1 double -> int
//      3. 그 다음 출력하자
//      15 분?
//      5개 만들기
        System.out.println((int) (Math.random() * 45) + 1);
    }
}
