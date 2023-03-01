
class construct{
   private int no;
    private String name;

    //method overloading in constructor
    public construct(){         //default constructor
        no = 34;
        name = "Sudarshan";
    }

    public construct(int no,String name){       //parameterized
        this.no = no;
        this.name = name;
    }

    public construct(String name){
        no = 54;
        this.name = name;
    }
    public int getNo(){
        return no;
    }
    public void setNo(int no)

    {
        this.no = no;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class constructorDemo {
    public static void main(String[] args)
    {
        //we create a class object then constructor automatically called
        construct con = new construct();            //called default constructor
        construct con1 = new construct(55,"vinayak");   //called parameterized constructor
        construct con2 = new construct("Abhishek");

        System.out.println(con.getNo()+":"+con.getName());
        System.out.println(con1.getNo()+":"+con1.getName());
        System.out.println(con2.getNo()+":"+con2.getName());

    }
}
