import java.util.Scanner;

class Calcr{
    public int add(int a,int b){
        return a +b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

//Single level inheritance
class advcalcr extends Calcr{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

//Multilevel inheritance
class veryAdvCalc extends advcalcr{
    public double power(int a,int b){
        return Math.pow(a,b);
    }
}
public class InheritanceDemo
{
    public static void main(String[] args) {

        veryAdvCalc obj = new veryAdvCalc();
        int p = obj.add(10,20);
        int q = obj.sub(20,10);
        int r = obj.mul(10,20);
        int s = obj.div(20,5);
        double t = obj.power(2,4);

        //using user through input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
       int l = sc.nextInt();
        System.out.println("Enter Second number:");
       int m = sc.nextInt();

        int a = obj.add(l,m);
        float b = obj.sub(l,m);
        int c = obj.mul(l,m);
        int d = obj.div(l,m);
        double e = obj.power(l,m);
        System.out.println("Using user through input:");
        System.out.println(obj.add(l,m));
       System.out.println("addition is:"+a+" \n substraction is:"+b+"\n multiplication is: "+c+"\n division is: "+d+" \n power is:"+e);

        System.out.println("using default input:");
        System.out.println("The addition is:"+obj.add(5,6));
        System.out.println("addition is:"+p+" \n substraction is:"+q+"\n multiplication is: "+r+"\n division is: "+s+" \n power is:"+t);
    }
}
