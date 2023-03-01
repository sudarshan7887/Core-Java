import java.io.PrintStream;

class Abc{
    int price ;
    int no;
    static String name;

    static {
        name = "trimax";
        System.out.println("in static block");
    }

    public Abc()
    {
        no = 23;
        price = 50;
        System.out.println("in constructor:");
    }

    //we can't use non static variable directly in static method first create class obj parameter and assign value for it
    public static void show(Abc obj)
    {
        System.out.println("in static method:");
        System.out.println(obj.price+":"+obj.no+":"+name);
    }

    public void show1()
    {
        System.out.println(price+":"+no+":"+name);
    }
}
public class staticMethod {
    public static void main(String[] args)
    {
        Abc obj1 = new Abc();
        obj1.no = 12;
        obj1.price = 30;
        Abc.name = "pen";

        Abc obj2 = new Abc();

        Abc.show(obj1);     //static method called with class name
        obj1.show1();       //non static method called with obj

    }
}
