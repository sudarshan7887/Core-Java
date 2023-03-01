class up{
    public void show(){
        System.out.println("in up show");
    }
}
class  down extends up{
    public void show1(){
        System.out.println("in down show1");
    }
}
public class upcasingANDdowncasting
{
    public static void main(String[] args)
    {
        //upcasting
        up obj = new down();
        obj.show();

        //downcasting
        down obj1 = (down) obj;
        obj1.show1();
    }
}
