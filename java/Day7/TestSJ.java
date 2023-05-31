import java.util.*;

public class TestSJ {
    static Scanner sc = new Scanner(System.in);
    static List<Member> list = new ArrayList<>();

    public static void main(String[] args) {
        controller();
    }

    static void controller() {
//        1 . list.add(marine) 상태값 생성중 10  생성완료
//        1 . list.add(marine) 상태값 생성중 생성중
//        1 . list.add(marine) 상태값 생성중 생성중
        System.out.println("1. 마린생성 2. 인덱스를 입력받아서 확인");
        String nextLine = sc.nextLine();

        int mode = Integer.parseInt(nextLine);
        selectMode(mode);
    }

    private static void selectMode(int mode) {
        if (mode == 1) register();
        else if (mode == 2) return;
        else controller();
    }

    static void register() {
        System.out.println("아이디 입력 >>");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력 >>");
        String name = sc.nextLine();
        Member member = new Member(id, name);

        if (list.contains(member)) {
            System.out.println("아이디나 비밀번호가 중복됩니다. 다시 입력해주세요.");
            System.out.println();
        } else {
            list.add(new Member(id, name));
            System.out.println("회원가입이 완료되었습니다!!!!");
            System.out.println();
        }
        controller();
    }
}

//class Member {
//    private String id;
//    private String password;
//
//    public Member(String id, String password) {
//        this.id = id;
//        this.password = password;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member member = (Member) o;
//        return Objects.equals(id, member.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, password);
//    }
//}