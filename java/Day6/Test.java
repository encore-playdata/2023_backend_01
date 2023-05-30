import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        Set  Queue  Stack final
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
//        순서 x , 중복 x
//        에러 종류  error warning
        set.add(1);
        set.add(2);
        System.out.println(set.size());

        for (Integer i : set) {
            System.out.printf("%4.2f 입니다. %d %s\n",
                    (float) i * 8000, i, "ㅛㅛㅛㅛ");
        }
    }
}

//final class Person {
//    private final Integer num;
//    private final String name;
//
//    public Person(Integer num, String name) {
//        this.num = num;
//        this.name = name;
//    }
//}
