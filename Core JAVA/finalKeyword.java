
//final class=>
//once a class is final then we can't intherit the subclass; i.einheritance is not possible for final class
final class lmn{

    public void show(int a ,int b)
    {
        System.out.println(a+b);
    }
}

//final method=>
//cannot override the method
class xyz{
    public final void display()
    {
        System.out.println("In display method");
    }
}

class opq extends xyz
{
//    can't override the below display method because above display method is final
//    public void display(){
//        System.out.println("in opq display");
//    }
}
public class finalKeyword
{
    public static void main(String[] args)
    {
        //once a variable is final then can't change value of variable i.e final keyword is used for make a variable constant
         final int n = 10;
          //  n = 5;            //throw an error
        lmn obj = new lmn();
        obj.show(10,20);

        opq obj1 = new opq();
        obj1.display();


    }
}
