
class v{
    public void show(){
        System.out.println("In v class");
    }
}
public class AnnonymousInnerClass
{
    public static void main(String[] args)
    {
        //Annonymous inner class
        v obj = new v()
        {
            public void show()
                {
                    System.out.println("In new show");
                }
        };
        obj.show();
    }
}
