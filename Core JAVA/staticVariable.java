
class mobile
{
    String name;
    int price;
    static  String brand;
    public void show()
    {
        System.out.println(brand +":"+price+":"+name);
    }
}
public class staticVariable
{
    public static void main(String[] args)
    {
        mobile m = new mobile();
        m.name = "y12";
        m.price = 12000;
        mobile.brand = "vivo";      //static variable call using class name not using object

        mobile m1 = new mobile();
        m1.name = "14 pro max";
        m1.price = 189000;
        mobile.brand = "Apple";
        m1.show();
        m.show();
    }
}
