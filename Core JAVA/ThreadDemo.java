import javax.swing.plaf.TableHeaderUI;

//In Thread class has a run method
//Min priority = 1
//max priority = 10
//default priority=5
class T extends Thread
{
    public void run(){
        for (int i=0;i<10;i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T1 extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++) {
            System.out.println("Sudarshan");
            System.out.println(Thread.MAX_PRIORITY);        //print maximum priority
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        T obj1 = new T();
        T1 obj2 = new T1();
        obj1.start();
        Thread.sleep(5);
        obj2.start();
    }
}
