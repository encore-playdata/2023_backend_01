import MyThread.MyRunnable;
import MyThread.MyThread;
import dto.Person;

public class Main {
    public static void main(String[] args)
            throws CustomException{
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

//        Person person = new Person();
//        for (int i = 0; i < 5; i++) {
//            MyThread myThread = new MyThread(1000, i, person);
//            myThread.start();
//        }
//        try{
//            System.out.println(1 / 0);
//            Person person = null;
//            System.out.println(person.getName());
//        }catch (Exception e){
//            System.out.println("err");
//        }finally {
//            System.out.println("fds");
//        }
//        catch (NullPointerException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//        }catch (ArithmeticException e){
//            System.out.println("/ 0 err");
//        }
//        throw new CustomException("sss");
//        System.out.println(1/0);
        try{
            System.out.println(1/0);
        }catch (Exception e){
            throw new CustomException("sss");
        }

    }
}
