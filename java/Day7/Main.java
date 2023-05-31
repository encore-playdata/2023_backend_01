import MyThread.MyRunnable;
import MyThread.MyThread;
import dto.Person;

public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable(1);
//        MyRunnable myRunnable2 = new MyRunnable(2);
//        Thread thread = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable2);
//        thread.start();
//        thread2.start();
//        System.out.println("main");

//        MyThread myThread = new MyThread(1000,1);
//        MyThread myThread2 = new MyThread(2000,2);
//        myThread.start();
//        myThread2.start();

        Person person = new Person();
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(1000, i, person);
            myThread.start();
        }

    }
}
