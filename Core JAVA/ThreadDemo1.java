//Thread using Runnable
class Th1 implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<5;i++)
             System.out.println("Hello");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Th2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println("Sudarshan");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Runnable obj1 = new Th1();
        Runnable obj2 = new Th2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
