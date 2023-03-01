abstract class Bike{
    public abstract   void ride();
    public abstract void drive();

    public void modify(){
        System.out.println("modifying a car...");
    }
}
class Car extends Bike{
    public void ride(){
        System.out.println("Riding a Bike...");
    }
    public void drive(){
        System.out.println("Driving a Car..");
    }
}
public class Abstactclass {

    //we can not create an object of abstract class
    //we implement all the abstract methods
    //in abstract class there are abstract and unubstract method
    public static void main(String[] args) {
        Car c = new Car();
        c.ride();
        c.drive();
        c.modify();
    }
}
