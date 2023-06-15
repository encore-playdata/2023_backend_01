import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static boolean 짝수판별기(int num){
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }

    static int 두배만들기(int num){
        return num*2;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // 1. 짝수를 골라가지고
        // 2. 두배를 하고싶다
        List<Integer> list2 = new ArrayList<>();
        for (Integer integer : list) {
            if(integer % 2==0){
                list2.add(integer);
            }
        }
//
//        for (Integer integer : list2) {
//            if(짝수판별기(integer)){
//                list2.add(두배만들기(integer));
//            }
//        }

        List<Integer> collect = list.stream()
                .filter(Main::짝수판별기)
                .map(Main::두배만들기)
                .collect(Collectors.toList());
        System.out.println(list2);

        List<String> strings = new ArrayList<>();
        String name = "김";
        String age = "19";
        for (int i = 1; i < 11; i++) {
            strings.add(i + " " + name + " " + age);
        }
        List<Person> personList2 = new ArrayList<>();
        for (String s:strings)
            if(Integer.parseInt(s.split(" ")[0])%2 ==0)
                personList2.add(new Person(s));

        System.out.println("personList2 = " + personList2);
        List<Person> personList = strings.stream()
                .map(Person::new)
                .filter(person-> person.id % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("personList = " + personList);


    }
}

class Person{
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Person(String args) {
        //아무튼 스트링 잘라서 넣기
        String[] s = args.split(" ");

        this.id = Integer.parseInt(s[0]);
        this.name = s[1];
        this.age = Integer.parseInt(s[2]);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
