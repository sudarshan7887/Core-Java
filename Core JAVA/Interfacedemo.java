//class->class=>extends
//interface=>class=>implements
//interface->interface=>extends

interface A2{
    //every variable in interface are final and static
    int age = 23;
    String name="Sudarshan";

    //by default all methods in interface are public abstract
    void config();
    void modify();
}
//interface can be derived into implements keyword in class
//if interface is implements then all method of interface neccessory to  define

interface A3{
    void run();
}

//interface to interface derived into extends keyword
interface A4 extends A3{
    void display();
}

class A5 implements  A4{
    @Override
    public void run() {
        System.out.println("In run method...");
    }

    @Override
    public void display() {
        System.out.println("In display method...");
    }
}

//interface supports multiple inheritance but all method can be implemented
class B1 implements A2,A3 {
    public void config() {
        System.out.println("In config methods");
    }


    public void modify() {
        System.out.println("In modify methods");
    }

    public void run() {
        System.out.println("Running...");
    }

}
    public class Interfacedemo {
        public static void main(String[] args) {
            A2 obj= new B1();
            obj.config();
            obj.modify();

            A5 obj1 = new A5() ;
            obj1.display();
            obj1.run();


            //variables can be call in  interface is
            System.out.println("age is:"+A2.age+"\n name is:"+A2.name);
        }
    }
