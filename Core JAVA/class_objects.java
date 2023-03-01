import java.util.Scanner;

//class
class calc{

    //methods
    public int add(int n1,int n2)
    {
        //int a = n1 + n2;
        return n1 +n2;
    }
    public int sub(int n1,int n2)
    {
        int s = n1-n2;
        return s;
    }
    public int mul(int n1,int n2)
    {
        int m = n1*n2;
        return m;
    }
    public float div(int n1,int n2)
    {
        float d = n1/n2;
        return d;
    }
}
public class class_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int num1 = sc.nextInt();
        System.out.println("Enter second value:");
        int num2 = sc.nextInt();

        //creating object of calc
        calc c = new calc();

        //Calling methods
        int result1 = c.sub(num1,num2);
        int result2 = c.mul(num1,num2);
        float result3 = c.div(num1,num2);

        System.out.println("addition is:" +c.add(num1,num2));
        System.out.println("substraction is:" +result1);
        System.out.println("multiplication is:" +result2);
        System.out.println("division is:" +result3);
    }
}
