import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class TestTG {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        Member member1 = new Member("test1", "1q2w3e4r");
        Member member2 = new Member("test1", "1q2w3e4r");

        if(member1 == member2){ //주소비교
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if(member1.equals(member2)){ //equals비교
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        set.add(member1);
        set.add(member2);
        // equals and hashcode 비교
        System.out.println(set.size());
    }
}
final class Member {
    final private String id;
    final private String password;
    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
