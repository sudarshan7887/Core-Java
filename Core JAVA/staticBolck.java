class a
{
    int rno;
    int marks;
    static String name;

    //static block called only once
    //static block always called first
    static {
        name = "Ram";
        System.out.println("In Static block");
    }

    public a(){
        rno = 34;
        marks = 67;
        System.out.println("In constructor:");
    }
    public void show(){
        System.out.println(rno+":" +name+":" +marks);
    }
}
public class staticBolck {
    public static void main(String[] args)
    {
        a obj = new a();
        obj.rno = 1;
        obj.marks = 66;
        a.name = "Sudarshan";

        a obj2 = new a();
        obj.show();
    }
}
