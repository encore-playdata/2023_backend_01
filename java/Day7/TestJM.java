import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class TestJM {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("1", "1"));
        set.add(new Member("1", "2"));
        set.add(new Member("1", "3"));
        for (Member p : set) {
            System.out.println(p);
        }
        System.out.println(set.size());

    }
}
//class Member {
//    private String id;
//    private String password;
//
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member member = (Member) o;
//        return Objects.equals(id, member.id);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//    public Member(String id, String password) {
//        this.id = id;
//        this.password = password;
//    }
//}