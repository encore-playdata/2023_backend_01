import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        Set  Queue  Stack final
//        final float pie = 3.14f;
//        final Integer i = 0;
//        List<Integer> list = new ArrayList<>();
        Set<Person> set = new HashSet<>();
//        순서 x , 중복 x
//        에러 종류  error warning
        set.add(new Person(1,"1"));
        set.add(new Person(1,"1"));
        set.add(new Person(1,"1"));
        for (Person p:set) {
            System.out.println(p);
        }

//        set.add(1);
//        set.add(2);
        System.out.println(set.size());

//        for (Integer i : set) {
//            System.out.printf("%4.2f 입니다. %d %s\n",
//                    (float) i * 8000, i, "ㅛㅛㅛㅛ");
//        }
    }
}

final class Person {
    private final Integer num;
    private final String name;

    public Person(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(num, person.num) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}

class Member{
    private String id;
    private String password;
}
