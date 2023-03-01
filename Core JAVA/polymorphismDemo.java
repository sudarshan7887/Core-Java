//runtime polymorphism
class poly{
    public void show(){
        System.out.println("In poly show");
    }
}
class morph extends poly
{
    public void show(){
        System.out.println("In morph show:");
    }
}

class phism extends poly
{
    public void show(){
        System.out.println("In phism show");
    }
}
public class polymorphismDemo
{
    public static void main(String[] args)
    {
        //dynamic method dispatch
            poly obj = new poly();
            obj.show();

            obj = new morph();
            obj.show();

            obj = new phism();
            obj.show();

    }
}
