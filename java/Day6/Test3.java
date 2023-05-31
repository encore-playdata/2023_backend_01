import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(1); // 넣기
        queue.offer(2); // 넣기

//        System.out.println(queue.peek()); // 나올 것 보기
//        System.out.println(queue.size()); // 사이즈
//        System.out.println(queue.remove()); // 빼기 없으면 err
//        System.out.println(queue.poll()); // 빼기 없으면 null
//        System.out.println(queue.size());
//        System.out.println(queue.poll());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
